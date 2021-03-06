package config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = "model.repositories")
@EntityScan(basePackages = "model.entities")
@EnableTransactionManagement
@PropertySource("classpath:app.properties")
public class DataConfig {

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("db.driver"));
        dataSource.setUrl(env.getRequiredProperty("db.url"));
        dataSource.setUsername(env.getRequiredProperty("db.user"));
        dataSource.setPassword(env.getRequiredProperty("db.password"));
        return dataSource;
    }

    @Bean
    public Properties getHibernateProperties(){
        Properties properties=new Properties();
        properties.put("hibernate.dialect",env.getRequiredProperty("db.hibernate.dialect"));
        properties.put("hibernate.show_sql",env.getRequiredProperty("db.hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto",env.getRequiredProperty("db.hibernate.hbm2ddl.auto"));
        properties.put("hibernate.connection.CharSet",env.getRequiredProperty("db.hibernate.connection.CharSet"));
        properties.put("hibernate.connection.characterEncoding",env.getRequiredProperty("db.hibernate.connection.characterEncoding"));
        properties.put("hibernate.connection.useUnicode",env.getRequiredProperty("db.hibernate.connection.useUnicode"));
        return  properties;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){

        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean=
                new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
        entityManagerFactoryBean.setPackagesToScan(env.getRequiredProperty("db.entitymanager.packages.to.scan"));
        return entityManagerFactoryBean;
    }
    @Bean
    @Qualifier(value = "jpaTransactionManager")
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}

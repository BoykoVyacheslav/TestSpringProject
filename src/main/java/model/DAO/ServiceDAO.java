package model.DAO;

import model.Entities.Service;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class ServiceDAO {
    @PersistenceContext
    private EntityManager entityManager;

    private static ServiceDAO instance;

    private ServiceDAO() {
    }

    public static ServiceDAO getInstance(){
        if(instance==null) instance=new ServiceDAO();
        return instance;
    }

    public List<Service> getAllServices(){
        String queryString="Select s from Service as s";
        TypedQuery<Service> query=entityManager.createQuery(queryString,Service.class);
        return query.getResultList();
    }

    public void addService(String serviceName,double price){
        entityManager.persist(new Service(serviceName,price));
    }

    public void delService(int id){
        Service service=entityManager.find(Service.class,id);
        getAllServices().remove(service);
        entityManager.persist(service);
    }//need test

    public void changeServiceName(int id,String newName){
        Service service=entityManager.find(Service.class,id);
        service.setName(newName);
        entityManager.persist(service);
    }

    public void changeServicePrice(int id,double newPrice){
        Service service=entityManager.find(Service.class,id);
        service.setPrice(newPrice);
        entityManager.persist(service);
    }
}

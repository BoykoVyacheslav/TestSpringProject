package model;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDAO {

    private static UserDAO instance;
    @PersistenceContext
    private EntityManager entityManager;

    private UserDAO(){}

    public static UserDAO getInstance(){
        if (instance==null) instance=new UserDAO();
        return instance;
    }

    void addUser(String name, String login, String password) {
        entityManager.persist(new User(name, login, password));
    }

    void delUser(long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
    //TODO change update method in UserDAO
    void update(long id, String...args) {
        User user = entityManager.find(User.class, id);
        entityManager.persist(user);
    }

    User getUser(String email) {
        return entityManager.find(User.class, email);
    }



}

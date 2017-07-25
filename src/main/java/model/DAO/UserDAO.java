package model.DAO;

import model.Entities.User;

import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDAO {

    private static UserDAO instance;
    @PersistenceContext
    private EntityManager entityManager;

    protected UserDAO(){}

    public static UserDAO getInstance(){
        if (instance==null) instance=new UserDAO();
        return instance;
    }


    public void addUser(String name, String login, String password) {
        entityManager.persist(new User(name, login, password));
    }

    public void delUser(long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    public User getUser(String email) {
        return entityManager.find(User.class, email);
    }

    public void changeUserName(int id,String newName){
        User user=entityManager.find(User.class,id);
        user.setName(newName);
        entityManager.persist(user);
    }

    public void changeUserPassword(int id,String newPassword){
        User user=entityManager.find(User.class,id);
        user.setPassword(newPassword);
        entityManager.persist(user);
    }


}

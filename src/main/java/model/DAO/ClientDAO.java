package model.DAO;

import model.Entities.Client;
import model.Entities.Payment;
import model.Entities.Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class ClientDAO extends UserDAO {
    @PersistenceContext
    private EntityManager entityManager;
    private static ClientDAO instance;

    private ClientDAO(){}

    public static ClientDAO getInstance(){
        if(instance==null)instance=new ClientDAO();
        return instance;
    }



    private Client getClientById(int id){
       return entityManager.find(Client.class,id);
    }

    private Service getServiceById(int id){
        return entityManager.find(Service.class,id);
    }

    public void addService(int id,Service service){
        Client client=getClientById(id);
        client.addService(service);
        entityManager.persist(client);
    }

    public void delService(int id,int serv_id){
        Client client=getClientById(id);
        client.getServices().remove(getServiceById(serv_id));
        entityManager.persist(client);
    }

    public List<Service> getUserServices(int id){
        return getClientById(id).getServices();
    }

    public List<Payment> getUserPauments(int id){
        return entityManager.find(Client.class,id).getPayments();
    }

    public double getBalance(int id){
        return entityManager.find(Client.class,id).getBalance();
    }

    public void addPayment(int id,Payment payment){
        Client client=getClientById(id);
        client.getPayments().add(payment);
        client.incBalance(payment.getSum());
    }


    //TODO transfer to ServiceDAO






}

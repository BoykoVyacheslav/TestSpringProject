package model.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Clients")
public class Client extends User{


    @Column(name = "balance")
    private double balance;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Payment> payments=new ArrayList<Payment>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Service> services;



    public Client(double balance) {
        this.balance = balance;
    }

    public Client() {
    }

//_________________Getters and Setters_________________________

    public int getId() {
        return super.getId();
    }

    public double getBalance() {
        return this.balance;
    }

    public void incBalance(double payment) {
        this.balance += payment;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void addPayment(Payment payments) {
        this.payments.add(payments);
    }

    public List<Service> getServices() {
        return this.services;
    }

    public void addService(Service service) {
        this.services.add(service);
    }
}

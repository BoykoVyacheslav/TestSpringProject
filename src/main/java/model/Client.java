package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Clients")
public class Client{

    @Id
    private int id;

    @Column(name = "balance")
    private double balance;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Payment> payments=new ArrayList<Payment>();

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Service> services;



    public Client(double balance) {
        this.balance = balance;
    }

    public Client() {
    }


}

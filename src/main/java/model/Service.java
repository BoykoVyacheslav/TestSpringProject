package model;

import javax.persistence.*;


@Entity
@Table(name = "Services")
public class Service {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "service_name")
    private String service_name;
    @Column(name = "price")
    private double price;

    public Service(String service_name, double price) {
        this.service_name = service_name;
        this.price = price;
    }

    public Service() {
    }



}

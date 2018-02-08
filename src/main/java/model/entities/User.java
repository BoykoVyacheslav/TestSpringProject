package model.entities;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

//    @OneToMany(mappedBy = "user")
//    private ArrayList<Order> orders;

//    @OneToMany(mappedBy = "user")
//    private ArrayList<Response> responses;


    public User(String name,String phone, String email, String password) {
        this.name = name;
        this.phone=phone;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public long getId() {
        return this.id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void makeOrder(Order order){
//        this.orders.add(order);
//    }
//    public ArrayList<Order> getOrders(){
//        return orders;
//    }
}

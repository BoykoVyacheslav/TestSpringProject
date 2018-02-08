package model.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name="Orders")
 class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "car_type")
    private String car;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @OneToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @Column(name = "reg_date")
    private Timestamp registrationDate;

    @Column(name = "load_date")
    private Date loadDate;

    @Column(name = "load_time")
    private Time loadTime;

    @Column(name = "load_desc")
    private String loadDescription;

    @Column(name = "wishes")
    private String wishes;

    @Column(name = "address_from")
    private String from;

    @Column(name = "address_to")
    private String to;

    @Column(name = "active")
    private boolean isActive;


    public Order(){
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car.toString();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Time getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Time loadTime) {
        this.loadTime = loadTime;
    }

    public String getLoadDescription() {
        return loadDescription;
    }

    public void setLoadDescription(String loadDescription) {
        this.loadDescription = loadDescription;
    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

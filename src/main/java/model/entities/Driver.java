package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Drivers")
public class Driver extends User {

    private enum RANGE {CITY,REGION,COUNTRY,INTERNATIONAL}

    @Column(name = "car_type")
    private String car;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "range")
    private RANGE range;

    @Column(name = "rank")
    private float rank;

    public Driver(Car car, RANGE range) {
        super();
        this.car = car.toString();
        this.range = range;
    }

    public String getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car.toString();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addBalance(BigDecimal balance) {
        this.balance=this.balance.add(balance);
    }

    public RANGE getRange() {
        return range;
    }

    public void setRange(RANGE range) {
        this.range = range;
    }

    public float getRank() {
        return rank;
    }

    public void addRank(Float rank) {
        this.rank += rank;
    }
}

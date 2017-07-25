package model.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Payments")
public class Payment {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "sum")
    private double sum;

    public Payment(double sum) {
        this.date = new Date();
        this.sum = sum;
    }

    public Payment() {
    }


    public long getId() {
        return this.id;
    }

    public Date getDate() {
        return this.date;
    }

    public double getSum() {
        return this.sum;
    }
}

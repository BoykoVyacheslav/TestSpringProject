package model;

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

    @Column
    private long sum;

    public Payment(Date date, long sum) {
        this.date = date;
        this.sum = sum;
    }

    public Payment() {
    }
}

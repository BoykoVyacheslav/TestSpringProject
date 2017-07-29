package model.Entities;

import org.hibernate.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Services")
public class Service {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Column(name = "service_name")
    private String service_name;

    @NotNull
    @Column(name = "price")
    private double price;

    public Service(String service_name, double price) {
        this.service_name = service_name;
        this.price=price;
    }

    protected Service() {
    }

    public String getService_name() {
        return service_name;
    }

    public void setName(String service_name) {
        this.service_name = service_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

/*TODO if needed, can realise price per period:
     ppd == pricePerDay;
     enum period{DAY,WEEK,MONTH,YEAR}
     switch (period){
            case DAY:this.price=ppd;
            case WEEK:this.price=ppd*7;
            case MONTH:this.price=ppd*28;
            case YEAR:this.price=ppd*336;
*/
}


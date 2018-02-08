package model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Cars")
public class Car {

    private enum CAR_TYPE{MINIVAN,VAN,MINIBUS,TRUCK}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "car_type")
    private CAR_TYPE type;

    @Column(name = "car_model")
    private String model;

    @Column(name = "reg_number")
    private String regNumber;

    @Column(name = "max_load")
    private BigDecimal maxLoad;

    @Column(name="capacity")
    private String capacity;

    public Car(CAR_TYPE type, String model, String regNumber, BigDecimal maxLoad, String capacity) {
        this.type = type;
        this.model = model;
        this.regNumber = regNumber;
        this.maxLoad = maxLoad;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public CAR_TYPE getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public BigDecimal getMaxLoad() {
        return maxLoad;
    }

    public String getCapacity() {
        return capacity;
    }
}

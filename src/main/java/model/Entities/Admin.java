package model.Entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Admins")
public class Admin extends User {


    @Column(name = "some_prop")
    private String some_prop;

    //TODO Realise some logic form administrator


    public int getId() {
        return super.getId();
    }

    public String getSome_prop() {
        return some_prop;
    }
}

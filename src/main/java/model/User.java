package model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id

    private long id;

    public long getId() {
        return id;
    }

    @Column(name = "name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;


    public User(String name, String login, String password) {
        this.name = name;
        this.email = login;
        this.password = password;
    }

    public User() {
    }




    public void setEmail(String email){
        this.email=email;
    }


}

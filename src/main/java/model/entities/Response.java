package model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    private User user;

    @OneToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "comment")
    private String comment;

    public Response(){
    }

    public Response(User user, Driver driver, Integer orderId, BigDecimal price, String comment) {
        this.user = user;
        this.driver = driver;
        this.orderId = orderId;
        this.price = price;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;

        Response response = (Response) o;

        if (id != response.id) return false;
        if (user != response.user) return false;
        if (driver != response.driver) return false;
        if (orderId != response.orderId) return false;
        if (!price.equals(response.price)) return false;
        return comment != null ? comment.equals(response.comment) : response.comment == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + orderId;
        result = 31 * result + price.hashCode();
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}

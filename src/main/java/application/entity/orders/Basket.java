package application.entity.orders;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Basket() {
    }
//    @OneToMany(fetch = FetchType.LAZY,targetEntity = Order.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "basket_id")
//    @JsonIgnore
//    private List<Basket> baskets=new ArrayList<>();
}

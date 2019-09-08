package application.entity.orders;

import application.entity.goods.Goods;
import application.entity.users.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//заказ
@Data
@Entity
@Table(name = "userorder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    Date createorder;
    private String name;
    private String fone;
    @Column(nullable = false)
    private boolean done=false;
    @Column(columnDefinition = "TEXT")
    private String description;
//      @ManyToOne
//      @JoinColumn(name = "user_id", nullable = false)
//      private User user;
      @OneToMany(targetEntity = QuantityGoodsInOrder.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
      @JoinColumn(name="orderid")
      @JsonIgnore
      private List<QuantityGoodsInOrder>quantityGoodsInOrders=new ArrayList<>();

    public Order() {
    }


}

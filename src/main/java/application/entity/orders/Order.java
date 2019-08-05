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
    public Order() {
    }
    Date createorder;
    private String descriptionuser;
    @Column(nullable = false)
    private boolean done=false;
    private String descriptionmenedger;
      @ManyToOne
      @JoinColumn(name = "user_id", nullable = false)
      private User user;
      @ManyToMany(mappedBy = "orders",targetEntity = Goods.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
      private List<Goods> goods=new ArrayList<>();
    //добавить id исполнителя



}

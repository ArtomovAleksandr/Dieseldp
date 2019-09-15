package application.entity.orders;

import application.entity.goods.Goods;
import application.entity.users.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//заказ
@Data
@Entity
@NoArgsConstructor
@Table(name = "userorder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date createorder;

    private String name;
    private String fone;
    @Column(nullable = false)
    private boolean done=false;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Transient
    private int countgoods;
    @Transient
    private double totalorder;
    @OneToMany(fetch = FetchType.LAZY  ,targetEntity = QuantityGoodsInOrder.class,cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private List<QuantityGoodsInOrder>quantityGoodsInOrders=new ArrayList<>();

    public void totalOrderSetZero(){
       this.totalorder=0;
    }
    public void totalOrderSumm(double summ){
        this.totalorder+=summ;
    }
    public void setCountGoods(){
        this.countgoods=quantityGoodsInOrders.size();
    }

}

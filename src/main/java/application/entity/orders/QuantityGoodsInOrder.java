package application.entity.orders;

import application.entity.goods.Goods;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//кол товара в заказе
@Data
@Entity
@NoArgsConstructor
@Table(name = "qungoodsinorder")
public class QuantityGoodsInOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int quantity;
    @ManyToOne(targetEntity = Order.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;

    @OneToOne(targetEntity = Goods.class )
    @JoinColumn(name="goods_id")
    private Goods goods;

    @Transient
    private double totalgoods;


    public void totalGoodsSumm(double summ){
        this.totalgoods=quantity*summ;
    }


    public QuantityGoodsInOrder(int quantity, Goods goods) {
        this.quantity = quantity;
        this.goods = goods;
    }


}

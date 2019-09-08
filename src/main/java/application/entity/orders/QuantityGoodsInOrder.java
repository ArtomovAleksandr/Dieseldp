package application.entity.orders;

import application.entity.goods.Goods;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//кол товара в заказе
@Data
@Entity
@Table(name = "qungoodsinorder")
public class QuantityGoodsInOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int quantity;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="orderid",nullable = false)
    private Order order;
    @OneToOne(cascade = CascadeType.ALL,targetEntity = Goods.class)
    private Goods goods;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public QuantityGoodsInOrder(int quantity, Goods goods) {
        this.quantity = quantity;
        this.goods = goods;
    }
}

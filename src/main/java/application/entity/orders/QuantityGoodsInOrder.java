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
    @ManyToOne(targetEntity = Order.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne(targetEntity = Goods.class )
    @JoinColumn(name="goods_id")
    @JsonIgnore
    private Goods goods;

    @Transient
    private double totalgoods;


    public void totalGoodsSumm(double summ){
        this.totalgoods=quantity*summ;
    }
  //  private Goods goods;

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

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    public Goods getGoods() {
        return goods;
    }


}

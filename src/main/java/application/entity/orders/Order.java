package application.entity.orders;

import application.entity.goods.Goods;
import application.entity.users.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    @Column(length = 25)
    private String createorderDateTime;
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
    public void setDateTameForOut(){
        if(this.createorderDateTime!=null) {
            LocalDateTime dateTime=LocalDateTime.parse( this.createorderDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            String abc = new Integer(dateTime.getDayOfMonth()).toString()+"-"+new Integer(dateTime.getMonthValue()).toString()+"-"+new Integer(dateTime.getYear()).toString()+"   "+new Integer(dateTime.getHour()).toString()+":"+new Integer((dateTime.getMinute())).toString();
            this.createorderDateTime = abc;
        }
    }

}

package application.entity.orders;

import application.entity.goods.Goods;
import application.entity.users.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
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
    private int idorder;
//      @ManyToOne
//      @JoinColumn(name = "user_id", nullable = false)
//      private User user;
    @OneToMany(fetch = FetchType.EAGER,targetEntity = QuantityGoodsInOrder.class,cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private List<QuantityGoodsInOrder>quantityGoodsInOrders=new ArrayList<>();

    public Order() {
    }

    public Order(String name, String fone, String description, int idorder) {
        this.name = name;
        this.fone = fone;
        this.description = description;
        this.idorder = idorder;
    }

    public void setCountGoods(){
        this.countgoods=quantityGoodsInOrders.size();
    }
    public Date getCreateorder() {
        return createorder;
    }

    public String getName() {
        return name;
    }

    public String getFone() {
        return this.fone;
    }

    public boolean isDone() {
        return done;
    }

    public String getDescription() {
        return description;
    }

    public List<QuantityGoodsInOrder> getQuantityGoodsInOrders() {
        return quantityGoodsInOrders;
    }

    public void setCreateorder(Date createorder) {
        this.createorder = createorder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantityGoodsInOrders(List<QuantityGoodsInOrder> quantityGoodsInOrders) {
        this.quantityGoodsInOrders = quantityGoodsInOrders;
    }

    public int getCountgoods() {
        return countgoods;
    }

    public void setCountgoods(int countgoods) {
        this.countgoods = countgoods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }
}

package application.entity.goods;

import application.entity.currency.Current;
import application.entity.orders.Order;
import application.entity.orders.QuantityGoodsInOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(targetEntity = Current.class, fetch = FetchType.EAGER)
    @JoinColumn(name="current_id")
    Current current;//id валюты
    @ManyToOne(targetEntity = Category.class,fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    Category category;//id категории
    @ManyToOne(targetEntity = Factory.class,fetch = FetchType.EAGER)
    @JoinColumn(name="factory_id")
    Factory factory;//id производителя
    @ManyToOne(targetEntity = Groups.class,fetch = FetchType.EAGER)
    @JoinColumn(name="groups_id")
    Groups groups;//id группы
    @ManyToOne(targetEntity = Uzel.class,fetch = FetchType.EAGER)
    @JoinColumn(name="uzel_id")
    Uzel uzel;//id узел
    //-------------------------
    //    @JoinColumn(name="id")
    @OneToOne(targetEntity = QuantityGoodsInOrder.class)
    @PrimaryKeyJoinColumn
    @JsonIgnore
    private QuantityGoodsInOrder quantityGoodsInOrder;
    //-------------------------
    @Column(length = 12)
    String num;//кассовый номер
    @Column(length = 20)
    String catalog;//каталожный номер
    @Column(length = 30)
    String name;//название
    @Column(length = 6)
    String unit;//еденица измерения
    @Column(length = 20)
    String mark;//маркировка

    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
    double inprice;//входная цена

    @Column(name="in_arhive",nullable = false)
    boolean inarhive=false;

    boolean countprice;//вычисляемая цена
    @Column(columnDefinition = "TINYINT")
    int addition;//наценка

    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
    double outprice;//выходная цена
    @Transient
    double priceouttable;

    public void countPiceForUser (){
      if(this.countprice){
          this.priceouttable=(((double)this.addition/100)+1)*this.inprice*this.current.getRate();
      }else {
          this.priceouttable=this.outprice*this.current.getRate();
      }
    }

}

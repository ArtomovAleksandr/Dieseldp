package application.entity.goods;

import application.entity.currency.Current;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
//изменить в стрке 20 fabrica to factory
@Data
@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
//    @ManyToOne(targetEntity = Current.class, fetch = FetchType.EAGER)
//    Current current;//id валюты
    @ManyToOne(targetEntity = Category.class,fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    Category category;//id категории
  //  @ManyToOne(targetEntity = Factory.class,fetch = FetchType.EAGER)
  //  Factory factory;//id производителя
 //   @ManyToOne(targetEntity = Groups.class,fetch = FetchType.EAGER)
 //   Groups groups;//id группы
 //   @ManyToOne(targetEntity = Uzel.class,fetch = FetchType.EAGER)
 //   Uzel uzel;//id узел
    @Column(length = 12)
    String num;//кассовый номер
    @Column(length = 20)
    String katalog;//каталожный номер
    @Column(length = 30)
    String name;//название
//    @Column(columnDefinition = "VARCHAR(100)")
    @Column(length = 6)
    String unit;//еденица измерения
    @Column(length = 20)
    String mark;//маркировка

    @Column(columnDefinition = "Decimal(10,2) default '0.00'")
    double inprice;//входная цена
 //   boolean countprice;//вычисляемая цена
    @Column(columnDefinition = "TINYINT")
    int addition;//наценка
 /*   @Column(precision = 8,scale = 2)
    @Type(type="big_decimal")
    double outprice;//выходная цена  */
  //  int mincount;//минимальное количество
  //  int maxcount;//максимальное количество
  //  String urlfoto;


    public Goods() {
    }

    public String getKatalog() {
        return katalog;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getMark() {
        return mark;
    }

    public double getInprice() {
        return inprice;
    }

    public int getAddition() {
        return addition;
    }

    public Category getCategory() { return category; }

  //  public Factory getFactory() { return factory; }

    public void setNum(String num) {
        this.num = num;
    }

    public void setKatalog(String katalog) {
        this.katalog = katalog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setInprice(double inprice) { this.inprice = inprice; }

    public void setCategory(Category category) {
        this.category = category;
    }

 /*   public void setFactory(Factory factory) {
        this.factory = factory;
    }*/

    public void setAddition(int addition) {
        this.addition = addition;
    }
}

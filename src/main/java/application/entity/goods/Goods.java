package application.entity.goods;

import application.entity.currency.Current;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(targetEntity = Current.class, fetch = FetchType.EAGER)
    Current current;//id валюты
    @ManyToOne(targetEntity = Category.class,fetch = FetchType.EAGER)
    Category category;//id категории
    @ManyToOne(targetEntity = Factory.class,fetch = FetchType.EAGER)
    Factory fabrica;//id производителя
    @ManyToOne(targetEntity = Groups.class,fetch = FetchType.EAGER)
    Groups group;//id группы
    @ManyToOne(targetEntity = Uzel.class,fetch = FetchType.EAGER)
    Uzel uzel;//id узел
    String num;//кассовый номер
    String katalog;//каталожный номер
    String name;//название
    String unit;//еденица измерения
    String mark;//маркировка
    @Column(precision = 8,scale = 2)
    @Type(type="big_decimal")
    double inprice;//входная цена
    boolean countprice;//вычисляемая цена
    @Column(precision = 4,scale = 2)
    @Type(type="big_decimal")
    double rate;
    @Column(precision = 8,scale = 2)
    @Type(type="big_decimal")
    double outprice;//выходная цена
    int mincount;//минимальное количество
    int maxcount;//максимальное количество
    String urlfoto;
}

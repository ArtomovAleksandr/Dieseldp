package application.entity.goods;

import lombok.Data;

import javax.persistence.*;

//категория
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    boolean visible;
    @Column(columnDefinition = "TINYINT")
    int metric;
    String name;
    public Category(){}
}

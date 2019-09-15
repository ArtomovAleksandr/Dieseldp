package application.entity.goods;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//категория
@Data
@Entity
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Boolean visible;
    @Column(columnDefinition = "TINYINT")
    private int metric;
    private String name;
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    @JsonIgnore
    List<Goods> goods=new ArrayList<>();

}

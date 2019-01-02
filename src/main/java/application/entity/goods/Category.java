package application.entity.goods;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Transient
    int show_namber;

    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    @JsonIgnore
    List<Goods> goods=new ArrayList<>();

    public Category(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setShow_namber(int show_namber) {
        this.show_namber = show_namber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

package application.entity.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//узел
@Data
@Entity
public class Uzel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Column(columnDefinition = "default 'true'")
    boolean visible;
    @Transient
    int show_namber;
    public Uzel(){}
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "uzel_id")
    @JsonIgnore
    List<Uzel> uzels=new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShow_namber(int show_namber) {
        this.show_namber = show_namber;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
}

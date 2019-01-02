package application.entity.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//производитель
@Data
@Entity
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length = 20)
    String name;
    @Transient
    int show_namber;

    public Factory() {
    }
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "factory_id")
    @JsonIgnore
    List<Factory> factories=new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShow_namber(int show_namber) {
        this.show_namber = show_namber;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getShow_namber() {
        return show_namber;
    }

    public List<Factory> getFactories() {
        return factories;
    }
}

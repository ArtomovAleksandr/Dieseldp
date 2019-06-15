package application.entity.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//группа
@Data
@Entity
public class Groups {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
    String name;
    @Transient
    int show_namber;
    public Groups(){}
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "groups_id")
    @JsonIgnore
    List<Groups> groups=new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

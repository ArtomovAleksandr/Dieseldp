package application.entity.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//узел
@Data
@Entity
@NoArgsConstructor
public class Uzel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Column(columnDefinition = "boolean default true",nullable = false)
    boolean visible;
    @Transient
    int show_namber;
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "uzel_id")
    @JsonIgnore
    List<Uzel> uzels=new ArrayList<>();

}

package application.entity.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//производитель
@Data
@Entity
@NoArgsConstructor
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length = 20)
    String name;
    @Transient
    int show_namber;

    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "factory_id")
    @JsonIgnore
    List<Factory> factories=new ArrayList<>();

}

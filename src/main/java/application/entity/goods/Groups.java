package application.entity.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//группа
@Data
@Entity
@NoArgsConstructor
public class Groups {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
    String name;
    @Transient
    int show_namber;
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "groups_id")
    @JsonIgnore
    List<Groups> groups=new ArrayList<>();


}

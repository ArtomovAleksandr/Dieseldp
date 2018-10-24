package application.entity.goods;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//группа
@Data
@Entity
public class Groups {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
    String name;
    public Groups(){}
}

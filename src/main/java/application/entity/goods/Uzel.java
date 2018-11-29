package application.entity.goods;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//узел
@Data
@Entity
public class Uzel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    public Uzel(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

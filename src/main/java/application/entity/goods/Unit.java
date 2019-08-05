package application.entity.goods;

import lombok.Data;

import javax.persistence.*;
//удалить
//единица измерения товара(шт., к-т., см.)
@Data
@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(columnDefinition = "VARCHAR(20)")
    String name;
    public Unit() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

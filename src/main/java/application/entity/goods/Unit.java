package application.entity.goods;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//удалить
//единица измерения товара(шт., к-т., см.)
@Data
@Entity
@NoArgsConstructor
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(columnDefinition = "VARCHAR(20)")
    String name;

}

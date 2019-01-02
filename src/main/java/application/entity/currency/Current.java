package application.entity.currency;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@Entity
public class Current {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String shortname;
    @Column(columnDefinition = "Decimal(10,2) default '1.00'")
    double rate;//входная цена
 //   @Column(columnDefinition = "default 'true'")
 //   boolean using;//
 //   @Column(precision = 6,scale = 2)
   // @Type(type="big_decimal")
   // private double value;
    public Current(){}
}

package application.entity.currency;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class HistoryCurrent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
 //   @ManyToOne(targetEntity = Current.class, fetch = FetchType.EAGER)
//    Current currents;
    @Column(columnDefinition = "date")
    Date date;
    @Column(precision = 6,scale = 2)
    @Type(type="big_decimal")
    double value;
    HistoryCurrent(){}


}

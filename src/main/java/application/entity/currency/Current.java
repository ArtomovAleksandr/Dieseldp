package application.entity.currency;

import application.entity.goods.Goods;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Current {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String shortname;
    @Column(columnDefinition = "Decimal(10,2) default '1.00'")
    double rate;//курс валюты
    public Current(){}
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Goods.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "current_id")
    @JsonIgnore
    List<Current> currents=new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getShortname() {
        return shortname;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }
}

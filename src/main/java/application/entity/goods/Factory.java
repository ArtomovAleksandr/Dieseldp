package application.entity.goods;

import lombok.Data;

import javax.persistence.*;

//производитель
@Data
@Entity
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Transient
    int show_namber;

    public Factory() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShow_namber(int show_namber) {
        this.show_namber = show_namber;
    }
}

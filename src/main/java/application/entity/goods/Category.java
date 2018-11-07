package application.entity.goods;

import lombok.Data;

import javax.persistence.*;

//категория
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    boolean visible;
    @Column(columnDefinition = "TINYINT")
    int metric;
    String name;
    @Transient
    int show_namber;
    public Category(){}

    public void setShow_namber(int show_namber) {
        this.show_namber = show_namber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

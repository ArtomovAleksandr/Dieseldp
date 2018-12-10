package application.entity.goods;

import lombok.Data;

import javax.persistence.*;

//узел
@Data
@Entity
public class Uzel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    boolean visible;
    @Transient
    int show_namber;
    public Uzel(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShow_namber(int show_namber) {
        this.show_namber = show_namber;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
}

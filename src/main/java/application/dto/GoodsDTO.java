package application.dto;

import application.entity.goods.Category;
import lombok.Data;

@Data
public class GoodsDTO {
    int category;
    String num;
    String catalog;
    String name;
    String unit;
    String mark;
    double inprice;
    int addition;

    public GoodsDTO() {
    }

    public int getCategory() {
        return category;
    }

    public String getNum() {
        return num;
    }

    public String getCatalog() {
        return catalog;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getMark() {
        return mark;
    }

    public double getInprice() {
        return inprice;
    }

    public int getAddition() {
        return addition;
    }
}

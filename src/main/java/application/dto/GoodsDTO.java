package application.dto;

import application.entity.goods.Category;
import lombok.Data;

@Data
public class GoodsDTO {
    private int current;
   private int category;
   private int factory;
   private int groups;
   private int uzel;
   private String num;
   private String catalog;
   private String name;
   private String unit;
   private String mark;
   private double inprice;
   private int addition;

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

    public int getCurrent() {
        return current;
    }

    public int getFactory() {
        return factory;
    }

    public int getGroups() {
        return groups;
    }

    public int getUzel() {
        return uzel;
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

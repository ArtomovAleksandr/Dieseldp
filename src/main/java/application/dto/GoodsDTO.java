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
   private boolean countprice;
   private int addition;
   private double outprice;
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
    public boolean getCountprice() { return countprice; }
    public int getAddition() {
        return addition;
    }
    public double getOutprice() { return outprice; }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setFactory(int factory) {
        this.factory = factory;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }

    public void setUzel(int uzel) {
        this.uzel = uzel;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setInprice(double inprice) {
        this.inprice = inprice;
    }

    public void setCountprice(boolean countprice) {
        this.countprice = countprice;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public void setOutprice(double outprice) {
        this.outprice = outprice;
    }
}

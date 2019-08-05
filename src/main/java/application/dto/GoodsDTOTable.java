package application.dto;
import lombok.Data;

@Data
public class GoodsDTOTable {
    private int id;
    private String current;
    private String category;
    private String factory;
    private String groups;
    private String uzel;
    private String num;
    private String catalog;
    private String name;
    private String unit;
    private String mark;
    private double inprice;
    private boolean countprice;
    private int addition;
    private double outprice;
    private double price;//вычисл цена
    public GoodsDTOTable() {
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setCurrent(String current) {
        this.current = current;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public void setUzel(String uzel) {
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

    public void setPrice(double price) {
        this.price = price;
    }
}

package application.dto;

public class GoodsDTOFactory {
    private int factoryid;
    private String factoryname;
    public GoodsDTOFactory() {
    }

    public GoodsDTOFactory(int factoryid, String factoryname) {
        this.factoryid = factoryid;
        this.factoryname = factoryname;
    }

    public int getFactoryid() {
        return factoryid;
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryid(int factoryid) {
        this.factoryid = factoryid;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }
}

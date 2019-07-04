package application.dto;

import lombok.Data;

@Data
public class GoodsDTOTableAJAX {
    private String inputstr;
//    private boolean arhivebool;
//    private int factoryid;
//    private int categoryid;
//    private int groupsid;
//    private int uzelid;

    public GoodsDTOTableAJAX() {
    }

    public String getInputstr() {
        return inputstr;
    }

//    public boolean isArhivebool() {
//        return arhivebool;
//    }
//
//    public int getFactoryid() {
//        return factoryid;
//    }
//
//    public int getCategoryid() {
//        return categoryid;
//    }
//
//    public int getGroupsid() {
//        return groupsid;
//    }
//
//    public int getUzelid() {
//        return uzelid;
//    }

    public void setInputstr(String inputstr) {
        this.inputstr = inputstr;
    }

//    public void setArhivebool(boolean arhivebool) {
//        this.arhivebool = arhivebool;
//    }
//
//    public void setFactoryid(int factoryid) {
//        this.factoryid = factoryid;
//    }
//
//    public void setCategoryid(int categoryid) {
//        this.categoryid = categoryid;
//    }
//
//    public void setGroupsid(int groupsid) {
//        this.groupsid = groupsid;
//    }
//
//    public void setUzelid(int uzelid) {
//        this.uzelid = uzelid;
//    }
}

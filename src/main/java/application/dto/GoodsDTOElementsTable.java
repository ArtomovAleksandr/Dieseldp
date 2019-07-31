package application.dto;

import java.util.List;

public class GoodsDTOElementsTable {
    private List<GoodsDTOCategory> categoryList;
    private List<GoodsDTOFactory> factoryList;
    private List<GoodsDTOGroups> groupsList;
    private List<GoodsDTOUzel> uzelList;

    public GoodsDTOElementsTable() {
    }

    public void setCategoryList(List<GoodsDTOCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public void setFactoryList(List<GoodsDTOFactory> factoryList) {
        this.factoryList = factoryList;
    }

    public void setGroupsList(List<GoodsDTOGroups> groupsList) {
        this.groupsList = groupsList;
    }

    public void setUzelList(List<GoodsDTOUzel> uzelList) {
        this.uzelList = uzelList;
    }

    public List<GoodsDTOCategory> getCategoryList() {
        return categoryList;
    }

    public List<GoodsDTOFactory> getFactoryList() {
        return factoryList;
    }

    public List<GoodsDTOGroups> getGroupsList() {
        return groupsList;
    }

    public List<GoodsDTOUzel> getUzelList() {
        return uzelList;
    }
}

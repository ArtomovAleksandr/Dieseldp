package application.dto;

public class GoodsDTOCategory {
    private int categoryid;
    private String categoryname;

    public GoodsDTOCategory(int categoryid, String categoryname) {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
    }

    public GoodsDTOCategory() {
    }

    public int getCategoryid() {
        return categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}

package application.dto;

import lombok.Data;

@Data
public class GoodsDTOTableAJAX {
    private String inputstr;
    private boolean arhivebool;
    private int factoryid;
    private int categoryid;
    private int groupsid;
    private int uzelid;
    private int paginator;
    private int numberpage;
    public GoodsDTOTableAJAX() {
    }


}

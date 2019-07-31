package application.dto;

public class GoodsDTOUzel {
    private int uzelid;
    private String uzelname;

    public GoodsDTOUzel(int uzelid, String uzelname) {
        this.uzelid = uzelid;
        this.uzelname = uzelname;
    }

    public GoodsDTOUzel() {
    }

    public int getUzelid() {
        return uzelid;
    }

    public String getUzelname() {
        return uzelname;
    }

    public void setUzelid(int uzelid) {
        this.uzelid = uzelid;
    }

    public void setUzelname(String uzelname) {
        this.uzelname = uzelname;
    }
}

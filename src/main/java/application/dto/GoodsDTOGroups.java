package application.dto;

public class GoodsDTOGroups {
    private int groupsid;
    private String groupsname;

    public GoodsDTOGroups(int groupsid, String groupsname) {
        this.groupsid = groupsid;
        this.groupsname = groupsname;
    }

    public GoodsDTOGroups() {
    }

    public int getGroupsid() {
        return groupsid;
    }

    public String getGroupsname() {
        return groupsname;
    }

    public void setGroupsid(int groupsid) {
        this.groupsid = groupsid;
    }

    public void setGroupsname(String groupsname) {
        this.groupsname = groupsname;
    }
}

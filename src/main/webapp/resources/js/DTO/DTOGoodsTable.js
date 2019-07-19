class DTOGoodsTable{
    constructor(inputstr ,arhivebool,factoryid,categoryid,groupsid,uzelid,paginator,numberpage){
        this.inputstr=inputstr;
        this.arhivebool=arhivebool;
        this.factoryid=factoryid;
        this.categoryid=categoryid;
        this.groupsid=groupsid;
        this.uzelid=uzelid;
        this.paginator=paginator;
        this.numberpage=numberpage;
    }
    setNumberPage(numberpage){
        this.numberpage=numberpage;
    }
}
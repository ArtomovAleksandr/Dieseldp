$(function () {
    function goodsdata(){
        var inputstr=$('#number').val();
        // var arhivebool=true;
        // var factoryid=$('#factory').val();
        // var categoryid=$('#category').val();
        // var groupsid=$('#groups').val();
        // var uzelid=$('#uzels').val();
        var goods=new DTOGoodsTable(inputstr)//,arhivebool,factoryid,categoryid,groupsid,uzelid);
        return goods;
    }
    var servise=new AJAXService();

    function success(data) {
        console.log(data);
        createtable(data);
    }

    function fail() {
        console.log("error! goods");
        window.location.href="/category/show/1";
    }
    function sendAJAX(){
        servise.post("/api/v1.0/goods/rest",goodsdata(),success(),fail());
    }
    $('#number').bind('input',sendAJAX);
    $('#factory').on('change',sendAJAX);
    $('#category').on('change',function () {
        servise.post("/api/v1.0/goods/rest",goodsdata,success,fail);
    });
    $('#uzels').on('change',function () {
        servise.post("/api/v1.0/goods/rest",goodsdata,success,fail);
    });
    $('#factory').on('change',function () {
        servise.post("/api/v1.0/goods/rest",goodsdata,success,fail);
    });
});

$(function () {
    function goodsdata(){
        var inputstr=$('#number').val();
        var arhivebool=false;
        var factoryid=$('#factory').val();
        var categoryid=$('#category').val();
        var groupsid=$('#groups').val();
        var uzelid=$('#uzels').val();
        var paginator=$('#paginator').val();
        var numberpage=0;
        var goods=new DTOGoodsTable(inputstr,arhivebool,factoryid,categoryid,groupsid,uzelid,paginator,numberpage);
        return goods;
    }
    var servise=new AJAXService();
    function sendAJAX(){
        function success(data) {
            console.log(data);
            createtable(data);
            cretepaginator(data.hasPrevious,data.numberpage,data.totalpages,data.hasNext);

        }
        function fail() {
            console.log("error! goods");
            window.location.href="/category/show/1";
        }
        servise.post("/api/v1.0/goods/rest",goodsdata(),success,fail);
    }
    $('#number').bind('input',sendAJAX);
    $('#factory').on('change',sendAJAX);
    $('#category').on('change',sendAJAX);
    $('#uzels').on('change',sendAJAX);
    $('#groups').on('change',sendAJAX);
    $('#paginator').on('change',sendAJAX);
    function choiceFromLocalStorageCurentElement(e) {
        if(localStorage.getItem('page')===null) {
            return JSON.parse(localStorage.getItem('page')).current;
        }else{
            return -1;
        }
    }
    function choiceFromLocalStorageLastElement(e) {
        if(localStorage.getItem('page')===null) {
            return JSON.parse(localStorage.getItem('page')).last;
        }else{
            return -1;
        }
    }


    function choiseNumberPaginator(e){
        if(Number.isInteger(e)){
            return e;
        }else if(e=='««'){
            return 0;//первый елемент
        }else if(e=='«'){//предыдущий елемент
              var elem=choiceFromLocalStorageCurentElement(e);
              if(elem==-1){
                  return 1;
              }else {
                  return elem;
              }
        }else if(e=='»»'){//последний элемент
            var elem=choiceFromLocalStorageLastElement(e);
            if(elem==-1){
                return -1;
            }else {
                return elem;
            }
        }else if(e=='»'){//следущий элемент
            var elem=choiceFromLocalStorageCurentElement(e);
            if(elem==-1){
                return -1;
            }else {
                return elem;
            }
        }
        return 0;
    }

    $('#pagination').click(
        function (e) {
            e.preventDefault();

            console.dir(e.target.innerText);
             var page= e.target.innerText;
             var goods=goodsdata();
             goods.setNumberPage(page-1);
             sendAJAX();
        }
    );
});

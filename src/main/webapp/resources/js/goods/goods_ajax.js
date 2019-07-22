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
    function sendAJAX(page){
        function success(data) {
            console.log(data);
            createtable(data);
            cretepaginator(data.hasPrevious,data.numberpage,data.totalpages,data.hasNext);

        }
        function fail() {
            console.log("error! goods");
            window.location.href="/category/show/1";
        }
        var goods=goodsdata();
        goods.setNumberPage(page);
        servise.post("/api/v1.0/goods/rest",goods,success,fail);
    }
    $('#number').bind('input',function (){sendAJAX(0)});
    $('#factory').on('change',function (){sendAJAX(0)});
    $('#category').on('change',function (){sendAJAX(0)});
    $('#uzels').on('change',function (){sendAJAX(0)});
    $('#groups').on('change',function (){sendAJAX(0)});
    $('#paginator').on('change',function (){sendAJAX(0)});
    function choiceFromLocalStorageCurentElement(e) {
        if(localStorage.getItem('numberpage')===null) {
            return JSON.parse(localStorage.getItem('numberpage'));
        }else{
            return 0;
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
        if(e.match(/^[0-9]+$/) != null){
            return (parseInt(e)-1);
        }else if(e=='««'){
            return 0;//первый елемент
        }else if(e=='«'){//предыдущий елемент
             var elem=choiceFromLocalStorageCurentElement(e);
        //     if(elem==-1){
        //         return 1;
        //     }else {
        //         return elem;
        //     }
        // }else if(e=='»»'){//последний элемент
        //     var elem=choiceFromLocalStorageLastElement(e);
        //     if(elem==-1){
        //         return -1;
        //     }else {
        //         return elem;
        //     }
        // }else if(e=='»'){//следущий элемент
        //     var elem=choiceFromLocalStorageCurentElement(e);
        //     if(elem==-1){
        //         return -1;
        //     }else {
        //         return elem;
        //     }
        }
       // return 0;
    }

    $('#pagination').on('click',function (e) {
       // console.log($(this).text());
    //    }
   //     sendAJAX(1)
     //   function f(e) {
       //     e.preventDefault();

         //   console.log(e);
            if(e.target.classList.value.match('disabled')==null)
            {
                var out = choiseNumberPaginator(e.target.innerText);
                sendAJAX(out);
            }
         //    var page= e.target.innerText;
             //var goods=goodsdata();
            // goods.setNumberPage(page-1);

        }
    );
});

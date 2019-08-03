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
    //page- номер страницы
    function sendAJAX(goods){
        function success(data) {//данные страницы
            console.log(data);
            createtable(data);
            cretepaginator(data.hasPrevious,data.numberpage,data.totalpages,data.hasNext);

        }
        function fail() {
            console.log("error! goods");
            window.location.href="/category/show/1";
        }
      //  var goods=goodsdata();//опрашиваем данные страницы
     //   goods.setNumberPage(page);//устанавливаем номер страныцы
     //   saveElementsGoodsToLocalStorage(goods);//сохраняем в LocalStorage
        servise.post("/api/v1.0/goods/rest",goods,success,fail);
    }
    function readGoods(page) {
        let goodspage=goodsdata();//опрашиваем данные страницы
        saveElementsGoodsToLocalStorage(goodspage);//сохраняем в LocalStorage
        createGoods(goodspage,page);
    }
    function createGoods(goods,page) {
        goods.setNumberPage(page);
        sendAJAX(goods);
    }
    function sendAJAXandCreateElements(storage){
        function success(data) {
         //   console.log(data);
            //
            createElementsPage(storage,data);

        }
        function fail() {
           console.log("error AJAXElements");
        }
        servise.get('/api/v1.0/elementspage/all',null,success,fail);
    }

    $('#number').bind('input',function (){readGoods(0)});
    $('#factory').on('change',function (){readGoods(0)});
    $('#category').on('change',function (){readGoods(0)});
    $('#uzels').on('change',function (){readGoods(0)});
    $('#groups').on('change',function (){readGoods(0)});
    $('#paginator').on('change',function (){readGoods(0)});
    //сохраняем в LocalStorage
    function saveElementsGoodsToLocalStorage(goods) {
        var elements={
            factoryid:goods.factoryid,
            categoryid:goods.categoryid,
            uzelsid:goods.uzelid,
            groupsid:goods.groupsid,
            paginator:goods.paginator
        }
        localStorage.setItem('elementspage',JSON.stringify(elements));
    }
    function choiceFromLocalStorageCurentElement(e) {
        if(localStorage.getItem('numberpage')!==null) {
            return parseInt(localStorage.getItem('numberpage'));
        }else{
            return 0;
        }
    }
    function choiceFromLocalStorageLastElement(e) {
        if(localStorage.getItem('countpage')!==null) {
            return parseInt(localStorage.getItem('countpage'));
        }else{
            return 0;
        }
    }


    function choiseNumberPaginator(e){
        if(e.match(/^[0-9]+$/) != null){
            return (parseInt(e)-1);
        }else if(e=='««'){
            return 0;//первый елемент
        }else if(e=='«'){//предыдущий елемент
             let elem=choiceFromLocalStorageCurentElement(e);
             if(elem>0) {
                 return elem - 1;
             }else {
                 return 0;
             }
        }else if(e=='»»'){//последний элемент
            let elem=choiceFromLocalStorageLastElement(e);
            if(elem>0) {
                return elem - 1;
            }else {
                return 0;
            }
         }else if(e=='»'){//следущий элемент
            let elem=choiceFromLocalStorageCurentElement(e);
            return elem+1;
        }else {
             return 0;
        }
    }

    $('#pagination').on('click',function (e) {
             if(e.target.classList.value.match('disabled')==null)
            {
                let out = choiseNumberPaginator(e.target.innerText);
                readGoods(out);
            }

        }
    );
    function getElementsGoodsFromLocalStorage() {
        let elemetspage = JSON.parse(localStorage.getItem('elementspage'));
        if(elemetspage===null) {
            elemetspage={
                factoryid:0,
                categoryid:1,
                uzelsid:0,
                groupsid:0,
                paginator:5
            }
        }
        return elemetspage;
    }
    function createTableLoadPage(page,pageelements) {
        let elmentpage={
            archivebool:false,
            categoryid:pageelements.categoryid,
            factoryid:pageelements.factoryid,
            groupsid:pageelements.groupsid,
            inputstr:"",
            numberpage:page,
            paginator:pageelements.paginator,
            uzelid:pageelements.uzelsid
        }
        sendAJAX(elmentpage);
    }
    //получаем данные елементов страницы
    var pageelements=getElementsGoodsFromLocalStorage();
    sendAJAXandCreateElements(pageelements);
    createTableLoadPage(choiceFromLocalStorageCurentElement(),pageelements);
 //   sendAJAX(0);
 //   createElementsPage();
});

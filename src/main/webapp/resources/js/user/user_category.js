$(function () {
    var digital=2;
    var namestorage='basketstorge';
    var fulltimestorage=10000;//минуты
    $( ".order button").click(function() {
        $(this).parents('.capture-order').addClass('display-off');
        $(this).parents('.product-show').children().last().removeClass('display-off');
    });
     $('.basket-order-head button').click(function () {
         $(this).parents('.basket-show').addClass('display-off');
         $(this).parents('.product-show').children('.capture-order').removeClass('display-off');

     });

     $('.select-quantity-plus button').click(
         function () {
             let currentquantity=$(this).parent().siblings(".current-quantity");
             let inputelem= $(currentquantity).find('input');
             let buttomminus=currentquantity.siblings('.select-quantity-minus').find('button');
             let elemdata= inputelem.val();
             if(elemdata.match(/^[0-9]+$/)==null) {
                elemdata = 1;
                 $(buttomminus).attr('disabled',true);
             }else {
                 $(buttomminus).attr('disabled',false);
                 elemdata = parseInt(elemdata) + 1;
             }
             $(inputelem).val(elemdata);
             countprice(this,elemdata);

             });
     $('.select-quantity-minus button').click(function () {
         let currentquantity=$(this).parent().siblings(".current-quantity");
         let inputelem= $(currentquantity).find('input');
         let buttomminus=currentquantity.siblings('.select-quantity-minus').find('button');
         let elemdata= inputelem.val();
         if(elemdata.match(/^[0-9]+$/)==null) {
             elemdata=1;
         }else {
             elemdata = parseInt(elemdata) - 1;
         }
         if(elemdata==1){
             $(buttomminus).attr('disabled',true);
         }
         $(inputelem).val(elemdata);
         countprice(this,elemdata);
     });
     function countprice(e,elemdata) {
         let pricestr= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-div-price').children('.capture-name-price').text();
         let price= parseFloat(pricestr).toFixed(digital);
         $(e).parents('.order-main').siblings('.price-box').children('.total-price').text((elemdata*price).toFixed(digital));
     }
     //work with localstorage
     function ishaveStorahe(){
         if(localStorage.getItem(namestorage)!==null){
           return true;
         }
         return false;
     }
     function iscontainsItemById(goods) {
         let items=readStorage().goods;
         let flag = false;
         items.forEach(function (item) {
                  if (item.id==goods.id){
                      flag=true;
                  }
          });
         return flag;
     }
     function readStorage(){
         return JSON.parse(localStorage.getItem(namestorage));
     }
     function createNewStorage(e){
         let timenow=Date.now();
         let storage={
             time:timenow,
             goods: [
                 {id: e.id,name:e.name,factory:e.factory,catalog:e.catalog,unit:e.unit,price:e.price,quantity:e.quantity},

             ]

         }
         localStorage.setItem(namestorage,JSON.stringify(storage));
         basketShow(storage);
     }
     function createGoods(e){
         let id=$(e).val();
         let name= $(e).parents('.basket-show').children('.basket-order-head').children('.basket-name').children('.basket-description').text().trim();
         let catalog= $(e).parents('.basket-show').children('.basket-order-head').children('.basket-name').children('.basket-unit').text().trim();
         let factory= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-factory').children('.capture-name').text();
         let unit= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-unit').children('.capture-name').text();
         let price= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-div-price').children('.capture-name-price').text();
         let quantity=$(e).siblings(".current-quantity").find('input').val();
         let goods= new DTOGoodsStorage(id,name,factory,catalog,unit,price,quantity);
         return goods;
     }
     function addItemToLocalStorage(goodselem){
         let storagedata=readStorage();
         storagedata.goods.push(goodselem);
         localStorage.setItem(namestorage,JSON.stringify(storagedata));
         basketShow(storagedata);
     }
     function updateItemToLocalStorage(goodselem){
         let items=readStorage();
         let idv=items.goods;//.indexOf(goodselem.id);
         let remove=undefined;
         for(let i=0; i<idv.length;i++){
             if(idv[i].id==goodselem.id){
                 remove= idv.splice(i,1,goodselem);
                 break;
             }
         }
         if(remove!=undefined){
             localStorage.setItem(namestorage,JSON.stringify(items));
             basketShow(items);
         }
     }
     $('.to-basket').click(function () {
         let goodselem = createGoods(this);
         if(ishaveStorahe()){

             if(iscontainsItemById(goodselem)){
       //        console.log('isConteins');
               updateItemToLocalStorage(goodselem);

             }else{
         //        console.log('noContains');
                 addItemToLocalStorage(goodselem);
             }
         }else {
             createNewStorage(goodselem);
         }
     });
        
     function checkFullTime() {
         if(ishaveStorahe()){
            let timestorage=readStorage().time;
            let timenow=Date.now();
            let fulltime=((timenow-timestorage)/60000).toFixed(0);
       //     console.log('minute = '+fulltime);
            if(fulltimestorage<fulltime){
                localStorage.removeItem(namestorage);
            }

         }
     }
     function basketShow(e) {
       if(e.goods.length>0){
       $('#goods-basket').removeClass('display-off').text(e.goods.length);
        }
     }
     function readStorageForBasketShow()
     {
         if(ishaveStorahe()) {
             let goods = readStorage();
             basketShow(goods);
         }else{
             $('#goods-basket').addClass('display-off');
         }
     }
     checkFullTime();
     readStorageForBasketShow();

});



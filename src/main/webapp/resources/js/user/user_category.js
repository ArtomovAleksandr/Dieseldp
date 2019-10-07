$(function () {
    var digital=2;
    var namestorage='basketstorge';
    $( ".order button").click(function() {
        $(this).parents('.capture-order').css('display','none');
        $(this).parents('.product-border').children('.basket-show').css('display', 'flex');
    });
     $('.basket-order-head button').click(function () {
         $(this).parents('.basket-show').css('display','none');
         $(this).parents('.product-border').children('.capture-order').css('display', 'flex');

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


     $('.to-basket').click(function () {
         let goodselem = createGoods(this);
         if(ishaveStorahe(namestorage)){

             if(iscontainsItemById(goodselem.id,namestorage)){
       //        console.log('isConteins');
                updateItemToLocalStorage(goodselem.id,goodselem.quantity,namestorage);

             }else{
         //        console.log('noContains');
                 addItemToLocalStorage(goodselem,namestorage);
             }
         }else {
             createNewStorage(goodselem,namestorage);
         }
         readStorageForBasketShow(namestorage);
     });

     readStorageForBasketShow(namestorage);

});



$(function () {
    var digital = 2;
    var namestorage = 'basketstorge';
    // var fulltimestorage=10000;//минуты

    // $( ".order button").click(function() {
    //     $(this).parents('.capture-order').addClass('display-off');
    //     $(this).parents('.product-show').children().last().removeClass('display-off');
    // });
    //  $('.basket-order-head button').click(function () {
    //      $(this).parents('.basket-show').addClass('display-off');
    //      $(this).parents('.product-show').children('.capture-order').removeClass('display-off');
    //
    //  });
    //

    //  $('.select-quantity-minus button').click(function () {
    //      let currentquantity=$(this).parent().siblings(".current-quantity");
    //      let inputelem= $(currentquantity).find('input');
    //      let buttomminus=currentquantity.siblings('.select-quantity-minus').find('button');
    //      let elemdata= inputelem.val();
    //      if(elemdata.match(/^[0-9]+$/)==null) {
    //          elemdata=1;
    //      }else {
    //          elemdata = parseInt(elemdata) - 1;
    //      }
    //      if(elemdata==1){
    //          $(buttomminus).attr('disabled',true);
    //      }
    //      $(inputelem).val(elemdata);
    //      countprice(this,elemdata);
    //  });
    //  function countprice(e,elemdata) {
    //      let pricestr= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-div-price').children('.capture-name-price').text();
    //      let price= parseFloat(pricestr).toFixed(digital);
    //      $(e).parents('.order-main').siblings('.price-box').children('.total-price').text((elemdata*price).toFixed(digital));
    //  }
    //  //work with localstorage
    function ishaveStorahe() {
        if (localStorage.getItem(namestorage) !== null) {
            return true;
        }
        return false;
    }

     function iscontainsItemById(id) {
         let flag = false;
         if(!ishaveStorahe()){
             return flag;
         }
         let items=readStorage().goods;
         items.forEach(function (item) {
                  if (item.id==id){
                      flag=true;
                  }
          });
         return flag;
     }
    function readStorage() {
        if (ishaveStorahe()) {
            return JSON.parse(localStorage.getItem(namestorage));
        }
    }

    function createItems() {
        let conteinerproduct = $('.conteiner-product');
        let Arraygoodsdata = readStorage().goods;
        Arraygoodsdata.forEach(function (elem) {
            let flagdisabledbutton=true;
            if(parseInt(elem.quantity)>1){
                flagdisabledbutton=false;
            }
     //       console.log(elem.id);
            conteinerproduct.prepend(
                $('<div class="card-item product-border">')
                    .prepend($('<div class="checkbox-wrap">')
                        .prepend($('<div class="custom-control custom-checkbox">')
                            .prepend($('<input type="checkbox" class="custom-control-input checked-item" id="customCheck' + elem.id + '" checked>'))
                            .append($('<label class="custom-control-label" for="customCheck' + elem.id + '">'))))
                    .append($('<div class="cart-item-info">')
                        .prepend($('<div class="header">')
                            .prepend($('<div class="card-item-title">')
                                .prepend($('<div class="caterory-name">').text('Hаименование'))
                                .append($('<h3 class="title">').text(elem.name)))
                            .append($('<div class="vendor">')
                                .append($('<div class="caterory-name">').text('Каталожный номер'))
                                .append($('<div class="title">').text(elem.catalog))))
                        .append($('<div class="footer">')
                            .prepend($('<div class="quantity-wrap">')
                                .prepend($('<div class="quntity-container">')
                                    .prepend($('<div class="select-quantity">')
                                        .prepend($(' <div class="pirice-elem display-off">')
                                            .prepend($('<input class="id-hidden" value="'+elem.id+'">'))
                                            .prepend($('<input class="price-hidden" value="'+elem.price+'">')))
                                        .append($('<button class="select-quantity-button button-minus">')
                                            .prop('disabled',flagdisabledbutton)
                                            .prepend($('<i class="fa fa-minus" aria-hidden="true">')))
                                        .append($('<div class="current-quantity-basket">')
                                            .prepend($('<input type="text" value="' + elem.quantity + '">')))
                                        .append($('<div class="lot-packin-basket">').text(elem.unit))
                                        .append($('<button class="select-quantity-button button-plus">')
                                            .prepend($('<i class="fa fa-plus" aria-hidden="true">'))))))
                            .append($('<div class="price-wrap">')
                                .prepend($('<div class="price-hur">').text((parseInt(elem.quantity) * parseFloat(elem.price)).toFixed(digital)))
                                .append($('<div class="price-uni">').text('гр.')))))
            );

        });
    }

    createItems();
    createTotalPaimentPrice();
    function createTotalPaimentPrice(){
        let allcheckboxchecked=$('.conteiner-product').find( "input[type=checkbox]:checked").get();
        let summ=0;
     //   console.log('tipe summ -'+typeof(summ));
        allcheckboxchecked.forEach(function (e) {
             let selectquantity=$(e).parents('.checkbox-wrap').siblings('.cart-item-info').children('.footer').children('.quantity-wrap').children('.quntity-container').children('.select-quantity');
             let inputelem=$(selectquantity).children('.current-quantity-basket').find('input');
             let priceelem=$(selectquantity).children('.pirice-elem').children('.price-hidden').val();
             let elemdata= inputelem.val();
             summ=summ+parseInt(elemdata)*parseFloat(priceelem);

        });
        //summ.toFixed(digital);
        $('.total-paiment-price').text(summ);
   //     let abc= $('.price-hur');

    }
    $('#customCheck').change(function () {
        let flag=this.checked;
        let allcheckbox=$('.conteiner-product').find( "input[type=checkbox]");
         allcheckbox.prop('checked',flag);
        if(!flag) {
            $('.delete-position button').addClass('display-off');
        }else{
            $('.delete-position button').removeClass('display-off');
        }
        createTotalPaimentPrice();
    });
    $(".button-plus").click(function () {
          //   alert("Handler for .click() called.");
             let selectquantity=$(this).parents('.select-quantity');
             let inputelem=$(selectquantity).children('.current-quantity-basket').find('input');
             let priceelem=$(selectquantity).children('.pirice-elem').children('.price-hidden').val();
             let idelem=$(selectquantity).children('.pirice-elem').children('.id-hidden').val();
         //    let currentquantity=$(this).parent().siblings(".current-quantity");
           //  let inputelem= $(currentquantity).find('input');
             if(iscontainsItemById(idelem)){
                 let buttomminus = selectquantity.children('.button-minus');
                 let elemdata = inputelem.val();
                 if (elemdata.match(/^[0-9]+$/) == null) {
                     elemdata = 1;
                     $(buttomminus).attr('disabled', true);
                 } else {
                     $(buttomminus).attr('disabled', false);
                     elemdata = parseInt(elemdata) + 1;
                 }
                 updateItemToLocalStorage(idelem,elemdata);
                 $(inputelem).val(elemdata);
                 $(selectquantity).parents('.footer').children('.price-wrap').children('.price-hur').text((elemdata * parseFloat(priceelem)).toFixed(digital));
             }else {
                 window.location.reload(true);
             }
             createTotalPaimentPrice();

    });
    $(".button-minus").click(function () {
       // alert("Handler for .click() called.");
        let selectquantity=$(this).parents('.select-quantity');
        let inputelem=$(selectquantity).children('.current-quantity-basket').find('input');
        let priceelem=$(selectquantity).children('.pirice-elem').children('.price-hidden').val();
        let idelem=$(selectquantity).children('.pirice-elem').children('.id-hidden').val();
        if(iscontainsItemById(idelem)) {
            let buttomminus = selectquantity.children('.button-minus');
            let elemdata = inputelem.val();
            if (elemdata.match(/^[0-9]+$/) == null) {
                elemdata = 1;
            } else {
                elemdata = parseInt(elemdata) - 1;
            }
            if (elemdata == 1) {
                $(buttomminus).attr('disabled', true);
            }
            updateItemToLocalStorage(idelem,elemdata);
            $(inputelem).val(elemdata);
            $(selectquantity).parents('.footer').children('.price-wrap').children('.price-hur').text((elemdata * parseFloat(priceelem)).toFixed(digital));
        }else {
            window.location.reload(true);
        }
            createTotalPaimentPrice();
    });
    $('.checked-item').change(function () {
        let allcheckbox=$('.conteiner-product').find( "input[type=checkbox]").length;
        let allcheckboxchecked=$('.conteiner-product').find( "input[type=checkbox]:checked").length;
        if(allcheckbox==allcheckboxchecked){
            $('#customCheck').prop('checked',true);
        }else{
            $('#customCheck').prop('checked',false);
        }
        if(allcheckboxchecked>0){
            $('.delete-position button').removeClass('display-off');
        }else{
            $('.delete-position button').addClass('display-off');
        }
        createTotalPaimentPrice()
   //     console.log("allcheckbox ="+allcheckbox);
     //   console.log("allcheckboxchecked ="+allcheckboxchecked);
    });
    $('.delete-position button').click(function () {
         if($('#customCheck').prop('checked')&&ishaveStorahe()){
             localStorage.removeItem(namestorage);
             window.location.reload(true);
         }else {
             let allcheckboxchecked = $('.conteiner-product').find("input[type=checkbox]:checked");
             if (allcheckboxchecked.length > 0) {
                 allcheckboxchecked.get().forEach(function (e) {
                     let selectquantity=$(e).parents('.checkbox-wrap').siblings('.cart-item-info').children('.footer').children('.quantity-wrap').children('.quntity-container').children('.select-quantity');
                     let idelem=$(selectquantity).children('.pirice-elem').children('.id-hidden').val();
                     deleteItemToLocalStorage(idelem);
                 })
                 window.location.reload(true);
             }
         }
         console.log(allcheckboxchecked);
       //   alert('ok '+abc);
    });
    //  function createNewStorage(e){
    //      let timenow=Date.now();
    //      let storage={
    //          time:timenow,
    //          goods: [
    //              {id: e.id,name:e.name,factory:e.factory,catalog:e.catalog,unit:e.unit,price:e.price,quantity:e.quantity},
    //      //        {id: "10",name:e.name,factory:e.factory,catalog:e.catalog,unit:e.unit,price:e.price,quantity:e.quantity}
    //          ]
    //
    //      }
    //      localStorage.setItem(namestorage,JSON.stringify(storage));
    //      basketShow(storage);
    //  }
    //  function createGoods(e){
    //      let id=$(e).val();
    //      let name= $(e).parents('.basket-show').children('.basket-order-head').children('.basket-name').children('.basket-description').text().trim();
    //      let catalog= $(e).parents('.basket-show').children('.basket-order-head').children('.basket-name').children('.basket-unit').text().trim();
    //      let factory= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-factory').children('.capture-name').text();
    //      let unit= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-unit').children('.capture-name').text();
    //      let price= $(e).parents('.product-show').children('.capture-order').children('.capture').children('.capture-div-price').children('.capture-name-price').text();
    //      let quantity=$(e).siblings(".current-quantity").find('input').val();
    //      let goods= new DTOGoodsStorage(id,name,factory,catalog,unit,price,quantity);
    //      return goods;
    //  }
    //  function addItemToLocalStorage(goodselem){
    //      let storagedata=readStorage();
    //      storagedata.goods.push(goodselem);
    //      localStorage.setItem(namestorage,JSON.stringify(storagedata));
    //      basketShow(storagedata);
    //  }
     function updateItemToLocalStorage(id,quantity){
         let items=readStorage();
         let idv=items.goods;//.indexOf(goodselem.id);
         let remove=undefined;
         for(let i=0; i<idv.length;i++){
             if(idv[i].id==id){
                 let goodselem=idv[i];
                 goodselem.quantity=quantity;
                 remove= idv.splice(i,1,goodselem);
                 break;
             }
         }
         if(remove!=undefined){
             localStorage.setItem(namestorage,JSON.stringify(items));
             basketShow(items);
         }
     }
    function deleteItemToLocalStorage(id){
        let items=readStorage();
        let idv=items.goods;//.indexOf(goodselem.id);
        let remove=undefined;
        for(let i=0; i<idv.length;i++){
            if(idv[i].id==id){
              //  let goodselem=idv[i];
              //  goodselem.quantity=quantity;
                remove= idv.splice(i,1);
                break;
            }
        }
        if(remove!=undefined){
            localStorage.setItem(namestorage,JSON.stringify(items));
            basketShow(items);
        }
    }
    //  $('.to-basket').click(function () {
    //      let goodselem = createGoods(this);
    //      if(ishaveStorahe()){
    //
    //          if(iscontainsItemById(goodselem)){
    //    //        console.log('isConteins');
    //            updateItemToLocalStorage(goodselem);
    //
    //          }else{
    //      //        console.log('noContains');
    //              addItemToLocalStorage(goodselem);
    //          }
    //      }else {
    //          createNewStorage(goodselem);
    //      }
    //  });
    //
    //  function checkFullTime() {
    //      if(ishaveStorahe()){
    //         let timestorage=readStorage().time;
    //         let timenow=Date.now();
    //         let fulltime=((timenow-timestorage)/60000).toFixed(0);
    //    //     console.log('minute = '+fulltime);
    //         if(fulltimestorage<fulltime){
    //             localStorage.removeItem(namestorage);
    //         }
    //
    //      }
    //  }
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
    //  checkFullTime();
      readStorageForBasketShow();

});



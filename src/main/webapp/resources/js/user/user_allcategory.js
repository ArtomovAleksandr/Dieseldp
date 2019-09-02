$(function f() {
    var namestorage = 'basketstorge';
    function ishaveStorahe() {
        if (localStorage.getItem(namestorage) !== null) {
            return true;
        }
        return false;
    }
    function readStorage() {
        if (ishaveStorahe()) {
            return JSON.parse(localStorage.getItem(namestorage));
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
    readStorageForBasketShow();
});
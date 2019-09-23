function ishaveStorahe(namestorage) {
    if (localStorage.getItem(namestorage) !== null) {
        return true;
    }
    return false;
}
function readStorage(namestorage) {
    if (ishaveStorahe(namestorage)) {
        return JSON.parse(localStorage.getItem(namestorage));
    }
    return false;
}
function removeStorage(namestorage){
    if(ishaveStorahe(namestorage)){
        localStorage.removeItem(namestorage);
        return true;
    }
    return false;
}
// id,namestorage
function iscontainsItemById(id,namestorage) {
    let flag = false;
    let itemsgoods=readStorage(namestorage);
    if(!itemsgoods){
        return flag;
    }
    let items=itemsgoods.goods;
    items.forEach(function (item) {
        if (item.id==id){
            flag=true;
        }
    });
    return flag;
}
function updateItemToLocalStorage(id,quantity,namestorage){
    let itemsgood=readStorage(namestorage);
    if(!itemsgood){
        return false;
    }
    let idv=itemsgood.goods;//.indexOf(goodselem.id);
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
        localStorage.setItem(namestorage,JSON.stringify(itemsgood));
        //   basketShow(items);
        return  true;
    }
    return false;
}
function deleteItemToLocalStorage(id,namestorage){
    let itemsgoods=readStorage(namestorage);
    if (!itemsgoods){
        return false
    }
    let idv=itemsgoods.goods;//.indexOf(goodselem.id);
    let remove=undefined;
    for(let i=0; i<idv.length;i++){
        if(idv[i].id==id){
            remove= idv.splice(i,1);
            break;
        }
    }
    if(remove!=undefined){
        localStorage.setItem(namestorage,JSON.stringify(itemsgoods));
        return true;
    }
    return false;
}
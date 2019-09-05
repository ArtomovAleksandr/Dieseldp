$(function () {
    var namestorage = 'basketstorge';
    class Storage {
        constructor(id,quantity){
            this.id=id;
            this.quantity=quantity;
        }
    }
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
    function createNewGoods(oldgoods) {
        let goods=new Array();
        oldgoods.forEach(function (e) {
            let g=new Storage(e.id,e.quantity);
            goods.push(g);
        })
        return goods;
    }
    function createNewData(fone,name,oldgoods){
        let goods=createNewGoods(oldgoods)
        let newdata={
            fone:fone,
            name:name,
            goods:goods
        }
        return newdata;
    }
   $('#create-order').click(function () {
      if(!ishaveStorahe()){
          return;
      }
      let fone=  $('.client-fone-data input').val();

      let name=$('.client-name-data input').val();

      //  if(name.match(/[><;]+/)!=null){
      //     return;
      //  }
      // if(fone.match(/[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}/)==null){
      //  return;
      // }
      let storage=readStorage();
      let newdata=createNewData(fone,name,storage.goods);
      console.log(newdata);

   });



});
$(function () {
    // var namestorage = 'basketstorge';
    // class Storage {
    //     constructor(id,quantity){
    //         this.id=id;
    //         this.quantity=quantity;
    //     }
    // }
    // function ishaveStorahe() {
    //     if (localStorage.getItem(namestorage) !== null) {
    //         return true;
    //     }
    //     return false;
    // }
    // function readStorage() {
    //     if (ishaveStorahe()) {
    //         return JSON.parse(localStorage.getItem(namestorage));
    //     }
    // }
    // function createNewGoods(oldgoods) {
    //     let goods=new Array();
    //     oldgoods.forEach(function (e) {
    //         let g=new Storage(e.id,e.quantity);
    //         goods.push(g);
    //     })
    //     return goods;
    // }
    // function createNewData(fone,name,oldgoods){
    //     let goods=createNewGoods(oldgoods)
    //     let newdata={
    //         fone:fone,
    //         name:name,
    //     //    goods:goods
    //     }
    //     newdata:'hello'
    //     return newdata;
    // }


   $('#create-order').click(function (e) {

       let nameuzel='uzels';
       var uzels=new Uzel(nameuzel,1);
       function success() {
           console.log("done!");
           location.replace("/uzels/show/1");
       }
       function fail() {
           console.log("error!")
           location.replace("/uzels/show/1");
       }








      // if(!ishaveStorahe()){
      //     return;
      // }
      // let fone=  $('.client-fone-data input').val();
      //
      // let name=$('.client-name-data input').val();

      //  if(name.match(/[><;]+/)!=null){
      //     return;
      //  }
      // if(fone.match(/[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}/)==null){
      //  return;
      // }
      // let storage=readStorage();
      // var orderDto=createNewData(fone,name,storage.goods);
      // let servise=new AJAXService();
       let servise=new AJAXService();
       servise.post("/api/v1.0/uzels",uzels,success,fail);
       e.preventDefault();
    //  console.log(order);

   });



});
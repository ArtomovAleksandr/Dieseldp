$(function () {
   $("#save").click(
       function (e) {
           var number=$("#number").val();
           var catalog=$("#catalog").val();
           var factory=$("#factory").val();
           var category=$("#category").val();
           var groups=$("#groups").val();
           var uzel=$("#uzels").val();
           var name=$("#name").val();
           var unit=$("#unit").val();
           var mark=$("#mark").val();
           var inprice=$("#inprice").val();// сделать валидацию входной цены
           var addition=$("#addition").val();
         //  var goods=new Goods(category,factory,groups,uzel);
           var goods=new Goods(category,number,catalog,name,unit,mark,inprice,addition);
           function success() {
               console.log("done! goods");
               location.replace("/");
           }
           function fail() {
               console.log("error! goods");
               location.replace("/category/show/1")
        //       location.replace("/");
           }
           let servise=new AJAXService();
           servise.post("/api/v1.0/goods",goods,success,fail);
           e.preventDefault();
       }
   );
});
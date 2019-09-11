$(function () {
   $("#save").click(
       function (e) {
           var current=$("#current").val();
           var category=$("#category").val();
           var factory=$("#factory").val();
           var groups=$("#groups").val();
           var uzel=$("#uzels").val();
           var number=$("#number").val();//кассовый номер
           var catalog=$("#catalog").val();
           var name=$("#name").val();
           var unit=$("#unit").val();
           var mark=$("#mark").val();
           var inprice=$("#inprice").val();// сделать валидацию входной цены
           var countprice=false;
           if ($("#countprice").is(':checked')){
               countprice=true;
           }
           var addition=$("#addition").val();
           var outprice=$("#outprice").val();// сделать валидацию выходной цены
         //  var goods=new Goods(category,factory,groups,uzel);
           var goods=new Goods(current,category,factory,groups,uzel,number,catalog,name,unit,mark,inprice,countprice,addition,outprice);
           function success() {
               console.log("done! goods");
               location.replace("/goods/show");
           }
           function fail() {
               console.log("error! goods");
               location.replace("/category/show/1")

           }
           let servise=new AJAXService();
           servise.post("/api/v1.0/goods",goods,success,fail);
           e.preventDefault();
       }
   );
});
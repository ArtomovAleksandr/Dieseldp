$(function () {
   var button=$("#save");
   $("#save").click(
       function (e) {
          e.preventDefault();
          let name=$("#name").val();
          let category=new Category(name);
           function succes() {
               console.log("done!edit");
               location.replace("/category")
           }
           function fail(e) {
               console.log(e);
               console.log("error!");
           }
           let servise=new AJAXService();
           servise.put("/api/v1.0/category/"+button.val(),category,succes,fail);
       }
   );
});
$(function () {
   var button=$("#save");
   $("#save").click(
       function (e) {
          e.preventDefault();
          let name=$("#name").val();
          let uzel=new Uzel(name);
           function succes() {
               console.log("done!edit");
               location.replace("/usels/show/1")
           }
           function fail(e) {
               console.log(e);
               console.log("error!");
           }
           let servise=new AJAXService();
           servise.put("/api/v1.0/uzels/"+button.val(),uzel,succes,fail);
       }
   );
});
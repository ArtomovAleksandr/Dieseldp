$(function () {
   var button=$("#save");
   $("#save").click(function (e) {
      e.preventDefault();
      let name=$("#name").val();
      let factory=new Factory(name);
      function succes() {
          console.log("done!edit");
          location.replace("/factory/show/1")
      }
      function fail(e) {
         console.log(e);
         console.log("error!");
      }
      let servise=new AJAXService();
      servise.put("/api/v1.0/factory/"+button.val(),factory,succes,fail);
   });
});
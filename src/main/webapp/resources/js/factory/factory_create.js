$(function () {
   $("#save").click(
      function (e) {
          let name=$('#factory').val();
          var factory=new Factory(name);
          function success() {
              console.log("done!");
              location.replace("/factory/show/1")
          }
          function fail() {
              console.log("error!")
              location.replace("/factory/show/1")
          }
          let servise=new AJAXService();
          servise.post("/api/v1.0/factory",factory,success,fail);
          e.preventDefault();
      }

   ) ;
});

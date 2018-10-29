$(function () {
   $("#save").click(
      function (e) {
          let name=$('#factory').val();
          var factory=new Factory(name);
          function success() {
              console.log("done!");
          }
          function fail() {
              console.log("error!")
          }
          let servise=new AJAXService();
          servise.post("/api/v1.0/factory",factory,success,fail);
          e.preventDefault();
      }

   ) ;
});
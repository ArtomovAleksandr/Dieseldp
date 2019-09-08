$(function () {
     $('#create-order').click(function (e) {

     //   alert('hallo');

             let name='name';
             var uzels=new Uzel(name,1);
             function success() {
                 console.log("done!");
                 location.replace("/uzels/show/1");
             }
             function fail() {
                 console.log("error!")
                 location.replace("/uzels/show/1");
             }
             let servise=new AJAXService();
             servise.post("/api/v1.0/uzels",uzels,success,fail);
             e.preventDefault();


         }


     );
});
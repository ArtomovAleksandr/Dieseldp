$(function () {
   $("#del").click(
       function (e) {
           $del=$(this);
           let service=new AJAXService();
           function success() {
               $del.parent().parent().remove();
               console.log('done!');
           };

           function fail() {
               console.log('fail!');
           };

           service.del("/api/v1.0/category/" + $del.val(), success, fail);

       }
   );
});
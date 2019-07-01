$(function () {
    $('#number').bind('input',function () {
       var innumber=$(this).val();
       let servise=new AJAXService();
        function success(data) {
            console.log(data);
          //  location.replace("/");
        }
        function fail() {
            console.log("error! goods");
            location.replace("/category/show/1")
        }
        servise.post("/api/v1.0/goods/rest",innumber,success,fail);
    });
});
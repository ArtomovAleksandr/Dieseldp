$(function () {
    $(".del").click(
        function (e) {
       /*      $del=$(this);
            let name= $del.parent().children().eq(1).val();
          //  let name=$("#category").val();
            var category=new Category(name,0);
            function success() {
                console.log("done!");
                location.replace("/category/show/1")
            }
            function fail() {
                console.log("error!")
                location.replace("/category/show/1")
            }
            let servise=new AJAXService();
            servise.post("/api/v1.0/category",category,success,fail);
            e.preventDefault();*/

              e.preventDefault();
                $del=$(this);
                let service=new AJAXService();
                function success() {
                    $del.parent().parent().remove();
                    console.log('done!');
                };

                function fail() {
                    console.log('fail!');
                };

                service.post("/api/v1.0/category/move_basket/" + $del.val(), success, fail);

        }
    );
});
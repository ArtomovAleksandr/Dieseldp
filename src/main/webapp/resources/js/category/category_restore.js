$(function () {
    $(".restore").click(
        function (e) {
            e.preventDefault();
            $restore=$(this);
            let service=new AJAXService();
            let category=new Category("name");
            function success() {
            //    $del.parent().parent().remove();
                console.log('done!');
                location.replace("/category/show/1")
            };

            function fail() {
                console.log('fail!');
            };
            service.put("/api/v1.0/category/restore/"+$restore.val(),category,success,fail);
        }




    )


});

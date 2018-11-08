$(function () {
    $(".del").click(
        function (e) {
            e.preventDefault();
            $del=$(this);
            let service=new AJAXService();
            let category=new Category("name");
            function success() {
                $del.parent().parent().remove();
                console.log('done!');
            };

            function fail() {
                console.log('fail!');
            };
            service.put("/api/v1.0/category/move_basket/"+$del.val(),category,success,fail);
        }




    )






});

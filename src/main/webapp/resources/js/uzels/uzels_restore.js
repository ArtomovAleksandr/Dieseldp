$(function () {
    $(".restore").click(
        function (e) {
            e.preventDefault();
            $restore=$(this);
            let service=new AJAXService();
            let uzel=new Uzel("name");
            function success() {
            //    $del.parent().parent().remove();
                console.log('done!');
                location.replace("/uzels/show/1")
            };

            function fail() {
                console.log('fail!');
            };
            service.put("/api/v1.0/uzels/restore/"+$restore.val(),uzel,success,fail);
        }




    )


});

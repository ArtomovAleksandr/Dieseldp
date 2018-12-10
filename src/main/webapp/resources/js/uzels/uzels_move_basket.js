$(function () {
    $(".del").click(
        function (e) {
            e.preventDefault();
            $del=$(this);
            let service=new AJAXService();
            let uzel=new Uzel("name");
            function success() {
                $del.parent().parent().remove();
                console.log('done!');
            };

            function fail() {
                console.log('fail!');
            };
            service.put("/api/v1.0/uzels/move_basket/"+$del.val(),uzel,success,fail);
        }




    )






});

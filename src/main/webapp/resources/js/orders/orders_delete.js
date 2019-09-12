$(function () {
    $(".del").click(function (e) {
        e.preventDefault();
        $del=$(this);
        let service=new AJAXService();
        function success(e) {
            $del.parent().parent().remove();
            console.log(e);
            console.log('done!');
        };

        function fail() {
            console.log('fail!');
        };

        service.del("/api/v1.0/orders/delete/" + $del.val(), success, fail);

    })
});
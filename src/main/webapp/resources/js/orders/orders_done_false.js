$(function () {
    $(".order-restore").click(function (e) {
        e.preventDefault();
        $done=$(this);
        let service=new AJAXService();
        function success(e) {
            $done.parent().parent().remove();
            console.log(e);
            console.log('done!');
            window.location.reload(false);
        };

        function fail() {
            console.log('fail!');
            window.location.reload(false);
        };

        service.put("/api/v1.0/orders/setdonefalse/" + $done.val(), success, fail);

    })
});
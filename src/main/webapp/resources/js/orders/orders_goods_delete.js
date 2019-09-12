$(function () {
    $(".del").click(function (e) {
        e.preventDefault();
        $del=$(this);
        let service=new AJAXService();
        function success(e) {
        //    $done.parent().parent().remove();
          //  console.log(e);
            console.log('done!');
            window.location.reload(false);
        };

        function fail() {
            console.log('fail!');
            window.location.reload(false);
        };
        let idorder=$del.data('order');
        service.del("/api/v1.0/orders/delete/"+idorder+"/" + $del.val(), success, fail);

    })
});
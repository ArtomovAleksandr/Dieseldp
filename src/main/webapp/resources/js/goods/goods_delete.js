$(function () {
    $("#delete").click(
        function (e) {
            var checkbox=$('.mycheckbox:checked:first');
            let service=new AJAXService();
            function success() {
                window.location.reload();
                console.log('done!');

            };
            function fail() {
                console.log('fail!');
            };
            if(checkbox.length>0){
                var id=checkbox.data('id');
                service.del("/api/v1.0/goods/"+id,success,fail);

            }
        }
    )
});
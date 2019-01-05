$(function () {
    $("#countprice").click(
        function () {
            if ($(this).is(':checked')){
               console.log('checked');

            }else{
                console.log('onchecked');

            }
        });
    $("#inprice").change(
        function () {
            var out=$(this).val();
            console.log('chenge '+out);
        }
    );
    $("#outprice").bind('input',function () {
        var out=$(this).val();
        console.log('chenge '+out);
    });
    $("#current").on('change',
        function (e) {
           var selectVal=$(this).val();
           console.log('selectVal -'+selectVal);
           var data=$(this).find(':selected').data("cur");
       //    var data=$("#current").attr('data-current');
       //    var data=$(this).getAttribute('data-current');
           console.log('data - '+data);
           var val= $("#addition").val();
           console.log('addition '+val );
        }
    );
});
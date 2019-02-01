$(function () {
    $("#inprice").bind('input',function () {
        var inprice=$(this).val();
        var addition=$('#addition').val();
        var current=$('#current').find(':selected').data('cur');
        if($('#countprice').is(':checked')){
            $('#price').text(inprice*current*((addition/100)+1));
        //    console.log(inprice+' :: '+current+' // '+addition);
        }

    });
    $("#outprice").bind('input',function () {
        var outprice=$(this).val();
  //      var addition=$('#addition').val();
        var current=$('#current').find(':selected').data('cur');
        if(!$('#countprice').is(':checked')){
            $('#price').text(outprice*current);
        }

    });

    $("#countprice").click(
        function () {
            var current=$('#current').find(':selected').data('cur');
            if ($(this).is(':checked')){
                var inprice=$('#inprice').val();
                var addition=$('#addition').val();
                $('#price').text(inprice*current*((addition/100)+1));

            }else{
                var outprice=$('#outprice').val();
                $('#price').text(outprice*current);
            //    console.log('onchecked');
            }
        });
    $('#addition').bind('input',function () {
        if ($('#countprice').is(':checked')) {
            var inprice=$('#inprice').val();
            var addition=$(this).val();
            var current=$('#current').find(':selected').data('cur');
            $('#price').text(inprice*current*((addition/100)+1));
        }
    });

   $("#current").on('change',
        function (e) {
           var current=$(this).find(':selected').data("cur");

            if ($('#countprice').is(':checked')){
                var inprice=$('#inprice').val();
                var addition=$('#addition').val();
                $('#price').text(inprice*current*('1.'+addition));

            }else{
                var outprice=$('#outprice').val();
                $('#price').text(outprice*current);
            }
        }
    );
});
$(function () {
   function createprice() {
        var current=$('#current').find(':selected').data('cur');
        if ($('#countprice').is(':checked')) {
            var inprice=$('#inprice').val();
            var addition=$('#addition').val();
            $('#price').text(inprice*current*((addition/100)+1));
        }else {
            var outprice=$('#outprice').val();
            $('#price').text(outprice*current);

        }
    }
    createprice();
});
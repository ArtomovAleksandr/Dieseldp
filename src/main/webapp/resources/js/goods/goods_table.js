$(function () {
    $("#create").click(
        function () {
       //    console.log('enter')
            var checkbox=$('.mycheckbox:checked:first');
           if(checkbox.length>0){
             var id=checkbox.data('id');
               document.location.href="/goods/create_goods/"+id;
           }else{
               document.location.href="/goods/create";
           }
        }
    );

});
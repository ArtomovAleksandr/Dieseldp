$(function () {
    $("#create").click(

        function () {
           console.log('enter')
            var checkbox=$('.mycheckbox:checked:first');
           if(checkbox.length>0){
             var id=checkbox.data('id');
           //  Location.replace("goods/create_goods/"+id);
               document.location.href="/goods/create_goods/"+id;
           }else{
            //   location.replace("/goods/create");
               document.location.href="/goods/create";
            //  location.redirect("/goods/create");
           }
       //    console.log('stop');
        }
    )
});
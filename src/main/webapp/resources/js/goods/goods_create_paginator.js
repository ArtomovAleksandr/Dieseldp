function cretepaginator(isPrevious,numberelement,countelement,isLast) {
   var paginul=$("#pagination");
   paginul.children().remove();
   if(isPrevious) {
      paginul.append($('<li class="page-item"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">««</span>')));
      paginul.append($('<li class="page-item"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">«</span>')));
   }else {
       paginul.append($('<li class="page-item disabled"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">««</span>')));
       paginul.append($('<li class="page-item disabled"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">«</span>')));
   }
    for(var i=1;i<=countelement;i++){
       if(numberelement==i){
         paginul.append($('<li class="page-item active"></li>').append($('<a class="page-link" href="#">'+i+'</a>')));
       }else{
           paginul.append($('<li class="page-item"></li>').append($('<a class="page-link" href="#">'+i+'</a>')));
       }
   }
    if(isLast) {
        paginul.append($('<li class="page-item"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">»»</span>')));
        paginul.append($('<li class="page-item"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">»</span>')));
    }else {
        paginul.append($('<li class="page-item disabled"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">»»</span>')));
        paginul.append($('<li class="page-item disabled"></li>').append($('<a class="page-link" href="#" aria-label="Previous"></a>').append('<span aria-hidden="true">»</span>')));
    }
}
cretepaginator(false,2,6,true);
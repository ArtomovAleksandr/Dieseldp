$(function () {
    $('#number').bind('input',function () {
       var innumber=$(this).val();
       let servise=new AJAXService();
        function success(data) {
            console.log(data);
            var tbody=$("tbody");
            tbody.children().remove()
            for(var i=0;i<data.length;i++){
                var inputstr='';
                if(data[i].countprice==true){
                    inputstr='<input type="checkbox" disabled checked>';
                }else {
                    inputstr='<input type="checkbox" disabled>';
                }
                tbody.append($('<tr>')
                    .append($('<td>').append($('<div>').append('<input type="checkbox" class="mycheckbox" data-id="'+data[i].id+'">')))
                    .append($('<td>').append($('<div>').append(data[i].num)))
                    .append($('<td>').append($('<div>').append(data[i].name)))
                    .append($('<td>').append($('<div>').append(data[i].catalog)))
                    .append($('<td>').append($('<div>').append(data[i].unit)))
                    .append($('<td>').append($('<div>').append(data[i].mark)))
                    .append($('<td>').append($('<div>').append(Number(data[i].inprice).toFixed(1))))
                    .append($('<td>').append($('<div>').append(data[i].current)))
                    .append($('<td>').append($('<div>').append(inputstr)))
                    .append($('<td>').append($('<div>').append(data[i].addition)))
                    .append($('<td>').append($('<div>').append(Number(data[i].outprice).toFixed(1))))
                    .append($('<td>').append($('<div>').append(Number(data[i].price).toFixed(1))))
                    .append($('<td>').append($('<div>').append(data[i].factory)))
                    .append($('<td>').append($('<div>').append(data[i].category)))
                    .append($('<td>').append($('<div>').append(data[i].groups)))
                    .append($('<td>').append($('<div>').append(data[i].uzel)))
                )
            }

        }
        function fail() {
            console.log("error! goods");
            location.replace("/category/show/1")
        }
        servise.post("/api/v1.0/goods/rest",innumber,success,fail);
    });
});
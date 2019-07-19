
function createtable(datadto) {
        var data=datadto.goodsDTOTableList;
        var countdigit = 1;//количество знаков после запятой
        var tbody = $("tbody");
        tbody.children().remove();
        for (var i = 0; i < data.length; i++) {
            var inputstr = '';
            if (data[i].countprice == true) {
                inputstr = '<input type="checkbox" disabled checked>';
            } else {
                inputstr = '<input type="checkbox" disabled>';
            }
            tbody.append($('<tr>')
                .append($('<td>').append($('<div>').append('<input type="checkbox" class="mycheckbox" data-id="' + data[i].id + '">')))
                .append($('<td>').append($('<div>').append(data[i].num)))
                .append($('<td>').append($('<div>').append(data[i].name)))
                .append($('<td>').append($('<div>').append(data[i].catalog)))
                .append($('<td>').append($('<div>').append(data[i].unit)))
                .append($('<td>').append($('<div>').append(data[i].mark)))
                .append($('<td>').append($('<div>').append(numberdigit(data[i].inprice, countdigit))))
                .append($('<td>').append($('<div>').append(data[i].current)))
                .append($('<td>').append($('<div>').append(inputstr)))
                .append($('<td>').append($('<div>').append(data[i].addition)))
                .append($('<td>').append($('<div>').append(numberdigit(data[i].outprice, countdigit))))
                .append($('<td>').append($('<div>').append(numberdigit(data[i].price, countdigit))))
                .append($('<td>').append($('<div>').append(data[i].factory)))
                .append($('<td>').append($('<div>').append(data[i].category)))
                .append($('<td>').append($('<div>').append(data[i].groups)))
                .append($('<td>').append($('<div>').append(data[i].uzel)))
            )
        }

}

function numberdigit(x,count) {
    return Number(x).toFixed(count);
}

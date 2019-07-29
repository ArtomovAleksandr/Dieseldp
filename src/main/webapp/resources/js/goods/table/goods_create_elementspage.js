function createElementsPage() {
    var maindiv=$('.main-div');
    maindiv.prepend($('<div class="row mt-4"></div>')
        .append($('<div class="input-group col-md-3"></div>')
            .append($('<div class="input-group-prepend mb-3"></div>')
                .append($('<label class="input-group-text" for="factory">Производитель</label>')))
            .append($('<select class="custom-select" id="factor" name="factory"></select>')))
        .append($('<div class="input-group col-md-3"></div>')
            .append($('<div class="input-group-prepend mb-3"></div>')
                .append($('<label class="input-group-text" for="category" name="category">Категории</label>')))
            .append($('<select class="custom-select" id="categor"></select>')))
        .append($('<div class="input-group col-md-3"></div>')
            .append($('<div class="input-group-prepend mb-3"></div>')
                .append($('<label class="input-group-text" for="groups">Группы</label>')))
            .append($('<select class="custom-select" id="group"></select>')))
        .append($('<div class="input-group col-md-3"></div>')
            .append($('<div class="input-group-prepend mb-3"></div>')
                .append($('<label class="input-group-text" for="uzels">Узлы</label>')))
            .append($('<select class="custom-select" id="uzel"></select>')))
    );
    maindiv.prepend($('<div class="row"></div>')
        .append($('<div class="input-group col-md-6 mt-3"></div>')
            .append($('<div class="input-group-prepend"></div>')
                .append($('<label class="input-group-text" for="number">Поиск товара</label>')))
            .append($('<input type="text" id="number" class="form-control" name="number" placeholder="Введите критерий поиска ...">')))
        .append($('<div class="input-group col-md-2 mt-3"></div>')
            .append($('<div class="input-group-prepend"></div>')
                .append($('<label class="input-group-text" for="paginat">Кол. элем</label>')))
            .append($('<select class="custom-select" id="paginat"></select>'))));

    var pagin=$('#paginat');
    var arraypaginator = [5, 10, 15,20];
    arraypaginator.forEach(function(element) {
        if(element==10){
            pagin.append($('<option value="'+element+'" selected>'+element+'</option>'));
        }else {
            pagin.append($('<option value="'+element+'">'+element+'</option>'));
        }
    });
  //  maindiv.append()
}
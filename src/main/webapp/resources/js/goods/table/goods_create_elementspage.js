function createElementsPage(storage,elementpage) {


     var maindiv=$('.main-div');
    // maindiv.prepend($('<div class="row mt-4"></div>')
    //     .append($('<div class="input-group col-md-3"></div>')
    //         .append($('<div class="input-group-prepend mb-3"></div>')
    //             .append($('<label class="input-group-text" for="factory">Производитель</label>')))
    //         .append($('<select class="custom-select" id="factory" name="factory"></select>')))
    //     .append($('<div class="input-group col-md-3"></div>')
    //         .append($('<div class="input-group-prepend mb-3"></div>')
    //             .append($('<label class="input-group-text" for="category" name="category">Категории</label>')))
    //         .append($('<select class="custom-select" id="category"></select>')))
    //     .append($('<div class="input-group col-md-3"></div>')
    //         .append($('<div class="input-group-prepend mb-3"></div>')
    //             .append($('<label class="input-group-text" for="groups">Группы</label>')))
    //         .append($('<select class="custom-select" id="groups"></select>')))
    //     .append($('<div class="input-group col-md-3"></div>')
    //         .append($('<div class="input-group-prepend mb-3"></div>')
    //             .append($('<label class="input-group-text" for="uzels">Узлы</label>')))
    //         .append($('<select class="custom-select" id="uzels"></select>')))
    // );
    // maindiv.prepend($('<div class="row"></div>')
    //     .append($('<div class="input-group col-md-6 mt-3"></div>')
    //         .append($('<div class="input-group-prepend"></div>')
    //             .append($('<label class="input-group-text" for="number">Поиск товара</label>')))
    //         .append($('<input type="text"class="form-control" name="number" placeholder="Введите критерий поиска ...">').prop('id','number')))
    //     .append($('<div class="input-group col-md-2 mt-3"></div>')
    //         .append($('<div class="input-group-prepend"></div>')
    //             .append($('<label class="input-group-text" for="paginat">Кол. элем</label>')))
    //         .append($('<select class="custom-select" id="paginator"></select>'))));
    //
    var pagin=$('#paginator');
    var arraypaginator = ['5', '10', '15','20'];
    arraypaginator.forEach(function(element) {
        if(element==storage.paginator){
            pagin.append($('<option value="'+element+'" selected>'+element+'</option>'));
        }else {
            pagin.append($('<option value="'+element+'">'+element+'</option>'));
        }
    });
    var factory=$('#factory');
    var arrayfacrory=elementpage.data.factoryList;
    if(storage.factoryid=='0'){
        factory.append($('<option value="0" selected>Нет производителя</option>'));
    }else {
        factory.append($('<option value="0">Нет производителя</option>'));
    }
    arrayfacrory.forEach(function (e) {

        if(e.factoryid.toString()==storage.factoryid){
            factory.append($('<option value="'+e.factoryid+'" selected>'+e.factoryname+'</option>'));
        }else{
            factory.append($('<option value="'+e.factoryid+'">'+e.factoryname+'</option>'));
        }
    });
    var category=$('#category');
    var arraycategory=elementpage.data.categoryList;
    arraycategory.forEach(function (e) {
       if(e.categoryid.toString()==storage.categoryid){
           category.append($('<option value="'+e.categoryid+'" selected>'+e.categoryname+'</option>'));
       }else{
           category.append($('<option value="'+e.categoryid+'">'+e.categoryname+'</option>'));
       }
    });
    var groups=$('#groups');
    var arraygroups=elementpage.data.groupsList;
    if(storage.groupsid=='0') {
        groups.append($('<option value="0" selected>Нет группы</option>'));
    }else {
        groups.append($('<option value="0">Нет группы</option>'));
    }
    arraygroups.forEach(function (e) {
        if(e.groupsid.toString()==storage.groupsid){
            groups.append($('<option value="'+e.groupsid+'" selected>'+e.groupsname+'</option>'));
        }else{
            groups.append($('<option value="'+e.groupsid+'">'+e.groupsname+'</option>'));
        }
    });
    var uzels=$('#uzels');
    var arrayuzels=elementpage.data.uzelList;
    if(storage.uzelid=='0') {
        uzels.append($('<option value="0" selected>Нет узла</option>'));
    }else {
        uzels.append($('<option value="0">Нет узла</option>'));
    }
    arrayuzels.forEach(function (e) {
        if(e.uzelid.toString()==storage.uzelsid){
            uzels.append($('<option value="'+e.uzelid+'" selected>'+e.uzelname+'</option>'));
        }else{
            uzels.append($('<option value="'+e.uzelid+'">'+e.uzelname+'</option>'));
        }
    });

}
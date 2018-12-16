<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container main-div mt-3">
    <h1>Добавить товар</h1>
    <form id="form" class="form create-admin-form mt-3 mb-5">
          <div class="row">
              <div class="input-group col-md-6 mt-3">
                  <div class="input-group-prepend">
                       <label class="input-group-text" for="number">Кассовый номер</label>
                  </div>

                      <input type="text" id="number" class="form-control" name="number"
                           placeholder="Введите кассовый номер товара">
              </div>
              <div class="input-group col-md-6 mt-3">
                  <div class="input-group-prepend">
                      <label class="input-group-text" for="catalog">Каталож. номер</label>
                  </div>
                  <input type="text" id="catalog" class="form-control" name="catalog"
                         placeholder="Введите каталожный номер товара">
              </div>
          </div>
          <%--<div class="mt-4 row">--%>
              <%--<div class="col-md-4">--%>
                  <%--<label class="input-group-text" for="catalog">Каталож. номер</label>--%>
              <%--</div>--%>
              <%--<div class="col-md-8">--%>
                  <%--<input type="text" id="catalog" class="form-control" name="catalog"--%>
                         <%--placeholder="Введите каталожный номер товара">--%>
              <%--</div>--%>
          <%--</div>--%>
         <div class="row">
            <div class="input-group col-md mt-3">
                <div class="input-group-prepend">
                          <label class="input-group-text" for="goods">Название товара</label>
                </div>
                <input type="text" id="goods" class="form-control" name="namegoods"
                       placeholder="Введите название товара...">
            </div>
            <%--<div class="col-md-8">--%>

            <%--</div>--%>
         </div>
          <div class="mt-4 row">
              <div class="col-md-3">
                       <label for="unit">Еденица измерения</label>
              </div>
              <div class="col-md-2">
                    <select id="unit">
                      <option value="шт." selected>шт.</option>
                      <option value="к-т">к-т</option>
                      <option value="см.">см.</option>
                    </select>

              </div>
              <div class="col-md-3">
                  <label for="mark">Маркировка</label>
              </div>
              <div class="col-md-4">
                  <input type="text" id="mark" class="form-control" name="mark">
              </div>
          </div>
          <div class="row mt-4">
              <div class="col-md-3">
                  <label for="inprice">Входная цена</label>
              </div>
              <div class="col-md-3">
                  <input type="text" value="0.00" id="inprice" name="inprice" class="form-control" placeholder="Введите входную цену товара ...">
              </div>
              <div class="col-md-6 input-group">
                  <div class="input-group-prepend">
                      <label class="input-group-text" for="current">Валюта</label>
                  </div>
              <%--</div>--%>
              <%--<div class="col-md-3">--%>
                  <select class="costom-select ml-2" name="current" id="current">
                      <option value="1" selected>дол. США</option>
                      <option value="2">евро</option>
                      <option value="3">гривня</option>
                  </select>
              </div>
          </div>
          <div class="row mt-4">
                  <div class="col-md-3">
                      <label for="outprice">Исходящая цена</label>
                  </div>
                  <div class="col-md-3">
                      <input type="text" value="0.00" id="outprice" name="outprice" class="form-control" placeholder="Введите исходящую цену товара ...">
                  </div>
                  <div class="col-md-3">
                      <label>Наценка в %</label>
                  </div>
                  <div class="col-md-3">
                      <input type="text" value="100" id="">
                  </div>

          </div>
         <div class="row mt-4">
             <div class="input-group col-md-6">
                 <div class="input-group-prepend mb-3">
                     <label class="input-group-text" for="inputGroupSelect01">Options</label>
                 </div>
                <select class="custom-select" id="inputGroupSelect01">
                    <%--<option selected>Choose...</option>--%>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                 </select>
             </div>
             <div class="input-group col-md-6">
                 <div class="input-group-prepend mb-3">
                     <label class="input-group-text" for="inputGroupSelect02">Options</label>
                 </div>
                 <select class="custom-select" id="inputGroupSelect02">
                     <%--<option selected>Choose...</option>--%>
                     <option value="1">One</option>
                     <option value="2">Two</option>
                     <option value="3">Three</option>
                 </select>
             </div>
         </div>
        <div class="row mt-4">
            <div class="input-group col-md-6">
                <div class="input-group-prepend mb-3">
                    <label class="input-group-text" for="inputGroupSelect03">Options</label>
                </div>
                <select class="custom-select" id="inputGroupSelect03">
                    <%--<option selected>Choose...</option>--%>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
            <div class="input-group col-md-6">
                <div class="input-group-prepend mb-3">
                    <label class="input-group-text" for="inputGroupSelect04">Options</label>
                </div>
                <select class="custom-select" id="inputGroupSelect04">
                    <%--<option selected>Choose...</option>--%>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
        </div>

        <div class="mt-4 row">
            <div class="col-md-12 text-center">
                <button type="submit" id="save" class="btn btn-outline-danger pl-5 pr-5">
                    Сохранить
                </button>
            </div>
         </div>

    </form>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/DTO/DTOCategory.js"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/category/category_create.js"></script>

</body>
</html>


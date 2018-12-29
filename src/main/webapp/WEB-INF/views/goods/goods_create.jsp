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

         <div class="row">

            <div class="col-md-4 mt-3">
                <div>
                    <label class="input-group-text" for="goods">Название товара</label>
                </div>
            </div>
             <div class="input-group col-md-8 mt-3">
                 <div class="input-group">
                     <input type="text" id="goods" class="form-control" name="namegoods"
                                placeholder="Введите название товара...">
                 </div>
             </div>
         </div>
        <div class="row">
            <div class="input-group col-md-8 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="mark">Макировка</label>
                </div>

                <input type="text" id="mark" class="form-control" name="number"
                       placeholder="Введите маркировку товара">
            </div>
            <div class="input-group col-md-4 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="catalog">Еденица измерения</label>
                </div>
                <select class="form-control" id="unit">
                    <option value="шт." selected>шт.</option>
                    <option value="к-т">к-т</option>
                    <option value="см.">см.</option>
                </select>

            </div>
        </div>


        <div class="row">
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="mark">Входная цена</label>
                </div>

                <input type="text" id="inprice" class="form-control" name="number"
                       placeholder="Введите входную цену товара"   value="00.00">
            </div>
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="current">Еденица измерения</label>
                </div>
                <select class="form-control" id="current" name="current">
                    <option value="1" selected>дол. США</option>
                    <option value="2">евро</option>
                    <option value="3">гривня</option>
                </select>

            </div>
        </div>




        <div class="row">
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="number">Продажная цена</label>
                </div>

                <input type="text" id="outprice" class="form-control" name="outprice" value="00.00"
                       placeholder="Введите продажная цена товара">
            </div>
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="addition">Наценку в %</label>
                </div>
                <input type="text" id="addition" class="form-control" name="catalog" value="75"
                       placeholder="Введите наценку товара">

                <div class="input-group-prepend">
                    <label class="input-group-text" for="countprice">Вычисляем цену</label>
                    <div class="input-group-text">
                        <input type="checkbox" checked id="countprice">
                    </div>
                </div>
            </div>
            <%--<div class="input-group col-md-3 mt-3">--%>
                <%--<div class="input-group-prepend">--%>
                    <%--<label class="input-group-text" for="countprice">Вычисляем цену</label>--%>
                    <%--<div class="input-group-text">--%>
                        <%--<input type="checkbox" checked id="countprice">--%>
                    <%--</div>--%>
                <%--</div>--%>

            <%--</div>--%>
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


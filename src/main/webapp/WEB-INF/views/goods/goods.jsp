<%@ page import="application.entity.currency.Current" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<% Integer countpagin=(Integer) request.getAttribute("countpagin");%>
<c:import url="../template/header.jsp"></c:import>
<div class="container-fluid main-div mt-3">




  <%--  <h1>Редактировать товар:${goods.name}</h1>  --%>
     <%--<form id="form" class="form create-admin-form mt-3 mb-5">--%>
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
      <div class="row mt-4">
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="factory">Производитель</label>
              </div>
              <select class="custom-select" id="factory" name="factory">
                  <c:forEach items="${factorys}" var="factory">
                      <%--<c:choose>--%>
                         <%-- <c:when test="${goods.factory.id==factory.id}">
                              <option value="${factory.id}" selected>${factory.name}</option>
                          </c:when>
                          <c:otherwise>--%>
                              <option value="${factory.id}">${factory.name}</option>
                          <%--</c:otherwise>--%>
                      <%--</c:choose>--%>
                  </c:forEach>
              </select>
          </div>
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="category" name="category">Категории</label>
              </div>
              <select class="custom-select" id="category">
                  <c:forEach items="${categorys}" var="category">
                     <%-- <c:choose>
                          <c:when test="${goods.category.id==category.id}">
                              <option value="${category.id}"selected>${category.name}</option>
                          </c:when>
                          <c:otherwise>--%>
                              <option value="${category.id}">${category.name}</option>
                          <%--</c:otherwise>--%>
                      <%--</c:choose>--%>
                  </c:forEach>
              </select>
          </div>
      <%--</div>--%>
      <%--<div class="row mt-4">--%>
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="groups">Группы</label>
              </div>
              <select class="custom-select" id="groups">
                  <c:forEach items="${groups}" var="group">
                     <%-- <c:choose>
                          <c:when test="${goods.groups.id==group.id}">
                              <option value="${group.id}" selected>${group.name}</option>
                          </c:when>
                          <c:otherwise>--%>
                              <option value="${group.id}">${group.name}</option>
                     <%--     </c:otherwise>
                      </c:choose>--%>
                  </c:forEach>
              </select>
          </div>
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="uzels">Узлы</label>
              </div>
              <select class="custom-select" id="uzels">
                  <c:forEach items="${uzels}" var="uzel">
                     <%-- <c:choose>
                          <c:when test="${goods.uzel.id==uzel.id}">
                              <option value="${uzel.id}"selected>${uzel.name}</option>
                          </c:when>
                          <c:otherwise>--%>
                              <option value="${uzel.id}">${uzel.name}</option>
                         <%-- </c:otherwise>
                      </c:choose>--%>
                  </c:forEach>
              </select>
          </div>
      </div>
      <table class="table table-bordered">
          <thead>
          <tr>
              <th scope="col">#</th>
              <th scope="col">Касс. номер</th>
              <th scope="col">Наименование</th>
              <th scope="col">Катал. номер</th>
              <th scope="col">Ед. изм.</th>
              <th scope="col">Маркировка</th>
              <th scope="col">Входная цена</th>
              <th scope="col">Валюта</th>
              <th scope="col">Выч.цена</th>
             <th scope="col">наценка</th>
              <th scope="col">Прод.цена</th>
              <th scope="colgroup">Цена</th>
              <th scope="colgroup">Производитель</th>
              <th scope="colgroup">Категории</th>
              <th scope="colgroup">Группы</th>
              <th scope="colgroup">Узлы</th>


          </tr>
          </thead>
          <tbody>
          <c:forEach var="good" items="${goods}">
          <tr>
              <td>
                      <input type="checkbox" class="mycheckbox" data-id="${good.id}">

              </td>
              <td>
                  <div>
                      ${good.num}
                  </div>
              </td>
              <td>

                  <div>
                      ${good.name}
                  </div>

              </td>
              <td>
                  <div>
                      ${good.catalog}
                  </div>

              </td>
              <td>
                  <div>
                      ${good.unit}
                  </div>
              </td>
              <td>
                  <div>
                      ${good.mark}
                  </div>
              </td>
              <td>
                  <div>
                      ${good.inprice}
                  </div>
              </td>
              <td>
                  <div>
                      <c:forEach items="${currents}" var="current">
                          <c:choose>
                          <c:when test="${good.current.id==current.id}">
                              ${current.name}
                              <c:set var="cur" value="${current.rate}"/>

                          </c:when>
                          </c:choose>
                      </c:forEach>
                  </div>
              </td>
              <td>
                              <div>
                              <c:choose>
                                  <c:when test="${good.countprice==true}">
                                      <input type="checkbox" checked disabled>
                                  </c:when>
                                  <c:otherwise>
                                      <input type="checkbox" disabled>
                                  </c:otherwise>
                              </c:choose>
                              </div>
              </td>
                            <td>
                                <div>
                                    ${good.addition}
                                </div>
                            </td>
                            <td>
                                <div>
                                    ${good.outprice}
                                </div>
                            </td>
                            <td>
                                <div>
                                    <c:choose>
                                        <c:when test="${good.countprice==true}">


                                            ${good.inprice*(1+(good.addition/100))*cur}

                                        </c:when>
                                        <c:otherwise>
                                            ${good.outprice*cur}
                                        </c:otherwise>
                                    </c:choose>
                                </div>
              </td>
              <td>
              <div>
                  <c:forEach items="${factorys}" var="factory">
                      <c:choose>
                          <c:when test="${good.factory.id==factory.id}">
                              ${factory.name}
                          </c:when>
                      </c:choose>
                  </c:forEach>
              </div>
          </td>
              <td>
                  <div>
                      <c:forEach items="${categorys}" var="category">
                          <c:choose>
                              <c:when test="${good.category.id==category.id}">
                                  ${category.name}
                              </c:when>
                          </c:choose>
                      </c:forEach>
                  </div>
              </td>

          </td>
          <td>
              <div>
                  <c:forEach items="${groups}" var="group">
                      <c:choose>
                          <c:when test="${good.groups.id==group.id}">
                              ${group.name}
                          </c:when>
                      </c:choose>
                  </c:forEach>
              </div>
          </td>
              <td>
                  <div>
                      <c:forEach items="${uzels}" var="uzel">
                          <c:choose>
                              <c:when test="${good.uzel.id==uzel.id}">
                                  ${uzel.name}
                              </c:when>
                          </c:choose>
                      </c:forEach>
                  </div>
              </td>
          </tr>
          </c:forEach>


      </table>

      <div class="mt-4 row">
          <div class="col-md-12 text-center">
              <button type="submit" id="create" class="btn btn-outline-danger pl-5 pr-5">
                  Создать
              </button>
          </div>
          <div class="col-md-12 text-center">
          <button type="submit" id="archive" class="btn btn-outline-danger pl-5 pr-5">
              В Архив
          </button>
          </div>
          <div class="col-md-12 text-center">
              <button type="submit" id="update" class="btn btn-outline-danger pl-5 pr-5">
                  Редактировать
              </button>
          </div>
          <div class="col-md-12 text-center">
              <button type="submit" id="delete" class="btn btn-outline-danger pl-5 pr-5">
                  Удалить
              </button>
          </div>
      </div>




      <%--</div>--%>
       <%--  <div class="row">

            <div class="col-md-4 mt-3">
                <div>
                    <label class="input-group-text" for="name">Название товара</label>
                </div>
            </div>
             <div class="input-group col-md-8 mt-3">
                 <div class="input-group">
                     <input type="text" id="name" class="form-control" name="namegoods"
                      value="${goods.name}"  placeholder="Введите название товара...">
                 </div>
             </div>
         </div>
        <div class="row">
            <div class="input-group col-md-8 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="mark">Макировка</label>
                </div>

                <input type="text" id="mark" class="form-control" name="number"
                   value="${goods.mark}"    placeholder="Введите маркировку товара">
            </div>
            <div class="input-group col-md-4 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="unit">Еденица измерения</label>
                </div>
                <select class="form-control" id="unit">
                    <c:forEach items="${units}" var="unit">
                        <c:choose>
                           <c:when test="${unit.name==goods.unit}">
                              <option value="${unit.name}" selected>${unit.name}</option>
                           </c:when>
                            <c:otherwise>
                                <option value="${unit.name}">${unit.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>

                </select>

            </div>
        </div>


        <div class="row">
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="mark">Входная цена</label>
                </div>

                <input type="text" id="inprice" class="form-control" name="number"
                       placeholder="Введите входную цену товара"   value="${goods.inprice}">
            </div>
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="current">Еденица измерения</label>
                </div>
                <select class="form-control" id="current" name="current">
                    <c:forEach items="${currents}" var="current">
                        <c:choose>
                            <c:when test="${goods.current==current}">
                                <option value="${current.id}" data-cur="${current.rate}" selected >${current.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${current.id}" data-cur="${current.rate}">${current.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>

            </div>
        </div>




        <div class="row">
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="number">Продажная цена</label>
                </div>

                <input type="text" id="outprice" class="form-control" name="outprice" value="${goods.outprice}"
                       placeholder="Введите продажная цена товара">
            </div>
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="addition">Наценку в %</label>
                </div>
                <input type="text" id="addition" class="form-control" name="catalog" value="${goods.addition}"
                       placeholder="Введите наценку товара">

                <div class="input-group-prepend">
                    <label class="input-group-text" for="countprice">Вычисляем цену</label>
                    <div class="input-group-text">
                        <c:choose>
                          <c:when test="${goods.countprice==true}">
                                <input type="checkbox" checked id="countprice">
                          </c:when>
                            <c:otherwise>
                                <input type="checkbox" id="countprice">
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="input-group col-md-6 mt-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="number">Вычисляем цену, в грн.</label>
                </div>

                <label type="text" id="price" class="form-control"></label>
            </div>
            <div class="input-group col-md-6 mt-3">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked>
                    <label class="form-check-label" for="inlineRadio1">Наличие</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                    <label class="form-check-label" for="inlineRadio2">Под заказ</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3">
                    <label class="form-check-label" for="inlineRadio3">Архив</label>
                </div>
            </div>
        </div>
         <div class="row mt-4">
             <div class="input-group col-md-6">
                 <div class="input-group-prepend mb-3">
                     <label class="input-group-text" for="factory">Производитель</label>
                 </div>
                <select class="custom-select" id="factory" name="factory">
                    <c:forEach items="${factorys}" var="factory">
                        <c:choose>
                            <c:when test="${goods.factory.id==factory.id}">
                            <option value="${factory.id}" selected>${factory.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${factory.id}">${factory.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                 </select>
             </div>
             <div class="input-group col-md-6">
                 <div class="input-group-prepend mb-3">
                     <label class="input-group-text" for="category" name="category">Категории</label>
                 </div>
                 <select class="custom-select" id="category">
                     <c:forEach items="${categorys}" var="category">
                         <c:choose>
                             <c:when test="${goods.category.id==category.id}">
                                 <option value="${category.id}"selected>${category.name}</option>
                             </c:when>
                             <c:otherwise>
                                  <option value="${category.id}">${category.name}</option>
                             </c:otherwise>
                         </c:choose>
                     </c:forEach>
                 </select>
             </div>
         </div>
        <div class="row mt-4">
            <div class="input-group col-md-6">
                <div class="input-group-prepend mb-3">
                    <label class="input-group-text" for="groups">Группы</label>
                </div>
                <select class="custom-select" id="groups">
                    <c:forEach items="${groups}" var="group">
                        <c:choose>
                            <c:when test="${goods.groups.id==group.id}">
                                <option value="${group.id}" selected>${group.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${group.id}">${group.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
            </div>
            <div class="input-group col-md-6">
                <div class="input-group-prepend mb-3">
                    <label class="input-group-text" for="uzels">Узлы</label>
                </div>
                <select class="custom-select" id="uzels">
                    <c:forEach items="${uzels}" var="uzel">
                        <c:choose>
                            <c:when test="${goods.uzel.id==uzel.id}">
                                <option value="${uzel.id}"selected>${uzel.name}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${uzel.id}">${uzel.name}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="mt-4 row">
            <div class="col-md-12 text-center">
                <button type="submit" id="save" value="${goods.id}" class="btn btn-outline-danger pl-5 pr-5">
                    Сохранить
                </button>
            </div>
         </div>--%>

    <%--</form>--%>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/DTO/DTOGoods.js"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/goods_table.js" type="text/javascript"></script>
<%--
<script src="../../../resources/js/goods/goods_edit.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/create_price.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/create_price_edit.js" type="text/javascript"></script>
--%>
</body>
</html>


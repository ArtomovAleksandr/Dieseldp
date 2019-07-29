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
          <div class="row">
              <div class="input-group col-md-6 mt-3">
                  <div class="input-group-prepend">
                       <label class="input-group-text" for="number">Поиск товара</label>
                  </div>
                  <input type="text" id="number" class="form-control" name="number"
                          placeholder="Введите критерий поиска ...">
              </div>
              <div class="input-group col-md-2 mt-3">
                  <div class="input-group-prepend">
                      <label class="input-group-text" for="paginator">Кол. элем</label>
                  </div>
                  <select class="custom-select" id="paginator">
                      <option value="5" selected>5</option>
                      <option value="10" >10</option>
                      <option value="15" >15</option>
                      <option value="20" >20</option>
                  </select>
              </div>
          </div>
      <div class="row mt-4">
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="factory">Производитель</label>
              </div>
              <select class="custom-select" id="factory" name="factory">
                  <option value="0" selected>Нет производителя</option>
                  <c:forEach items="${factorys}" var="factory">
                              <option value="${factory.id}">${factory.name}</option>
                  </c:forEach>
              </select>
          </div>
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="category" name="category">Категории</label>
              </div>
              <select class="custom-select" id="category">
                  <c:forEach items="${categorys}" var="category">
                              <option value="${category.id}">${category.name}</option>
                  </c:forEach>
              </select>
          </div>
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="groups">Группы</label>
              </div>
              <select class="custom-select" id="groups">
                  <option value="0" selected>Нет группы</option>
                  <c:forEach items="${groups}" var="group">
                              <option value="${group.id}">${group.name}</option>
                  </c:forEach>
              </select>
          </div>
          <div class="input-group col-md-3">
              <div class="input-group-prepend mb-3">
                  <label class="input-group-text" for="uzels">Узлы</label>
              </div>
              <select class="custom-select" id="uzels">
                  <option value="0" selected>Нет узла</option>
                  <c:forEach items="${uzels}" var="uzel">
                              <option value="${uzel.id}">${uzel.name}</option>
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
              <th scope="colgroup">Производ.</th>
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
                                  <c:when test="${good.countprice}">
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
    <div class="mt-4 row justify-content-center">
              <nav>
                <ul class="pagination"id="pagination">
                    <c:choose>
                        <c:when test="${previous}" >
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">«</span>
                                </a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item disabled">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">««</span>
                                </a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                    <c:choose>
                        <c:when test="${previous}" >
                             <li class="page-item">
                                 <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">««</span>
                                  </a>
                             </li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item disabled">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">«</span>
                                </a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                    <c:forEach varStatus="loop" begin="1" end="${countpagin}"  >
                        <c:choose>
                        <c:when test="${loop.count==numberpagin}">
                                <li class="page-item active"><a class="page-link" href="#">${loop.count}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item"><a class="page-link" href="#">${loop.count}</a></li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:choose>
                    <c:when test="${next}" >
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">»</span>
                            </a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="page-item disabled">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">»</span>
                            </a>
                        </li>
                    </c:otherwise>
                </c:choose>
                    <c:choose>
                        <c:when test="${next}" >
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span aria-hidden="true">»»</span>
                                </a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item disabled">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span aria-hidden="true">»»</span>
                                </a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </nav>
        </div>
    </div>
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





</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/DTO/DTOGoods.js"></script>
<script src="../../../resources/js/DTO/DTOGoodsTable.js"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/table/goods_table.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/table/goods_delete.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/table/goods_create_elementspage.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/table/goods_create_table.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/table/goods_create_paginator.js" type="text/javascript"></script>
<script src="../../../resources/js/goods/table/goods_ajax.js" type="text/javascript"></script>

</body>
</html>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru" xmlns:th="http://www.thymeleaf.org">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container main-div">
    <h3>Заказ</h3>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">Имя</th>
                <th scope="col">Телефон</th>
                <th scope="col">Кол. позиций</th>

                <th colspan="4"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${order.name}</td>
                <td>${order.fone}</td>
                <td>${order.countgoods}</td>
                <%--<td></td>--%>
                <td colspan="4"></td>
            </tr>
            <tr>
                <th>Наименование</th>
                <th>Каталожный ном.</th>
                <th>Произвадитель</th>
                <th>Цена</th>
                <th>Кол.</th>
                <th>Сумма</th>
                <th></th>
            </tr>
            <c:forEach items="${order.quantityGoodsInOrders}" var="orders">
                <tr>
                    <td scope="row">${orders.goods.name}</td>
                    <td scope="row">${orders.goods.catalog}</td>
                    <td scope="row">${orders.goods.factory.name}</td>
                    <td scope="row">${orders.goods.priceouttable}</td>
                    <td scope="row">${orders.quantity}</td>
                    <td scope="row">${orders.totalgoods}</td>
                    <td colspan="2">
                                <button class="btn btn-outline-danger  del" data-order="${order.id}"  value="${orders.goods.id}">
                                    Удалить
                                </button>

                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="4"></td>
                <td>Итого</td>
                <td>${order.totalorder}</td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>


    <div class="container">
        <div class="mt-4 row justify-content-center">
            <nav>
                <ul class="pagination" id="pagination">

                    <c:forEach varStatus="loop" begin="1" end="${totalpage}">
                        <c:choose>
                            <c:when test="${loop.count==namberpage+1}">
                                <li class="page-item active"><a class="page-link"
                                                                href="/userorder/showfalsedone/${loop.count}">${loop.count}</a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item"><a class="page-link"
                                                         href="/userorder/showfalsedone/${loop.count}">${loop.count}"</a></li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </ul>
            </nav>
        </div>
    </div>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->

<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/orders/orders_goods_delete.js" type="text/javascript"></script>

</body>
</html>



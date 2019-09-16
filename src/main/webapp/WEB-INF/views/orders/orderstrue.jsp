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
    <h3>Выполненные заказы</h3>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Имя</th>
                <th scope="col">Телефон</th>
                <th scope="col">Кол. позиций</th>

                <th colspan="3">
                    <a href="/userorder/showfalsedone/1">
                        <button class="btn btn-outline-info">
                            Смотреть Заказы
                        </button>
                    </a>
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${orders}" var="order">
                <tr>
                    <th scope="row">${order.id}</th>
                    <td scope="row">${order.name}</td>
                    <td scope="row">${order.fone}</td>
                    <td scope="row">${order.countgoods}</td>
                    <td colspan="3">
                                <button class="btn btn-outline-danger  del"  value="${order.id}">
                                    Удалить
                                </button>

                                    <button class="btn btn-outline-success order-restore "
                                            value="${order.id}">
                                        Восстановить
                                    </button>

                    </td>
                </tr>
            </c:forEach>
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
<script src="../../../resources/js/orders/orders_delete.js" type="text/javascript"></script>
<script src="../../../resources/js/orders/orders_done_false.js" type="text/javascript"></script>

</body>
</html>



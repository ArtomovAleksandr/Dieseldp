<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru" xmlns:th="http://www.thymeleaf.org">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<%--<% Integer countpagin=(Integer) request.getAttribute("countpagin");%>--%>
<div class="container main-div">
    <h3>Заказы</h3>
    <%--<div class="tools-div form-control text-right">--%>
        <%--<a class="btn btn-outline-primary" href="/category/basket/show/1">В корзину</a>--%>
        <%--<a class="btn btn-outline-warning" href="/category/create">Создать</a>--%>
    <%--</div>--%>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">Имя</th>
                <th scope="col">Телефон</th>
                <th scope="col">Кол. позиций</th>

                <th colspan="3"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${orders}" var="order">
                <tr>
                    <th scope="row">${order.name}</th>
                    <td scope="row">${order.fone}</td>
                    <td scope="row">${order.countgoods}</td>
                    <td colspan="3">
                                <button class="btn btn-outline-danger  del"  value="${categor.id}">
                                    Удалить
                                </button>
                                <button class="btn btn-outline-danger  show-order"  value="${categor.id}">
                                      Смотреть
                                </button>
                                <a href="/category/${order.id}">
                                    <button class="btn btn-outline-info " name="id"
                                            value="${order.id}">
                                        Выполнено
                                    </button>
                                </a>

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
                    <%--<c:choose>--%>
                        <%--<c:when test="${hasprevios}">--%>
                            <%--<li class="page-item">--%>
                                <%--<a class="page-link" href="/user/category/${idcategory}/${namberpage}" aria-label="Previous">--%>
                                    <%--<span aria-hidden="true">&laquo;</span>--%>
                                    <%--<span class="sr-only">Previous</span>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                        <%--</c:when>--%>
                        <%--<c:otherwise>--%>
                            <%--<li class="page-item disabled">--%>
                                <%--<a class="page-link" href="/user/category/${idcategory}/${namberpage}" aria-label="Previous">--%>
                                    <%--<span aria-hidden="true">&laquo;</span>--%>
                                    <%--<span class="sr-only">Previous</span>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                        <%--</c:otherwise>--%>
                    <%--</c:choose>--%>
                    <c:forEach varStatus="loop" begin="1" end="${totalpage}">
                        <c:choose>
                            <c:when test="${loop.count==namberpage+1}">
                                <li class="page-item active"><a class="page-link"
                                                                href="/user/category/${idcategory}/${loop.count}">${loop.count}</a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item"><a class="page-link"
                                                         href="/user/category/${idcategory}/${loop.count}">${loop.count}</a></li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <%--<c:choose>--%>
                        <%--<c:when test="${hasnext}">--%>
                            <%--<li class="page-item">--%>
                                <%--<a class="page-link" href="/user/category/${idcategory}/${namberpage+2}" aria-label="Next">--%>
                                    <%--<span aria-hidden="true">&raquo;</span>--%>
                                    <%--<span class="sr-only">Next</span>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                        <%--</c:when>--%>
                        <%--<c:otherwise>--%>
                            <%--<li class="page-item disabled">--%>
                                <%--<a class="page-link" href="/user/category/${idcategory}/${namberpage+2}" aria-label="Next">--%>
                                    <%--<span aria-hidden="true">&raquo;</span>--%>
                                    <%--<span class="sr-only">Next</span>--%>
                                <%--</a>--%>
                            <%--</li>--%>

                        <%--</c:otherwise>--%>
                    <%--</c:choose>--%>
                </ul>
            </nav>
        </div>
    </div>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<%--<script src="../../../resources/js/DTO/DTOCategory.js" type="text/javascript"></script>--%>
<%--<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>--%>
<%--<script src="../../../resources/js/category/category_move_basket.js" type="text/javascript"></script>--%>

</body>
</html>



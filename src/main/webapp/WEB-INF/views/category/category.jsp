<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru" xmlns:th="http://www.thymeleaf.org">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<% Integer startnumber=(Integer) request.getAttribute("startnumber");%>
<c:set var="sum" scope="page" value="${1}"/>
<div class="container main-div">
    <h3>Категории</h3>
    <div class="tools-div form-control text-right">
        <a class="btn btn-outline-primary" href="/category/basket/show/1">В корзину</a>
        <a class="btn btn-outline-warning" href="/category/create">Создать</a>
    </div>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Название Категории</th>

                <th colspan="2"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach  items="${category}" var="categor">
                <tr>

                    <th scope="row"><%= ++startnumber %></th>

                    <td scope="row">${categor.name}</td>
                    <td colspan="2">
                                <button class="btn btn-outline-danger  del"  value="${categor.id}">
                                    Скрыть
                                </button>
                                <a href="/category/${categor.id}">
                                    <button class="btn btn-outline-info " name="id"
                                            value="${categor.id}">
                                        Редактировать
                                    </button>
                                </a>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


    <%--<nav aria-label="...">--%>
        <%--<ul class="pagination pagination-lg">--%>
           <%--<% for(int i=1;i<=countpagin;i++){ %>--%>
            <%--<li class="page-item"><a class="page-link" href="/category/show/<%=i%>" ><%= i %></a></li>--%>

            <%--<%}%>--%>

    <%--</nav>--%>
    <div class="mt-4 row justify-content-center">
    <nav>
        <ul class="pagination" id="pagination">
            <c:forEach varStatus="loop" begin="1" end="${totalpage}">
                <c:choose>
                    <c:when test="${loop.count==namberpage+1}">
                        <li class="page-item active"><a class="page-link"
                                                        href="/category/show/${loop.count}">${loop.count}</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="page-item"><a class="page-link"
                                                 href="/category/show/${loop.count}">${loop.count}</a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </ul>
    </nav>
    </div>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/DTO/DTOCategory.js" type="text/javascript"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/category/category_move_basket.js" type="text/javascript"></script>

</body>
</html>


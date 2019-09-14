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
<div class="container main-div">
    <h3>Корзина Категорий</h3>
    <div class="tools-div form-control text-right">
        <a class="btn btn-outline-primary" href="/category/show/1">К категориям</a>
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
            <c:forEach items="${category}" var="categor">
                <tr>
                    <th scope="row"><%= ++startnumber %></th>
                    <td scope="row">${categor.name}</td>
                    <td colspan="2">
                                <button class="btn btn-outline-danger  del"  value="${categor.id}">
                                    Удалить
                                </button>
                            <%--    <a href="/category/restore/${categor.id}"> --%>
                                    <button class="btn btn-outline-info restore" name="id"
                                            value="${categor.id}">
                                        Востановить
                                    </button>
                           <%--    </a>  --%>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


    <%--<nav aria-label="...">--%>
        <%--<ul class="pagination pagination-lg">--%>
           <%--<% for(int i=1;i<=countpagin;i++){ %>--%>
            <%--<li class="page-item"><a class="page-link" href="/category/basket/show/<%=i%>" ><%= i %></a></li>--%>

            <%--<%}%>--%>

    <%--</nav>--%>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/DTO/DTOCategory.js" type="text/javascript"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/category/category_delete.js" type="text/javascript"></script>
<script src="../../../resources/js/category/category_restore.js" type="text/javascript"></script>

</body>
</html>


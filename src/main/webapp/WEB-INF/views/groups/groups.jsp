<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru" xmlns:th="http://www.thymeleaf.org">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<% Integer countpagin=(Integer) request.getAttribute("countpagin");%>
<div class="container main-div">
    <h3>Группы</h3>
    <div class="tools-div form-control text-right">
        <a class="btn btn-outline-warning" href="/groups/create">Создать</a>
    </div>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Название Группы</th>
                <th colspan="2"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${groups}" var="group">
                <tr>
                    <th scope="row">${group.show_namber}</th>
                    <td scope="row">${group.name}</td>
                    <td colspan="2">
                                <button class="btn btn-outline-danger  del"  value="${group.id}">
                                    Удалить
                                </button>
                                <a href="/groups/${group.id}">
                                    <button class="btn btn-outline-info " name="id"
                                            value="${group.id}">
                                        Редактировать
                                    </button>
                                </a>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


    <nav aria-label="...">
        <ul class="pagination pagination-lg">
           <% for(int i=1;i<=countpagin;i++){ %>
            <li class="page-item"><a class="page-link" href="/groups/show/<%=i%>" ><%= i %></a></li>

            <%}%>
    </nav>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/groups/groups_delete.js" type="text/javascript"></script>
</body>
</html>


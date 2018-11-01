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
    <h3>Производители</h3>
    <div class="tools-div form-control text-right">
        <a class="btn btn-outline-warning" href="/factory/create">Создать</a>
    </div>
    <div>
        <table class="table table-bordered mt-2">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Название Производителя</th>
            <%--     <th scope="col">Email</th> --%>
                <th colspan="2"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${factory}" var="factor">
                <tr>
                    <th scope="row">${factor.show_namber}</th>
                    <td scope="row">${factor.name}</td>
              <%--       <td scope="row">${admin.email}</td> --%>
                    <td colspan="2">
                    <%--     <c:set var="current" scope="session" value="${login}"/> --%>
                    <%--    <c:choose> --%>
                           <%--   <a href="/factory/${factor.id}"> --%>
                                <button class="btn btn-outline-danger  del"  value="${factor.id}">
                                    Удалить
                                </button>
                           <%--   </a>  --%>

                                <a href="/factory/${factor.id}">
                                    <button class="btn btn-outline-info " name="id"
                                            value="${factor.id}">
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
            <li class="page-item"><a class="page-link" href="/factory/show/<%=i%>" ><%= i %></a></li>

            <%}%>
        <%--    <li class="page-item disabled">
                <a class="page-link" href="#" tabindex="-1">1</a>
            </li>
            <li class="page-item"><a class="page-link" href="/factory/show/2">2</a></li>
            <li class="page-item"><a class="page-link" href="/factory/show/3">3</a></li>
        </ul> --%>
    </nav>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/factory/factory_delete.js" type="text/javascript"></script>
<%-- <script src="../../../resources/js/admins/admins.js" type="text/javascript"></script>  --%>
</body>
</html>


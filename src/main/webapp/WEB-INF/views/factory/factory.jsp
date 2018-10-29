<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container main-div mt-md-5">
    <h1>Производители</h1>
    <div class="tools-div form-control text-right">
        <a class="btn btn-outline-warning ml-2" href="/factory/create">Create</a>
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
                    <th scope="row">${factor.id}</th>
                    <td scope="row">${factor.name}</td>
              <%--       <td scope="row">${admin.email}</td> --%>
                    <td colspan="2">
                    <%--     <c:set var="current" scope="session" value="${login}"/> --%>
                    <%--    <c:choose> --%>

                                <button class="btn btn-outline-danger m-2 del" type="submit" value="${factor.id}">
                                    Delete
                                </button>


                                <a href="/admins/${factor.id}">
                                    <button class="btn btn-outline-info m-2" name="id" type="submit"
                                            value="${factor.id}">
                                        Edit
                                    </button>
                                </a>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<%-- <script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/admins/admins.js" type="text/javascript"></script>  --%>
</body>
</html>


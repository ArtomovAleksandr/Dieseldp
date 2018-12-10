<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container main-div mt-3">
    <h1>Редактировать узел: ${uzels.name}</h1>
    <form id="form" class="form edit-admin-form mt-3 mb-5">
        <input type="text" value="${uzels.id}" name="id" hidden>
        <div class="row">
            <div class="col mt-2">
                <label for="name">Узел: </label>
            </div>
            <div class="col-md-8">
                <input type="text" id="name" class="form-control" name="name"
                       value="${uzels.name}" placeholder="Enter here...">
            </div>
        </div>

        <div class="mt-4 row">
            <div class="col-md-12 text-center">
                <button type="submit" id="save" value="${uzels.id}" class="btn btn-outline-success pl-5 pr-5">
                    Сохранить
                </button>
            </div>
        </div>
    </form>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->

<script src="../../../resources/js/DTO/DTOUzel.js" type="text/javascript"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/uzels/uzels_edit.js" type="text/javascript"></script>
</body>
</html>


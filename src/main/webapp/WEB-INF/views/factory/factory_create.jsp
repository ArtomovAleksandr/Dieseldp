<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <c:import url="../template/head.jsp"></c:import>
</head>

<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container main-div mt-3">
    <h1>Добавить производителя</h1>
    <form id="form" class="form create-admin-form mt-3 mb-5">
      <%--  <input type="text" id="id" name="id" hidden> --%>
        <div class="row">
            <div class="col mt-2">
                <label for="factory">Производитель</label>
            </div>
            <div class="col-md-8">
                <input type="text" id="factory" class="form-control" name="name"
                       placeholder="Введите название производителя...">
            </div>
        </div>
        <div class="mt-4 row">
            <div class="col-md-12 text-center">
                <button type="submit" id="save" class="btn btn-outline-danger pl-5 pr-5">
                    Сохранить
                </button>
            </div>
        </div>
    </form>
</div>
<c:import url="../template/footer.jsp"></c:import>
<!--Scripts-->
<script src="../../../resources/js/DTO/DTOFactory.js"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/factory/factory_create.js"></script>

</body>
</html>


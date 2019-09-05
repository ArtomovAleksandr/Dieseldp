<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <c:import url="../template/userhead.jsp"></c:import>
</head>
<body>
<div class="container">
    <%--<c:import url="../template/myprofil.jsp"></c:import>--%>
        <div class="row mt-2 ml-1 mr-1" id="top">
            <div class="col text-right">
                <i class="fa fa-phone"></i>
                <span class="d-none d-inline style-fa">+038 067 564-88-88</span>
                <a href="#">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <span class="d-none d-lg-inline style-fa">Мой профиль</span>
                </a>
                <a href="/user/bascket">
                    <div class="fa fa-shopping-cart  basket" aria-hidden="true">
                        <div id="goods-basket" class="display-off">2</div>
                    </div>
                    <span class="d-none d-lg-inline style-fa">Корзина</span>
                </a>
                <a href="#">
                    <i class="fa fa-share" aria-hidden="true"></i>
                    <span class="d-none d-lg-inline style-fa">Выход</span>
                </a>
            </div>
        </div>

    <div class="row mt-2 mr-1 ml-1" id="logo" >
        <div  style="width: 181px" >
            <img src="../../../resources/images/logo2.png" alt="diselexpert.com.ua">
        </div>
            <div class="col" id="repead-images">
        </div>
    </div>
        <nav id="menu" class="navbar navbar-expand-lg navbar-light mt-2">
            <a class="navbar-brand color_white" href="/user/allcategory/1">Меню</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto color_white">
                    <li class="nav-item">
                        <a class="nav-link color_white_hover" href="#">Отзывы</a>
                        <!--<span class="sr-only">(current)</span>-->
                    </li>
                    <li class="nav-item">
                        <a class="nav-link color_white_hover" href="#">Доставка</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link color_white_hover" href="#">Контакты</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link color_white_hover" href="#">О сервисе</a>
                    </li>
                </ul>
            </div>
        </nav>
</div>
<div class="container mt-3">

    <h5><span class="badge badge-light">ВСЕ КАТЕГОРИИ ТОВАРА</span></h5>
    <div class="row mb-2">
        <c:forEach items="${categorys}" var="category">
        <div class="product col-lg-3 col-md-3 col-sm-6">
            <a href="/user/category/${category.id}/1">
                <div class="product-border">
                    <div class="product-show">
                        <div class="image">
                          <img src="../../../resources/images/no-photo.jpg" alt="no image">
                        </div>
                        <div class="capture">
                            <h4>${category.name}</h4>
                        </div>
                    </div>
                </div>
            </a>
        </div>
        </c:forEach>
    </div>


</div>
<div class="container">
    <div class="mt-4 row justify-content-center">
        <nav>
            <ul class="pagination"id="pagination">
                <c:choose>
                    <c:when test="${hasprevios}">
                <li class="page-item">
                    <a class="page-link" href="/user/allcategory/${namberpage}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                        <span class="sr-only">Previous</span>
                    </a>
                </li>
                    </c:when>
                    <c:otherwise>
                        <li class="page-item disabled">
                            <a class="page-link" href="/user/allcategory/${namberpage}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                                <span class="sr-only">Previous</span>
                            </a>
                        </li>
                    </c:otherwise>
                </c:choose>
                <c:forEach varStatus="loop" begin="1" end="${totalpage}">
                    <c:choose>
                        <c:when test="${loop.count==namberpage+1}" >
                            <li class="page-item active"><a class="page-link" href="/user/allcategory/${loop.count}">${loop.count}</a></li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item"><a class="page-link" href="/user/allcategory/${loop.count}">${loop.count}</a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                <c:choose>
                <c:when test="${hasnext}">
                <li class="page-item">
                    <a class="page-link" href="/user/allcategory/${namberpage+2}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                        <span class="sr-only">Next</span>
                    </a>
                </li>
                </c:when>
                <c:otherwise>
                    <li class="page-item disabled">
                        <a class="page-link" href="/user/allcategory/${namberpage+2}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>

                </c:otherwise>
                </c:choose>
            </ul>
        </nav>
    </div>
</div>
<script src="../../../resources/js/user/user_allcategory.js" type="text/javascript"></script>
</body>
</html>

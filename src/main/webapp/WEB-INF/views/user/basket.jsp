<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <c:import url="../template/userhead.jsp"></c:import>
    <%--<link  href="../../../resources/css/style.css" rel="stylesheet">--%>
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
            <%--<img src="images/logo2.png" alt="diselexpert.com.ua">--%>
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

    <div class="row justify-content-md-center">
        <div class="col col-lg-8 col-sm-12 col-md-12 col-xl-8">
            <div class="image mb-2">Благодарим Вас за выбор товара</div>
            <div class="header  product-border">
                <div class="select-all">
                    <!--<form>-->
                    <div class="custom-control custom-checkbox">
                        <input type="checkbox" class="custom-control-input" id="customCheck" checked>
                        <label class="custom-control-label" for="customCheck">Выбрать все доступные товары</label>
                    </div>

                    <!--</form>-->
                </div>
                <div class="delete-position">
                    <button>
                        <i class="fa fa-trash" aria-hidden="true"></i>
                    </button>
                </div>
            </div>
            <div class="conteiner-product">

            </div>
            <div class="buy product-border">
                <div class="buy-totalpaiment-infoclient">
                    <div class="total-paiment">
                        <div class="total-paiment-title">К оплате</div>
                        <div class="total-paiment-price">00</div>
                        <div class="price-unit">гр.</div>
                    </div>
                    <div class="info-client">
                        <div class="info-client-fone">
                            <div class="client-fone">Введите номер телефона</div>
                            <div class="client-fone-data">
                                <input type="tel"  pattern="[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}" placeholder="050-567-88-88">
                            </div>
                        </div>
                        <div class="info-client-name">
                            <div class="client-name">Введите свое имя</div>
                            <div class="client-name-data">
                                <input type="text">
                            </div>
                        </div>
                    </div>
                </div>
                <button id="create-order">Оформить заказ</button>
            </div>

        </div>

    </div>


</div>
<script src="../../../resources/js/DTO/DTOUzel.js" type="text/javascript"></script>
<script src="../../../resources/js/services/AJAXService.js" type="text/javascript"></script>
<script src="../../../resources/js/user/user_basket.js" type="text/javascript"></script>
<script src="../../../resources/js/user/user_create_order.js" type="text/javascript"></script>
</body>
</html>

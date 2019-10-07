<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <c:import url="../template/userhead.jsp"></c:import>
    <link rel="stylesheet" href="../../../resources/css/styletitle.css">
    <link rel="stylesheet" href="../../../resources/css/stylecategory.css">
    <%--<link  href="../../../resources/css/style.css" rel="stylesheet">--%>

</head>
<body>
<div class="container">
    <%--<c:import url="../template/myprofil.jsp"></c:import>--%>
        <c:import url="../template/myprofil.jsp"></c:import>
        <c:import url="../template/logoheader.jsp"></c:import>
        <c:import url="../template/menuheader.jsp"></c:import>

</div>
<div class="container mt-3">

    <h5><span class="badge badge-light">ЗАПЧАСТИ</span></h5>
    <div class="row mb-2">
        <c:forEach items="${goods}" var="good">
            <div class="product col-xl-6 col-lg-6 col-md-12 col-sm-12 ">

                <div class="product-border">
                    <%--<div class="product-show">--%>
                        <div class="image">
                            <img src="https://wegstr.com/image/cache/catalog/NOVY%20SEDY%20MODEL/cnc-milling-machine-WEGSTR-ES-AUTO_LEVEL_NEW-220x180.jpg"
                                 alt="espanol">
                            <%--<img src="../../../resources/images/no-photo.jpg" alt="no image">--%>
                            <%--<img src="data:image/jpeg;base64,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" alt="plunger">--%>
                         </div>
                        <div class="capture-order">
                            <div class="capture">
                                <div class="capture-row-name">
                                    <div class="capture-descript">Наименование</div>
                                    <div class="capture-name">${good.name}</div>
                                </div>
                                <div class="capture-factory">
                                    <div class="capture-descript">Производитель</div>
                                    <div class="capture-name">${good.factory.name}</div>
                                </div>
                                <div class="capture-catalog">
                                    <div class="capture-descript">Каталожный номер</div>
                                    <div class="capture-name">${good.catalog}</div>
                                </div>
                                <div class="capture-unit">
                                    <div class="capture-descript">Еденица измерения</div>
                                    <div class="capture-name">${good.unit}</div>
                                </div>
                                <div class="capture-price">
                                    <div class="capture-descript-price">Цена</div>
                                    <div class="capture-name-price">${good.priceouttable}</div>
                                    <div class="capture-descript">гр.</div>
                                </div>

                            </div>
                            <div class="order">
                                <button>
                                    <i class="fa fa-plus" aria-hidden="true"></i>
                                </button>
                            </div>
                        </div>
                        <div class="basket-show">
                            <div class="basket-order-head">

                                <button>
                                    <i class="fa fa-arrow-left" aria-hidden="true"></i>

                                </button>

                                <div class="basket-name">
                                    <div class="basket-description">
                                        ${good.name}
                                    </div>
                                    <div class="basket-unit">
                                        ${good.catalog}
                                    </div>

                                </div>
                            </div>
                            <div class="order-main">
                                <div class="add-cart-wrap">
                                    <div class="select-quantity-minus">
                                        <button class="select-quantity-button" disabled>
                                            <i class="fa fa-minus" aria-hidden="true"></i>
                                        </button>

                                    </div>
                                    <div class="current-quantity">
                                        <input type="text" value="1" title="Количество товара">
                                    </div>
                                    <div class="lot-packin">
                                        шт.
                                    </div>
                                    <div class="select-quantity-plus">
                                        <button class="select-quantity-button">
                                            <i class="fa fa-plus" aria-hidden="true"></i>
                                        </button>
                                    </div>
                                </div>
                                    <button class="to-basket" value="${good.id}">В КОРЗИНУ</button>

                            </div>
                            <div class="line-box">
                                <div class="line">

                                </div>
                            </div>
                            <div class="price-box">
                                <div class="order-price-fixed">
                                    Сумма товара
                                </div>
                                <div class="total-price-curency">
                                <div class="total-price">
                                    ${good.priceouttable}
                                </div>
                                <div class="curency">
                                    гр.
                                </div>
                                </div>
                            </div>
                        </div>
                    <%--</div>--%>
                </div>

            </div>
        </c:forEach>
    </div>


</div>
<div class="container">
    <div class="mt-4 row justify-content-center">
        <nav>
            <ul class="pagination" id="pagination">
                <c:choose>
                    <c:when test="${hasprevios}">
                        <li class="page-item">
                            <a class="page-link" href="/user/category/${idcategory}/${namberpage}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                                <span class="sr-only">Previous</span>
                            </a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="page-item disabled">
                            <a class="page-link" href="/user/category/${idcategory}/${namberpage}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                                <span class="sr-only">Previous</span>
                            </a>
                        </li>
                    </c:otherwise>
                </c:choose>
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
                <c:choose>
                    <c:when test="${hasnext}">
                        <li class="page-item">
                            <a class="page-link" href="/user/category/${idcategory}/${namberpage+2}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                                <span class="sr-only">Next</span>
                            </a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="page-item disabled">
                            <a class="page-link" href="/user/category/${idcategory}/${namberpage+2}" aria-label="Next">
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
<script src="../../../resources/js/DTO/DTOGoodsStorage.js" type="text/javascript"></script>
<script src="../../../resources/js/DTO/template_function_basket.js" type="text/javascript"></script>
<script src="../../../resources/js/user/user_category.js" type="text/javascript"></script>
</body>
</html>

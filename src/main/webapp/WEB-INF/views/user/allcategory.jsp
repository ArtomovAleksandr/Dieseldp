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
        <c:import url="../template/myprofil.jsp"></c:import>
        <c:import url="../template/logoheader.jsp"></c:import>
        <c:import url="../template/menuheader.jsp"></c:import>

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
<script src="../../../resources/js/DTO/template_function_basket.js" type="text/javascript"></script>
<script src="../../../resources/js/user/user_allcategory.js" type="text/javascript"></script>
</body>
</html>

<%--<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Diesel expert</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/userorder/showfalsedone/1">Заказы</a>
            </li>
        <li class="nav-item">
            <a class="nav-link" href="/goods/show">Товар</a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/category/show/1">Категории</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/factory/show/1">Производитель</a>
        </li>
        <%--<li class="nav-item">--%>
            <%--<a class="nav-link" href="/events">Events</a>--%>
        <%--</li>--%>
        <li class="nav-item">
            <a class="nav-link" href="/groups/show/1">Группы</a>
        </li>
        <li class="nav-item">
            <a class="nav-link btn-outline-danger" href="/uzels/show/1">Узел</a>
        </li>
        </ul>
    </div>
</nav>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Header -->
<div class="header">
    <div class="container">
        <!-- Navbar search -->
        <div class="navbar-search">
            <div class="col-lg-2">
                <a href="<c:url value="/" />" style="text-decoration:none;">
                    <p class="header-logo"> My Food </p>
                </a>
            </div>
            <div class="col-lg-8">
                <form class="navbar-form" role="search" style="margin-left: 28px" action="<c:url value="/food/search"/>">
                    <div class="input-group col-md-12" style="">
                        <input type="text" class="form-control" placeholder="Tên món ăn" name="q">
                        <div class="input-group-btn">
                            <button id="btn-search" class="btn btn-default flat-butt" type="submit">
                                Tìm kiếm
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-lg-2">
                <div class="header-cart">
                    <a href="${pageContext.request.contextPath}/order/cart">
                        <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                        Giỏ hàng
                        <b class="header-cart-count">0</b>
                    </a>
                </div>
            </div>
        </div>
        <!-- End Navbar search -->
        <!-- Navbar menu-->
        <div class="navbar-menu">
            <ul class="nav navbar-nav">
                <li class="menu-li">
                    <a href="<c:url value="/" />">
                        <i class="fa fa-home" aria-hidden="true"></i> &nbsp <b>TRANG CHỦ</b>
                    </a>
                </li>
                <li class="dropdown">
                    <button class="dropbtn">
                        <i class="fa fa-bars" aria-hidden="true"></i>
                        &nbsp <b>DANH MỤC</b> &nbsp<b class="caret"></b>
                    </button>
                    <div class="dropdown-content">
                        <a href="${pageContext.request.contextPath}/food">Tất cả</a>
                        <c:forEach items="${listDanhMuc }" var="item" >
                        	<a href="${pageContext.request.contextPath}/food/category/${item.danhMucId}">${item.ten }</a>
                        </c:forEach>
                    </div>
                </li>
                <li class="dropdown">
                    <button class="dropbtn">
                        <i class="fa fa-map-marker" aria-hidden="true"></i>
                        &nbsp <b>CHI NHÁNH</b> &nbsp<b class="caret"></b>
                    </button>
                    <div class="dropdown-content">
                    <c:forEach items="${listChiNhanh }" var = "item">
                    	 <a href="${pageContext.request.contextPath}/branch/${item.chiNhanhId}">${item.ten}</a>
                    </c:forEach>
                    </div>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="menu-li">
                    <a href="${pageContext.request.contextPath}/customer/register"><i class="fa fa-pencil-square-o"></i> &nbsp <b>ĐĂNG KÝ</b></a>
                </li>
                <li class="dropdown menu-li" style="padding-right: 15px">
                    <a class="dropdown-toggle" href="#" data-toggle="dropdown">
                        <i class="fa fa-sign-in"></i> &nbsp<b>ĐĂNG NHẬP</b>
                    </a>
                    <div class="dropdown-menu form-login" style="padding: 15px; padding-bottom: 10px;">
                        <sform method="post" modelAttribute="customer" action="${pageContext.request.contextPath}/customer/login" class="form-horizontal" accept-charset="UTF-8">
                            <input id="usernameLogin" path="sdt" class="form-control form-login" type="text" name="usernameLogin" placeholder="Số điện thoại..." />
                            <input id="passwordLogin" path="password" class="form-control form-login" type="password" name="passwordLogin" placeholder="Mật khẩu..."/>
                            <label class="form-check-label">
                                <spring:input id="saveLogin" name="saveLogin" type="checkbox" class="form-check-input"/>
                                Ghi nhớ đăng nhập
                            </label>
                            <button class="btn btn-primary pull-right" type="submit">Đăng nhập</button>
                        <form>
                    </div>
                </li>
            </ul>
        </div>
        <!-- End navbar -->
    </div>
</div>
<!-- End header -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <!-- Hiển thị thông tin tìm kiếm ở đây -->
        <h4 style="padding-top: 14px"> Kết quả tìm kiếm theo: <b>Danh mục gà</b></h4>
        <hr>
        <!-- Hiển thị kết quả tìm kiếm ở đây-->
        <div class="row">
        <c:forEach items="${foodlist }" var="item">	
            <div class="col-md-3">
                <a href="#" class="thumbnail">
                    <img alt="Image" src="<c:url value="/resources/images/suon-xao-chua-ngot.jpg"/>" class="img-responsive">
                    <div class="caption">
                        <h4>${item.ten }</h4>
                        <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá:  VND</p>
                    </div>
                </a>
            </div>
           </c:forEach>
        </div>
    </div>
</div>
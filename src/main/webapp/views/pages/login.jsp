<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <c:if test="${!empty param.error}">
            <div class="alert alert-danger" style="margin-top:10px">
                <strong>Thông tin đăng nhập không chính xác</strong>
            </div>
        </c:if>
        <c:if test="${not empty message}">
            <div style="margin-top:10px">
                <div class="alert alert-success">
                    <strong>${message}</strong>
                </div>
            </div>
        </c:if>
        <h4 style="padding-top: 14px"> THÔNG TIN TÀI KHOẢN </h4>
        <hr />
        <form:form action="${pageContext.request.contextPath}/login"
                   method="post"
                   class="form-horizontal">
            <div class="form-group">
                <label class="col-md-3 control-label" for="sdt">Số điện thoại</label>
                <div class="col-md-6">
                    <input id="sdt" name="sdt" type="text" placeholder="" class="form-control input-md" required="true" />
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="password">Mật khẩu</label>
                <div class="col-md-6">
                    <input id="password" name="password" type="password" placeholder="" class="form-control input-md" required="true"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div class="checkbox">
                        <label><input name="remember-me" type="checkbox">Ghi nhớ đăng nhập</label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button type="submit" class="btn btn-primary btn-lg btn-register">Đăng nhập</button>
                </div>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form:form>
    </div>
</div>
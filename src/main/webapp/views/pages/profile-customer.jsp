<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <c:if test="${not empty message}">
            <div style="margin-top:10px">
                <div class="alert alert-success">
                    <strong>${message}</strong>
                </div>
            </div>
        </c:if>
        <h4 style="padding-top: 14px"> Thông tin khách hàng </h4>
        <hr>
        <form:form action="/customer/change-profile" modelAttribute="khachhang" class="form-horizontal">
            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-3 control-label" for="phoneNumber">Số điện thoại</label>
                <div class="col-md-6">
                    <form:input id="phoneNumber" path="sdt" type="text" placeholder="" class="form-control input-md" readonly="true" />
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="name">Họ và tên</label>
                <div class="col-md-6">
                    <form:input id="name" path="ten" type="text" class="form-control input-md" required="true"/>
                    <form:errors path="ten" class="form-control input-md" cssClass="error" />
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="gender">Giới tính</label>
                <div class="col-md-2">
                    <form:select id="gender" path="gioiTinh" class="form-control">
                        <form:option value="1">Nam</form:option>
                        <form:option value="0">Nữ</form:option>
                    </form:select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="location" >Địa chỉ</label>
                <div class="col-md-6">
                    <form:textarea id="location" path="diaChi" class="form-control input-md" required="true"/>
                    <form:errors path="diaChi" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button type="submit" class="btn btn-info btn-register">Thay đổi thông tin</button>
                    <a class="btn btn-warning btn-register" href="change-password.html">Thay đổi mật khẩu</a>
                </div>
            </div>
        </form:form>
    </div>
</div>
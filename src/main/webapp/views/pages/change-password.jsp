<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <h4 style="padding-top: 14px"> <b>Thay đổi mật khẩu</b> </h4>
        <hr>
        <form:form action="/customer/change-password" method="post" modelAttribute="changepassword" class="form-horizontal">
            <!-- Text input-->
            <div class="form-group">
                <label class="col-lg-3 col-lg-offset-1 control-label" for="oldPass">Nhập mật khẩu hiện tại</label>
                <div class="col-lg-4">
                    <form:input id="oldPass" path="oldPassword" type="password" class="form-control input-md" required="true"/>
                    <form:errors path="oldPassword" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 col-lg-offset-1 control-label" for="newPass" >Nhập mật khẩu mới</label>
                <div class="col-lg-4">
                    <form:input id="newPass" path="newPassword" type="password" placeholder="" class="form-control input-md" required="true"/>
                    <form:errors path="newPassword" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 col-lg-offset-1 control-label" for="reNewPass">Nhập lại mật khẩu mới</label>
                <div class="col-lg-4">
                    <form:input id="reNewPass" path="reNewPassword" type="password" placeholder="" class="form-control input-md" required="true"/>
                    <form:errors path="reNewPassword" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button class="btn btn-success btn-register" type="submit">Thay đổi mật khẩu </button>
                </div>
            </div>
        </form:form>
    </div>
</div>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <h4 style="padding-top: 14px"> Tạo tài khoản khách hàng mới </h4>
        <hr />
        <%--@elvariable id="customerForm" type="foodGroup4.entity.Khachhang"--%>
        <form:form action="${pageContext.request.contextPath}/register"
                   method="post"
                   modelAttribute="customerForm"
                   class="form-horizontal">
            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-3 control-label" for="sdt">Số điện thoại</label>
                <div class="col-md-6">
                    <form:input path="sdt" type="text" placeholder="" class="form-control input-md" required="true" />
                    <form:errors path="sdt" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="password">Mật khẩu</label>
                <div class="col-md-6">
                    <form:input path="password" type="password" placeholder="" class="form-control input-md" required="true"/>
                    <form:errors path="password" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="rePassword">Nhập lại mật khẩu</label>
                <div class="col-md-6">
                    <form:input path="rePassword" type="password" placeholder="" class="form-control input-md" required="true"/>
                    <form:errors path="rePassword" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <form:label class="col-md-3 control-label" path="ten">Họ và tên</form:label>
                <div class="col-md-6">
                    <form:input path="ten" type="text" class="form-control input-md" required="true"/>
                    <form:errors path="ten" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <form:label class="col-md-3 control-label" path="gioiTinh">Giới tính</form:label>
                <div class="col-md-2">
                    <select name="gioiTinh" class="form-control">
                        <option value="1" selected="selected">Nam</option>
                        <option value="0">Nữ</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <form:label class="col-md-3 control-label" path="diaChi">Địa chỉ</form:label>
                <div class="col-md-6">
                    <form:textarea path="diaChi" placeholder="" class="form-control input-md" required="true"></form:textarea>
                    <form:errors path="diaChi" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button type="submit" class="btn btn-primary btn-lg btn-register">Đăng ký</button>
                </div>
            </div>
        </form:form>
    </div>
</div>
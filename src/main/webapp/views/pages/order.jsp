<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <h4 style="padding-top: 14px"> <b>Thông tin đơn đặt hàng</b></h4>
        <hr>
        <c:url var = "url_post" value="/order/final-order" />
        <form:form action="${url_post }" method="post" modelAttribute="infoOrderDto" class="form-horizontal">
            <!-- Text input-->
            <input type="radio" name="useNewInfo" value="true" ${infoOrderDto.useNewInfo == true ? "checked":""}> Sử dụng số điện thoại và địa chỉ khác
            <br><br>
            <div class="form-group">
                <label class="col-md-3 control-label" for="phoneNumber1">Số điện thoại</label>
                <div class="col-md-6">
                    <form:input path="newSdt" id="phoneNumber1" name="phoneNumber1" type="text" placeholder="" class="form-control input-md"/>
                    <form:errors path="newSdt" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="name1">Họ và tên</label>
                <div class="col-md-6">
                    <form:input path="newTen" id="name1" name="name1" type="text" class="form-control input-md"/>
                    <form:errors path="newTen" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="location1" >Địa chỉ</label>
                <div class="col-md-6">
                    <form:textarea path="newDiaChi" id="location1" name="location1" class="form-control input-md"/>
                    <form:errors path="newDiaChi" cssClass="error"/>
                </div>
            </div>
            <hr>
            <input type="radio" name="useNewInfo" value="false" ${infoOrderDto.useNewInfo == false ? "checked":""}> Sử dụng thông tin bạn đã cung cấp
            <br><br>
            <div class="form-group">
                <label class="col-md-3 control-label" for="phoneNumber2">Số điện thoại</label>
                <div class="col-md-6">
                    <input id="phoneNumber2" name="phoneNumber2" value="${khachhang.sdt}" type="text" placeholder="" class="form-control input-md" required="" disabled>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="name2">Họ và tên</label>
                <div class="col-md-6">
                    <input id="name2" name="name2" value="${khachhang.ten}" type="text" class="form-control input-md" required="" disabled>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="location2" >Địa chỉ</label>
                <div class="col-md-6">
                    <textarea id="location2" name="location2" class="form-control input-md" required="" disabled>${khachhang.diaChi}</textarea>
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button class="btn btn-info btn-register" type="submit">Đặt hàng</button>
                </div>
            </div>
        </form:form>
    </div>
</div>
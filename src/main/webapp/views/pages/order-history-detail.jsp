<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<div class="container">
    <div class="row">
        <div class="col-lg-10 col-lg-offset-1">
            <c:if test="${hoadon != null}">
            <div class="row">
                <div class="col-md-6">
                    <h4 style="padding-top: 14px"> <b>Thông tin thanh toán</b> </h4>
                    <ul>
                        <li>Số điện thoại người nhận: ${hoadon.sdtNguoiNhan}</li>
                        <li>Họ tên người nhận: ${hoadon.hoTenNguoiNhan}</li>
                        <li>Địa chỉ người nhận: ${hoadon.diaChiGiao}</li>
                    </ul>
                </div>
                <div class="col-md-6">
                    <h4 style="padding-top: 14px"> <b>Chi nhánh thanh toán</b> </h4>
                    <ul>
                        <li>Tên chi nhánh: </li>
                        <li>Địa chỉ</li>
                    </ul>
                </div>
            </div>
            <h4 style="padding-top: 14px"> <b>Thông tin đơn hàng</b> </h4>
            <hr>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>Món ăn</th>
                    <th>Số lượng</th>
                    <th class="text-center">Đơn giá (VNĐ)</th>
                    <th class="text-center">Tổng giá (VNĐ)</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${hoadon.chitiethoadons}" var="chitiethoadon">
                <tr>
                    <td class="col-md-5">
                        <div class="media">
                            <a class="pull-left" href="#"> <img class="media-object" src="${chitiethoadon.mon.hinhAnh}"
                                                                style="width: 100px; height: 80px;"> </a>
                            <div class="media-body">
                                <h4 class="media-heading cart-text-padding-top"><a href="#">${chitiethoadon.mon.ten}</a></h4>
                            </div>
                        </div>
                    </td>
                    <td class="col-md-1" style="text-align: center">
                        <p>${chitiethoadon.soLuong}</p>
                    </td>
                    <td class="col-md-1 text-center" id="price"><p class="cart-text-padding-top"><b>${chitiethoadon.tongTien / chitiethoadon.soLuong}</b></p></td>
                    <td class="col-md-2 text-center" id="priceFood"><p class="cart-text-padding-top"><b>${chitiethoadon.tongTien}</b></p></td>
                </tr>
                </c:forEach>
                <tr>
                    <td colspan="3"><h4><b>Tạm tính</b></h4></td>
                    <td class="text-center"><h5><strong>${hoadon.tongTien}</strong></h5></td>
                </tr>
                <tr>
                    <td colspan="3"><h4><b>Phí vận chuyển</b></h4></td>
                    <td class="text-center"><h5><strong>0</strong></h5></td>
                </tr>
                <tr>
                    <td colspan="3"><h4><b>Thành tiền</b></h4></td>
                    <td class="text-center"><h4><strong>${hoadon.tongTien}</strong></h4></td>
                </tr>
                </tbody>
            </table>
            </c:if>
            <c:if test="${hoadon != null}">
                <div style="margin-top:10px">
                    <div class="alert alert-danger">
                        <strong>Không tìm thấy đơn hàng</strong>
                    </div>
                </div>
            </c:if>
        </div>
    </div>
</div>
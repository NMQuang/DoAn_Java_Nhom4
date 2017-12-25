<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="foodGroup4.common.state.TinhTrangGiaoHang" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <c:if test="${not empty message}">
            <div style="margin-top: 10px">
                <div class="alert alert-success">
                    <strong>${message}</strong>
                </div>
            </div>
        </c:if>
        <h4 style="padding-top: 14px"> <b>Lịch sử đơn hàng </b></h4>
        <hr>
        <table class="table table-hover table-bordered">
            <thead>
            <tr>
                <th class="col-lg-3 text-center">Mã đơn hàng</th>
                <th class="col-lg-3 text-center">Ngày tạo</th>
                <th class="col-lg-3 text-center">Tình trạng</th>
                <th class="col-lg-3 text-center"> </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listHoadons}" var="hoadon">
            <tr>
                <td class="text-center">
                    <h4>#<fmt:formatNumber value="${hoadon.maHd}" minIntegerDigits="5" groupingUsed="false"/></h4>
                </td>
                <td class="text-center">
                    <h4><fmt:formatDate value="${hoadon.ngayTao}" pattern="dd/MM/yyyy HH:mm:ss"/></h4>
                </td>
                <td class="text-center">
                    <c:choose>
                        <c:when test="${hoadon.tinhTrangGiaoHang == TinhTrangGiaoHang.DANG_XU_LY}">
                            <h4 class="text-warning">${TinhTrangGiaoHang.codeToString(hoadon.tinhTrangGiaoHang)}</h4>
                        </c:when>
                        <c:when test="${hoadon.tinhTrangGiaoHang == TinhTrangGiaoHang.DANG_CHE_BIEN}">
                            <h4 class="text-info">${TinhTrangGiaoHang.codeToString(hoadon.tinhTrangGiaoHang)}</h4>
                        </c:when>
                        <c:when test="${hoadon.tinhTrangGiaoHang == TinhTrangGiaoHang.DANG_GIAO_HANG}">
                            <h4 class="text-primary">${TinhTrangGiaoHang.codeToString(hoadon.tinhTrangGiaoHang)}</h4>
                        </c:when>
                        <c:when test="${hoadon.tinhTrangGiaoHang == TinhTrangGiaoHang.DA_GIAO_HANG}">
                            <h4 class="text-success">${TinhTrangGiaoHang.codeToString(hoadon.tinhTrangGiaoHang)}</h4>
                        </c:when>
                    </c:choose>
                </td>
                <td class="text-center">
                    <a href="<c:url value="/order/history/${hoadon.maHd}"/>" class="btn btn-info" style="float:left;margin-left:24px"> Chi tiết </a>
                    <c:if test="${hoadon.tinhTrangGiaoHang == TinhTrangGiaoHang.DANG_XU_LY}">
                    <button data-id="${hoadon.maHd}" type="button" onclick="confirmDelOrder(this)" class="btn btn-warning">Hủy</button>
                    </c:if>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<script>
    function confirmDelOrder(e) {
        bootbox.confirm({
            title: "Xác nhận hủy đơn hàng",
            message: "Bạn có muốn hủy đơn hàng này. Lưu ý: đơn hàng sau khi hủy sẽ không thể hồi phục lại",
            buttons: {
                cancel: {
                    label: '<i class="fa fa-times"></i> Cancel'
                },
                confirm: {
                    label: '<i class="fa fa-check"></i> OK',
                    className: 'btn-danger'
                }
            },
            callback: function (result) {
                if(result) {
                    var idOrder = e.getAttribute('data-id');
                    var form = document.createElement('form');
                    form.setAttribute('method', 'post');
                    form.setAttribute('action', '<c:url value="/order/remove-order"/>')

                    var inputId = document.createElement('input');
                    inputId.setAttribute('type', 'hidden');
                    inputId.setAttribute('name', 'idOrder');
                    inputId.setAttribute('value', idOrder);
                    form.appendChild(inputId);

                    var inputCsrf = document.createElement('input');
                    inputCsrf.setAttribute('type', 'hidden');
                    inputCsrf.setAttribute('name', '${_csrf.parameterName}');
                    inputCsrf.setAttribute('value', '${_csrf.token}');
                    form.appendChild(inputCsrf);

                    document.body.appendChild(form);

                    form.submit();
                }
            }
        });
    }
</script>
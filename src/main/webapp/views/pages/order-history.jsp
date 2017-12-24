<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
                    <h4 class="text-success">${hoadon.tinhTrangGiaoHang}</h4>
                </td>
                <td class="text-center">
                    <a href="<c:url value="/order/history/${hoadon.maHd}"/>" class="btn btn-info" style="float:left;margin-left:24px"> Chi tiết </a>
                    <form action="<c:url value="/order/delete/${hoadon.maHd}"/>">
                        <input type="hidden" name="id"/>
                        <button type="submit" class="btn btn-warning">Hủy</button>
                    </form>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script>
    function changeBranch(element) {
        const idBranch = element.value;
        if(idBranch >= 0) {
            window.location.replace("${pageContext.request.contextPath}/order/cart?idChinhanh=" + idBranch);
        }
    }

    function changeQuantityFood(element) {
        const idFood = element.getAttribute("data-id");
        const quantityFood = element.value;
        var id_element_price_food = "price-food-" + idFood;
        const priceFood = parseFloat($('#'+id_element_price_food).text());

        const newTotalPriceFood = quantityFood * priceFood;

        var id_element_total_price_food = "total-price-food-" + idFood;
        $('#'+id_element_total_price_food).text(newTotalPriceFood );

        var currentTotalCartPrice = 0;
        const listTotalPriceFoods = $('.total-price-food');
        listTotalPriceFoods.map(function (t) {
            currentTotalCartPrice += parseFloat(this.innerHTML);
        });
        $('#totalCartPrice').text(currentTotalCartPrice);
        $('#totalTempCartPrice').text(currentTotalCartPrice);
    };
</script>
<div class="container">
    <div class="row">
        <div class="col-lg-10 col-lg-offset-1">
            <c:if test="${sessionScope.cartInfo.quantity > 0}">
                <form:form action="${pageContext.request.contextPath}/order/order-info" method="post" modelAttribute="mapQuantityFood">
            <div style="margin-top: 14px;">
                <c:if test="${error != null}">
                    <div class="alert alert-danger">
                        <strong>${error}</strong>
                    </div>
                </c:if>
                <h4 style="float: left;margin-right: 12px"><b>Chọn chi nhánh thanh toán thanh toán</b></h4>
                <select onchange="changeBranch(this)" class="list-group-item" style="width: 400px">
                    <option value="-1" ${sessionScope.cartInfo.chinhanh != null ? "" : "selected"}>Chọn chi nhánh thanh toán</option>
                    <c:forEach items="${chinhanhs}" var="chinhanh">
                    <option ${sessionScope.cartInfo.chinhanh.chiNhanhId == chinhanh.chiNhanhId ? "selected": ""} value="${chinhanh.chiNhanhId}">${chinhanh.ten}</option>
                    </c:forEach>
                </select>
            </div>
            <h4 style="padding-top: 14px"> <b>Thông tin giỏ hàng</b> </h4>
                    <small style="color:red">(*) Những món ăn không có trong chi nhánh sẽ bị bỏ qua</small>
            <hr>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>Món ăn</th>
                    <th>Số lượng</th>
                    <th width="16%" class="text-center">Đơn giá (VNĐ)</th>
                    <th class="text-center">Tổng giá (VNĐ)</th>
                    <th width="20%"> </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${sessionScope.cartInfo.foodInfoDtos}" var="foodInfo">
                    <tr style="<c:out value="${foodInfo.price < 0 ? 'background: #f96f57' : ''}"/>">
                        <td class="col-md-5">
                            <div class="media">
                                <a class="pull-left" href="${pageContext.request.contextPath}/food/${foodInfo.mon.monId}"> <img class="media-object"
                                                                    src="<c:out value="${foodInfo.mon.hinhAnh}"/>"
                                                                    style="width: 100px; height: 80px;"> </a>
                                <div class="media-body">
                                    <h4 class="media-heading cart-text-padding-top">
                                        <c:out value="${foodInfo.mon.ten}"/>
                                        <div>
                                        <c:if test="${foodInfo.price < 0 && sessionScope.cartInfo.chinhanh != null}">
                                            <small style="color: navajowhite">(Không có trong chi nhánh đang chọn)</small>
                                        </c:if>
                                            <c:if test="${sessionScope.cartInfo.chinhanh == null}">
                                                <small style="color: navajowhite">(Chưa chọn chi nhánh)</small>
                                            </c:if>
                                        </div>
                                    </h4>
                                </div>
                            </div>
                        </td>
                        <td class="col-md-1" style="text-align: center">
                            <input name="map[${foodInfo.mon.monId}]" onchange="changeQuantityFood(this)" type="number" min="1" class="form-control"
                                   data-id="${foodInfo.mon.monId}" value="${foodInfo.quantity}"/>
                        </td>
                        <td class="col-md-1 text-center"><p class="cart-text-padding-top"><b
                                id="price-food-${foodInfo.mon.monId}"><c:out
                                value="${foodInfo.price > 0 ? foodInfo.price : 0}"/></b></p></td>
                        <td class="col-md-2 text-center"><p class="cart-text-padding-top"><b class="total-price-food"
                                                                                             id="total-price-food-${foodInfo.mon.monId}"><c:out
                                value="${foodInfo.price > 0 ? foodInfo.quantity * foodInfo.price : 0}"/></b></p></td>
                        <td class="col-md-1 text-center">
                            <a href="${pageContext.request.contextPath}/order/remove-food-from-cart/${foodInfo.mon.monId}" class="btn btn-danger">
                                <span class="glyphicon glyphicon-remove"></span>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="4"><h4><b>Tạm tính</b></h4></td>
                    <td class="text-center"><h5><strong id="totalTempCartPrice">${sessionScope.cartInfo.totalPrice}</strong><strong> VNĐ</strong></h5></td>
                </tr>
                <tr>
                    <td colspan="4"><h4><b>Phí vận chuyển</b></h4></td>
                    <td class="text-center"><h5><strong>0</strong></h5></td>
                </tr>
                <tr>
                    <td colspan="4"><h4><b>Thành tiền</b></h4></td>
                    <td class="text-center"><h4><strong id="totalCartPrice">${sessionScope.cartInfo.totalPrice}</strong><strong> VNĐ</strong></h4></td>
                </tr>
                </tbody>
            </table>
            <div class="pull-right" style="margin-bottom: 20px">
                <button type="submit" class="btn btn-success btn-lg">
                    Thanh toán
                </button>
                <a href="<c:url value="/food/"/>" class="btn btn-warning btn-lg">
                    Tiếp tục mua hàng
                </a>
            </div>
                </form:form>
            </c:if>
            <c:if test="${sessionScope.cartInfo.quantity == 0}">
                <div style="margin-top: 10px;min-height: 300px" >
                    <div class="alert alert-danger">
                        <strong>Không có món ăn để thanh toán</strong>
                    </div>
                </div>
            </c:if>
        </div>
    </div>
</div>
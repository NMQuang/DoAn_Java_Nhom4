<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <div class="row">
        <div class="col-lg-10 col-lg-offset-1">
            <h4 style="padding-top: 14px"> <b>Thông tin giỏ hàng</b> </h4>
            <hr>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>Món ăn</th>
                    <th>Số lượng</th>
                    <th class="text-center">Đơn giá</th>
                    <th class="text-center">Tổng giá</th>
                    <th> </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="col-md-5">
                        <div class="media">
                            <a class="pull-left" href="#"> <img class="media-object" src="http://placehold.it/250x200"
                                                                style="width: 100px; height: 80px;"> </a>
                            <div class="media-body">
                                <h4 class="media-heading cart-text-padding-top"><a href="#">Tên món ăn</a></h4>
                            </div>
                        </div>
                    </td>
                    <td class="col-md-1" style="text-align: center">
                        <input type="email" class="form-control" id="amountFood" value="3">
                    </td>
                    <td class="col-md-1 text-center" id="price"><p class="cart-text-padding-top"><b>$4.87</b></p></td>
                    <td class="col-md-2 text-center" id="priceFood"><p class="cart-text-padding-top"><b>$14.61</b></p></td>
                    <td class="col-md-1 text-center">
                        <button type="button" class="btn btn-danger">
                            <span class="glyphicon glyphicon-remove"></span>
                        </button>
                    </td>
                </tr>
                <tr>
                    <td class="col-md-5">
                        <div class="media">
                            <a class="pull-left" href="#"> <img class="media-object" src="http://placehold.it/250x200"
                                                                style="width: 100px; height: 80px;"> </a>
                            <div class="media-body">
                                <h4 class="media-heading cart-text-padding-top"><a href="#">Tên món ăn</a></h4>
                            </div>
                        </div>
                    </td>
                    <td class="col-md-1" style="text-align: center">
                        <input type="email" class="form-control" value="2">
                    </td>
                    <td class="col-md-1 text-center"><p class="cart-text-padding-top"><b>$4.99</b></p></td>
                    <td class="col-md-2 text-center"><p class="cart-text-padding-top"><b>$9.98</b></p></td>
                    <td class="col-md-1 text-center">
                        <button type="button" class="btn btn-danger">
                            <span class="glyphicon glyphicon-remove"></span>
                        </button>
                    </td>
                </tr>
                <tr>
                    <td colspan="4"><h4><b>Tạm tính</b></h4></td>
                    <td class="text-center"><h5><strong>$24.59</strong></h5></td>
                </tr>
                <tr>
                    <td colspan="4"><h4><b>Phí vận chuyển</b></h4></td>
                    <td class="text-center"><h5><strong>$6.94</strong></h5></td>
                </tr>
                <tr>
                    <td colspan="4"><h4><b>Thành tiền</b></h4></td>
                    <td class="text-center"><h4><strong>$31.53</strong></h4></td>
                </tr>
                </tbody>
            </table>
            <div class="pull-right" style="margin-bottom: 20px">
                <button type="button" class="btn btn-success btn-lg">
                    Thanh toán
                </button>
            </div>

        </div>
    </div>
</div>
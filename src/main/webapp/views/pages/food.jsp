<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <div class="row food-info">
            <div class="food-head">
                <div class="col-lg-6">
                    <img src="<c:url value="${mon.hinhAnh }"/>" class="img-responsive center-block" style="max-height: 400px"/>
                </div>
                <div class="col-lg-6">
                    <h3>${mon.ten }</h3>
                    <p> ${mon.moTa }</p>
                    <div class="text-center">
                        <button class="btn btn-success btn-lg">Đặt hàng</button>
                        <a href="cart.html" class="btn btn-info btn-lg">Xem giỏ hàng</a>
                    </div>
                </div>
            </div>
            <div class="food-branches col-lg-12">
                <table class="table table-branches">
                    <thead>
                        <tr>
                            <th colspan="2" style="padding-top: 15px; font-size: 18px">
                                Danh sách chi nhánh có món ăn này</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${ChiNhanhMonList }" var = "item">
                    	<tr>
                            <td width="60%"> <b>${item.chinhanh.ten }</b><br>
                                <span class="food-branches-location">
                                    <i class="fa fa-map-marker" aria-hidden="true"></i>
                                    &nbsp ${item.chinhanh.diaChi }
                                </span>
                            </td>
                            <td width="40%" style="vertical-align: middle;"> <i class="fa fa-tag" aria-hidden="true"></i> <span price="${item.gia }" class="_single_price"></span> VND </td>
                        </tr>
                    </c:forEach>
                        
                    </tbody>
                </table>
            </div>
        </div>
        <h4>Món ăn đặt hàng nhiều trong tuần</h4>
        <hr>
        <div class="row">
            <div class="col-md-12">
                <div id="Carousel" class="carousel my-carousel slide carousel-fade">
                    <!-- Carousel items -->
                    <div class="carousel-inner">
                        <div class="item active">
                            <div class="row">
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 - 150.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <!--.row-->
                        </div>
                        <!--.item-->
                        <div class="item">
                            <div class="row">
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <!--.row-->
                        </div>
                        <!--.item-->
                        <div class="item">
                            <div class="row">
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-md-3">
                                    <a href="#" class="thumbnail">
                                        <img alt="Image" src="http://placehold.it/250x200"
                                             class="img-responsive">
                                        <div class="caption">
                                            <h4>Tên món ăn</h4>
                                            <p><i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: 100.000 VND</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <!--.row-->
                        </div>
                        <!--.item-->
                    </div>
                    <!--.carousel-inner-->
                    <a data-slide="prev" href="#Carousel" class="left carousel-control my-carousel-control">‹</a>
                    <a data-slide="next" href="#Carousel" class="right carousel-control my-carousel-control">›</a>
                </div>
                <!--.Carousel-->
            </div>
        </div>
    </div>
</div>
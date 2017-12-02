<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <div class="row food-info">
            <div class="col-lg-5">
                <img src="<c:url value="/resources/images/mon-an/ga-ran.jpg"/>" class="img-responsive img-agency center-block" style="max-height: 400px"/>
                <div class="agency-info" style="margin-top: 10px">
                    <p> <i class="fa fa-map-marker"></i> Địa chỉ: 10A-10B-10C Lê Thánh Tôn, P. Bến Nghé, Q. 1</p>
                    <p>Giờ đón khách: 8h:30 - 11h, 16h:30 - 20h:30</p>
                </div>
            </div>
            <div class="col-lg-7">
                <div class="panel panel-order">
                    <div class="panel-heading text-center">
                        <h4>Đặt bàn tại chi nhánh Quận 01</h4>
                    </div>
                    <ul class="list-group text-center">
                        <li class="list-group-item">
                            <table style="table-layout: fixed" width="100%">
                                <tr>
                                    <td class="col-lg-6 text-center"> <i class="fa fa-tag"></i> &nbsp Giá: 50000 VNĐ/1 phần </td>
                                    <td class="col-lg-6 text-center"> <i class="fa fa-clock-o"></i> &nbsp Thời gian giao: 30 phút </td>
                                </tr>
                            </table>
                        </li>
                        <li class="list-group-item">
                            <div class="input-group col-md-8 col-md-offset-2" >
                                <span class="input-group-addon" style="width: 160px">Số phần món ăn</span>
                                <select class="form-control">
                                    <option value="1">1 phần</option>
                                    <option value="2">2 phần</option>
                                    <option value="3">3 phần</option>
                                    <option value="4">4 phần</option>
                                    <option value="5">5 phần</option>
                                    <option value="6">6 phần</option>
                                    <option value="7">7 phần</option>
                                    <option value="8">8 phần</option>
                                </select>
                            </div>
                        </li>
                        <li class="list-group-item">
                            <div class="input-group col-md-8 col-md-offset-2" >
                                <span class="input-group-addon" style="width: 160px">Số điện thoại liên hệ</span>
                                <input type="text" class="form-control">
                            </div>
                        </li>
                        <li class="list-group-item">
                            <i class="fa fa-phone fa-lg"></i>
                            &nbsp Hot line hỗ trợ:
                            <em style="color: red">01666xxxxxx</em>
                        </li>
                        <button type="submit" class="btn btn-lg btn-block btn-success" href="#">Thêm món ăn vào giỏ hàng</button>
                    </ul>
                </div>
            </div>
        </div>
        <h4>Món ăn đang giảm giá</h4>
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
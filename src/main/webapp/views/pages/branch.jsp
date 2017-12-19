<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <!-- Hiển thị thông tin tìm kiếm ở đây -->
        <h4 style="padding-top: 14px"> <b>${branch.ten }</b></h4>
        <hr>
        <!-- Hiển thị kết quả tìm kiếm ở đây-->
        <div class="row">
            <div class="col-lg-5" style="height: 315px;">
                <img src="<c:url value="/resources/images/quan-an/${branch.hinhAnh }"/>" class="img-responsive img-agency" style="max-height: 315px"/>
                <div class="agency-info" style="margin-top: 10px">
                    <p> <i class="fa fa-map-marker"></i> Địa chỉ: ${branch.diaChi }</p>
                    <p>Giờ đón khách: 8h:30 - 11h, 16h:30 - 20h:30</p>
                </div>
            </div>
            <div class="col-lg-7">
                <form>
                    <div class="panel panel-order">
                        <div class="panel-heading text-center">
                            <h4>Đặt bàn tại chi nhánh ${branch.ten }</h4>
                        </div>
                        <ul class="list-group text-center">
                            <li class="list-group-item">
                                <div class="input-group col-md-4 col-md-offset-2 pull-left" >
                                    <span class="input-group-addon"><i class="fa fa-clock-o fa-lg"></i></span>
                                    <select id="timeOrder" name="timeOrder" class="form-control" style="border-bottom-right-radius: 0px; border-top-right-radius: 0px">
                                        <option value="8:30">8:30</option>
                                        <option value="9:00">9:00</option>
                                        <option value="9:30">9:30</option>
                                        <option value="10:00">10:00</option>
                                        <option value="10:30">10:30</option>
                                        <option value="11:00">11:00</option>
                                        <option value="11:30">11:30</option>
                                        <option value="12:00">12:00</option>
                                        <option value="12:30">12:30</option>
                                        <option value="13:00">13:00</option>
                                        <option value="13:30">13:30</option>
                                        <option value="14:00">14:00</option>
                                        <option value="14:30">14:30</option>
                                        <option value="15:00">15:00</option>
                                        <option value="15:30">15:30</option>
                                        <option value="16:00">16:00</option>
                                        <option value="16:30">16:30</option>
                                        <option value="17:00">17:00</option>
                                        <option value="17:30">17:30</option>
                                        <option value="18:00">18:00</option>
                                        <option value="18:30">18:30</option>
                                        <option value="19:00">19:00</option>
                                        <option value="19:30">19:30</option>
                                        <option value="20:00">20:00</option>
                                        <option value="20:30">20:30</option>
                                    </select>
                                </div>
                                <div class="input-group col-md-4" >
                                    <span class="input-group-addon" style="border-top-left-radius: 0px; border-bottom-left-radius: 0px;"><i class="fa fa-users fa-lg"></i></span>
                                    <select id="amount" name="amount" class="form-control">
                                        <option value="1">1 người</option>
                                        <option value="2">2 người</option>
                                        <option value="3">3 người</option>
                                        <option value="4">4 người</option>
                                        <option value="5">5 người</option>
                                        <option value="6">6 người</option>
                                        <option value="7">7 người</option>
                                        <option value="8">8 người</option>
                                    </select>
                                </div>
                            </li>
                            <li class="list-group-item">
                                <div class="input-group col-md-8 col-md-offset-2" >
                                    <span class="input-group-addon">Số điện thoại</span>
                                    <input id="phoneNumber" name="phoneNumber" type="text" class="form-control">
                                </div>
                            </li>
                            <li class="list-group-item">
                                <i class="fa fa-phone fa-lg"></i>
                                &nbsp Hot line hỗ trợ:
                                <em style="color: red">${branch.dienThoai }</em>
                            </li>
                            <button type="submit" class="btn btn-lg btn-block btn-success" href="#">Đặt bàn</button>
                        </ul>
                    </div>
                </form>
            </div>
        </div>

        <h4 style="padding-top: 14px"> Các món ăn thuộc <b> chi nhánh ${branch.ten }</b></h4>
        <hr>
        <div class="row">
        <c:forEach items="${listFood}" var="item">
            <div class="col-md-3">
                <a href="#" class="thumbnail">
                    <img alt="Image" src="<c:url value="/resources/images/mon-an/${item.pk.mon.hinhAnh }"/>" class="img-responsive">
                    <div class="caption">
                        <h4>${item.pk.mon.ten }</h4>
                        <p>
                        <i class="fa fa-tag" aria-hidden="true"></i> &nbsp<span class="_single_price" price="${item.gia }"></span> VND</p>
                    </div>
                </a>
            </div>
		</c:forEach>
        </div>
    </div>
</div>
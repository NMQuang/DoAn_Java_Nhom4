<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <h4 style="padding-top: 14px"> Thông tin khách hàng </h4>
        <hr>
        <form class="form-horizontal">
            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-3 control-label" for="phoneNumber">Số điện thoại</label>
                <div class="col-md-6">
                    <input id="phoneNumber" name="phoneNumber" value="01666xxxxxx" type="text" placeholder="" class="form-control input-md" required="" disabled>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="name">Họ và tên</label>
                <div class="col-md-6">
                    <input id="name" name="name" value="Phạm Đức Lộc" type="text" class="form-control input-md" required="" disabled>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="gender">Giới tính</label>
                <div class="col-md-2">
                    <select id="gender" name="gender" class="form-control" disabled>
                        <option value="1">Nam</option>
                        <option value="2">Nữ</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-3 control-label" for="location" >Địa chỉ</label>
                <div class="col-md-6">
                    <textarea id="location" name="location" class="form-control input-md" required="" disabled>Thành phố Hồ Chí Minh</textarea>
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button class="btn btn-info btn-register">Thay đổi thông tin</button>
                    <!-- Khi chọn thay đổi thông tin thì unlock hết các thuộc tính disable đi
                    và ẩn button thay đổi mật khẩu để người dùng đổi thông tin-->
                    <a class="btn btn-warning btn-register" href="change-password.html">Thay đổi mật khẩu</a>
                </div>
            </div>
        </form>
    </div>
</div>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<div class="container">
    <div class="col-lg-10 col-lg-offset-1">
        <h4 style="padding-top: 14px"> <b>Thay đổi mật khẩu</b> </h4>
        <hr>
        <form class="form-horizontal">
            <!-- Text input-->
            <div class="form-group">
                <label class="col-lg-3 col-lg-offset-1 control-label" for="oldPass">Nhập mật khẩu hiện tại</label>
                <div class="col-lg-4">
                    <input id="oldPass" name="oldPass" type="password" class="form-control input-md" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 col-lg-offset-1 control-label" for="newPass" >Nhập mật khẩu mới</label>
                <div class="col-lg-4">
                    <input id="newPass" name="newPass" type="password" placeholder="" class="form-control input-md" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-3 col-lg-offset-1 control-label" for="reNewPass">Nhập lại mật khẩu mới</label>
                <div class="col-lg-4">
                    <input id="reNewPass" name="reNewPass" type="password" placeholder="" class="form-control input-md" required="">
                </div>
            </div>
            <div class="form-group">
                <div style="text-align: center">
                    <button class="btn btn-success btn-register" type="submit">Thay đổi mật khẩu </button>
                </div>
            </div>
        </form>
    </div>
</div>
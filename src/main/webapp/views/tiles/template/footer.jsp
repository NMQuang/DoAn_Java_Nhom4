<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Footer -->
<footer>
    <div class="footer" id="footer">
        <div class="container">
            <div class="row col-md-10 col-md-offset-1">
                <div class="col-md-4">
                    <h3> Thông tin </h3>
                    <ul>
                        <li><p><i class="fa fa-phone"></i> &nbsp &nbspHotline: ${trungtam.hotline} </p></li>
                        <li><p><i class="fa fa-users"></i> &nbsp Số lượt truy cập: ${trungtam.soLuongTruyCap} </p></li>
                        <li><a href="${pageContext.request.contextPath}/introduce"> &nbsp <i class="fa fa-info"></i> &nbsp&nbspThông tin trang web </a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <h3> Theo dõi qua mạng xã hội </h3>
                    <ul>
                        <li><a href="#"> <i class="fa fa-facebook-square"></i>&nbsp Facebook </a></li>
                        <li><a href="#"> <i class="fa fa-twitter-square"></i>&nbsp Twitter </a></li>
                        <li><a href="#"> <i class="fa fa-linkedin-square"></i>&nbsp Linkedin </a></li>
                        <li><a href="#"> <i class="fa fa-google-plus-square"></i>&nbsp Google Plus </a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <h3> Theo dõi qua email </h3>
                    <form role="subscribe" action="${pageContext.request.contextPath}/subscribe" method="post">
                        <div class="input-group col-md-12" style="">
                            <input type="email"  required class="form-control" placeholder="Email của bạn" name="email">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit">
                                    <b>Subscribe</b>
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <!--/.row-->
        </div>
        <!--/.container-->
    </div>
    <!--/.footer-->
</footer>
<!-- End footer -->
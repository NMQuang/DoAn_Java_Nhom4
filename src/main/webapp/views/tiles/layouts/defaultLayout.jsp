<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Food - Trang chủ</title>
    <!-- CSS -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" />
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />
    <!-- JS -->
</head>
<body>

<!-- Header -->
<tiles:insertAttribute name="header" />
<!-- End header -->

<!-- Content -->
<tiles:insertAttribute name="content" />
<!-- End content -->

<!-- Footer -->
<tiles:insertAttribute name="footer" />
<!-- End footer -->

<!-- Script -->
<script src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.js"/>"></script>
<script src="<c:url value="/resources/js/myjs.js"/>"></script>
</body>
</html>
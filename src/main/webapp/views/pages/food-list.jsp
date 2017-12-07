<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<div class="container">
	<div class="col-lg-10 col-lg-offset-1">
		<!-- Hiển thị thông tin tìm kiếm ở đây -->
		<c:if test="${param.q != null}">
		<h4 style="padding-top: 14px">
			Kết quả tìm kiếm theo: <b>${param.q }</b>
		</h4>
		</c:if>
		<hr>
		<!-- Hiển thị kết quả tìm kiếm ở đây-->
		<div class="row">
			<c:forEach items="${foodlist}" var="item">
				<div class="col-md-3">
					<a href="#" class="thumbnail"> <img alt="Image"
						src="<c:url value="/resources/images/suon-xao-chua-ngot.jpg"/>"
						class="img-responsive">
						<div class="caption">
							<h4>${item.ten }</h4>
							<p>
								<i class="fa fa-tag" aria-hidden="true"></i> &nbsp Giá: VND
							</p>
						</div>
					</a>
				</div>
			</c:forEach>
		</div>
		<% int id = (int)request.getAttribute("id"); 
			int pages = (int)request.getAttribute("pages");%>
		<c:set var ="URL" value="${requestScope['javax.servlet.forward.request_uri']}"/>
		<c:set var ="URL" value="${URL}?${param.q != null? 'q=' +=param.q +='&':'' }" />
		<div style="text-align: center">
			<nav>
				<ul class="pagination">
					<%
						if (id > 1) {
					%>
					<li><a href="${URL }index=1" aria-label="<<"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
					<%
						}
					%>
					<%
						for (int i = id - 1; i <= pages; i++) {
					%>
					<%
						if (id == i) {
					%>
					<li class="active"><a href="javascript:"><%=i%></a></li>
					<%
						}
					%>
					<%
						if (i - id > 5) {
					%>
					<%
						if (i % 5 == 0) {
					%>
					<li><a href="${URL }index=<%=i%>"><%=i%></a></li>
					<%
						}
					%>
					<%
						} else {
					%>
					<%
						if (i != id && i >= 1) {
					%>
					<li><a href="${URL }index=<%=i%>"><%=i%></a></li>
					<%
						}
							}
					%>
					<%
						}
					%>

					<%
						if (id < pages) {
					%>
					<li><a href="${URL }index=<%=pages%>" aria-label=">>">
							<span aria-hidden="true">&raquo;</span>
					</a></li>
					<%
						}
					%>
				</ul>
			</nav>
		</div>
	</div>
</div>
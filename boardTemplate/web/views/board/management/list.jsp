<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<H1><c:out value="${title}" /></H1>
		<div class="row">
			<div class="col-lg-12">
				<table class="table table-striped table-hover">
					<thead>
						<tr>
						<c:forEach var="list" items="${tHead}" varStatus="row">
							<c:choose>
								<c:when test="${list.tHead eq 'checkbox'}">
									<td><input type="checkbox" id="allCheck" name="listCheck"></td>
								</c:when>
								<c:when test="${list.tHead eq 'number'}">
									<td>${row.count}</td>
								</c:when>
								<c:when test="${list.tHead eq 'all'}">
									<td><input type="checkbox" id="allCheck" name="listCheck"></td>
									<td><${row.count}</td>
								</c:when>
								<c:otherwise>
									<td>${list.tHead}</td>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						</tr>
					</thead>
					<tbody id="getBoardMgtList"></tbody>
				</table>
			</div>
		</div>
	</div>
</body>
<script defer="defer" language="JavaScript">
var pageInit = {
	// 페이지 조회
	init : function() {
		this.getList();
	},
	// 게시판 관리 목록
	getList : function() {
		if (parent.parent._LOG) console.log("pageInit.getList Start!");

		var jsonObj = {};

		$.ajax({
			url  : "",
			type : "post",
			data : jsonObj,
			async : false,
			beforeSend : function() {
				if (parent._LOG) console.log("pageInit.getList beforeSend");
			},
			success : function(data){
				if (parent._LOG) console.log("pageInit.getList success");
			},
			error : function() {
				if (parent._LOG) console.log("pageInit.getList error");
			}
		});

		if (parent._LOG) console.log("pageInit.getList End!");
	},
};
$(document).ready(function(){
	pageInit.init();
});
</script>
</html>
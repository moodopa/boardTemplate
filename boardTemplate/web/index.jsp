<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>Bootstrap Example</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script defer="defer" language="JavaScript">
		var _LOG = true;
		var _CONTEXT = "${pageContext.request.contextPath}";
	</script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Common Board</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">main</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
							게시판 관리 <span class="caret"></span>
						</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">게시판 관리 목록</a></li>
							<li><a href="#">게시판 관리 등록</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
							게시판 설정 <span class="caret"></span>
						</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">게시판 설정 목록</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
							게시판  <span class="caret"></span>
						</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="">게시판 목록</a></li>
							<li class="divider"></li>
							<li class="dropdown-header">게시판</li>
							<li><a href="#">aaa-게시판</a></li>
						</ul>
					</li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<p><a href="#">Link</a></p>
				<p><a href="#">Link</a></p>
				<p><a href="#">Link</a></p>
			</div>
			<div class="col-sm-10 text-left">
				<iframe src="/board/management/list.do" id="iContent" width="100%" height="100%" frameborder="0"></iframe>
			</div>
		</div>
	</div>
	<footer class="container-fluid text-ceanter">
		<p class="text-center">&#167; css : &#169; bootstrap &#167; creator : &#169; moodo </p>
	</footer>
</body>
</html>
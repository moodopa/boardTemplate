<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<html lang="ko">
<head>
	<title>${title}</title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<H1>SELECT</H1>
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<td>UID</td>
				<td>제목</td>
				<td>등록 ID</td>
				<td>등록 일시</td>
			</tr>
		</thead>
		<tbody id="getSampleList"></tbody>
	</table>
	<br>
	<h1>INSERT</h1>
	<div id="divInsert">
		<input type="text" id="inTitle" placeholder="제목을 입력하세요.">
		<input type="text" id="inContent" placeholder="본문을 입력하세요.">
		<input type="text" id="inRegId" placeholder="등록 ID를 입력하세요.">
		<input type="button" id="insert" value="저장" onclick="insertSample()">
	</div>
	<h1>UPDATE</h1>
	<div id="divUpdate">
		<input type="text" id="upSampleId" placeholder="sampleId를 입력하세요.">
		<input type="text" id="upTitle" placeholder="수정될 제목을 입력하세요.">
		<input type="text" id="upContent" placeholder="수정될 본문을 입력하세요.">
		<input type="text" id="upRegId" placeholder="수정될 등록 ID를 입력하세요.">
		<input type="button" id="update" value="수정" onclick="updateSample()">
	</div>
	<h1>DELETE</h1>
	<div id="divDelete">
		<input type="text" id="deSampleId" placeholder="삭제될 sampleId를 입력하세요.">
		<input type="button" id="delete" value="삭제" onclick="deleteSample()">
	</div>
</div>
</body>
<script defer="defer" type="text/javascript">
	$(function(){
		// $("#insert").on("click", insertSample());
	});
	function selectSample() {

		$.ajax({
			url			: "${pageContext.request.contextPath}/sample/select.do",
			type		: "post",
			data 		: "",
			dataType	: "json",
			async		: false,
			beforeSend	: function() {
				console.log("selectSample beforeSend Start!");
			},
			success : function(data){
				console.log("success => ", data);
				if (data.result == "success") {
					var htmlString = "";

					for (var i=0; i<data.data.length; i++) {
						htmlString += "<tr>";
						htmlString += "<td>"+ (data.data[i].sampleId||"") +"</td>";
						htmlString += "<td>"+ (data.data[i].title||"") +"</td>";
						htmlString += "<td>"+ (data.data[i].content||"") +"</td>";
						htmlString += "<td>"+ (data.data[i].regId||"") +"</td>";
						htmlString += "</tr>";
					}

					$("#getSampleList").empty().append(htmlString);
				} else {
					console.log("error => ", data.result);
				}
			},
			error : function(request, status, error) {
				console.log("code : ", request.status ,", message : ", request.responseText, ", error : ", error);
			}
		});
	};

	function insertSample() {
		$.ajax({
			url			: "${pageContext.request.contextPath}/sample/insert.do",
			type		: "post",
			data 		: {"title" : $("#inTitle").val(), "content" : $("#inContent").val(), "regId" : $("#inRegId").val()},
			dataType	: "json",
			async		: false,
			beforeSend	: function() {
				console.log("insertSample beforeSend Start!");
			},
			success : function(data){
				console.log("success => ", data);
				if (data.result == "success") {
					$("#divInsert").find("input[type=text]").val("");
					selectSample();
				} else {
					console.log("error => ", data.result);
				}
			},
			error : function(request, status, error) {
				console.log("code : ", request.status ,", message : ", request.responseText, ", error : ", error);
			}
		});
	};

	function updateSample() {
		$.ajax({
			url			: "${pageContext.request.contextPath}/sample/update.do",
			type		: "post",
			data 		: {"sampleId" : $("#upSampleId").val(), "title" : $("#upTitle").val(), "content" : $("#upContent").val(), "regId" : $("#upRegId").val()},
			dataType	: "json",
			async		: false,
			beforeSend	: function() {
				console.log("updateSample beforeSend Start!");
			},
			success : function(data){
				console.log("success => ", data);
				if (data.result == "success") {
					$("#divUpdate").find("input[type=text]").val("");
					selectSample();
				} else {
					console.log("error => ", data.result);
				}
			},
			error : function(request, status, error) {
				console.log("code : ", request.status ,", message : ", request.responseText, ", error : ", error);
			}
		});
	};

	function deleteSample() {
		$.ajax({
			url			: "${pageContext.request.contextPath}/sample/delete.do",
			type		: "post",
			data 		: {"sampleId" : $("#deSampleId").val()},
			dataType	: "json",
			async		: false,
			beforeSend	: function() {
				console.log("deleteSample beforeSend Start!");
			},
			success : function(data){
				console.log("success => ", data);
				if (data.result == "success") {
					$("#divDelete").find("input[type=text]").val("");
					selectSample();
				} else {
					console.log("error => ", data.result);
				}
			},
			error : function(request, status, error) {
				console.log("code : ", request.status ,", message : ", request.responseText, ", error : ", error);
			}
		});
	}

	$(document).ready(function(){
		selectSample();
	});
</script>
</html>
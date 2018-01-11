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

	$(document).ready(function(){
		selectSample();
	});
</script>
</html>
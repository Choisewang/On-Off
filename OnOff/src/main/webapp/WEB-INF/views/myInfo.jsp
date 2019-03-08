<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>마이페이지</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- All Plugin Css -->
<link rel="stylesheet" href="css/plugins.css">

<!-- Style & Common Css -->
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/main.css">

<style>
body {
	margin: 20px auto;
	padding: 0;
	font-family: "맑은 고딕";
	font-size: 1.5em;
}

ul#navi {
	width: 200px;
	text-indent: 10px;
}

ul#navi, ul#navi ul {
	margin: 0;
	padding: 0;
	list-style: none;
}

li.group {
	margin-bottom: 3px;
}

ul.sub li {
	margin-bottom: 2px;
	height: 35px;
	line-height: 35px;
	background: #f4f4f4;
	cursor: pointer;
}

ul.sub li a {
	display: block;
	width: 100%;
	height: 100%;
	text-decoration: none;
	color: #000;
}

ul.sub li:hover {
	background: #da0833;
}

#calendar {
	max-width: 75%;
}
</style>

<script type="text/javascript" src="js/jquery.min.js"></script>

</head>
<body>
	<div class="basic-information" style="min-width: 80%;">
		<table border="1" style="width: 100%; text-align: center;">
			<tr>
				<td rowspan="3" width="15%;">이미지</td>
				<td width="15%">이름</td>
				<td width="15%">생년월일 or 나이</td>
				<td width="15%">등급</td>
			</tr>

			<tr>
				<td colspan="3">주소</td>
			</tr>

			<tr>
				<td>전화번호</td>
				<td>이메일</td>
				<td>가입일</td>
			</tr>

			<tr>
				<td>변경하기</td>
				<td colspan="3">비밀번호 변경, 회원정보 수정, 회원 탈퇴</td>
			</tr>
		</table>

	</div>
</body>
</html>
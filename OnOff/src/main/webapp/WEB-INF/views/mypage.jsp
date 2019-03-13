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

</style>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		$("#myPage").load("myInfo.do");
		
		$("#myInfo").click(function() {
			$("#myPage").load("myInfo.do");
		});

		$("#myGroup").click(function() {
			$("#myPage").load("myGroup.do");
		});

		$("#myCal").click(function() {
			$("#myPage").load("myCal.do");
		});

		$("#myGroupManager").click(function() {
			$("#myPage").load("myGroupManager.do");
		});
	});
</script>

</head>

<body>

	<!-- Navigation Start  -->
	<nav class="navbar navbar-default navbar-sticky bootsnav">
		<div class="container">
			<!-- Start Header Navigation -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-menu">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="index.html"> <img
					src="img/Onlogo.png" class="logo" alt="logo">
				</a>
			</div>
			<!-- End Header Navigation -->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-menu">
				<ul class="nav navbar-nav navbar-right" data-in="fadeInDown"
					data-out="fadeOutUp">
					<li><a href="#">Sign up</a></li>
					<li><a href="#">Login</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
	</nav>
	<!-- Navigation End  -->

	<table>
		<tr>
			<td valign="top">

				<ul id="navi">
					<li class="group">
						<ul class="sub">
							<li><a id="myInfo">내정보</a></li>
							<li><a id="myGroup">가입한 그룹</a></li>
							<li><a id="myCal">소모임 달력</a></li>
							<li><a id="myGroupManager">그룹관리</a></li>
							<!-- 관리자/주최자 권한 if문 -->
						</ul>
					</li>
				</ul>

			</td>

			<td style="width: 83%;">
				<div id="myPage" style="margin:50px 50px;  width: 100%;"></div>
			</td>
		</tr>
	</table>

</body>
</html>
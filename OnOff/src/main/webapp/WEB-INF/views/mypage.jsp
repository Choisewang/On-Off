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
		margin:20px auto;
		padding: 0;
		font-family:"맑은 고딕";
		font-size:1.5em;
	}
	ul#navi {
		width: 200px;
		text-indent: 10px;
	}
	ul#navi, ul#navi ul {
		margin:0;
		padding:0;
		list-style:none;
	}
	li.group {
		margin-bottom: 3px;
	}
	ul.sub li {
		margin-bottom: 2px;
		height:35px;
		line-height:35px;
		background:#f4f4f4;
		cursor:pointer;
	}
	ul.sub li a {
		display: block;
		width: 100%;
		height:100%;
		text-decoration:none;
		color:#000;
	}
	ul.sub li:hover {
		background:#da0833;
	}
</style>

</head>



<body>

	<!-- Navigation Start  -->
	<nav class="navbar navbar-default navbar-sticky bootsnav">

		<div class="container">      
			<!-- Start Header Navigation -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
				<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="index.html"><img src="img/Onlogo.png" class="logo" alt="logo"></a>
			</div>
			<!-- End Header Navigation --> 

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-menu">
				<ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
						<li><a href="index.html">Sign up</a></li> 
						<li><a href="login.html">Login</a></li>
					</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
	</nav> 
	<!-- Navigation End  -->
    <div>
    	<ul id="navi">
        	<li class="group">
            	<ul class="sub">
            	    <li><a href="#">내정보</a></li>
            	    <li><a href="#">가입중인소모임</a></li>
            	    <li><a href="#">참석예정인 소모임(달력)</a></li>
            	    <li><a href="#">회원관리</a></li>
            	</ul>
        	</li>
    	</ul>
    	
    	
    
    </div>
    


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="no-js" >
    <head>
        <meta charset="utf-8"> 
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>On & Off</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		
        <!-- All Plugin Css --> 
		<link rel="stylesheet" href="css/plugins.css">
		
		<!-- Style & Common Css --> 
		<link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/main.css">

	<style type="text/css">
	
	.up-box{
		/* font-size: 40px; */
		border-bottom: 1px solid black;
		padding-bottom: 30px;
		word-wrap:break-word;
		height: auto;
		width: auto;
		background-color: white;
		word-wrap:break-word;
		padding-left: 700px;
	}
	
	.down-box{
		padding-top: 30px;
		padding-bottom: 30px;
		height: auto;
		width : 100%;
		background-color: white;
		padding-left: 700px;
		float: left;
		
	}
	
	
	img{
		max-width: 50%;
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
               <a class="navbar-brand" href="index.jsp"><img src="img/logo.png" class="logo" alt=""></a>
            </div>
            <!-- End Header Navigation -->
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-menu">
               <ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
                     <li><a href="index.jsp">Home</a></li> 
                     <c:set var="user" value="${dto.username }"/>
                     <c:choose>
                     <c:when test="${user==null }">
                        <li class="login"><a href="login.do">Login</a></li>
                     </c:when>
                     <c:otherwise>
                        <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">${dto.username }</a>
                           <ul class="dropdown-menu animated fadeOutUp" style="display: none; opacity: 1;">
                              <li class="active"><a href="mypage.do">마이페이지</a></li>
                              <li><a href="logout.do">로그아웃</a></li>
                           </ul>
                        </li>
                     </c:otherwise>
                  </c:choose>
               </ul>
            </div><!-- /.navbar-collapse -->
         </div>   
      </nav>
<!-- Navigation End  -->


	
    <!-- Main jumbotron for a primary marketing message or call to action -->
	<section class="inner-banner" style="backend:#242c36 url(https://via.placeholder.com/1920x600)no-repeat;">
		<div class="container">
			<div class="caption">
				<h2>선택한 그룹</h2>
				<p>그룹 상세보기<span>ㅇㅇ</span></p>
			</div>
		</div>
	</section>
	


	<section>
		
		<div class="up-box">
			
				<div style="width: auto; height: auto; float: left;"><a><img alt="" src=""> 이미지</a></div>
				
				<a>그룹 소개 적는 곳</a>
				
				<button class="btn brows-btn">가입하기</button>
		</div>
			
		<div class="down-box">
			
			<button class="btn brows-btn" style="display: inline-block">자유게시판</button>
			<button class="btn brows-btn" style="display: inline-block">갤러리</button>
			<button class="btn brows-btn" style="display: inline-block" onclick="location.href='moim.do'">모임 일정</button>
			<button class="btn brows-btn" style="display: inline-block">라이브</button>
			<button class="btn brows-btn" style="display: inline-block">채팅</button>

			
		</div>
		


	</section>		

<br></br>
      <!-- footer start -->
      <footer>
         <div class="copy-right">
          <p>&copy;Copyright 2018 Final Project | Design By <a href="#"> Kh정보교육원_On조 </a></p>
         </div>
      </footer>
		 
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/owl.carousel.min.js"></script>
		<script src="js/bootsnav.js"></script>
		<script src="js/main.js"></script>
    </body>
</html>
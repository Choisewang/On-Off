<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="no-js" lang="en">
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
		<section class="main-banner" style="background:#242c36 url(img/slider-01.jpg) no-repeat">
			<div class="container">
				<div class="caption">
					<h2><img src="img/logo.png" class="logo" alt=""></h2>
					<form action="search.do" method="post">
						<fieldset> 
							<div class="col-md-10 col-sm-4 no-pad">
								<input type="text" class="form-control border-right" name="searchText" placeholder="소모임을 검색하세요" />
							</div>
							<div class="col-md-2 col-sm-2 no-pad">
								<input type="submit" class="btn seub-btn" value="SEARCH" />
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</section>
		
				

		
		<br/><br/><br/><hr/><br/>
		<div class="bestclub">BEST CLUB</div>
		
		<section class="features">
			<div class="container" id="bestsort">
				<div class="col-md-4 col-sm-4">
					<div class="bestsort-content">
						members
					</div>
				</div>
				<div class="col-md-4 col-sm-4">
					<div class="bestsort-content">
						posts
					</div>
				</div>
				<div class="col-md-4 col-sm-4">
					<div class="bestsort-content">
						satisfaction
					</div>
				</div>				
			</div>
			<div class="container">
				
				<div class="col-md-4 col-sm-4">
					<div class="features-content">
						<img class="sampleimg" src="img/sample_koala.jpg"/>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-4">
					<div class="features-content">
						<img class="sampleimg" src="img/sample_koala.jpg"/>
					</div>
				</div>

				<div class="col-md-4 col-sm-4">
					<div class="features-content">
						<img class="sampleimg" src="img/sample_koala.jpg"/>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-4">
					<div class="features-content">
						<img class="sampleimg" src="img/sample_koala.jpg"/>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-4">
					<div class="features-content">
						<img class="sampleimg" src="img/sample_koala.jpg"/>
					</div>
				</div>
				
				<div class="col-md-4 col-sm-4">
					<div class="features-content">
						<span class="box1"><span aria-hidden="true" class="icon-printer"></span></span>
						<h3>Send Your Resume</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incidid ut labore et dolore magna aliqua.</p>
					</div>
				</div>
			
			</div>
		</section>

		<section class="counter">
			<div class="container">
				<div class="randomlive">
				<p class="randomlive_">OFFLINE LIVE</p>
				<iframe width="560" height="315" src="https://www.youtube.com/embed/G8APgeFfkAk" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
				</div>
			</div>
		</section>
			
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

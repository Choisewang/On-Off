<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>On & Off | 상세보기</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- All Plugin Css -->
<link rel="stylesheet" href="css/plugins.css">

<!-- Style & Common Css -->
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Insert title here</title>
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
				<a class="navbar-brand" href="index.html"><img
					src="img/logo.png" class="logo" alt=""></a>
			</div>
			<!-- End Header Navigation -->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-menu">
				<ul class="nav navbar-nav navbar-right" data-in="fadeInDown"
					data-out="fadeOutUp">
					<li><a href="index.html">Home</a></li>
					<li><a href="login.html">Login</a></li>
					<li><a href="companies.html">mypage</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Browse</a>
						<ul class="dropdown-menu animated fadeOutUp"
							style="display: none; opacity: 1;">
							<li class="active"><a href="browse-job.html">Browse Jobs</a></li>
							<li><a href="company-detail.html">Job Detail</a></li>
							<li><a href="resume.html">Resume Detail</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
	</nav>
	<!-- Navigation End  -->

	<section class="profile-detail">
		<div class="container">
			<div class="col-md-12">
				<div class="row">
					<div class="basic-information">
						<div class="col-md-9 col-sm-9">
							<div class="profile-content">
								<h2>
									제목<span>등록일</span>
								</h2>
								<p>아니... 이게 정말로 되는건가?</p>
							</div>
						</div>

						<div class="panel panel-default">
							<div class="panel-heading">
								<i class="fa fa-user fa-fw"></i> 글쓴이
							</div>
							<!-- /.panel-heading -->

							<div class="panel-content">
								<div>
									<div class="testimonial" style="text-align: left; margin-top: 60px;">
										<div class="pic">
											<img src="img/client-1.jpg" alt="">
										</div>
									</div>
									<!-- <ul class="WriterInformation">
										<li><span>Address:</span>Menlo Park, CA</li>
										<li><span>Website:</span>Google.com</li>
										<li><span>Employee:</span>50,000 - 70,000 employer</li>
										<li><span>Mail:</span>info@google.com</li>
										<li><span>From:</span>1998</li>
										<li>
										
										</li>
									</ul> -->
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>


	<!-- 댓글 -->
	<section class="testimonials dark">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div id="testimonial-slider" class="owl-carousel">

						<!-- for문 시작 -->
						<div class="testimonial">
							<div class="pic">
								<img src="img/client-1.jpg" alt="">
							</div>
							<p class="description">" 댓글내용 "</p>
							<h3 class="testimonial-title">댓글 작성일</h3>
							<span class="post">작성자</span>
						</div>
						<!-- for문 종료 -->

						<div class="testimonial">
							<div class="pic">
								<img src="img/client-2.jpg" alt="">
							</div>
							<p class="description">" 댓글내용 "</p>
							<h3 class="testimonial-title">댓글 작성일</h3>
							<span class="post">작성자</span>
						</div>

						<div class="testimonial">
							<div class="pic">
								<img src="img/client-3.jpg" alt="">
							</div>
							<p class="description">" 댓글내용 "</p>
							<h3 class="testimonial-title">댓글 작성일</h3>
							<span class="post">작성자</span>
						</div>

						<div class="testimonial">
							<div class="pic">
								<img src="img/client-4.jpg" alt="">
							</div>
							<p class="description">" 댓글내용 "</p>
							<h3 class="testimonial-title">댓글 작성일</h3>
							<span class="post">작성자</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<!-- footer start -->
	<footer>
		<div class="container">
			<div class="col-md-3 col-sm-6">
				<h4>Featured Job</h4>
				<ul>
					<li><a href="#">Browse Jobs</a></li>
					<li><a href="#">Premium MBA Jobs</a></li>
					<li><a href="#">Access Database</a></li>
					<li><a href="#">Manage Responses</a></li>
					<li><a href="#">Report a Problem</a></li>
					<li><a href="#">Mobile Site</a></li>
					<li><a href="#">Jobs by Skill</a></li>
				</ul>
			</div>

			<div class="col-md-3 col-sm-6">
				<h4>Latest Job</h4>
				<ul>
					<li><a href="#">Browse Jobs</a></li>
					<li><a href="#">Premium MBA Jobs</a></li>
					<li><a href="#">Access Database</a></li>
					<li><a href="#">Manage Responses</a></li>
					<li><a href="#">Report a Problem</a></li>
					<li><a href="#">Mobile Site</a></li>
					<li><a href="#">Jobs by Skill</a></li>
				</ul>
			</div>

			<div class="col-md-3 col-sm-6">
				<h4>Reach Us</h4>
				<address>
					<ul>
						<li>1201, Murakeu Market, QUCH07<br> United Kingdon
						</li>
						<li>Email: Support@job.com</li>
						<li>Call: 044 123 458 65879</li>
						<li>Skype: job@skype</li>
						<li>FAX: 123 456 85</li>
					</ul>
				</address>
			</div>

			<div class="col-md-3 col-sm-6">
				<h4>Drop A Mail</h4>
				<form>
					<input type="text" class="form-control input-lg"
						placeholder="Your Name"> <input type="text"
						class="form-control input-lg" placeholder="Email...">
					<textarea class="form-control" placeholder="Message"></textarea>
					<button type="submit" class="btn btn-primary">Login</button>
				</form>
			</div>


		</div>
		<div class="copy-right">
			<p>
				&copy;Copyright 2018 Jober Desk | Design By <a
					href="https://themezhub.com/">ThemezHub</a>
			</p>
		</div>
	</footer>

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/owl.carousel.min.js"></script>
	<script src="js/bootsnav.js"></script>
	<script src="js/main.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Jober Desk | Responsive Job Portal Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		
        <!-- All Plugin Css -->  
		<link rel="stylesheet" href="css/plugins.css">
		
		<!-- Style & Common Css --> 
		<link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/main.css">

    </head>
    
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
	
	//일반 로그인
	function login(){
		
		var idVal = $("#id").val();
		var pwVal = $("#pw").val();
		
		if(idVal == null || idVal==""){
			alert("아이디를 확인해 주세요");
		}else if(pwVal == null || pwVal==""){
			alert("비밀번호를 확인해 주세요");
		}else{
			
			$.ajax({
				type:"post",
				url:"loginajax.do",
				data:"id="+idVal+"&pw="+pwVal,
				success:function(msg){
					if(msg.loginchk == true){
						location.href="home.do";
					}else{
						alert("잘못 입력했습니다.");
					}
				},
				error:function(){
					alert("로그인 실패");
				}				
			});			
		}	
	}
	
	</script>
	
    <body>
	
		<!-- Navigation Start  -->
		<nav class="navbar navbar-default navbar-sticky bootsnav">

			<div class="container">      
				<!-- Start Header Navigation -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
						<i class="fa fa-bars"></i>
					</button>
					<a class="navbar-brand" href="home.do"><img src="img/Onlogo.png" class="logo" alt=""></a>
				</div>
				<!-- End Header Navigation -->

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="navbar-menu">
					<ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
							<li><a href="home.do">Home</a></li> 
							<li><a href="login.do">Login</a></li>
						</ul>
				</div><!-- /.navbar-collapse -->
			</div>   
		</nav>
		<!-- Navigation End  -->
		
		<!-- login section start -->
		<section class="login-wrapper">
			<div class="container">
				<div class="col-md-6 col-sm-8 col-md-offset-3 col-sm-offset-2">
					<!-- <form> -->
						<img class="img-responsive" alt="logo" src="img/Onlogo.png">
						<input type="text" class="form-control input-lg" placeholder="User ID" id="id">
						<input type="password" class="form-control input-lg" placeholder="Password" id="pw">
						<label><a href="forgetPassword.do">Forget Password?</a></label>
						<button type="button" class="btn btn-primary" onclick="login();">Login</button>
						<p>Have't Any Account <a href="registUser.do">Create An Account</a></p>
					<!-- </form> -->
				</div>
			</div>
		</section>
		<!-- login section End -->	
		
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

	<style type="text/css">
	
	.left-box{
		float:left;
		width: 70%;
		border-right: 1px solid black;
		padding-right: 30px;
		word-wrap:break-word;
		height: 500px;
		background-color: white;
		padding-left: 350px;
		
	} 
	
	.right-box{
		float: right;
		width: 30%;
		padding-left: 20px;
		word-wrap:break-word;
		height: 500px;
		background-color: white;
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
               <a class="navbar-brand" href="index.do"><img src="img/logo.png" class="logo" alt=""></a>
            </div>
            <!-- End Header Navigation -->
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-menu">
               <ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
                     <li><a href="index.do">Home</a></li> 
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
				<h2>모임 일정</h2>
				<p>현재 진행 예정인 모임<span>ㅇㅇ</span></p>
			</div>
		</div>
	</section>
	
<!-- 	<section class="jobs">
		<div class="container">
			<div class="row heading">
				<h2></h2>
				<p>참여를 원하는 곳에 참가신청을 하세요</p> 
			</div>
		</div>
	</section> -->
	
	<section>
		
		<div class="left-box">
			
				<form action="" method="post">
					<h1 style="font-size:40px;">일정</h1>
					<input type="hidden" value="">
							<table border="1">
									<col width="50px">
									<col width="450px">
									<col width="100px">
									<col width="100px">
								<tr id="">
									<th>No.</th>
									<th>진행중인 일정</th>
									<th>주최자</th>
									<th>작성일자</th>
								</tr>
								
<%-- <%
			if(list.size() == 0){
%>			

		<tr><td colspan="5">--글이 존재하지 않습니다--</td></tr>

<%
			}else{
				for(MVCBoardDto dto:list){
			
%> --%>	
						
								<tr>
									<td>d</td>
									<td><a href="moimDetail.do">d</a></td>
									<td>d</td>
									<td>d</td>
								</tr>		
					
							
								 <tr>
			 						<td colspan="4">
			 							<input type="button" value="글쓰기" onclick="location.href='moimwrite.do'">
			 							<input type="submit" value="삭제" /> <!-- onclick= -->
									</td>
								</tr>	
							</table>						


<!-- 페이징 코드 시작-->
	<nav aria-label="Page navigation example" style="margin-left: 250px;"> 
  		<ul class="pagination">
    		<li class="page-item">
      	<a class="page-link" href="#" aria-label="Previous">
       	 <span aria-hidden="true">&laquo;</span>
      	</a>
    		</li>
   			 <li class="page-item"><a class="page-link" href="#">1</a></li>
   			 <li class="page-item"><a class="page-link" href="#">2</a></li>
   			 <li class="page-item"><a class="page-link" href="#">3</a></li>
    			<li class="page-item">
        <a class="page-link" href="#" aria-label="Next">
         <span aria-hidden="true">&raquo;</span>
        </a>
   		    </li>
 	    </ul>
	</nav>
<!-- 페이징 코드 끝-->
				</form>
		</div>
			
		<div class="right-box">
			
			
				<h1>캘린더넣어~~~~~~~~~~~</h1>
			
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
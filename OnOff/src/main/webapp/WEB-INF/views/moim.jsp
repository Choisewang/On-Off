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

	<style type="text/css">
	
	.left-box{
		float:left;
		width: 70%;
		border-right: 1px solid black;
		padding-right: 30px;
		word-wrap:break-word;
		height: 600px;
		background-color: white;
		padding-left: 350px;
		
		
	} 
	
	.right-box{
		float: right;
		width: 30%;
		padding-left: 20px;
		word-wrap:break-word;
		height: 600px;
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
								
								<c:choose>
								<c:when test="${empty list }">
									<tr>
										<td>*******모임 정보가 없습니다*******</td>
									</tr>
								</c:when>
									<c:otherwise>
										<c:forEach items="${list }" var="dto">
									
								<tr>
									<td>${dto.moimno }</td>
									<td><a href="moimDetail.do?moimno=${dto.moimno }">${dto.moimtitle }</a></td>
									<td>${dto.userid }</td>
									<td>${dto.moimregdate }</td>
								</tr>		
									
										</c:forEach>
									</c:otherwise>
								</c:choose>
						
						


							
								 <tr>
			 						<td colspan="4">
			 							<input type="button" value="글쓰기" onclick="location.href='moimwrite.do'">
			 							<input type="submit" value="삭제" /> <!-- onclick= -->
									</td>
								</tr>	
							</table>						

<%-- <div>
 <ul>
  <c:if test="${pageMaker.prev}">
   <li><a href="paging.do?page=${pageMaker.makeQuery(pageMaker.startPage - 1)}">이전</a></li>
  </c:if> 
  
  <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
   <li><a href="paging.do?page=${pageMaker.makeQuery(idx)}">${idx}</a></li>
  </c:forEach>
    
  <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
   <li><a href="paging.do?page=${pageMaker.makeQuery(pageMaker.endPage + 1)}">다음</a></li>
  </c:if> 
 </ul>
</div>
 --%>

      <div id="paging" style="padding-left:350px;font-weight:bold;">
       
        <c:if test="${pageMaker.prev}">
         <a href="paging.do?page=${startPage - 1}">이전&nbsp;&nbsp;&nbsp;&nbsp;</a>
        </c:if> 
         
        <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
         <a href="paging.do?page=${idx}">${idx}&nbsp;&nbsp;</a>
        </c:forEach>
          
        <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
         <a href="paging.do?page=${pageMaker.endPage + 1}">&nbsp;&nbsp;다음</a>
        </c:if> 
      
      </div>


				</form>
		</div>
			

			
			
		<div class="right-box">
			
			<%-- <jsp:include page="myCal.jsp"></jsp:include> --%>
			<%-- 	<%@ include file="myCal.jsp" %> --%>
			
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
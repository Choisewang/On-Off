<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="home.do">home</a>
	<br/>
	<a href="boardList.do">boardList</a>
	<a href="boardListPhoto.do">boardListPhoto</a>
	<br/>
	<a href="boardDetail.do">boardDetail</a>
	<a href="boardDetailPhoto.do">boardDetailPhoto</a>	
	<br/>
	<a href="boardWrite.do">boardWrite</a>
	
	<br/>
	<a href="login.do">login</a>
	<br/>
	<a href="moim.do">moim</a>
	<br/>
	<a href="moimDetail.do">moimDetail</a>
	<a href="search.do">소모임검색</a>

	<a href="groupDetail.do">그룹 상세보기</a>
	<%-- <jsp:forward page="home.do"></jsp:forward>	 --%>
	<a href="home.do">home</a>
	<br/>
	<input type="button" value="채팅창 팝업창 " onclick="showPopup();">
	
	<script type="text/javascript">
		function showPopup(){
			window.open("chat.do","a","width=400,height=500,left=100,top=50");
		}
	</script>
	
	<a href="test.do">test</a>
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<style type="text/css">
	
	#data{
		border: 1px dashed black;
		width: 250px;
		height: 300px;
		overflow: auto;
	}
	
	.mysession{
		padding: 2px;
		margin: 3px; 
		border-radius: 5px;
		background: lightgray;
		display: inline-block;
	}

</style>

<%
	String id = (String)request.getAttribute("id");
	String groupnum = (String)request.getAttribute("groupnum");
	System.out.println(id + " : " + groupnum);
	
	HttpSession session = request.getSession(false);
	if(session !=null){
		session.invalidate();
	}
	session = request.getSession(true);
	session.setAttribute("id",id);
	session.setAttribute("groupnum",groupnum);
	
%>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="http://cdn.sockjs.org/sockjs-0.3.4.js"></script>

<script type="text/javascript">

	$(document).ready(function() {
		$("#sendBtn").click(function() {
			sendMessage();
		});
	});

	var sock;
	
	//웸소켓을 지정한 url로 연결한다.
	sock = new SockJS("<c:url value="/echo"/>");

	/*
		(1) onopen : 웹 소켓이 열리면 호출
		
		(2) onmessage : 메시지가 도착하면 호출
		
		(3) onerror : 에러가 발생하면 호출
		
		(4) onclose : 웹 소켓이 닫히면 호출
		
		(5) send : 메시지 전송
		
		(6) close : 웹 소켓 닫기

	*/
	
	//자바스크립트 안에 function을 집어넣을 수 있음.
	//데이터가 나한테 전달되었을 때 자동으로 실행되는 function
	
/*  	sock.onopen = function(){
		
	}; 
*/
	
	sock.onmessage = onMessage;

	//데이터를 끊고싶을때 실행하는 메소드
	sock.onclose = onClose;
	
	function sendMessage() {
		// websocket으로 메세지를 보내겠다.
		sock.send($("#message").val());
		$("#message").val('');
	}
	
	// evt 파라미터는 웹소켓을 보내준 데이터다.(자동으로 들어옴)
	function onMessage(evt) {
		var data = evt.data;
		var sessionid = null;
		var message = null;
		
		// evt 문자열 split
		var strArray = data.split('|');
		
		sessionid = strArray[0];
		message = strArray[1];
		

		$("#data").append(data + "<br/>");
		$("#data").animate({ scrollTop: $('#data').prop("scrollHeight")}, 0);
		//sock.close();
		
		
	}

	function onClose(evt) {
		$("#data").append("연결 끊김");
	}
	
</script>

</head>
<body>
	
	<div>
		<div id="chatlist">
			<table border="1">
				
			</table>
		</div>
	</div>
	
	
	<div id="popupchat">
		<div id="data"></div>
		<span><%=id %></span>
		<input type="text" id="message" onkeypress="if(event.keyCode==13){sendMessage();}" />
		<input type="button" id="sendBtn" value="send" />
	</div>
	

</body>
</html>

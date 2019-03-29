<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
//$("#btn_update").click(function() {
//$("#myPage").load("groupUpdateRes.do");
//});

// 폼 다 채워졌나 확인
function nullChk(){
if(document.getElementById("title").value==""||document.getElementById("content").value==""){
 alert("양식을 모두 작성해주세요");
}  else {
 document.getElementById("updateform").submit();
}
}
</script>
</head>
<body>

   <section class="regist-wrapper">
      <div class="container">
         <div class="col-md-12">
            <div class="row">
               <form action="groupUpdateRes.do" id="updateform" method="post">
                  <input type="hidden" name="groupno" id="groupno" value="${dto.groupno }"/>
                  <div class="basic-information">
                     <div class="col-md-9 col-sm-9">
                        <div class="profile-content">
                           <ul class="information">
                              <li><span>제목</span><label style="font-weight:normal;"><input id="title" name="grouptitle" type="text" value="${dto.grouptitle }" size="52"></label></li>
                              <li><span>내용</span><label style="font-weight:normal;"><textarea id="content" name="groupcontent" rows=5 cols=53>${dto.groupcontent }</textarea></label></li>
                              <li><span>사진</span><label style="font-weight:normal;"><input type="hidden"><img src="img/${dto.groupimg }.jpg" class="img-responsive" alt="" /></label></li>
                              <li><span>그룹생성날짜</span><fmt:formatDate value="${dto.groupregdate }" pattern="yyyy-MM-dd"/><label></label></li>
                           </ul>                                    
                        </div>
                     </div>
                  </div>

                  <div id="twobtn">
                   <input type="button" class="btn brows-btn2" value="수정하기" id="btn_update" onclick="nullChk();"/>
                  <input type="button" class="btn brows-btn2" value="마이페이지로 돌아가기" id="backbtn" onclick="location.href='mypage.do'" />
                  </div>
               </form>   
            </div>
         </div>
      </div>
      </section>

</body>
</html>
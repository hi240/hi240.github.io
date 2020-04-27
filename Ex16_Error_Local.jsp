<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="/error/commonError.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  페이지마다 고유한 에러페이지 설정 
          설정은 최종 배포시 하는게 맞다.
     고민: 모든 페이지에 설정하는게 아니고, 전역(web.ㅌml) 설정을 하면 자동적용

-->
<%
   String data=request.getParameter("name").toLowerCase();
%>
전달받은 내용: <%= data %>
</body>
</html>
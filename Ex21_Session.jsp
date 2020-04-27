<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  
session 객체 : 브라우져 (접속한 사용자) 마다 서버에서 부여하는 고유한 객체

session 값 : 웹 서버가 접속한 클라이언트(브라우져)에게 부여하는 고유한 ID값(식별값)

A사용자 : 웹 서버에 접속 : session객체 생성 >> 고유한 값 ID 값을 부여 >> 그 ID값을  Client response
B사용자 : 웹 서버에 접속 : session객체 생성 >> 고유한 값 ID 값을 부여 >> 그 ID값을  Client response

jsessionid : c0f92f ... >>유일값 보장
session 객체 : 각 접속한 사용자의 [고유한 정보]>>쇼핑몰 구매한 물건 정보, 로그인한 id 정보
                           처음 접속한 시간, 마지막 접속한 시간
                           
-->
<%
    Date time = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    
%>
    <h3>세션정보</h3>
    session객체의 식별값 : <%= session.getId() %><br> <!-- 사용자마다 고유하게 부여하는 key값 -->
    <hr>
    <%
       time.setTime(session.getCreationTime());
    %>
    [session 생성된 시간] : <%= formatter.format(time) %>
    <hr>
    <%
        time.setTime(session.getLastAccessedTime());
    %>
    [session 마지막 접속 시간 (client의)] : <%= formatter.format(time) %>
</body>
</html>






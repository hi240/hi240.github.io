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
Today Point
서버자원(WAS: memory 사용하기)
1- Application 객체 (전역자원)>> 접속하는 모든 사용자가 다룰 수 있는 자원(마치static)
2- Session 객체 >> 접속하는 브라우저 마다 (Session ID )마다 고유하게 부여되는 객체 (고유한 자원)
 서버가 클라이언트에 준 key값
application.setAttribute("count",0); //count변수는 전역자원
사이트에 접속하는 모든 session은 count라는 변수에 접근 가능
session.setAttribute("ID","kglim") //id라는 변수는 session객체 안에 생성
접속한 모든 사용자 마다 고유하게 부여되는 객체 안에 생성이 됩니다.

A라는 사용자가 웹 서버 접속
서버 고유한session객체 자동 생성>객체 식별값(A001) > 식별값 > 접속한 client response
AA05BBAC key에 해당하는 session객체를 가지고 논다..

B라는 사용자가 웹 서버 접속
서버 고유한session객체 자동 생성>객체 식별값(B001) > 식별값 > 접속한 client response
AA05BBAC key에 해당하는 session객체를 가지고 논다..
 -->
 세션 정보
 웹서버가 부여하는 고유한 sessionID <%=session.getId() %><br>
 
 <h3>세션안에다가 값을 쓸 수 있다.이렇게.</h3>
 <%
   String userid = request.getParameter("userid");
 session.setAttribute("id", userid); //내가만든 session에 값적기
 %>
 <h3>세션 변수값</h3>
 <%
 String id = (String)session.getAttribute("id");
 out.print("당신의 ID는 <b>"+id+"<b>");
 %>
</body>
</html>





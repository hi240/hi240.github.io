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
1. 메모리쿠키 (브라우저쿠키) : 클라이언트가 강제로 삭제하지 않는 한 브라우저 닫기 전까지 유효함..(소멸타임: -1)
2. 파일쿠키 (소멸시간 有) : 클라이언트가 강제로 삭제하지 않는 한 정해진 시간까지 유효
   setMaxage(60) : 60초
   30일
   (30*24*60*60) 일*시*분*초
   setMaxage(30*24*60*60)
 -->
 <% 
   Cookie co = new Cookie("bit","hong");
   co.setMaxAge(30*24*60*60);
   response.addCookie(co);
 %>
</body>
</html>
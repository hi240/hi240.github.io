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
정보(데이터) > where 저장

클라이언트 (개인 로컬 PC에 있는 브라우저)  :  서버(웹 서버 또는 DB 서버)
정보(데이터,자료) >> 어디에 저장(보관)
고민: 보안적인 고민.. , 소멸(일시적,영속적)

(보안성별루)
Client에 정보를 저장하는 방법!
1. 쿠키!! (메모리쿠키와 파일쿠키로 나눠져요!) 메모리쿠키는 브라우저 닫으면 사라지고, 파일쿠키는 남아있어요! 파일쿠키는 local txt파일로 저장(암호화되어있어요)
2. 로컬스토리지 (저장소: key, value)

(보안성좋음)
Server(Web server : tomcat)
1. 서버에 메모리로 쓰는거 : session 객체(접속유저당 하나씩 만들어지는데, 접속한 사용자 식별값, 개인정보, 접속시간 등) >> 서버가 꺼지거나, 리부팅하면 다 사라짐
2.                   application 객체(접속한 모든 사용자가 공유하는 객체) >> 서버꺼지거나, 리부팅 소멸
3. 서버 영속적 소멸 : 파일 > login.txt > 영속적이긴 한데 관리가 힘듬.
4. DB server : 보안, 영속 관리 편함


 -->
 <%
    Cookie mycookie = new Cookie("cname","1004"); //생성
     //만든 쿠키를 Client 브라우저에 전달해야함. > response (<%= 같은거..)
     response.addCookie(mycookie);
 %>
 <a href="Ex17_Cookie_Read.jsp">Cookie read</a>
 서버에서 설정한 쿠키 이름: <%= mycookie.getName() %><br>
 서버 설정한 값 : <%= mycookie.getValue() %><br>
 서버 설정한 쿠키 소멸 시기 (session 소속) : <%= mycookie.getMaxAge() %>
</body>
</html>








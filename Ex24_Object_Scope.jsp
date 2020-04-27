<%@page import="kr.or.bit.Emp"%>
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
tomcat 제공 (WAS) 기본적인 내장 객체
1. request (요청: 클라이언트 정보)
2. response (응답: 특정 페이지 이동, 정보 출력, 쿠키 쓰기)
3. application (전역객체 : web.xml 자원 read, 전역자원)
4. session(접속한 사용자 (브라우저 마다) 고유하게 부여되는 객체, 고유한 변수)
5. out(out.print())

session 객체
[내부에 session 변수를 생성 가능]
생성된 변수의 scope은 (유효범위)
scope: a.jsp(session.setAttribute 로 member 변수 생성
       b.jsp(session.getAttribute 로 member 를 read 가능
session 변수는 현재 WebContent 폴더 안에 있는 모든 페이지에서 사용가능
Life-cycle (언제사라지나): 1. session 변수는 session 객체와 life-cycle이 동일 (sessionID 소멸)
                        2. 서버 리부팅, session.invalidate()을 하면 강제로 사라짐.
                        
Application객체
[내부 application]에도 변수 생성 가능 전역변수. 모든 session이 공유가능 >접속하는 모든 사용자에게
scope : 현재 WebContent 폴더 안에 있는 모든 페이지에서 사용가능 > java의 static
Life-cycle : 소멸(서버가 리부팅 될 때)

request 객체
[request 변수] : request.setAttribute("type","A");
scope : 요청페이지(login.jsp)에서만 사용. 단, 예외적으로 다른페이지에 login.jsp를 (include , forward)하는 경우라면, 그 페이지에 공유된다★★★★★★★
 -->
 <% 
    Emp emp = new Emp();
 emp.setEmpno(2000);
 emp.setEname("홍길동");
   //생성 login.jsp
   session.setAttribute("empobj",emp);
 
       //다른 페이지 가정(member.jsp)
       Emp e = (Emp)session.getAttribute("empobj");
       out.print(e.getEmpno()+"<br>");
       out.print(e.getEname()+"<br>");

       //request
       request.setAttribute("who","king");
       String who = (String) request.getAttribute("who");
       out.print("who"+who);
 
     //<jsp:include page="b.jsp"></jsp:include>
     //<jsp:forward page="b.jsp"></jsp:forward>
     
     //b.jsp
     //session.getAttribute("empobj") 가능
     //request.getAttribute("who") 도 가능
       
 %>
 
</body>
</html>








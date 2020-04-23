<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
      //1.한글처리 (페이지 상단에)
      request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id"); //클라이언트가 던진 데이터 받기....
    /*
      WAS 가 내장하고 있는 request 객체
      [JSP 파일에서는 Default로 내장객체를 선언없이 사용 가능]
    		  request객체 ( 요청객체 )
    		  ********1. 요청페이지당 한개의 request객체가 생성 된다.********
    		  2.request를 생성하면 클라이언트의 정보를(입력값,ip,브라우저 버전..) 서버에서 read할 수 있다.
    		  
    		  request 내장 객체는 클라이언트에서 서버로 요청할 때 생성되는 httpServletRequest라는 타입을 갖는 객체가
    		  자동 생성되고, 그 주소를 request가 참조합니다.
    		  
    		  WAS 내장하고 있는 request 객체 
    		  	[JSP 파일에서는 Default 내장객체 선언없이 사용 가능]
    		  		
    		  	requset 객체(요청 객체)
    		  	1. 요청 페이지당 한개의 request 객체 생성 (^^**)
    		  	2. 클라이언트의 정보(입력값 , IP, 브라우져 버전) 를 서버 read (request)
    		  	
    		  	request 내장 객체는 클라이언트에서 서버로 요청할때 생성되는 
    		  	HttpServletRequest 타입을 갖는 객체가 자동 생성되고  그 주소를 request 참조
    		  	HttpServletRequest request = ....코드 ...
    */
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       id:<%=id %><hr>
       <!--  내장함수인 request를 이용해 이것저것 볼 수 있다. 정도 알면됌. -->
접속한 클라이언트 IP : <%= request.getRemoteAddr() %><br>
서버(요청한 방식:인코딩) : <%= request.getCharacterEncoding() %> <br>
전송방식: <%= request.getMethod() %><br>
포트 : <%=request.getServerPort() %><br>
context root (홈 디렉토리, 가상디렉토리, 웹경로): <%= request.getContextPath() %> <br>
<!-- 
       request.getContextPath()
       가상경로(웹 경로) : /WebJSP
       실경로 : D:\bit155\WebJSP....
    파일 업로드(실경로) >> 웹경로(가상)>>실경로
 -->
 <%= request.getRequestURI() %>
 <!--  /WebJSP/Ex04_request.jsp -->
</body>
</html>








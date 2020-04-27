<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    /*
        요청에 대한 흐름 제어 
        액션태그
    **include
    **forward
         공통점:request 객체를 공유한다.
         차이점:include제어권 가지고 있다. (Ex14..)
          forward 제어권을 넘겨준다 (point: 요청 주소는 동일한데, 다른 page의 내용을 서비스 할 수 있다.)
          why? 처음 요청했던 주소의 Buffer을 그대로 사용
          192.168.0.12:8090/WebJSP/login.jsp ... forward >> A.jsp,B.jsp,C.jsp ...
         담는 그릇은 login.jsp이지만 내용은 A.jap,B.jsp,C.jsp 에 담긴다.
         login.jsp는 그냥 거쳐가는 신호일 뿐이다.
         
         http://192.168.0.35:8090/WebJSP/Ex15_forward_main.jsp?code=C
         code=C 코드값에 따라서 forward되는 페이지가 달라진다.
    */
    String code=request.getParameter("code");  //code를 받아서 
    String viewURI= null;
    if(code.equals("A")){                      //그 code가 A면, forward폴더에A를 실행시킨다.
    	viewURI="/forward/A.jsp";
    }else if(code.equals("B")){
    	viewURI="/forward/B.jsp";
    }else if(code.equals("C")){
    	viewURI="/forward/C.jsp";
    }
    %>
    <jsp:forward page="<%=viewURI %>"></jsp:forward>
<!-- 이 아래부터의 코드는 의미가 있을까? -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 나는 forward페이지입니다.
</body>
</html>
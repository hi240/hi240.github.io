<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
      /*
                           웹환경
             Client(웹브라우저)      ->      Server (요청정보를 read,처리)
                               request 요청
             Server               ->      Client
                              response 응답  클라이언트 브라우져 해석 가능
                              
                              지원 : 아파치 톰켓
                              response
                              1. 표현식(출력) <%=
                              2. 페이지 이동 처리 (sendRedirect)
                              *****javascript : 페이지이동하는거: location.href="Ex01_Basic.jsp"
                              *** page를 서버에게 재요청 : web브라우저에서 F5 새로고침 똑같다.
                              java에서 response라는 객체를 사용하면 위랑 똑같은 기능
                              java :  response.sendRedirect("Ex01_Basic.jsp");
      */
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      1.일반적인 출력() : <%= 100+200+300 %><br>
      2.sendRedirect : response객체의 함수 (클라이언트가 서버에 페이지를 재요청)
      <%
          response.sendRedirect("Ex01_Basic.jsp");
      %>
</body>
<script type="text/javascript">
          location.href="Ex01_Basic.jsp";
</script>
</html>









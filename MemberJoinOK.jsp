<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    request.setCharacterEncoding("UTF-8");
    String uid = request.getParameter("userId");
	String pwd = request.getParameter("userPass"); 	
	String name = request.getParameter("userName"); 
	String email = request.getParameter("userEmail"); 
	String phone = request.getParameter("userPhone"); 
	String hobby = request.getParameter("hobby"); 
	String gender[] = request.getParameterValues("gender"); 
	String ssn1 = request.getParameter("userSsn1"); 
	String ssn2 = request.getParameter("userSsn2"); 
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    회원정보 입니다.<br>
	ID  : <%= uid %><br>
	PWD :<%= pwd %><br>
	name :<%= name %><br>
	
	<%
		for(String str : gender){
	%>
		gender:<%= str %><br>
	<%	
		}
	%>
	email :<%= email %><br>
	phone :<%= phone %><br>
	hobby :<%= hobby %><br>
	주민번호 : <%= ssn1+"-"+ssn2 %><br>

	<!--  영문 대소문자 숫자, _ - 만 입력가능하고 5~20자리 입력햇느닞 체크 아이디,
	패스워드 체크는 영문대문자와 소문자 숫자 특수문자를 하나이상 포함하여 8~15되는지.
	 -->
</body>
</html>
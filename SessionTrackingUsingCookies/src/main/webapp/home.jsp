<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Cookie cookies[] = request.getCookies();
String cook = null;
if(cookies!=null){
	for(Cookie c : cookies){
		if(c.getName().equals("check")){
			cook=c.getValue();
		}
	}
}
if(cook!=null){
	
%>
<h1>WelCome To Home Page</h1>
<a href="logout">Logout</a>
<%
}
else{
	response.sendRedirect("login.html");
}
%>
</body>
</html>
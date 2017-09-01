<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>1jsp</title>
</head>
<body>

<% 
//set variable in servlet: request.setAttribute("a", "b"); 
String x = (String)request.getAttribute("a"); 
//must print it to show it in frontend !!
out.print(x);
%> 

<h1>1.jsp</h1>


</body>
</html>

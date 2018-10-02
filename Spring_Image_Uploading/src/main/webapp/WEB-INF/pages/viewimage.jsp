<%@page import="javax.swing.text.html.HTML.Tag"%>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">View Image</h1>
	
	<c:forEach var="b64" items="${imagePhoto}">
		
		<img  class="img-responsive" height="300px" width="300px" src="data:image/jpg;base64,${b64}"/> 
	
	</c:forEach>
	
</body>
</html>
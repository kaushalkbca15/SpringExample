<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Image Upload Example</h1>
	<hr>
	<br>
	<br>
	<form action="upload" method="POST" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<%-- <td colspan="2">${message}</td> --%>
			</tr>
			<tr>
				<td>select Image</td>
				<td><input type="file" class="file" name="file" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table><br><br><br>
		<table border="2">
			<tr><td><a href="viewimage">View Image</a> </td> </tr>
		</table>

	</form>
</body>
</html>
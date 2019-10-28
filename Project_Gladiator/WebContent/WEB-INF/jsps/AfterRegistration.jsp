<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Credentials</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<br>
<br>
<center>
	<table>
		<tr>
			<th>Your Customer Id is :</th>
			<td>${sessionScope.rd.custId}</td>
		</tr>
		<tr>	
			<th>Your Username is:</th>
			<td>${sessionScope.rd.userName}</td>
		</tr>
		<tr>
			<th>Your Password is:</th>
			<td>${sessionScope.rd.userPassword}</td>
		</tr>	
	</table>
	<h3>Kindly note down your Credentials for Login purpose!!!   </h3>
	</center>
</body>
</html>
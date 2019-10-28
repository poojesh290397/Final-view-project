<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Applicant Details</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<h1>Applicant</h1>
<table border=1>
	<tr>
	<!-- 	<th> CustomerId </th> -->
		<th>First Name</th>
		<th>Phone</th>
		<th>Email</th>
		<th>Security Quest</th>
		<th>Security Answer</th>
		
	
	<tr>
 		<td>${requestScope.rd.custId}</td>
 		<td>${requestScope.rd.userName}</td>
		<td>${requestScope.rd.userPhone}</td>
		<td>${requestScope.rd.userEmail}</td>
		<td>${requestScope.rd.securityQuestion}</td>
		<td>${requestScope.rd.securityAnswer}</td>
	</tr>
	<a href="home"  >GO TO HOMEPAGE</a>
</body>
</html>
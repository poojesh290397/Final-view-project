<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h1, h3, p{
	margin-left:30%;
	margin-top:10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<h1>INSERTED SUCCESSFULLY</h1>
<h3>Your generated Loan id is: </h3>
<p>${requestScope.lad.loanId}</p>
</body>
</html>
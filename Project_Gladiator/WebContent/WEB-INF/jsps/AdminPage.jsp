<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input {
	width: 150px;
	height: 30px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<jsp:include page="nav.jsp" />
	<br>
	<center>
		<a href="getListByStatus"><input type="button" name="btn1"
			value="Get Status"></a>
	</center>
	<br>
	<center>
		<a href="adminview"><input type="button" name="btn1"
			value="Get Users List"></a>
	</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
	margin:auto;
}

th {
	font-size: 30px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View By Status</title>
</head>
<body>
	<div ></div>
	<jsp:include page="nav.jsp" />
	<table cellspacing=9>
		<tr>
			<th>Customer Id</th>
			<th>
			<th>
			<th>Status</th>

			<c:forEach items="${requestScope.listByStatus}" var="stat">
				<tr>
					<td name="id"><c:out value="${stat.custId}"></c:out></td>
					<th>
					<th>
					<td><c:out value="${stat.status}"></c:out></td>
				</tr>
			</c:forEach>			
		</table>
	</div>
</body>
</html>
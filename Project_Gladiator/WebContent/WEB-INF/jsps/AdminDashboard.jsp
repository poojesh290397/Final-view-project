<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
  font-family:Arial;
 }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<table cellpadding=7 cellspacing=7>
		<tr>
		<th>CUSTOMER ID</th>
		<th>USERNAME</th>
		<th>USERPHONE</th>
		<th>USEREMAIL</th>
		</tr>	
	 <c:forEach items="${requestScope.list}" var="emp">
<tr>
<td name="id"><c:out value="${emp.custId}"></c:out></td>
<td><c:out value="${emp.userName}"></c:out></td>
<td><c:out value="${emp.userPhone}"></c:out></td>
<td><c:out value="${emp.userEmail}"></c:out></td>
 <td><a href="appDetails?id=${emp.custId}">View Details</a></td>
 
 <form action="update" method="get"  >
 <input type="hidden" name="id" value="${emp.custId}">
<td><select name="status">
  <option value="APPROVED" >Approved</option>
  <option value="VERIFYING">In Verification</option>
  <option value="REJECTED">Rejected</option>
  <option value="DISBURSED">Disbursed</option>
</select> </td>
</label><td><input type="text" name="desc" placeholder="Description"></td>
<td><input type="submit" value="Submit"></a></td>
 </form>
 </c:forEach>
</tr>
</table>
</body>
</html>
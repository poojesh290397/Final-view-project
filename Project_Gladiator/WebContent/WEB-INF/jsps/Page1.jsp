<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Page1.css">
<style>
body{
background-image:url("${pageContext.request.contextPath}/resources/img/loan3.jpg");
background-repeat: no-repeat;
background-size:100% 900px;
}
.property{
opacity:0.8;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Property Page</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<div class="property">
<form id="property" method="get" action="addPropertyDetails" modelAttribute="prop">
<h2>Property Details</h2>
 <label>Property Name</label><br>
<input type="text" name="propertyName" placeholder="Property Name" id="name" pattern=".{3,19}" title="Length should be at least 2 and less than 20 characters" required><br><br>
<label>Property Location</label><br>
 <input type="text" name="propertyLocation" placeholder="Property Location" id="name" pattern=".{3,19}" title="Length should be at least 2 and less than 20 characters" required><br><br>
 <label>Estimated Amount</label><br>
 <input type="number" name="estAmount" placeholder="Estimated Amount" id="name" min="0" required><br><br>
 <button type="submit" id="submit"  align="center">Next</button>
</form>
</div>
</body>
</html>
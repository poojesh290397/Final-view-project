<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-image:url("${pageContext.request.contextPath}/resources/img/loan3.jpg");
background-repeat: no-repeat;
background-size:100% 900px;
}
</style>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Page3.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Details</title>
</head>
<body>
<jsp:include page="nav.jsp" />
	<div class="bank">
<form id="bank" method="get" action="addBankDetails" modelAttribute="bank">
<!-- <link rel="stylesheet" type="text/css" href="Page 3.css"> -->
<h2>Bank Details</h2>
  <label>Bank Name</label><br>
  <input type="text" name="bankName" placeholder="Bank Name" id="bn" pattern="[a-zA-Z].{2,19}" title="Should be text and length should be at least 2 and less than 20 characters" required><br><br>
  <label>Branch</label><br>
  <input type="text" name="branch" placeholder="Branch" id="branch" pattern="[a-zA-Z].{3,19}" title="Should be text and length should be at least 3 and less than 20 characters"  required><br><br>
   <label>IFSC Code</label><br>
  <input type="text" name="ifsc" placeholder="IFSC code" id="ifc" pattern="[a-zA-Z].{10,19}" title="Length should be at least 11 and less than 20 characters" required><br><br>
   <label>Account No</label><br>
  <input type="text" name="accNo" placeholder="Enter your Account No" id="acc" pattern="\d*" maxlength="9" minlength="8" title="Numeric value and length should be 9" required><br><br>
  <button type="submit" id="submit">Next</button>
</form>
</div>
</body>
</html>
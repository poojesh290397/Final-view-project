<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Page5.css">
<head>
<style>
body{
background-image:url("${pageContext.request.contextPath}/resources/img/loan3.jpg");
background-color:#ffffe6;
background-repeat: no-repeat;
background-size:100% 900px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loan Account Details</title>
</head>
<body>
<jsp:include page="nav.jsp" />
	<div class="loanacc">
<form id="loanacc" method="post" action="addLoanDetails"  modelAttribute="loan">
<h2>Loan Account Details</h2>
   <label>Loan Amount</label><br>
  <input type="text" name="loanAmount" placeholder="Enter the Loan Amount" id="lamnt" pattern="\d*" maxlength="10" minlength="7" title="Give correct numeric value" required><br><br>
  <label>Loan Tenure</label><br>
   <input type="number" name="loanTenure"  placeholder="In years" id="tenure" min="5" max="40" required><br><br>
  <label>Rate Of Interest</label><br>
   <input type="number" name="rateOfInterest" default="8.5" value="8.5" class="field left" readonly  id="roi "required ><br><br>
  <label>Existing EMI</label><br>
   <input type="text" name="existingEmi"  placeholder="Existing EMI if any" id="exisemi" pattern="\d*" maxlength="7" minlength="0" required><br><br>
   <button type="submit" id="submit">Submit</button>
</div>
	
</body>
</html>
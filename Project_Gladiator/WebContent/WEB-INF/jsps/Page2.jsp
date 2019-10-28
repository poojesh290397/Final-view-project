<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Page2.css">
<style>
body{
background-image:url("${pageContext.request.contextPath}/resources/img/loan3.jpg");
background-repeat: no-repeat;
background-size:100% 900px;
 background-size:cover;  
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Income Details Page</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<div class="income">
<form id="income" method="get" action="addIncomeDetails" modelAttribute="income">
<h2>Income-Expense Details</h2>
 <label>Employment Type</label><br>
  <input type="radio" name="typeOfEmployment"  value="Salaried"  id="toe" required>Salaried<br>
  <input type="radio" name="typeOfEmployment"  value="Self-Employed"  id="toe">Self-Employed<br><br>
  <label>Retirement Age</label><br>
  <input type="number" name="retirementAge" placeholder="Retirement Age" id="ra" min="40" max="80" required><br><br>
   <label>Organization Type</label><br>
  <input type="text" name="organizationType"  placeholder="Organization Type" id="ot" pattern=".{2,19}" title="Length should be at least 2 and less than 20 characters" required><br><br>
   <Label>Employer Name</label><br>
  <input type="text" name="employerName" placeholder="Employer Name" id="en" pattern=".{3,29}" title="Length should be at least 3 and less than 30 characters" required><br><br>
   <label>Monthly Expense</label><br>
  <input type="number" name="monthlyExpense" placeholder="Monthly Expense" id="me" min="0" max="999999999" required><br><br>
  <button type="submit" id="submit">Next</button>
</form>
</div>
</body>
</html>
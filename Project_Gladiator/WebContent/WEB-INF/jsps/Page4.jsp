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
background-color:#ffffe6;
}
</style>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/Page4.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<div class="personal">

<form id="personal" method="post" action="addPersonalDetails" modelAttribute="personal">
<h2>Personal Details</h2>
  <label>First Name</label><br>
  <input type="text" name="firstName"  placeholder="Firstname" id="firstName" pattern="[A-Za-z].{2,19}" title="Length should be at least 2 and less than 20 characters" required ><br><br>
  <label>Middle Name</label><br>
  <input type="text" name="middleName" placeholder="Middlename" id="middleName" pattern="[A-Za-z].{2,19}" title="Length should be at least 2 and less than 20 characters"><br><br>
   <label>Last Name</label><br>
  <input type="text" name="lastName" placeholder="Lastname" id="lastName" pattern="[A-Za-z].{2,19}" title="Length should be at least 2 and less than 20 characters"><br><br>
   <label>Email id</label><br>
   <input type="email" name="email" placeholder="Enter your Email id" id="email" maxlength="19" required><br><br>
   <label>Phone No</label><br>
   <input type="tel" name="phoneNo" placeholder="Phone No" id="phoneNo" pattern="[7-9]\d{9}$" title="Phone no should start from 7/8/9 and should be 10 digit numeric value" required ><br><br>
   <label>Age</label><br>
   <input type="number" name="age" placeholder="Enter your age" id="age" min="21" max="80" required ><br><br>
   <label>Date Of Birth</label><br>
   <input type="date" name="dob" id="dob" required><br><br> 
   <label>Gender</label><br>
   <input type="radio" name="gender" value="Male" id="gen" required>Male<br>
  <input type="radio" name="gender" value="Female" id="gen">Female<br><br>
   <label>Nationality</label><br>
   <input type="text" name="nationality" defaultvalue="India" value="India" class="field left" readonly id="nationality"><br><br>
    <label>Address</label><br>
   <input type="textarea" name="address" placeholder="Enter your address" id="address" pattern="[A-Za-z0-9].{3,50}" maxlength="50" required><br><br>
    <label>State</label><br>
   <input type="text" name="state" placeholder="Enter your state" id="state" pattern="[A-Za-z].{3,19}" required><br><br>
    <label>Pincode</label><br>
   <input type="number" name="pincode" placeholder="Enter your pincode" id="pincode" max="999999" min="100000" required><br><br>
    <label>Aadhar No</label><br>
   <input type="text" name="aadharNo" placeholder="Enter your Adhar No" id="aadharNo" pattern="\d{12}$" required><br><br>
    <label>Pan No</label><br>
   <input type="text" name="panNo" placeholder="Enter your Pan No" id="panNo" pattern="[A-Za-z]{5}\d{4}[A-Za-z]{1}" title="Give valid pan no" required><br><br>
  <button type="submit" id="submit">Next</button>
</form>
</div>
</body>
</html>
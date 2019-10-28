<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
body{
	  background-image: url("${pageContext.request.contextPath}/resources/img/registerbackground.jpg");
}
</style>
<script> 
  var check = function() {
  if (document.getElementById('password').value ==  document.getElementById('confirm_password').value) {
    document.getElementById('message').style.color = 'green';
    document.getElementById('message').innerHTML = 'matching';
    document.getElementById('contact-submit').disabled=false;
    
  } else {
    document.getElementById('message').style.color = 'red';
    document.getElementById('message').innerHTML = 'not matching';
    document.getElementById('contact-submit').disabled=true;
  }
} 
 </script>    
</head>
<body>
<jsp:include page="nav.jsp" />          
       
</head>
<body>
	
<div class="container" id="hi">  
  <form id="contact" action="addDetails" method="post"  modelAttribute="register">
    <h3>Registration</h3>
    <h4>Enter your Registration Credentials here</h4>
    <fieldset>
     <input name="userName"  placeholder="userName" type="text" tabindex="1" required autofocus>
    </fieldset>
	<fieldset>
     <input name="userPassword"  placeholder="userPassword" type="password" tabindex="1" id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,19}" onkeyup='check();' title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 and less than 20 characters" required>
    </fieldset>
    <fieldset>
      <input name="retypePassword"  placeholder="retypePassword" type="password" tabindex="2" id="confirm_password"  onkeyup='check();' required>
    </fieldset>
     <span id='message'></span>
	<fieldset>
      <input name="userEmail"  placeholder="userEmail" type="email" tabindex="2" pattern=".{8,19}" title="Length should be at least 8 and less than 20 characters" required>
    </fieldset>
	<fieldset>
      <input name="userPhone"  placeholder="userPhone" type="tel" tabindex="3" pattern="[7-9]\d{9}$" title="Phone no should start from 7/8/9 and should be 10 digit numeric value" required>
    </fieldset>
        <fieldset>
      <select name="securityQuestion" placeholder="securityQuestion"  type="text" tabindex="5" required>
           <option value="favourite colour">What is your favourite colour?</option>
           <option value="pet name">What is your pet's name?</option>
           <option value="best friend name">What is your bestfriend's name?</option>
           <option value="sweet dish">What is your favourite sweet dish?</option>
         </select>
       </fieldset>
      <fieldset>
     <input name="securityAnswer" type="text" tabindex="3" pattern=".{3,19}" title="Length should be at least 3 and less than 20 characters" required>
      </fieldset> 

    <fieldset>
      <button name="submit" type="submit" id="contact-submit" >Submit</button>
    </fieldset>
   
  </form>
</div>
	
</body>
</html>
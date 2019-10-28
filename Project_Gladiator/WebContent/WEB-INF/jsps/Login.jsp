<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css" />
<style>
body{
	  background-image: url("${pageContext.request.contextPath}/resources/img/registerbackground.jpg");
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<div class="container" id="hi">  
  <form id="contact" action="login1" method="post">
    <h3>LogIn</h3>
    <h4>Enter your Credentials here</h4>
    <fieldset>
      <input placeholder="Customer Id" type="text" tabindex="1" name="custId" pattern="\d*" title="Id should be correct format" required autofocus>
    </fieldset>
	<fieldset>
      <input placeholder="Username" type="text" tabindex="1" name="userName" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="password" type="password" name="userPassword" tabindex="1" required>
    </fieldset>
	<fieldset>
      <button name="submit" type="submit" id="contact-submit">Submit</button>
    </fieldset>
   
  </form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css/homepage.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<style>
.topnav a{
margin-top:14px;
font-family: "Roboto", Helvetica, Arial, sans-serif;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
    <div class="topnav">
        <img src="${pageContext.request.contextPath}/resources/img/shelterlogo.jpg" height="12%" width="8%">
          <a href="AboutUs">About Us</a>
          <a href="faq">FAQ</a>
          <a href="Calculator">Calculator</a>
          <%
          	String username = (String)session.getAttribute("user");
            if (username==null){
          %>
          <a href="login">Login</a>
          <a href="register">Registration</a>
          <% } else if (username.equals("admin")) { %>
          <a href="adminview">List All</a>
          <a href="getListByStatus">List By Status</a>
          <a href="logout">Logout</a>
          <% } else { %>
          <a href="checkStatus">Get Status</a>
          <a href="addPropertyDetails1">Loan Application</a>
          <a href="logout">Logout</a>
          <% } %>
          <a href="home">Home</a>
    </div>
</div>
</body>
</html>
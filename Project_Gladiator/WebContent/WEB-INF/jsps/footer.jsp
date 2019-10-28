<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.footer{
  margin-top:3px;
  padding:30px;
  color:white;
  align-content: center;
  z-index:999;
  background-color:black;
  height:250px;
}
.left{
  width:50%;
  float:left;   
}
.right{
  width:49%;
  padding-left:30px;
  float:right;
} 
.right p{
 padding:7px;
}
body{
font-family:Arial;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div class="footer">
      <footer>
          <div class="left">
               <img src="${pageContext.request.contextPath}/resources/img/shelterlogo.jpg" height="140" width="140"><br>
                <p>We are one of the leading financial services company 
                  focused on lending, asset management, wealth management 
                    and insurance.We are  classified as a Systemically Important
                  Non–deposit taking NBFC as per RBI Regulations.</p>
          </div>
   
   
   <div class="right">
        <p> Contact Us here</p>
    <p><a href="sheltercarefin@gmail.com">sheltercarefin@gmail.com</a></p>
    <p><a href="9891236789">9891236789</a></p>
    <p>
      <a href="https://www.twitter.com">
    <img border="0" src="${pageContext.request.contextPath}/resources/img/twitter-logo.png" width="30" height="30">
    </a>
    <a href="https://www.linkedin.com">
    <img border="0" src="${pageContext.request.contextPath}/resources/img/linkedin-logo.png" width="30" height="30">
    </a>
    </p>
    <p>&copy;Shelter Care Finance Ltd.</p>
   </div>
   </footer>
 </div>
</body>
</html>
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
 background-size:cover;  
}
.loanacc{
width:45%;
margin:auto;
background-color: white;
padding:10px;
opacity:0.8;
}
table{
	font-family:Arial;
	margin-left:15%;
}
label{
  font-size:28px;
}
input{
	font-size:17px;
	display:block;
 }
td[colspan="2"] {
    text-align: center;
}
input[type="submit"]
{
  margin-top:7px;
  margin-left:30%;
  width:100px;
  height:30px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Documents</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<div class="loanacc">
<center><h2>Documents Upload</h2></center>
	<table cellspacing=10 cellpadding=6>
		<form id="loanacc" form method="POST" action="uploadMultipleFile" enctype="multipart/form-data">
			<tr>
				<td><label>Aadhar No</label><br></td>
				<td><input type="file" name="file"
					placeholder="Enter your Aadhar No" id="filetoupload" required></td>
			</tr>
			<tr>
				<td><label>Pan No</label></td>
				<br>
				<td><input type="file" name="file"
					placeholder="Enter your Pan No" id="filetoupload" required></td>
			</tr>
	
			<tr>
				<td><label>Salary Slip</label></td>
				<td><input type="file" name="file" id="filetoupload" required></td>
			</tr>
	
			<tr>
				<td><label>Voter Id</label></td>
				<td><input type="file" name="file" id="filetoupload" required></td>
			</tr>
	
			<tr>
				<td><label>NOC</label></td>
				<td><input type="file" name="file" id="filetoupload" required></td>
			</tr>
	
			<tr>
				<td><label>Agreement</label></td>
				<td><input type="file" name="file" id="filetoupload" required></td>
			</tr>
	
			<tr>
				<td colspan=2><input type="submit" value="Upload" name="submit"></td>
			</tr>
		</form>
	</table>

	</div>
</body>

</html>
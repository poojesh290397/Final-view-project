<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/calculator.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<jsp:include page="nav.jsp" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/javascript.js"></script>
<div>
<h2 style="font-size:40px;"><center>Calculator</center></h2>
</div>
<div class="button_toggle">
<button onclick="eli_cal()">Eligibility Calculator</button>
<button onclick="emi_cal()">EMI Calculator</button>

</div>
	<div>
		<div class="emi_eli div_left">
			<h2 id="eli_cal_head" class="visible">Eligibility calculator</h2>
			<table cellspacing=6 cellpadding=6 id="eli_cal_cont" class="invisible">
				<form method="post" id="form_eli">
					<tr>
						<td>Monthly income</td>
						<td><input type="text" name="monthlyIncome" required></td>
					</tr>
					<tr>
						<td>ROI</td>
						<td>8.5%</td>
					</tr>
					<tr>
						<td>Tenure</td>
						<td><input type="text" name="eliTenure" placeholder="In years" min=1 max=40 required></td>
					</tr>
					<tr>
						
						<td><input type="submit" id="eliCalculate" value="Calculate" required></td>
					</tr>
					<td>Eligibility</td>
					<td><p id="eligibility"></p></td>
					</tr>
				</form>
			</table>
		</div>
	<div class="emi_eli div_right">
		<h2 id="emi_cal_head" class="visible">Emi calculator</h2>
			<table cellspacing=7 cellpadding=7 id="emi_cal_cont" class="invisible">
			   <form method="post" id="form_emi">
				   <tr>
				   		<td>Loan</td>
				   		<td><input type="text" name="emiLoan" min=1000000 required></td>
				   </tr>
				   <tr>
						<td>Tenure</td>
						<td><input type="text" name="emiTenure" placeholder="In years" min=1 max=40 required></td>
				   </tr>
				   <tr>
				    	<td>Roi</td>
				    	<td>8.5%</td> 
				    </tr>
				    <tr>
						
						<td><input type="submit" id="emiCalculate" value="Calculate"></td>
					</tr>
				    <tr>
				    <td>Emi</td>
				    <td><p id="emiValue"></p></td>
				    </tr>
			  </form>
			 </table>
	</div>
</div>
<div>
	<center>
		<br><br>
		<%
          	String username = (String)session.getAttribute("user");
            if (username==null){
          %>
			<a href="register"><input type="button" value="Apply Now" id="apply_now" /></a>
		  <% }  else { %>
		    <a href="addPropertyDetails1"><input type="button" value="Apply Now" id="apply_now" />
		    <% } %>
	</center>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>

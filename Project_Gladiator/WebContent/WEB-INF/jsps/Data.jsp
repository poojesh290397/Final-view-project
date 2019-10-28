<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
	margin:auto;
}

td{
padding:5px;}
th {
	font-size: 23px;
	padding:5px;
}
#dvContainer
{
    margin-top:8px;
    margin-left:20%;
    margin-right:20%;
	border: 1px solid;
    padding: 10px;
	font-family:Arial;
	box-shadow:5px 5px;
}
input{
	display:block;
	padding:5px;
	margin-top:5px;
	margin-left:45%;
	width:100px;
	height:50px;
}
</style>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript">
        $("#btnPrint").live("click", function () {
            var divContents = $("#print_it").html();
            var printWindow = window.open('', '', 'height=400,width=800');
            printWindow.document.write('<html><head><title>HOME-LOAN APPLICATION</title>');
            printWindow.document.write('</head><body >');
            printWindow.document.write(divContents);
            printWindow.document.write('</body></html>');
            printWindow.document.close();
            printWindow.print();
        });
    </script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Applicant Details</title>
</head>
<body>
<jsp:include page="nav.jsp" />
 <div id="print_it">
    <div id="dvContainer">
			<table>
				<tr>
					<th><u>Personal Details</u></th>
				</tr>
				<tr>
					<th>First Name</th>
					<td>${requestScope.pd.firstName}</td>
					<th>Middle Name</th>
					<td>${requestScope.pd.middleName}</td>
				</tr>

				<tr>
					<th>Last Name</th>
					<td>${requestScope.pd.lastName}</td>
					<th>Email</th>
					<td>${requestScope.pd.email}</td>
				</tr>

				<tr>
					<th>Phone No</th>
					<td>${requestScope.pd.phoneNo}</td>
					<th>Age</th>
					<td>${requestScope.pd.age}</td>
				</tr>

				<tr>
					<th>Date of Birth</th>
					<td>${requestScope.pd.dob}</td>
					<th>Gender</th>
					<td>${requestScope.pd.gender}</td>
				</tr>

				<tr>
					<th>Nationality</th>
					<td>${requestScope.pd.nationality}</td>
					<th>Address</th>
					<td>${requestScope.pd.address}</td>
				</tr>

				<tr>
					<th>State</th>
					<td>${requestScope.pd.state}</td>
					<th>Pincode</th>
					<td>${requestScope.pd.pincode}</td>
				</tr>

				<tr>
					<th>Aadhar No</th>
					<td>${requestScope.pd.aadharNo}</td>
					<th>Pan NO</th>
					<td>${requestScope.pd.panNo}</td>
				</tr>
			</table>
		</div>
   
   <div id="dvContainer">
			<table>
				<tr>
					<th><u>BANK DETAILS</u></th>
				</tr>
				<tr>
					<th>CustomerId</th>
					<td>${requestScope.bd.custId}</td>
					<th>Account No</th>
					<td>${requestScope.bd.accNo}</td>
				</tr>
				
				<tr>
					<th>Bank Name</th>
					<td>${requestScope.bd.bankName}</td>
					<th>Branch</th>
					<td>${requestScope.bd.branch}</td>
				</tr>
				
				<tr>
					<th>IFSC Code</th>
					<td>${requestScope.bd.ifsc}</td>
				</tr>
				
			</table>
		</div>
		
		<div id="dvContainer">
			<table>

				<tr>
					<th><u>PROPERTY DETAILS</u></th>
				</tr>
				<tr>
					<th>Property Name</th>
					<td>${requestScope.prd.propertyName}</td>
					<th>Property Location</th>
					<td>${requestScope.prd.propertyLocation}</td>
				</tr>
				
				<tr>
					<th>Estimated Amount</th>
					<td>${requestScope.prd.estAmount}</td>
				</tr>
			</table>
		</div>
		
		<div id="dvContainer">

			<table>

				<tr>
					<th><u>INCOMEEXPENSE DETAILS </u></th>
				</tr>
				<tr>
					<th>Type Of Employment</th>
					<td>${requestScope.ied.typeOfEmployment}</td>
					<th>Organization Type</th>
					<td>${requestScope.ied.organizationType}</td>
				</tr>
				<tr>
					<th>Retirement Age</th>
					<td>${requestScope.ied.retirementAge}</td>
					<th>Employer name</th>
					<td>${requestScope.ied.employerName}</td>
				</tr>
				<tr>
				<tr>
					<th>Monthly Expense</th>
					<td>${requestScope.ied.monthlyExpense}</td>
				</tr>
				<br>
			</table>
		</div>
		
		<div id="dvContainer">
			<table>

				<tr>
					<th><u>LOAN AMOUNT</u></th>
				</tr>
				<tr>
					<th>Loan Amount</th>
					<td>${requestScope.lad.loanAmount}</td>
					<th>Loan Tenure</th>
					<td>${requestScope.lad.loanTenure}</td>
				</tr>

				<tr>
					<th>Rate of Interest</th>
					<td>${requestScope.lad.rateOfInterest}</td>
					<th>Existing Emi</th>
					<td>${requestScope.lad.existingEmi}</td>
				</tr>

				<tr>
					<th>Loan Account No</th>
					<td>${requestScope.lad.loanAccountNo}</td>
					<th>Date Of Verification</th>
					<td>${requestScope.lad.dateOfVerification}</td>
				</tr>
				
				<tr>
					<th>Date of Approval </th>
					<td>${requestScope.lad.dateOfApproval}</td>
					<th>Date Of Disbursement</th>
					<td>${requestScope.lad.dateOfDisbursement}</td>
				</tr>
				
				<tr>
					<th>Status</th>
					<td>${requestScope.lad.status}</td>
				</tr>


			</table>
		</div>
	</div>
     <input id="btnPrint" type="button" value="Print">
 </form>
 <%! String aadhar,pan,salary,voterid,noc,agreement; %>
 	
 	<%int custId=(int)session.getAttribute("custId"); %>
 	<% aadhar="/files/"+custId+"/"+custId+"aadhar.pdf";
 	pan="/files/"+custId+"/"+custId+"pan.pdf";
 	salary="/files/"+custId+"/"+custId+"salarySlip.pdf";
 	voterid="/files/"+custId+"/"+custId+"voterid.pdf";
 	noc="/files/"+custId+"/"+custId+"noc.pdf";
 	agreement="/files/"+custId+"/"+custId+"agreement.pdf";	
 %>
 
  <div id="dvContainer">
			<table>
				<tr>
					<th><u>BANK DETAILS</u></th>
				</tr>
				<tr>
					<th>Aadhar Card</th>
					<td><a href="<c:url value="<%= aadhar %>" />" target="€_blank">Aadhar Card</a></td>
					<th>Pan Card</th>
					<td><a href="<c:url value="<%= pan %>" />" target="_blank">Pan Card</a></td>
				</tr>
				
				<tr>
					<th>Salary slip</th>
					<td><a href="<c:url value="<%= salary %>" />" target="_blank">Salary slip</a></td>
					<th>Voter Id</th>
					<td><a href="<c:url value="<%= voterid %>" />" target="€_blank">Voter Id</a></td>
				</tr>
				
				<tr>
					<th>Noc</th>
					<td><a href="<c:url value="<%= noc %>" />" target="_blank">Noc</a></td>
					<th>Agreement</th>
					<td><a href="<c:url value="<%= agreement %>" />" target="€_blank">Agreement</a></td>
				</tr>
				
			</table>
		</div> 
	
		<br><br>
</body>
</html>
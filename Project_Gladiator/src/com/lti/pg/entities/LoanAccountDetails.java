package com.lti.pg.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HL_LOANACCOUNT")
public class LoanAccountDetails {
	
	@Id
	@Column(name="custId")
	private int custId;
	
	@Column(name="loanAccountNo")
	private long loanAccountNo;//convert to long
	
	@Column(name="loanId")
	private long loanId;
	
	@Column(name="loanAmount")
	private double loanAmount;//convert to double
	
	@Column(name="loanTenure")
	private int loanTenure;
	
	@Column(name="rateOfInterest")
	private Float rateOfInterest;
	
	@Column(name="existingEmi")
	private Double existingEmi;
	
	@Column(name="pan")
    private String pan;
	
	@Column(name="aadhar")
	private String aadhar;
	
	@Column(name="salarySlip")
	private String salarySlip;
	
	@Column(name="voterId")
	private String voterId;
	
	@Column(name="noc")
	private String noc;
	
	@Column(name="agreement")
	private String agreement;
	
	@Column(name="dateOfVerification")
	private Date dateOfVerification;
	
	@Column(name="dateOfApproval")
	private Date dateOfApproval;
	
	@Column(name="dateOfDisbursement")
	private Date dateOfDisbursement;
	
	@Column(name="status")
	private String status="PENDING";
	
	@Column(name="description")
	private String description;

	public LoanAccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanAccountDetails(int custId, long loanAccountNo, long loanId, double loanAmount, int loanTenure,
			Float rateOfInterest, Double existingEmi, String pan, String aadhar, String salarySlip, String voterId,
			String noc, String agreement, Date dateOfVerification, Date dateOfApproval, Date dateOfDisbursement,
			String status, String description) {
		super();
		this.custId = custId;
		this.loanAccountNo = loanAccountNo;
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.rateOfInterest = rateOfInterest;
		this.existingEmi = existingEmi;
		this.pan = pan;
		this.aadhar = aadhar;
		this.salarySlip = salarySlip;
		this.voterId = voterId;
		this.noc = noc;
		this.agreement = agreement;
		this.dateOfVerification = dateOfVerification;
		this.dateOfApproval = dateOfApproval;
		this.dateOfDisbursement = dateOfDisbursement;
		this.status = status;
		this.description = description;
	}
	

	/*public LoanAccountDetails(int custId, long loanAccountNo, int loanId, double loanAmount, int loanTenure,
			Float rateOfInterest, Double existingEmi) {
		super();
		this.custId = custId;
		this.loanAccountNo = loanAccountNo;
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.rateOfInterest = rateOfInterest;
		this.existingEmi = existingEmi;
	}*/

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public long getLoanAccountNo() {
		return loanAccountNo;
	}

	public void setLoanAccountNo(long loanAccountNo) {
		this.loanAccountNo = loanAccountNo;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public Float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Double getExistingEmi() {
		return existingEmi;
	}

	public void setExistingEmi(Double existingEmi) {
		this.existingEmi = existingEmi;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getSalarySlip() {
		return salarySlip;
	}

	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getNoc() {
		return noc;
	}

	public void setNoc(String noc) {
		this.noc = noc;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	public Date getDateOfVerification() {
		return dateOfVerification;
	}

	public void setDateOfVerification(Date dateOfVerification) {
		this.dateOfVerification = dateOfVerification;
	}

	public Date getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	public Date getDateOfDisbursement() {
		return dateOfDisbursement;
	}

	public void setDateOfDisbursement(Date dateOfDisbursement) {
		this.dateOfDisbursement = dateOfDisbursement;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LoanAccountDetails [custId=" + custId + ", loanAccountNo=" + loanAccountNo + ", loanId=" + loanId
				+ ", loanAmount=" + loanAmount + ", loanTenure=" + loanTenure + ", rateOfInterest=" + rateOfInterest
				+ ", existingEmi=" + existingEmi + ", pan=" + pan + ", aadhar=" + aadhar + ", salarySlip=" + salarySlip
				+ ", voterId=" + voterId + ", noc=" + noc + ", agreement=" + agreement + ", dateOfVerification="
				+ dateOfVerification + ", dateOfApproval=" + dateOfApproval + ", dateOfDisbursement="
				+ dateOfDisbursement + ", status=" + status + ", description=" + description + "]";
	}

		
	
	
}

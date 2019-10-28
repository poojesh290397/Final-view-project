package com.lti.pg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HL_BANK")
public class BankDetails {
	
	@Id
	private int custId;
	
	@Column(name="bankName")
	private String bankName;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="ifsc")
	private String ifsc;
	
	@Column(name="accNo")
	private int accNo;
	
	
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankDetails(int custId, String bankName, String branch, String ifsc, int accNo) {
		super();
		this.custId = custId;
		this.bankName = bankName;
		this.branch = branch;
		this.ifsc = ifsc;
		this.accNo = accNo;
	}

	

	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getIfsc() {
		return ifsc;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	@Override
	public String toString() {
		return "BankDetails [custId=" + custId + ", bankName=" + bankName + ", branch=" + branch + ", ifsc=" + ifsc
				+ ", accNo=" + accNo + "]";
	}

}

package com.lti.pg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HL_INCOMEEXPENSE")
public class IncomeExpenseDetails {

	@Id
	//@OneToOne
	//@JoinColumn(name="custId")
	private int custId;
	
	@Column(name="typeOfEmployment")
	private String typeOfEmployment;
	
	@Column(name="retirementAge")
	private int retirementAge;
	
	@Column(name="organizationType")
	private String organizationType;
	
	@Column(name="employerName")
	private String employerName;
	
	@Column(name="monthlyExpense")
	private long monthlyExpense;//convert to long

	public IncomeExpenseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncomeExpenseDetails(int custId, String typeOfEmployment, int retirementAge, String organizationType,
			String employerName, long monthlyExpense) {
		super();
		this.custId = custId;
		this.typeOfEmployment = typeOfEmployment;
		this.retirementAge = retirementAge;
		this.organizationType = organizationType;
		this.employerName = employerName;
		this.monthlyExpense = monthlyExpense;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public long getMonthlyExpense() {
		return monthlyExpense;
	}

	public void setMonthlyExpense(long monthlyExpense) {
		this.monthlyExpense = monthlyExpense;
	}

	@Override
	public String toString() {
		return "IncomeExpenseDetails [custId=" + custId + ", typeOfEmployment=" + typeOfEmployment + ", retirementAge="
				+ retirementAge + ", organizationType=" + organizationType + ", employerName=" + employerName
				+ ", monthlyExpense=" + monthlyExpense + "]";
	}

	
	
}

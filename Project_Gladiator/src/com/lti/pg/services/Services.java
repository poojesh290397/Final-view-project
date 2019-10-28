package com.lti.pg.services;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lti.pg.entities.BankDetails;
import com.lti.pg.entities.IncomeExpenseDetails;
import com.lti.pg.entities.LoanAccountDetails;
import com.lti.pg.entities.PersonalDetails;
import com.lti.pg.entities.PropertyDetails;
import com.lti.pg.entities.RegisterDetails;
import com.lti.pg.exception.LoanException;

public interface Services {
	
	public List<RegisterDetails> getListOfUsers() throws LoanException;
	public RegisterDetails getData(int custId);
	public RegisterDetails addApplicant(RegisterDetails rd)throws LoanException;
	public BankDetails addBankDetails(BankDetails bd)throws LoanException;
	public PersonalDetails addPersonalDetails(PersonalDetails pd)throws LoanException;
	public IncomeExpenseDetails addIncomeExpenseDetails(IncomeExpenseDetails ied)throws LoanException;
	public PropertyDetails addPropertyDetails(PropertyDetails prd)throws LoanException;
	public LoanAccountDetails addLoanDetails(LoanAccountDetails lad) throws LoanException;
	public Boolean verifyUser(String user, String pass, int custId)throws LoanException;
	public int createCustomerId() throws LoanException;
	//rename
	public BankDetails getBankData(int custId) throws LoanException;
	public PropertyDetails getPropertyData(int custId) throws LoanException;
	public IncomeExpenseDetails getIncomeData(int custId) throws LoanException;
	public PersonalDetails getPersonalData(int custId) throws LoanException;
	public LoanAccountDetails getLoanData(int custId) throws LoanException;
	
	//
	public long generateAccountNo() throws LoanException;
	public long generateLoanId() throws LoanException;
	
	//
	public LoanAccountDetails updateLoanStatus(int id,String status,String description) throws LoanException;
	//
	public Date setVerificationDate(int id) throws LoanException;
	public Date setApprovalDate(int id) throws LoanException;
	public Date setDisbursementDate(int id) throws LoanException;
	//
	public List<LoanAccountDetails> getListOfUsersByStatus() throws LoanException;
	public String loanStatus(int id)throws LoanException;
	
}

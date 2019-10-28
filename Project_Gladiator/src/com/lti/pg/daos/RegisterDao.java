package com.lti.pg.daos;

import java.sql.Date;
import java.util.List;

import com.lti.pg.entities.BankDetails;
import com.lti.pg.entities.IncomeExpenseDetails;
import com.lti.pg.entities.LoanAccountDetails;
import com.lti.pg.entities.PersonalDetails;
import com.lti.pg.entities.PropertyDetails;
import com.lti.pg.entities.RegisterDetails;
import com.lti.pg.exception.LoanException;

public interface RegisterDao {

	public RegisterDetails insert(RegisterDetails rd) throws LoanException;
	public RegisterDetails getData(int custId) throws LoanException;
	public BankDetails getBankData(int custId) throws LoanException;
	public PropertyDetails getPropertyData(int custId) throws LoanException;
	public IncomeExpenseDetails getIncomeData(int custId) throws LoanException;
	public PersonalDetails getPersonalData(int custId) throws LoanException;
	public LoanAccountDetails getLoanData(int custId) throws LoanException;
	public List<RegisterDetails> getList() throws LoanException;
	public Boolean userExist(String user, String pass, int custId) throws LoanException;
	public PersonalDetails insertpd(PersonalDetails pd) throws LoanException;
	public BankDetails insertbd(BankDetails bd) throws LoanException;
	public PropertyDetails insertprd(PropertyDetails prd) throws LoanException;
	public LoanAccountDetails insertlad(LoanAccountDetails lad) throws LoanException;
	public IncomeExpenseDetails insertied(IncomeExpenseDetails ied)throws LoanException;
	public int createId() throws LoanException;
	public long createAccountNo() throws LoanException;
	public long createLoanId() throws LoanException;
	
	public LoanAccountDetails updateStatus(int id,String status,String description)throws LoanException;
	public Date setVerificationDate(int id) throws LoanException;
	public Date setApprovalDate(int id) throws LoanException;
	public Date setDisbursementDate(int id) throws LoanException;
	public List<LoanAccountDetails> getListByStatus() throws LoanException;
	public String checkLoanStatus(int id) throws LoanException;
	
}

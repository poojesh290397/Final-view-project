package com.lti.pg.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pg.daos.RegisterDao;
import com.lti.pg.entities.BankDetails;
import com.lti.pg.entities.IncomeExpenseDetails;
import com.lti.pg.entities.LoanAccountDetails;
import com.lti.pg.entities.PersonalDetails;
import com.lti.pg.entities.PropertyDetails;
import com.lti.pg.entities.RegisterDetails;
import com.lti.pg.exception.LoanException;


@Transactional(propagation=Propagation.REQUIRES_NEW)
@Service("Services")

public class ServicesImpl implements Services {
	
	int custId;
	long loanAccountNo;
	long loanid;
	
	@Autowired
	RegisterDao service;
	
	@Override
	public RegisterDetails getData(int custId) {
		try {
			return service.getData(custId);
		} catch (LoanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public RegisterDetails addApplicant(RegisterDetails rd) {
		
		
		try {
			custId = createCustomerId();
		} catch (LoanException e1) {
			e1.printStackTrace();
		}
		rd.setCustId(custId);
		try {
			service.insert(rd);
			return rd;
		} catch (LoanException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean verifyUser(String user, String pass,int custId) throws LoanException {
		this.custId=custId;
		return service.userExist(user, pass,custId);
	}

	@Override
	public BankDetails addBankDetails(BankDetails bd) throws LoanException {
		bd.setCustId(custId);
		try {
			service.insertbd(bd);
			return bd;
		} catch (LoanException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PersonalDetails addPersonalDetails(PersonalDetails pd) throws LoanException {
		pd.setCustId(custId);
		System.out.println(custId);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date;
		String dob=pd.getDob().toString();
		try {
			date = (java.util.Date)format.parse(dob);
			System.out.println(date);
			System.out.println(date);
			pd.setDob(new java.sql.Date(date.getTime()));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		try {
			service.insertpd(pd);
			return pd;
		} catch (LoanException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public IncomeExpenseDetails addIncomeExpenseDetails(IncomeExpenseDetails ied) throws LoanException {
		
		ied.setCustId(custId);
		try {
			service.insertied(ied);
			return ied;
		} catch (LoanException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public PropertyDetails addPropertyDetails(PropertyDetails prd) throws LoanException {	
		prd.setCustId(custId);
		try {
			service.insertprd(prd);
			return prd;
		} catch (LoanException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LoanAccountDetails addLoanDetails(LoanAccountDetails lad) throws LoanException {
		lad.setCustId(custId);
		try {
		/*	loanAccountNo = generateAccountNo();*/
			 loanid =generateLoanId();
		} catch (LoanException e1) {
			e1.printStackTrace();
		}

		lad.setCustId(custId);
		lad.setLoanId(loanid);
		System.out.println(custId);
		/*lad.setLoanAccountNo(loanAccountNo);*/
		try {
			service.insertlad(lad);
			return lad;
		} catch (LoanException e) {
			e.printStackTrace();
		}
		return null;
	
	}
	
	@Override
	public int createCustomerId() throws LoanException {
		return service.createId();
	}

	@Override
	public List<RegisterDetails> getListOfUsers() throws LoanException {
		return service.getList();
		
	}

	@Override
	public BankDetails getBankData(int custId) throws LoanException {
		
		return service.getBankData(custId);
	}

	@Override
	public PropertyDetails getPropertyData(int custId) throws LoanException {
		return service.getPropertyData(custId);
	}

	@Override
	public IncomeExpenseDetails getIncomeData(int custId) throws LoanException {
		return service.getIncomeData(custId);
	}

	@Override
	public PersonalDetails getPersonalData(int custId) throws LoanException {
		return service.getPersonalData(custId);
	}

	@Override
	public LoanAccountDetails getLoanData(int custId) throws LoanException {
		return service.getLoanData(custId);
	}

	@Override
	public long generateAccountNo() throws LoanException {
		return service.createAccountNo();
	}

	@Override
	public long generateLoanId() throws LoanException {
		return service.createLoanId();
	}

	@Override
	public LoanAccountDetails updateLoanStatus(int id,String status,String description) throws LoanException {
	return service.updateStatus(id, status,description);
	}

	@Override
	public Date setVerificationDate(int id) throws LoanException {
		return service.setVerificationDate(id);
	}

	@Override
	public Date setApprovalDate(int id) throws LoanException {
		return service.setApprovalDate(id);
	}

	@Override
	public Date setDisbursementDate(int id) throws LoanException {
		return service.setDisbursementDate(id);
	}

	@Override
	public List<LoanAccountDetails> getListOfUsersByStatus() throws LoanException {
		return service.getListByStatus() ;
	}

	@Override
	public String loanStatus(int id) throws LoanException {
		return service.checkLoanStatus(id);
	}

}

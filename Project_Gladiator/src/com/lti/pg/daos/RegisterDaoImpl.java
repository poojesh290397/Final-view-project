package com.lti.pg.daos;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.pg.entities.BankDetails;
import com.lti.pg.entities.IncomeExpenseDetails;
import com.lti.pg.entities.LoanAccountDetails;
import com.lti.pg.entities.PersonalDetails;
import com.lti.pg.entities.PropertyDetails;
import com.lti.pg.entities.RegisterDetails;
import com.lti.pg.exception.LoanException;

@Transactional(propagation=Propagation.REQUIRED)
@Repository
public class RegisterDaoImpl implements RegisterDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public RegisterDetails insert(RegisterDetails rd)throws LoanException {
		try {
		manager.persist(rd);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		
		System.out.println("Inserted successfully");
		return rd;
	}

	@Override
	public RegisterDetails getData(int custId)throws LoanException {
		try {
		RegisterDetails rd=manager.find(RegisterDetails.class,custId );
		return rd;
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		
	}

	@Override
	public List<RegisterDetails> getList()throws LoanException {
		Query qry;
		try {
			qry=manager.createNamedQuery("allEmp");
			return qry.getResultList();
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		
	}
	
	@Override
	public LoanAccountDetails updateStatus(int id, String status,String description) throws LoanException {
		LoanAccountDetails lad;
		try {
		lad=manager.find(LoanAccountDetails.class,id);
		}	
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		lad.setStatus(status);
		lad.setDescription(description);
		return lad;
	}

	@Override
	public Boolean userExist(String user,String pass,int custId) throws LoanException {
		RegisterDetails rd;
		try {
		Query qry=manager.createQuery("from RegisterDetails where userName=:user and userPassword=:pass");
		qry.setParameter("user", user);
		qry.setParameter("pass", pass);
		rd= (RegisterDetails) qry.getSingleResult();
		}
			catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		if(rd!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public PersonalDetails insertpd(PersonalDetails pd) throws LoanException {
		try {
			manager.persist(pd);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("Inserted successfully");
		return pd;
	}

	@Override
	public BankDetails insertbd(BankDetails bd) throws LoanException {
		try
		{
			manager.persist(bd);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("Inserted successfully");
		return bd;
	}

	@Override
	public PropertyDetails insertprd(PropertyDetails prd) throws LoanException {
		try {
		manager.persist(prd);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("Inserted successfully");
		return prd;
	}

	@Override
	public LoanAccountDetails insertlad(LoanAccountDetails lad) throws LoanException {
		try {
		manager.persist(lad);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("Inserted successfully");
		return lad;
	}

	@Override
	public IncomeExpenseDetails insertied(IncomeExpenseDetails ied) throws LoanException {
		try {
		manager.persist(ied);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("Inserted successfully");
		return ied;
	}

	@Override
	public int createId() throws LoanException {
		Integer id;
		try {
		Query qr= manager.createQuery("select max(custId) from RegisterDetails");
		id=(Integer)qr.getSingleResult();}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("MAX VALUE"+ id);
		return (id+1);
	}

	@Override
	public BankDetails getBankData(int custId) throws LoanException {
		BankDetails bd;
		try {
		 bd=manager.find(BankDetails.class,custId );}
			catch(Exception e)
			{
					throw new LoanException("something went wrong in Validating user",e);
			}
		return bd;
	}

	@Override
	public PropertyDetails getPropertyData(int custId) throws LoanException {
		PropertyDetails prd;
		try {	 prd=manager.find(PropertyDetails.class,custId );}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		return prd;
	}

	@Override
	public IncomeExpenseDetails getIncomeData(int custId) throws LoanException {
		IncomeExpenseDetails ied;
		try {
		ied=manager.find(IncomeExpenseDetails.class,custId );}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		return ied;
	}

	@Override
	public PersonalDetails getPersonalData(int custId) throws LoanException {
		PersonalDetails pd;
		try { pd=manager.find(PersonalDetails.class,custId );}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		return pd;
	}

	@Override
	public LoanAccountDetails getLoanData(int custId) throws LoanException {
		LoanAccountDetails lad;
		try{ lad=manager.find(LoanAccountDetails.class,custId );}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		return lad;
	}

	@Override
	public long createAccountNo() throws LoanException {
		Long id;
		try {
		Query qr= manager.createQuery("select max(loanAccountNo) from LoanAccountDetails");
		id=(Long)qr.getSingleResult();
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("MAX VALUE"+ id);
		return (id+1);
	}

	@Override
	public long createLoanId() throws LoanException {
		Long id;
		try {
		Query qr= manager.createQuery("select max(loanId) from LoanAccountDetails");
		 id=(Long)qr.getSingleResult();}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		System.out.println("MAX VALUE"+ id);
		return (id+1);
	}

	@Override
	public Date setVerificationDate(int id) throws LoanException {
		LoanAccountDetails lad;
		try {  lad= manager.find(LoanAccountDetails.class,id);}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		java.sql.Date date=new java.sql.Date(new java.util.Date().getTime());
		lad.setDateOfVerification(date);
		return date;
	}

	@Override
	public Date setApprovalDate(int id) throws LoanException {
		LoanAccountDetails lad;
		try {
		lad= manager.find(LoanAccountDetails.class,id);
		}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		java.sql.Date date=new java.sql.Date(new java.util.Date().getTime());
		lad.setDateOfApproval(date);
		return date;
	}

	@Override
	public Date setDisbursementDate(int id) throws LoanException {
		LoanAccountDetails lad;
		try {
		lad= manager.find(LoanAccountDetails.class,id);}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		java.sql.Date date=new java.sql.Date(new java.util.Date().getTime());
		lad.setDateOfDisbursement(date);
		return date;
	}

	@Override
	public List<LoanAccountDetails> getListByStatus() throws LoanException {
		try {	
		Query qry=manager.createQuery("from LoanAccountDetails order by status desc ");
			return qry.getResultList();
		}
			catch(Exception e)
			{
					throw new LoanException("something went wrong in Validating user",e);
			}
		}

	@Override
	public String checkLoanStatus(int id) throws LoanException {
		String status;
		try {
		Query qry=manager.createQuery("from from LoanAccountDetails where loanId=:id");
		qry.setParameter("id",id);
		 status=(String)qry.getSingleResult();}
		catch(Exception e)
		{
				throw new LoanException("something went wrong in Validating user",e);
		}
		return status;
	}
		
	}


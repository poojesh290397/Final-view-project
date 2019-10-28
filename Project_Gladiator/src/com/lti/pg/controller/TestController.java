package com.lti.pg.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.pg.entities.BankDetails;
import com.lti.pg.entities.IncomeExpenseDetails;
import com.lti.pg.entities.LoanAccountDetails;
import com.lti.pg.entities.PersonalDetails;
import com.lti.pg.entities.PropertyDetails;
import com.lti.pg.entities.RegisterDetails;
import com.lti.pg.exception.LoanException;
import com.lti.pg.services.Services;

@Controller("TestController")
public class TestController {

	@Resource
	Services service;
	
	@RequestMapping("/")
	public String startPage() 
	{
		return "HomePage";
	}
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "HomePage";
	}
	
	@RequestMapping("/register")
	public String getRegisterPage() {
		return "Register";
	}
	
	@RequestMapping("/login")
	public String getLoginPage() {
		return "Login";
	}
	
	@RequestMapping("/addBankDetails1")
	public String getBankPage() {
		return "Page3";
	}
	
	@RequestMapping("/addPropertyDetails1")
	public String getPropertyPage() {
		return "Page1";
	}
	
	@RequestMapping("/addIncomeDetails1")
	public String getIncomePage() {
		return "Page2";
	}
	
	@RequestMapping("/addPersonalDetails1")
	public String getPersonalPage() {
		return "Page4";
	}
	
	@RequestMapping("/addLoanaccDetails1")
	public String getLoanPage() {
		return "Page5";
	}
	

	@RequestMapping("/checkStatus")
	public String getltPage() {
		return "LoanTracker";
	}
	//23-10
	@RequestMapping("/faq")
	public String getFaq() 
	{
		return "Faq";
	}
	
	@RequestMapping("/AboutUs")
	public String getAboutUs() 
	{
		return "AboutUs";
	}

	@RequestMapping("/Calculator")
	public String getCalculator() 
	{
		return "Calculator";
	}	

	@RequestMapping("/add")
	public String getPage() {
		return "InsertSuccess";
	}
	

	@RequestMapping("/addDetails")
	public String register(@ModelAttribute("register")RegisterDetails rd,HttpSession session)
	{
		System.out.println(rd);
		session.setAttribute("rd",rd);
		
		try {
			service.addApplicant(rd);
		} catch (LoanException e) {
			return "Errors";
		}
		return "AfterRegistration";
	}
	
	
	
	@RequestMapping("/login1")
	public String login(HttpServletRequest request,HttpSession session)
	{
		int custId=(Integer.parseInt(request.getParameter("custId")));
		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");
		Boolean b;
		if((custId==100)&&user.equals("admin")&&pass.equals("admin"))
		{
			session.setAttribute("custId", custId);
			session.setAttribute("user", user);
			return "AdminPage";
		}
		else {
		try {
			b=service.verifyUser(user,pass,custId);
			if(b==true) {
				
				session.setAttribute("custId", custId);
				session.setAttribute("user", user);

				return "LoginDash";
			}
				
		} catch (LoanException e) {
			return  "Errors";
		}
		}
			return  "Register";
		
	}

	
	@RequestMapping("/addPropertyDetails")
	public String registerPropertyDetails(@ModelAttribute("prop")PropertyDetails prd,HttpSession session)
	{
		try {
		int custId=(int)session.getAttribute("custId");
		System.out.println("PRoperty"+custId);
		prd.setCustId(custId);
		session.setAttribute("prd",prd);
		}
		catch(Exception e)
		{
			return "Errors";
		}
		return "Page2";
	}
	@RequestMapping("/addBankDetails")
	public String registerBankDetails(@ModelAttribute("bank")BankDetails bd,HttpSession session)
	{
		try {
		int custId=(int)session.getAttribute("custId");
		System.out.println("bank"+custId);
		bd.setCustId(custId);
		session.setAttribute("bd",bd);
		}
		catch(Exception e)
		{
			return "Errors";
		}
		return "Page4";
	}
	@RequestMapping("/addLoanDetails")
	public String registerLoanDetails(@ModelAttribute("loan")LoanAccountDetails lad,HttpSession session)
	{
		try {
		int custId=(int)session.getAttribute("custId");
		lad.setCustId(custId);
		Long loanid=lad.getLoanId();
		session.setAttribute("loanid",loanid);
		session.setAttribute("lad",lad);
		}
		catch(Exception e)
		{
			return "Errors";
		}
		
		return "Page6";
	}
	

	@RequestMapping("/addPersonalDetails")
	public String registerPersonalDetails(@ModelAttribute("personal")PersonalDetails pd,HttpSession session)
	{	
		try {
		int custId=(int)session.getAttribute("custId");
		pd.setCustId(custId);
		session.setAttribute("pd",pd);
		}
		catch(Exception e)
		{
			return "Errors";
		}
		return "Page5";
	}
	
	@RequestMapping("/addIncomeDetails")
	public String registerIncomeDetails(@ModelAttribute("income")IncomeExpenseDetails ied,HttpSession session)
	{
		try {
		int custId=(int)session.getAttribute("custId");
		ied.setCustId(custId);
		session.setAttribute("ied",ied);
		}
		catch(Exception e)
		{
			return "Errors";
		}
		return "Page3";
	}
	
	
	@RequestMapping("/appDetails")
	public ModelAndView getApplicantDetails(@RequestParam("id")int custId,HttpSession session) {
		int customerid=custId;
		session.setAttribute("custId",customerid);
		ModelAndView mdv=new ModelAndView("Data");
		PropertyDetails prd=null;
		LoanAccountDetails lad=null;
		IncomeExpenseDetails ied=null;
		BankDetails bd=null;
		PersonalDetails pd=null;
		try {
			lad=service.getLoanData(custId);
			ied=service.getIncomeData(custId);
			bd=service.getBankData(custId);
			prd=service.getPropertyData(custId);
			pd=service.getPersonalData(custId);
			mdv.addObject("lad",lad);
			mdv.addObject("ied",ied);
			mdv.addObject("bd",bd);
			mdv.addObject("prd",prd);
			mdv.addObject("pd",pd);

		} catch (LoanException e) {
			
			mdv.setViewName("Errors");
		}
		return mdv;
}

	@RequestMapping("/getListByStatus")
	public ModelAndView getListByStatus(HttpSession session) {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("ListByStatus");
		 List<LoanAccountDetails> listByStatus=null;
		try {
			listByStatus = service.getListOfUsersByStatus();
			System.out.println(listByStatus);
			mdv.addObject("listByStatus",listByStatus);
			
			return mdv;
		} catch (LoanException e) {
			
			mdv.setViewName("Errors");
		}
		return null;
	}
	
	@RequestMapping("/update")
	public String updateStatus(@RequestParam("id")int id,@RequestParam("status")String status,@RequestParam("desc")String description)
	{
		LoanAccountDetails lad=null;
		String stat=status;
		System.out.println(stat);
		if(stat.equals("VERIFYING"))
		{
			try {
				lad=service.updateLoanStatus(id, status, description);
				service.setVerificationDate(id);
			} catch (LoanException e) {
				return "Errors";
			}
		}
		
		else if(stat.equals("APPROVED"))
		{
			try {
				lad=service.updateLoanStatus(id, status, description);
				service.setApprovalDate(id);
				long account=service.generateAccountNo();
				lad.setLoanAccountNo(account);
			} catch (LoanException e) {
				return "Errors";
			}
		}
		else if(stat.equals("DISBURSED"))
		try {
			lad=service.updateLoanStatus(id, status, description);
			service.setDisbursementDate(id);
		} catch (LoanException e) {
			return "Errors";
		}
		return "UpdateSuccess";	
	}
	
	@RequestMapping("/checkStatus1")
	public ModelAndView checkStatus(HttpServletRequest request,HttpSession session)
	{
		int custId=(int)session.getAttribute("custId");/*(Integer.parseInt(request.getParameter("custid")));*/
		System.out.println(custId);
		LoanAccountDetails lad=null;
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("LoanTracker");
		try {
			lad=service.getLoanData(custId);
			mdv.addObject("lad",lad);
			return mdv;
		} catch (LoanException e) {
			mdv.setViewName("Errors");
			return mdv;
		}
	}

	
	
	@RequestMapping("/adminview")
	public ModelAndView getAllDetails(HttpServletRequest request) {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("AdminDashboard");
		 List<RegisterDetails> list=null;
		try {
			list = service.getListOfUsers();
			mdv.addObject("list",list);
			return mdv;
		} catch (LoanException e) {
			
			e.printStackTrace();
		}
	
		return null;
	}
	
	
	@RequestMapping("/documentsUploadPage")
	public String documentsUploadPage() 
	{
		return "Page6";
	}
	
	@RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
	 public ModelAndView uploadMultipleFileHandler(@RequestParam("file")MultipartFile[] files,HttpSession session) {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("InsertSuccess");
		
		String[] names= {"aadhar.pdf","pan.pdf","salarySlip.pdf","voterid.pdf","noc.pdf","agreement.pdf"};
		int custId=(int)session.getAttribute("custId");
		for (int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			String append=Integer.toString(custId);
			String name = custId+names[i];
			try {
				byte[] bytes = file.getBytes();
				String rootPath = "d:";
				// Creating the directory to store file
				
				File dir = new File(rootPath + File.separator + "tmpFiles"+File.separator + append);
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
			} catch (Exception e) {
				mdv.setViewName("Errors");
				return mdv;
			}
		}
		
		LoanAccountDetails lad=(LoanAccountDetails)session.getAttribute("lad");
		BankDetails bd=(BankDetails) session.getAttribute("bd");
		PersonalDetails pd=(PersonalDetails) session.getAttribute("pd");
		PropertyDetails prd=(PropertyDetails) session.getAttribute("prd");
		IncomeExpenseDetails ied=(IncomeExpenseDetails) session.getAttribute("ied");
		
		try {
			service.addPropertyDetails(prd);
			service.addIncomeExpenseDetails(ied);
			service.addBankDetails(bd);
			service.addPersonalDetails(pd);
			service.addLoanDetails(lad);
		} catch (LoanException e1) {
			// TODO Auto-generated catch block
			mdv.setViewName("Errors");
			return mdv;
		}
		mdv.addObject("lad",lad);
		mdv.setViewName("InsertSuccess");
		return mdv;
	}
	
	
	@RequestMapping("/logout")
	public String getLogout(HttpSession session) 
	{
		session.invalidate();
		return "HomePage";
	}	
}

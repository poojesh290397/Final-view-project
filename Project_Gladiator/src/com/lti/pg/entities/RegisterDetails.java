package com.lti.pg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
@NamedQueries({
	@NamedQuery(name="allEmp", query=" from RegisterDetails")
})
@Entity
@Table(name="HL_REGISTER")
public class RegisterDetails {

	@Id
	@Column(name="CUSTID")
	private int custId;
	
	@Column(name="USERNAME")
	private String userName;
	
	@Column(name="USERPASSWORD")
	private String userPassword;
	
	@Transient
	private String retypePassword;
	
	@Column(name="USERPHONE")
	private String  userPhone;
	
	@Column(name="USEREMAIL")
	private String userEmail;
	
	@Column(name="SECURITYQUESTION")
	private String securityQuestion;
	
	@Column(name="SECURITYANSWER")
	private String securityAnswer;
	
	public RegisterDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterDetails(int custId, String userName, String userPassword, String retypePassword, String userPhone,
			String userEmail, String securityQuestion, String securityAnswer) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.retypePassword = retypePassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	public RegisterDetails(int custId, String userName, String userPassword, String userPhone, String userEmail,
			String securityQuestion, String securityAnswer) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getRetypePassword() {
		return retypePassword;
	}
	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	@Override
	public String toString() {
		return "Register [custId=" + custId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", retypePassword=" + retypePassword + ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer + "]";
	}


}

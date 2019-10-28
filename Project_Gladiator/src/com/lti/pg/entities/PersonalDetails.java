package com.lti.pg.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="HL_PERSONAL")
public class PersonalDetails {
	
	@Id
	@Column(name="custId")
	private int custId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phoneNo")
	private long phoneNo;//convert to Long
	
	@Column(name="age")
	private int age;
	
	/*@DateTimeFormat(pattern = "yyyy/MM/dd")*/
	@Column(name="dob")
	private Date dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="address")
	private String address;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private long pincode;//convert to long
	
	@Column(name="aadharNo")
	private long aadharNo;//convert to long
	
	@Column(name="panNo")
	private String panNo;

	public PersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalDetails(int custId, String firstName, String middleName, String lastName, String email, long phoneNo,
			int age, Date dob, String gender, String nationality, String address, String state, long pincode,
			long aadharNo, String panNo) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "PersonalDetails [custId=" + custId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", email=" + email + ", phoneNo=" + phoneNo + ", age=" + age + ", dob="
				+ dob + ", gender=" + gender + ", nationality=" + nationality + ", address=" + address + ", state="
				+ state + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", panNo=" + panNo + "]";
	}
	
	
}

package com.lti.pg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HL_PROPERTY")
public class PropertyDetails {


	@Id
	@Column(name="custId")
	private int custId;
	
	@Column(name="propertyName")
	private String propertyName;
	@Column(name="propertyLocation")
	private String propertyLocation;
	@Column(name="estAmount")
	private double estAmount;
	public PropertyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyDetails(int custId, String propertyName, String propertyLocation, double estAmount) {
		super();
		this.custId = custId;
		this.propertyName = propertyName;
		this.propertyLocation = propertyLocation;
		this.estAmount = estAmount;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	public double getEstAmount() {
		return estAmount;
	}
	public void setEstAmount(double estAmount) {
		this.estAmount = estAmount;
	}
	@Override
	public String toString() {
		return "PropertyDetails [custId=" + custId + ", propertyName=" + propertyName + ", propertyLocation="
				+ propertyLocation + ", estAmount=" + estAmount + "]";
	}

	

}

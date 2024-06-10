package com.tnsif.daytwo;

public class Customer {
	private int customerId;
	private String customerName;
	private String customercity;
	
	//default constructor
	public Customer() {
		System.out.println("Hii Feriends I am default constructor");
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Customer(int customerId, String customerName, String customercity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customercity = customercity;
	}

     //getter and setters 
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customercity="
				+ customercity + "]";
	}
}



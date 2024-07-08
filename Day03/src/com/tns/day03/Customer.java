package com.tns.day03;

public class Customer {

	private String customerName;
	private int customerId;
	private String customerCity;
	
	//Default constructor 
	public Customer() {
		System.out.println("Default constructor");
	}

	
	
	//Parametriozed constructor 
	//use of this keyword 
	public Customer(String customerName, int customerId, String customerCity) {
		this(); //calling default constructor 
		
		System.out.println("Parameterized Constructor ");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}



	//getter and setter
	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerCity() {
		return customerCity;
	}



	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}



	//toString
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}


}

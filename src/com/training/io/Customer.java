package com.training.io;

public class Customer {
	private String customerId;
	private String customerName;
	private String gender;
	private String city;
	
	public Customer(String customerId, String customerName, String gender, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", city=" + city + "]";
	}
	
	
	

}
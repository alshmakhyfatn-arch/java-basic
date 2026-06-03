package bankingcore.miniproject;

import java.io.Serializable;

//Encapsulation
public class Customer implements Serializable {

	private static final long serialVersionUID = -894579597512632244L;
// implements Comparable<User>{
	
	// 1. attributes
	// instance variables
	protected String CustomerId;
	protected String CustomerName;
	protected String gender;
	protected int mobileNumber;
	
	public Customer() {
		System.out.println("User constructor called");
	}
	
	//Constructor
	public Customer(String CustomerId, String CustomerName, String gender, int mobileNumber) {
		this.CustomerId = CustomerId;
		this.CustomerName = CustomerName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}
	
	//static variables
	static String organizationName;
	public String getUserId() {
		return CustomerId;
	}
	public void setCustomerId(String CustomerId) {
		this.CustomerId = CustomerId;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
		
	}
	
	public String getCustomerName() {
		return CustomerName;
	}

	public String getgender() {
		return gender;
	}
	
	
	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", gender=" + gender + ", mobileNumber="+ mobileNumber+"]";
	}



	

	


}
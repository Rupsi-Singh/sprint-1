package com.cg.onlinegrocery.domain;

public class Customer extends Account{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerPhone;
	private String customerEmail;
	private String customerAddress;

	public Customer(int userID, String userName, String password, String customerPhone, String customerEmail,String customerAddress) {
		super(userID, userName, password);
		this.customerAddress=customerAddress;
		this.customerEmail=customerEmail;
		this.customerAddress=customerAddress;
		
		
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
}

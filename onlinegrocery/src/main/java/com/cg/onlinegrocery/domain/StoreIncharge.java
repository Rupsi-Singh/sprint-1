package com.cg.onlinegrocery.domain;

public class StoreIncharge extends Account{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String storeInchargePhone;
	private String storeInchargeEmail;
	
	
	public StoreIncharge(int userID, String userName,String password,String storeInchargePhone, String storeInchargeEmail) {
		super(userID,userName,password);
		this.storeInchargePhone = storeInchargePhone;
		this.storeInchargeEmail = storeInchargeEmail;
	}


	public String getStoreInchargePhone() {
		return storeInchargePhone;
	}


	public void setStoreInchargePhone(String storeInchargePhone) {
		this.storeInchargePhone = storeInchargePhone;
	}


	public String getStoreInchargeEmail() {
		return storeInchargeEmail;
	}


	public void setStoreInchargeEmail(String storeInchargeEmail) {
		this.storeInchargeEmail = storeInchargeEmail;
	}
	
}

package com.cg.onlinegrocery.domain;

public class Admin extends Account{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adminPhone;
	private String adminEmail;
	
	
	public Admin(int userID, String userName,String password,String adminPhone, String adminEmail) {  
        super(userID,userName,password);
        this.adminPhone=adminPhone;
        this.adminEmail=adminEmail;
        
    }  
	
	public Admin() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
	
	

}

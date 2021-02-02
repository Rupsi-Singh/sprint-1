package com.cg.onlinegroceryordering.domain;

import javax.persistence.*;


@Entity
public class UserDetail extends Login{
	
	private int userId;
	private String name;
	private String address;
	private String phone;
	private String email;
   public UserDetail(String username,String password, String role,int userId, String phone, String address, String email, String name)
   {
	   super(username,password,role);
	   this.name=name;
	   this.address=address;
	   this.phone=phone;
	   this.email=email;
	   this.userId=userId;
   }
   public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public UserDetail()
   {
	   super();
   }
	
	
	

}

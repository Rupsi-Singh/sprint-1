package com.cg.onlinegroceryordering.domain;
import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Login {
	
	@Id
	@Column(nullable = false)
	private String userName;
	private String role;
	@Column(nullable = false)
	private String password;

	public Login() {
		super();
	}

	public Login(String userName, String role, String password) {
		super();
		this.userName = userName;
		this.role = role;
		this.password = password;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [userName=" + userName + ", role=" + role + ", password=" + password + "]";
	}

}

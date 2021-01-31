package com.cg.onlinegrocery.domain;
import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "Accounts")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class Account implements Serializable {

    private static final long serialVersionUID = -2054386655979281969L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int userID;
    private String userName;
    private String password;
    
    private int userRole;
    public Account(int userID, String userName, String password) {  
        super();  
        this.userID = userID;  
        this.userName = userName;
        this.password=password;
    }  
    public Account()
    {
    	super();
    }
    
    @Column(name = "User_Name", length = 20, nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "Password", length = 20, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Column(name = "User_Role", length = 20, nullable = false)
    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
   
   
   
}
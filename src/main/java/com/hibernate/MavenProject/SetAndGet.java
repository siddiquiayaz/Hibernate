package com.hibernate.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 @Entity
 @Table (name ="userDetails")
public class SetAndGet {
	
	@Id
	private int userNameId;
	private String password;
	private String mail;
	public int getUserNameId() {
		return userNameId;
	}
	public void setUserNameId(int userNameId) {
		this.userNameId = userNameId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	

}

package com.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserInformation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int userid;
 private String username;
 private String emailid;
 private String password;
 private String mobilenumber;
 private String gender;
public UserInformation() {
	
}
public UserInformation(int userid, String username, String emailid, String password, String mobilenumber,String gender) {
	super();
	this.userid = userid;
	this.username = username;
	this.emailid = emailid;
	this.password = password;
	this.mobilenumber = mobilenumber;
	this.gender=gender;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}


public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


@Override
public String toString() {
	return "UserInformation [userid=" + userid + ", username=" + username + ", emailid=" + emailid + ", password="
			+ password + ", mobilenumber=" + mobilenumber + ", gender=" + gender + "]";
}

 
}

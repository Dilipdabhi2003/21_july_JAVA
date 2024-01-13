package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserModel")
public class UserModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname,lname,email,mobile,address,gender,password,cpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile="
				+ mobile + ", address=" + address + ", gender=" + gender + ", password=" + password + ", cpassword="
				+ cpassword + "]";
	}
	public UserModel(int id, String fname, String lname, String email, String mobile, String address, String gender,
			String password, String cpassword) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.cpassword = cpassword;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}

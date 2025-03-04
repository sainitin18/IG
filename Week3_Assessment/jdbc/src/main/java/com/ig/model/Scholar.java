package com.ig.model;

public class Scholar {
	int scholarId;
    String name;
    String email;
    String mobile;
    
	public int getScholarId() {
		return scholarId;
	}
	public void setScholarId(int scholarId) {
		this.scholarId = scholarId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Scholar [scholarId=" + scholarId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
}

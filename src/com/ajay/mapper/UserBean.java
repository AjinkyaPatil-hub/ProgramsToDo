package com.ajay.mapper;

public class UserBean {

	private String address;
	private int pincode;
	private String city;
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String address, int pincode, String city) {
		super();
		this.address = address;
		this.pincode = pincode;
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

package com.ajay.cloning;

public class Address implements Cloneable{
	
	private String city;
	private int poncode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, int poncode) {
		super();
		this.city = city;
		this.poncode = poncode;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPoncode() {
		return poncode;
	}
	public void setPoncode(int poncode) {
		this.poncode = poncode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", poncode=" + poncode + "]";
	}
	
	

}

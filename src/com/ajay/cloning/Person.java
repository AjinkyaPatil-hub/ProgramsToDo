package com.ajay.cloning;

public class Person implements Cloneable{

	private int id;
	private String name;
	private Address address;
	
	public Person() {
		super();
	}
	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		person.setAddress((Address)address.clone());
		
		return person;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

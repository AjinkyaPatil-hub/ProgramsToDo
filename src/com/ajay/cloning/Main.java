package com.ajay.cloning;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address  address = new Address("Pune", 1424);
		Person person  = new Person(101,"ajay",address);
		
		Person person2  = (Person) person.clone();
		person2.getAddress().setCity("Solapur");
		System.out.println("person>>>>"+person);
		System.out.println("person2>>>>"+person2);
		
	}
}

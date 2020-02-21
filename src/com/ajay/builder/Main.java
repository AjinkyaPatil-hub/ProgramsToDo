package com.ajay.builder;

public class Main {
	public static void main(String[] args) {
		Person peron = new PersonBuilder().setId(101).build();
		System.out.println("BuilderDesigPattern>>>  "+peron);
	}

}

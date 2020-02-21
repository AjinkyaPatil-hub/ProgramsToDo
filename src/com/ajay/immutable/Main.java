package com.ajay.immutable;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Age age = new Age(5, 12, 1991);
		Immutable i = new Immutable(4, "ajay", age);
		System.out.println(i.getId());
		System.out.println(i.getName());
		System.out.println(i.getAge());
		age.setYear(19912);
		System.out.println(i.getAge().getYear());
		
	}
}

class A {
	public void a() throws IOException{
		System.out.println("Base");
	}
}

class B extends A {
	public void a() throws ArithmeticException{
		System.out.println("over");
	}
}

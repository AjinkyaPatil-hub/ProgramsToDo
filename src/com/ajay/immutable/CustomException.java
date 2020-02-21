package com.ajay.immutable;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class CustomException {
	public static void  validate(int age) throws MyException
	{
		if(age<5){
			throw new MyException("age is invalid");
		}else {
			System.out.println("user created...");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(2);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	
}

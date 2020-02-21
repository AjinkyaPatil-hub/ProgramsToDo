package com.ajay.TIAA;

public class PrintFibo {

	public static void main(String[] args) {
		int num=5;
		System.out.print(0+":"+1+":");
		fibt(num);
		
	}

	private static void fibt(int num) {
		int a=0;
		int b=1;
		int i=2;
		while(i<num) {
			int c = a+b;
			System.out.print(c +":");
			a=b;
			b=c;
			i++;
		}
		
	}
}

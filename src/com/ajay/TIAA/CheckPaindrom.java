package com.ajay.TIAA;

public class CheckPaindrom {

	public static void main(String[] args) {
		int num = 125;
		isPaindrom(num);
	}

	private static void isPaindrom(int num) {
		int temp=num;
		int res=0;
		while(temp!=0) {
			int rem=temp%10;
			res = res*10+rem;	
			temp=temp/10;
		}
		System.out.println(res);
		if(num==res)
			System.out.println("Pidrom");
		else
			System.out.println("not paindrom");
	}
}

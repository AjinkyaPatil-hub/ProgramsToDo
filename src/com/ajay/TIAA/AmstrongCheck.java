package com.ajay.TIAA;

public class AmstrongCheck {

	public static void main(String[] args) {
		int power  =3;
		int num=153;
		checkAmstrong(power,num);
		System.out.println(Math.pow(5, 3));
	}

	private static boolean checkAmstrong(int power, int num) {
		
		int temp = num;
		int res=0;
		while(temp>0) {
			int rem = temp%10;
			res = (int) (res+Math.pow(rem, power));
			temp = temp/10;
		}
		System.out.println(res);
		if(res == num)
			return true;
		
		return false;
		
	}
}

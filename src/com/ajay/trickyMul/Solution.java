package com.ajay.trickyMul;

public class Solution {

	public static void main(String[] args) {
		int i=120;
		mulTricky(i);
	}

	private static void mulTricky(int no) {
		int res=1 , mod;
		while(no>0) {
			mod = no%10;
			if(mod==0) {
				int temp = no /10;
				String temps = temp+""+0;
				temp = Integer.parseInt(temps);
				System.out.println(temp);
				res = temp*res;
				no = no/10;
			}else {
				res = mod*res;
				no = no/10;
			}
		}
		System.out.println(res);
	}
}

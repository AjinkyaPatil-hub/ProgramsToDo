package com.ajay.TIAA;

public class LogestPaindrom {

	public static void main(String[] args) {
		String str="abaa";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("ys");
		else
			System.out.println("no");
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(str.contentEquals(sb))
			System.out.println("ys");
		else
			System.out.println("no");
	}
}

package com.ajay.HackerRank;

public class CountingOccuranceOfChar {
	
	public static void main(String[] args) {
			String str="aacsa"; 
			StringBuilder sb = new StringBuilder();
			int count=0;
			int i=0;
			for(i=0;i<str.length()-1;i++) {
				if(str.charAt(i) == str.charAt(i+1)) {
					count++;
				}else {
					count++;
					sb.append(""+count+str.charAt(i));
					count=0;
				}
			}
			count++;
			sb.append(""+count+str.charAt(i));
			
			System.out.println(sb);
		
	}
	
	

}

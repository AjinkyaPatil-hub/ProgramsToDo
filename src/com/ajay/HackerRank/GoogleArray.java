package com.ajay.HackerRank;

public class GoogleArray {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,5};
		System.out.println(findPerfectArray(arr));
	}

	private static boolean findPerfectArray(int[] arr) {
		
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i] <= 0 || arr[i]>arr.length+1) {
				return false;
			}
		}
		return true;
		
		
		
	}
	
}

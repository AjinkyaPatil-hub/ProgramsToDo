package com.ajay.TIAA;

import java.util.Arrays;

public class ShiftingMukundprob {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		mukuProb(arr);
	}

	private static void mukuProb(int[] arr) {

		for(int i=1;i<arr.length;i=i+2) {
			int last=arr[arr.length-1];
			for(int j=arr.length-2;j>=i;j--) {
				arr[j+1]=arr[j];
			}
			 arr[i] = last;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

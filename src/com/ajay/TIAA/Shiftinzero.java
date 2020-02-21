package com.ajay.TIAA;

import java.util.Arrays;

public class Shiftinzero {

	public static void main(String[] args) {
		int[] arr= {1,2,3,0,0,6,4};
		shiftZeroTOStart(arr);
		shiftZeroToRight(arr);
	}

	private static void shiftZeroToRight(int[] arr) {
		int count=arr.length-1;
		int k=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] != 0) {
				arr[k--] = arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count] =0;
			count--;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void shiftZeroTOStart(int[] arr) {
		
		int count=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				arr[k++] = arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count] = 0;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

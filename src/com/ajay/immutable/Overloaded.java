package com.ajay.immutable;

import java.util.Arrays;

public class Overloaded {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr.length);
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		int sum=0;
		int sum2=0;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(row==col) {
					sum = sum+arr[row][col];
				}
				if(row==arr[row].length-col-1) {
					sum2 = sum2+arr[row][col];
				}
			}
		}
		System.out.println(sum+":"+sum2);
	}
}

package com.hackerRank;

import java.util.Arrays;

public class CandleJumping {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		// inserting value into 2 d array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 5;
			}
		}
		for (int[] row : arr) {

			System.out.println(Arrays.toString(row));
		}

		//adding only first column
		int colAdd=0;	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i ==j) {
					colAdd+=arr[i][j];
				}
				
			}
		}
		System.out.println("Column addition "+colAdd);
	
		//System.exit(0);
		//adding right and left diagonal matrix 
		int sum = 0 ,sum2=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
				if(i==arr[i].length-j-1) {
					sum2 = sum2+arr[i][j];
				}
			}
		}
		System.out.println("sum of diagonal is " + sum2+":"+sum);
		System.exit(0);
		// first method to print 2 d array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println();
		}
		// 2 method
		// first loop through all rows
		for (int[] row : arr) {

			System.out.println(Arrays.toString(row));
		}

	}
}

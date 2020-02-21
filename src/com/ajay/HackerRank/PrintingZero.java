package com.ajay.HackerRank;

import java.util.Arrays;

public class PrintingZero {

	static int[][] arr = { { 1, 1, 1 }, { 1, 2, 1 }, { 1, 1, 3 } };

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row == 1 && col == 1) {
					System.out.println("-");
				} else {
					System.out.print(arr[row][col]);
				}
			}
			//System.out.println();

		}
	}

}

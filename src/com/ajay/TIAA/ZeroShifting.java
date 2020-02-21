package com.ajay.TIAA;

import java.util.Arrays;

public class ZeroShifting {
	static int count = 0;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 8, 0, 6 };
		shiftZero(arr);

	}

	private static int[] shiftZero(int[] arr) {
		int[] zero = new int[arr.length];
		int[] nonZero = new int[arr.length];
		int z = 0, k = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zero[z++] = arr[i];
				count++;
			}
			else {
				nonZero[k++]=arr[i];
			}
		}
		
		//for combining
		/*
		 * int j=0; for(int i=count;i<arr.length;i++) { zero[i] = nonZero[j++]; }
		 * System.out.println(Arrays.toString(zero));
		 */
		int check=0;
		int x=0,y=0;
		for(int i=0;i<arr.length;i++) {
			if(check != count) {
				check++;
				arr[i] = zero[x++];
			}else {
				arr[i] = nonZero[y++];
			}
		}
		 System.out.println(Arrays.toString(arr));
		
		return zero;

	}
}

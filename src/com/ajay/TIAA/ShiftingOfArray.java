package com.ajay.TIAA;

import java.util.Arrays;

public class ShiftingOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 2;
		shiftToRight(arr, n);

	}

	private static void shiftToRight(int[] arr, int n) {
		int rot = 0;
		while (rot != n) {

			int element = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = element;
			rot++;
		}
		System.out.println(Arrays.toString(arr));
	}
}

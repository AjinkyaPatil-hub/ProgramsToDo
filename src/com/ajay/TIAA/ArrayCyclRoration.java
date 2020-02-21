package com.ajay.TIAA;

import java.util.Arrays;

public class ArrayCyclRoration {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 2;
		cyclRotate(arr, n);
	}

	private static void cyclRotate(int[] arr, int n) {
		int rot = 0;
		while (rot != n) {

			int element = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = element;
			rot++;
		}
		System.out.println(Arrays.toString(arr));
	}
}

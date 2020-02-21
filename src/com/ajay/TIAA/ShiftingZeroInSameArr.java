package com.ajay.TIAA;

import java.util.Arrays;

public class ShiftingZeroInSameArr {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 3, 0, 9, 7, 0, 6 ,0};
		shift(arr);
	}

	private static void shift(int[] arr) {
		boolean isPres = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				i++;
			} else {
				int j = i + 1;
				// finding for the zero in the array if present
				// if zero present it will make flag=true and return the j pos.
				while (j < arr.length) {
					if (arr[j] == 0) {
						isPres = true;
						break;
					}
					j++;
				}
				// if zero is present then only it will enter in this loop
				// it will shift the element through right
				if (isPres) {
					int z = j - 1;
					while (z >= i) {
						arr[z + 1] = arr[z];
						z--;
						
					}
					// after shifting all insert zero to i pos.
					isPres = false;
					arr[i] = 0;
				}
			}

		}
		System.out.println(Arrays.toString(arr));

	}
}

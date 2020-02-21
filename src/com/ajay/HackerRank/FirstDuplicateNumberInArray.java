package com.ajay.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FirstDuplicateNumberInArray {
	static int repeatedValue = 10;
	static int x = 0;
	static boolean flag = false;

	public static void main(String[] args) {
		int[] arr = { 1, 2,  2, 3 }; // 3 first duplicate number is 3

		//System.out.println( firstDuplicateNumberInArray(arr));
		System.out.println(firstDuplicateByHashSet(arr));

	}

	private static int firstDuplicateByHashSet(int[] arr) {
		HashSet<Integer> hs= new HashSet<>();
		for(int i=0;i<arr.length-1;i++) {
			if(hs.contains(arr[i]))
			{
				return arr[i];
			}
			hs.add(arr[i]);
			
		}
		return -1;
		
	}

	private static int firstDuplicateNumberInArray(int[] arr) {
		int min_index=arr.length;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					min_index=  Math.min(min_index, j);
				}
			}
		}
		if(min_index == arr.length) return -1;
		else return arr[min_index];
	}
}

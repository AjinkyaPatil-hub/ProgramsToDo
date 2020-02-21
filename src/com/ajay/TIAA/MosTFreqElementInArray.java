package com.ajay.TIAA;

import java.util.HashMap;
import java.util.Iterator;

public class MosTFreqElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,1,2,8,1,1,1};
		mosstFreq(arr);
	}

	private static void mosstFreq(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i],hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		int maxValue=0;
		Iterator<Integer> itr = hm.keySet().iterator();
		Integer key = 0;	
		while(itr.hasNext()) {
			key =itr.next();
			maxValue = Math.max(hm.get(key), maxValue);
		}
		System.out.println("the ost repeated element int he array is" + hm.get(maxValue)+":"+maxValue);
		
		
	}
}

package com.ajay.TIAA;

import java.util.HashSet;
import java.util.Set;

public class FindingDup {
	public static void main(String[] args) {
		String[] arr = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
		String[] arr2 = {   "Java", "JSP", "Struts" };
		findingDup(arr,arr2);
	}

	private static void findingDup(String[] arr,String[] arr2) {
		Set set = new HashSet();
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr[i])==set.contains(arr2[i])) {
				System.out.println(arr[i]);
			}else {
				set.add(arr[i]);
			}
		}
		
		
	}

}

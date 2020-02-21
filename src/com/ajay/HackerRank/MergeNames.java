package com.ajay.HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {
	 public static HashSet<String> uniqueNames(String[] names1, String[] names2) {
	        HashSet<String> hs = new HashSet<>();
	       for(int i=0;i<names1.length;i++) {
	    	   hs.add(names1[i]);
	       }
	       for(int i=0;i<names2.length;i++) {
	    	   hs.add(names2[i]);
	       }
	       String [] arr = new String[hs.size()];
	       String [] arr2 = (String[]) hs.toArray();
	       
	         return hs;
	    }
	    
	    public static void main(String[] args) {
	        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
	        HashSet<String> res= MergeNames.uniqueNames(names1, names2); // should print Ava, Emma, Olivia, Sophia
	         System.out.println(res);
	    
	    }


}

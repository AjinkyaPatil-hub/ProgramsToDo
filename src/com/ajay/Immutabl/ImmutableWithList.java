package com.ajay.Immutabl;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableWithList {

	private final ArrayList<Integer> lst;

	public ImmutableWithList(ArrayList<Integer> lst) {
		super();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<lst.size();i++) {
			temp.add(lst.get(i));
		}
		this.lst = temp;
	}

	public List<Integer> getLst() {
		return (List<Integer>) lst.clone();
	}

	
	@Override
	public String toString() {
		return "ImmutableWithList [lst=" + lst + "]";
	}

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(11);
		lst.add(10);
		
		ImmutableWithList m = new ImmutableWithList(lst);
		System.out.println(m.getLst());
		lst.add(99);

		ImmutableWithList m2 = new ImmutableWithList(lst);
		System.out.println(m2.getLst());
	}
	

}

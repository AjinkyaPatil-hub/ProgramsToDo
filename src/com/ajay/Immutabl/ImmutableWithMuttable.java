package com.ajay.Immutabl;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableWithMuttable {

	private final String name;
	private final HashMap<String, String> hm;

	public ImmutableWithMuttable(String name, HashMap<String, String> hm) {
		super();
		this.name = name;
		HashMap<String, String> temp = new HashMap<>();
		String key = "";
		Iterator<String> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			key = itr.next();
			temp.put(key, hm.get(key));
		}
		this.hm = temp;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getHm() {
		return (HashMap<String, String>) hm.clone();

	}

	@Override
	public String toString() {
		return "ImmutableWithMuttable [name=" + name + ", hm=" + hm + "]";
	}

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "ajay");
		hm.put("2", "muku");
		hm.put("3", "akshay");
		ImmutableWithMuttable m = new ImmutableWithMuttable("ajay", hm);
		System.out.println(m);
	
		hm.put("12", "ajay");
		hm.put("22", "muku");
		hm.put("33", "akshay");
		ImmutableWithMuttable mm = new ImmutableWithMuttable("ajay", hm);
	
		System.out.println(mm);
	}
}

package com.ajay.immutable;

public final class Immutable {
	
	private final int id;
	private final String name;
	private Age age;
	
	
	
	public Immutable(int id, String name, Age age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Age clone = new Age();
		clone.setDay(age.getDay());
		clone.setMonth(age.getMonth());
		clone.setYear(age.getYear());
		this.age=clone;
	}

	


	public Age getAge() {
		return age;
	}




	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}

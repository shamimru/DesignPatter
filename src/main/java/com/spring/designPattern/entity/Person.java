package com.spring.designPattern.entity;

import lombok.Data;

@Data

public class Person {

	 int id;
	 String fname;
	 String lname;

//	 lazy loading 
	private static Person person;

	private Person() {

	}

	private Person(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	
	}
	

	public static Person getPerson() {

		if (person == null) {
			return new Person();
		}

		return person;
	}
	

	public  void getPring() {
		System.out.println("id is " + id+" and first name is "+fname +" and last name is "+lname);
	}

}



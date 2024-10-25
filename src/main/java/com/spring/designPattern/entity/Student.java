package com.spring.designPattern.entity;

public class Student {
	
	
//	eager loading 
	private static Student student=new Student();
	
	public static Student getStudent() {
		return student;
	}

}

package com.spring.designPattern.entity;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome signleton pattern");
		
		Person p =Person.getPerson();
		p.id=10;
		p.fname="Shamim";
		p.lname="ahamed";
		
		p.getPring();

	}

}

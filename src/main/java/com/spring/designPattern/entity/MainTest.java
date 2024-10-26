package com.spring.designPattern.entity;

import com.spring.designPattern.factoryDesign.Employee;
import com.spring.designPattern.factoryDesign.EmployeeFactory;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("welcome signleton pattern");
		
//		Person p =Person.getPerson();
////		p.id=10;
////		p.fname="Shamim";
////		p.lname="ahamed";
//		
//		p.getPring();
//		
//		System.out.println(p);
//		System.out.println(p.hashCode());
//		
//		Person p2 =Person.getPerson();
//		System.out.println(p2.hashCode());
//		
//		Student s=Student.getStudent();
//		System.out.println("Student "+ s.hashCode());
//		
//		Student s2=Student.getStudent();
//		System.out.println("Student "+ s2.hashCode());

		
		Employee employee = EmployeeFactory.getEmployee("ANDROID");
		System.out.println(employee.getSalery());
		
		Employee WEB = EmployeeFactory.getEmployee("WEB");
		System.out.println(WEB.getSalery());

	}

}

package com.spring.designPattern.factoryDesign;

public class EmployeeFactory {
	
	public static Employee getEmployee(String type) {
		
		if(type.trim().equalsIgnoreCase("ANDROID")) {
			return new AndroidDeveloper();
		}else if(type.trim().equalsIgnoreCase("WEB")) {
			return new WebDeveloper();

		}
		return null;
	}
	
	

}

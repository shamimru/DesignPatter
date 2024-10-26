package com.spring.designPattern.factoryDesign;

public class WebDeveloper implements Employee{

	@Override
	public int getSalery() {
		System.out.println("web developer");
		return 40_000;
	}

}

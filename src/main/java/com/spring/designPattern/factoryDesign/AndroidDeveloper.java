package com.spring.designPattern.factoryDesign;

public class AndroidDeveloper implements Employee{

	@Override
	public int getSalery() {
		// TODO Auto-generated method stub
		System.out.println("Android ");
		return 50_000;
	}

}

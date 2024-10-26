package com.spring.designPattern.builder;

public class BulderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User.UserBuilder().setId(1001).setName("shamim").setEmail("abc@gmail.com").build();
		System.out.println(user);

	}

}

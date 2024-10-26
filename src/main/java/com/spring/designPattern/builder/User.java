package com.spring.designPattern.builder;


public class User {
	
	private final int id;
	private final String  name;
	private final String  email;
	public User(UserBuilder builder) {
		this.id=builder.id;
		this.name=builder.name;
		this.email=builder.email;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + getId() + ", name=" + getName() + ", email=" + getEmail() + "]";
	}





	static class UserBuilder{
		
			private  int id;
			private  String  name;
			private  String  email;
			public int getId() {
				return id;
			}
			public UserBuilder setId(int id) {
				this.id = id;
				return this;
				
			}
			
			public UserBuilder setName(String name) {
				this.name = name;
				return this;
			}
			
			public UserBuilder setEmail(String email) {
				this.email = email;
				return this;
			}
			
			
			public User build() {
				User user = new User(this);
				
				return user;
			}
		}
	}



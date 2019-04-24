package com.zhiyou100.model;

public class User {
	private int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public User() {
		super();
	}
	public User(int age) {
		super();
		this.age = age;
	}
	
}

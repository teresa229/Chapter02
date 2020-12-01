package com.javaex.ex16;

public class Person {

	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {}
		//	super();//자동으로 생기지만 상속 받을 것이 없어서 필요없다.
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드-기본
	public void showInfo() {
		System.out.println("이름:"+ name + ", 나이:"+ age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

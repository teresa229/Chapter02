package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		/*
		Person p01 = new Person("정우성",45);
		System.out.println(p01.toString());
		
		Student p02 = new Student("서울고등학교");
		System.out.println(p02.toString());
		*/
		
		Student p03 = new Student("이정재",45,"한국고등학교");
	//	System.out.println(p03.toString());
		p03.showInfo();
		
		Student p04 = new Student("경기고등학교");
		System.out.println(p04.toString());
		
	}
}

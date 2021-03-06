package com.javaex.ex17;

public class Student extends Person {

	//필드
	private String schoolname;
	
	//생성자
	public Student(String name, int age, String schoolname){
		super(name,age);
		this.schoolname = schoolname;
	}

	//메소드-g/s
	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	//메소드-기본
	public void showInfo() {
		System.out.println("이름: "+ getName() + ", 나이:"+ getAge() + ", 학교: "+ schoolname);
	//	System.out.println("이름: "+ super.getName() + ", 나이:"+ super.getAge() + ", 학교: "+ schoolname);
	}	
	
    public void showInfo2(){
    	//복잡한 로직으로 가정
	    System.out.println("이름:" + super.getName() + ", 나이:" + super.getAge()  + ", 학교:" + schoolname);
    }
		
}


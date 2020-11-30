package com.javaex.ex14;

public class Student extends Person{

	//필드
	private String schoolName;

	//생성자
//	public Student() {
//		super();
//	}
	
	public Student(String schoolName) {
//		super(); //부모 요소를 무조건 불러온다.
		this.schoolName = schoolName;
	}

	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
		System.out.println("student(3)");
	}
	
	//메소드-g/s
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드-일반
	public void showInfo() {
/*		System.out.println(getName());  //super.getName());
		System.out.println(getAge());   //super.getAge());
		System.out.println(schoolName); //getSchoolName());과 같은 의미.
		}
*/	
	System.out.println("이름:"+getName()+"  나이:"+getAge()+ " 학교:" + getSchoolName());
	
//	System.out.println("이름: " + name +  "  나이:" + age +  "   학교:" + schoolName );
	}
	@Override
	public String toString() {
		return "Student[schoolName=" + schoolName + "]";
	}
}

package com.javaex.ex11;

public class MyMath {

	//필드
	public static double pi = 3.14;
	
	//생성자 생략 - 디폴트 생성자 사용
	
	//메소드 g/s
	
	//메소드 일반
	public static int plus(int a, int b) {//static 영역에 올려줘
//  	int sum = a+b; 생략 가능
//		return sum;
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static double circle(double r) {
		return r*r*pi;
		
	}
	
}

package com.javaex.ex21;

public class Circle extends Shape {

	//필드
	private int radius;

	//생성자
	public Circle(String fillcolor, String linecolor, int radius) {
		super(fillcolor, linecolor);
		this.radius = radius;
	}

	//메소드
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드
	public void draw() {
		System.out.println("원형- 면색:" + fillcolor + ", 선색:"+ linecolor + ", 반지름:" + radius);
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
}

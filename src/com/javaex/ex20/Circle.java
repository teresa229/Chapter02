package com.javaex.ex20;

public class Circle extends Shape{
	
	//필드
	private int radius;

	//생성자
	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor,lineColor);
		this.radius = radius;
	}

	//메소드
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드 일반
	public void draw() {
		System.out.println("원형-면색: "+ fillColor +", 선색: " + lineColor + ", 반지름: "+ radius);
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}

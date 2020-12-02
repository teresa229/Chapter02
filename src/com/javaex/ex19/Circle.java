package com.javaex.ex19;

public class Circle {
	
	//필드
	private String fillColor;
	private String lineColor;
	private int radius;
	
	//생성자
	public Circle() {
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

	//메소드
	public void draw() {
		System.out.println("원형-면색:"+ fillColor + ", 선색:" + lineColor + ", 반지름:"+ radius);
	}
	
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	
}

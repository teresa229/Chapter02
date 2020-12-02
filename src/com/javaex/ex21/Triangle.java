package com.javaex.ex21;

public class Triangle extends Shape {

	//필드 
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		super();
	}
	
	public Triangle(String fillcolor, String linecolor, int width, int height) {
		super(fillcolor,linecolor);
		this.width = width;
		this.height = height;
	}

	//메소드
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("삼각형- 면색:" + fillcolor + ", 선색:"+ linecolor + ", 가로:" + width + ", 세로:" + height);
	}
	
	public double area() {
		return (int)(width * height)/2;
	}
	
}

package com.javaex.ex20;

public class Ractangle extends Shape{

	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
		super();
	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor,lineColor);
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
		System.out.println("사각형-면색: "+ fillColor +", 선색: " + lineColor + ", 가로: "+ width + ", 세로:"+ height);
	}
	
	public double area(){
	//	double area = width * height;
	//	return area;
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
}

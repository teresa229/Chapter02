package com.javaex.ex18;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}

	//메소드
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void showInfo() {
		System.out.println("가로:"+ x +", 세로:"+ y +", 색:"+ color);
	}
	
}

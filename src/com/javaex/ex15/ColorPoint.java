package com.javaex.ex15;

public class ColorPoint extends Point{

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
	}
	
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		//super.setX(x);
		//super.serY(y);
		this.color = color;
	}
	
	//메소드
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	//메소드 - 기본
	public void showInfo() {
/*		System.out.println(getX());
		System.out.println(getY());
		System.out.println(getColor());
	}
*/
	System.out.println("포인트:" + x + "," + y + "색상:"+color);	
	}	
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
}

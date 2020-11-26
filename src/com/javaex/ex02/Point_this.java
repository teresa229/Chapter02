package com.javaex.ex02;

public class Point_this {

	//필드
	private int x;
	private int y;
	
	//메소드-겟터/세터
	public void setx(int x) {
		this.x = x;
	}
	public int getx() {
		return x;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	public int gety() {
		return y;
	}
	
	public void draw(int a, int b) {
		x = a;
		y = b;
		System.out.println("[x=" + x + ",y=" + y + "를 그렸습니다.]");
	}
}

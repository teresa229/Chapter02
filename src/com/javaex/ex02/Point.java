package com.javaex.ex02;

public class Point {

	//필드
	private int x;
	private int y;
	
	//메소드-겟터/세터
	public void setx(int a) {
		x = a;
	}
	public int getx() {
		return x;
	}
	
	public void sety(int b) {
		y = b;
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

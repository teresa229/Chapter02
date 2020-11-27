package com.javaex.ex05;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}
	
	
	// 메소드 getter setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반메소드
	public void draw() {
		System.out.println("점[x=" + x + ",y=" + y + "]를 그렸습니다.");
	}

	
	
}

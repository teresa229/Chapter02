package com.javaex.ex18;

public class Point {

	protected int x;
	protected int y;
	
	//생성자
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	//메소드
	public void showInfo() {
		System.out.println("가로:"+ x +", 세로:"+ y);
	}
	
}

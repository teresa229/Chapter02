package com.javaex.ex22;

public abstract class Shape {

	//필드
	protected String fillcolor;
	protected String linecolor;
	
	//생성자
	public Shape() {
	}
	
	public Shape(String fillcolor, String linecolor) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
	}

	//메소드
	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}
	
	//메소드 일반
//	public abstract void draw();  drawable로 개념을 이동
	
	public abstract double area();
}

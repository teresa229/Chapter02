package com.javaex.ex20;

public abstract class Shape { 
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드 일반
	//draw를 만들 요소가 없지만, 배열을 Shape로 바꾸어 정리하면 자식요소를 읽어올 draw가 필요해진다.
//  public void draw() {} -- 비어있으니 불안하잖아..아래와 같이 정리해 준다.
	public abstract void draw();
	
	public abstract double area();
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	

}

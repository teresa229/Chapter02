package com.javaex.ex18;

public class PointApp {
	
	public static void main(String[] args) { 

	Point[] c = new ColorPoint[2];
	
	Point cp1 = new ColorPoint("red");
	Point cp2 = new ColorPoint(10,10,"blue");
	
	c[0] = cp1;
	c[1] = cp2;
	
	for(int i= 0; i<c.length; i++) {
		c[i].showInfo();
	} 
	
	}
}

package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {

	Shape[] sArray = new Shape[3];
	
	Shape t01 = new Triangle("빨강","빨강",100,100);
	Shape c01 = new Circle("노랑","노랑",50);
	Shape r01 = new Rectangle("초록","초록",100,200);
	
	sArray[0] = t01;
	sArray[1] = c01;
	sArray[2] = r01;
	
	/*
	t01.draw();
	c01.draw();
	r01.draw();
	*/
	
	for(int i=0; i< sArray.length; i++) {
		sArray[i].draw();
	}
	
	System.out.println(t01.area());
	System.out.println(c01.area());
	System.out.println(r01.area());	

//	t01.area();
	}
}
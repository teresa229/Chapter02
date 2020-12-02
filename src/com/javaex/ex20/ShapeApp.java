package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
	
	//shape 배열만들기
	Shape[] sArray = new Shape[2];
	
	//사각형 만들기
	Shape r01 = new Ractangle("노랑","노랑",100,100);
		
	//원 만들기
	Shape c01 = new Circle("초록","초록",500);
	
	//배열에 주소값 대입
	sArray[0] = r01;
	sArray[1] = c01;
			
	//전부 그리기
	for(int i=0; i<sArray.length; i++) {
		sArray[i].draw();
	}
	
	//문제발생 -->추상 클래스 (생각해보기)
//	Shape s = new Shape("빨강","검정");
//	s.draw();
	
	}
}
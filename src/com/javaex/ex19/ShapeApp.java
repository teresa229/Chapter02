package com.javaex.ex19; //일반화, 추상화를 하지 않으면 불편한 상황 정리

public class ShapeApp {

	public static void main(String[] args) {
		
		//배열준비
		Ractangle[] rArray = new Ractangle[3]; //개수는 늘 넣어주어야 한다.
		
		//사각형 테스트
		Ractangle r01 = new Ractangle("빨강","노랑",5,10);
		Ractangle r02 = new Ractangle("빨강","파랑",20,30);
		Ractangle r03 = new Ractangle("빨강","초록",100,100);
		
		
		
		//배열에 주소값 대입
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//사각형 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		//원 테스트
		Circle c01 = new Circle("파랑","파랑",5);
		c01.draw();
	}
}
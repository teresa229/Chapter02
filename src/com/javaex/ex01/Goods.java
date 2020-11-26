package com.javaex.ex01;

public class Goods { //첫글자 대문자.. G

	//필드
	private String name;  //내가 정한 이름
	private int price; //경우에 따라서는 20개 이상
	
	//생성자
	
	//메소드-겟터/세터
	//name을 등록하는 기능: setName으로 이름 등록
	public void setName(String n) { //int가 없다는 것을 알려주는 void
		name= n;                    //n에는 "니콘" "LG그램" "머그컵"
				                    //6번은 생략	
	}
	
	//name을 읽어주는 기능: getName으로 이름 읽기
	public String getName() {
		return name;
	}
	
	//price 등록하는 기능: setPrice으로 가격 등록
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어주는 기능: getprice로 가격 읽기
	public int getPrice() {
		return price;
	}
	
	//메소드-일반
	public void showInfo(){
		System.out.println("상품이름:" + name + ", 가격:" + price);
	}
	
}

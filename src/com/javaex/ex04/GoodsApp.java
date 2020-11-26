package com.javaex.ex04;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		//생성자 Goods
		//setter사용    //showInfo()확인
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		//생성자 Goods(String name, int price)
		//setter 사용 x  //showInfo()확인     //showInfo()확인
		Goods computer = new Goods("LG그램",100000);
		computer.showInfo();
		
		//생성자 Goods(String name)
		//setter사용 setPrice();  //showInfo()확인
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
	}
}

package com.javaex.ex10;

public class GoodApp {
	
	public static void main(String[] args) {
		//메인 스토리
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(40000);
		System.out.println(camera.getTotalCount());
		
		Goods computer = new Goods("LG그램", 100000);
		System.out.println(computer.getTotalcount());
		
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.getTotalcount());
		
	//	System.out.println(camera.toString());
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}

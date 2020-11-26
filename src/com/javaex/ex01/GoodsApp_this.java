package com.javaex.ex01;

public class GoodsApp_this {

public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.setName("니콘");
		String cameraName = camera.getName();
	//	System.out.println(cameraName);
		
		camera.setPrice(400000);
		int cameraPrice = camera.getPrice();
	//	System.out.println(cameraPrice);
		
		camera.showInfo();
		
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		String computerName = computer.getName();
	//	System.out.println(computerName);
		
		computer.setPrice(1000000);
		int computerPrice = computer.getPrice();
	//	System.out.println(computerPrice);
		
		computer.showInfo();
		
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		String cupName = cup.getName();
	//	System.out.println(cupName);
		
		cup.setPrice(2000);
		int cupPrice = cup.getPrice();
	//	System.out.println(cupPrice);
		
		cup.showInfo();
	}
}

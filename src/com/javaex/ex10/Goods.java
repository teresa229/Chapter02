package com.javaex.ex10;

public class Goods {

	private String name;
	private int price;
	private static int totalCount;
	
	//생성자
	public Goods() {
		totalCount = totalCount + 1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount = totalCount + 1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalCount = totalCount + 1;
	}

	//메소드 getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public static int getTotalCount() {
		return totalCount;
	}

	public void setPrice(int price) {
		int defaultprice = 0;
		
		if (price<0) {
			this.price = defaultprice;
		}else {
			this.price = price;
		}
	}
	
	//일반 메소드
	public void showInfo() {
		System.out.println("상품명:"+ name + ", 가격:"+ price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}

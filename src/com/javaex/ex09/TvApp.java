package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		Tv tv = new Tv( 7, 20 , false);
		
		//toString으로 기본 테스트
	//	System.out.println(tv.toString());
		
		//현재 상태 출력메소드로 생성시 상태값 확인
	    tv.status();
	    
/*	    tv.power(true);
	    tv.volume(120);
	    tv.status();
	    
	    tv.volume(false);
	    tv.status();
		
	    tv.channel(0);
	    tv.status();
	    
	    tv.Channel(true);
	    tv.Channel(true);
	    tv.Channel(true);
	    tv.Channel(true);
	    tv.status();
	    
	    tv.power(false);
	    tv.status();
	    
*/	    
	}
}

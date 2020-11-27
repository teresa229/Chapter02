package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		Tv tv = new Tv( 7, 20 , false);
		
		//toString으로 기본 테스트
		System.out.println(tv.toString());
		System.out.println("====================");
		
		//현재 상태 출력메소드로 생성시 상태값 확인
	    tv.status();
	    System.out.println("====================");
	    
	    //전원 테스트 켬
	    tv.power(true);
	    tv.status();
	    System.out.println("====================");
	    
	    //전원 테스트 끔
	    tv.volume(false);
	    tv.status();
	    System.out.println("====================");
	    
  	    //전원 테스트 켬
	    tv.power(true); //false로 변경하고 테스트 해볼 것
	    tv.volume(120); //볼륨 숫자 변경해서 테스트 해볼 것
	    tv.status();
	    System.out.println("====================");
	    
	    //볼륨 테스트(볼륨 업 다운 버튼으로 입력)
	    tv.power(true); 
	    tv.volume(95); 
	    tv.status();
	    System.out.println("====================");
	    
	    //채널 테스트 (체널 업 다운 버튼으로 입력)
	    tv.power(true); //false로 변경하고 테스트 해볼 것
	    tv.volume(253); 
	    tv.status();
	    System.out.println("====================");
	    
	    tv.channel(true);
	    tv.status(); //정상범위
	    System.out.println("====================");
	    
	    tv.channel(255);
	    tv.channel(true); 
	    tv.status(); //비정상범위
	    
	    tv.channel(2); 
	    tv.status();
	    
	    
	    tv.channel(9); 
	    tv.volume(15); 
	    tv.status();
	    
	}
}

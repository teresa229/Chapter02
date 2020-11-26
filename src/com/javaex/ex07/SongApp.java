package com.javaex.ex07;

import com.javaex.ex03.Song_simple;

public class SongApp {
	
	public static void main(String[] args) {

		//Song() 생성자 사용
		//setter 6개 사용 값 대입
		//showInfo 출력
		Song chart01 = new Song();
		
		chart01.setTitle("좋은날");
		chart01.setArtist("아이유");
		chart01.setAlbum("Real");		
		chart01.setComposer("이민수");	    
	    chart01.setYear("2010년"); 
	    chart01.setTrack(3);  
	    
	    chart01.showInfo();	

	    System.out.println("=========");
	    
		//Song(파라미터 6개)생성자 사용
		//setter 6개 사용 값 대입
		//showInfo 출력
	    Song chart02 = new Song("거짓말","BIGBANG","Always","G-DRAGON","2007년",2);
	    chart02.showInfo();
  
	    System.out.println("=========");
	    
		 //Song(파라미터 2개)생성자 사용	
		 //setter 사용
		 //showInfo() 출력
		Song chart03 = new Song("벚꽃엔딩","버스커버스커");
		
		chart03.setAlbum("버스커버스커1집");		
		chart03.setComposer("장범준");	    
	    chart03.setYear("2012년"); 
	    chart03.setTrack(4);
	    
	    chart03.showInfo();
	    
	    System.out.println(chart01.toString());
	    System.out.println(chart02.toString());
	    System.out.println(chart03.toString());
	 
	
	}
}

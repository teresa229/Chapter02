package com.javaex.ex03;

public class SongApp_simple {

	public static void main(String[] args){
		
	//	Song_simple chart01 = new Song_simple("좋은날","아이유","Real","이민수","2010년",3); 
 
		Song_simple chart01 = new Song_simple();
		
		chart01.setTitle("좋은날");
		chart01.setArtist("아이유");
		chart01.setAlbum("Real");		
		chart01.setComposer("이민수");	    
	    chart01.setYear("2010년"); 
	    chart01.setTrack(3);
	   
	    chart01.showInfo();
	    
	    Song_simple chart02 = new Song_simple("거짓말","BIGBANG","Always","G-DRAGON","2007년",2);
	    chart02.showInfo();
	    
	    Song_simple chart03 = new Song_simple("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준","2012년",4); 
	    chart03.showInfo();
	}
}

package com.javaex.ex03;

public class SongApp {
	
public static void main(String[] args){
	
	Song chart1 = new Song();

	chart1.setTitle("좋은날");
	chart1.setArtist("아이유");	
	chart1.setAlbum("Real");		
	chart1.setComposer("이민수");
    chart1.setYear("2010년");  
    chart1.setTrack(3);
    
    chart1.showInfo();
    
    Song chart02 = new Song();
    
    chart02.setTitle("거짓말");
    chart02.setArtist("BIGBANG");
    chart02.setAlbum("Always");
    chart02.setComposer("G-DRAGON");
    chart02.setYear("2007년");
    chart02.setTrack(2);
    
    chart02.showInfo();
    
    Song chart03 = new Song();
    
    chart03.setTitle("벚꽃엔딩");
    chart03.setArtist("버스커버스커");
    chart03.setAlbum("버스커버스커1집");
    chart03.setComposer("장범준");
    chart03.setYear("2012년");
    chart03.setTrack(4);

    chart03.showInfo();
    
    
	}
}

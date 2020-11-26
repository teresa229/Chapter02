package com.javaex.ex03;

public class SongApp {
	
public static void main(String[] args){
	
	Song chart1 = new Song();

	chart1.setTitle("좋은날");
	String title1 = chart1.getTitle();
	
	chart1.setArtist("아이유");
	String artist1 = chart1.getArtist();
	
	chart1.setAlbum("Real");
	String album1 = chart1.getAlbum();
			
	chart1.setComposer("이민수");
    String composer1 = chart1.getComposer();
    
    chart1.setYear("2010년");
    String year1 = chart1.getYear();
    
    chart1.setTrack(3);
    int track1 = chart1.getTrack();
    
    chart1.showInfo();
    
    
    Song chart02 = new Song();
    
    chart02.setTitle("거짓말");
    String title2 = chart02.getTitle();
    
    chart02.setArtist("BIGBANG");
    String artist2 = chart02.getArtist();
    
    chart02.setAlbum("Always");
    String album2 = chart02.getAlbum();
    
    chart02.setComposer("G-DRAGON");
    String composer2 = chart02.getComposer();
    
    chart02.setYear("2007년");
    String year2 = chart02.getYear();
    
    chart02.setTrack(2);
    int track2 = chart02.getTrack();
    
    chart02.showInfo();
    
    Song chart03 = new Song();
    
    chart03.setTitle("벚꽃엔딩");
    String title3 = chart03.getTitle();
    
    chart03.setArtist("버스커버스커");
    String artist3 = chart03.getArtist();
    
    chart03.setAlbum("버스커버스커1집");
    String album3 = chart03.getAlbum();
    
    chart03.setComposer("장범준");
    String composer3 = chart03.getComposer();
    
    chart03.setYear("2012년");
    String year3 = chart03.getYear();
    
    chart03.setTrack(4);
    int track3 = chart03.getTrack();
    
    chart03.showInfo();
    
    
	}
}

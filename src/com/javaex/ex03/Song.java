package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//단축키로 만들수 있다. alt+shift+s
	//setTitle
	public void setTitle(String title){
		this.title = title;
	}	
	//getTitle
	public String getTitle() {
		return title;
	}
	
	//setArtist
	public void setArtist(String artist) {
		this.artist= artist;
	}
	//getArtist
	public String getArtist() {
		return artist;
	}
	
	//setAlbum
	public void setAlbum(String album) {
		this.album = album;
	}
	//getAlbum
	public String getAlbum() {
		return album;
	}
	
	//setComposer
	public void setComposer(String composer) {
		this.composer = composer;
	}
	//getComposer
	public String getComposer() {
		return composer;
	}
	
	//setYear
	public void setYear(String year) {
		this.year = year; 
	}
	//getYear
	public String getYear() {
		return year;
	}
	
	//setTrack
	public void setTrack(int track) {
		this.track = track;
	}
	//getTrack
	public int getTrack() {
		return track;
	}
	
	public void showInfo() {
		System.out.println(artist + "," + title + "(" + album +", " + year + ", " + track + "번 track," + composer +"작곡)" );
	}
}

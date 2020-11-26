package com.javaex.ex07;

public class Song {

	//필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	//생성자 1: 0개
	public Song() {}
	
/*	//생성자 2: 6개
	public Song(String title, String artist, String album, String composer, String year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
*/	
	//생성자 3: 2개 타이틀, 작곡자
	public Song(String title, String composer) {
		this.title = title;
		this.composer = composer;
	}
	
	//생성자 2 : 타이틀, 트랙 따로 관리한다고 가정
	public Song(String title, int track) {
		this.title = title;
		
		if(track<5) {
			this.track = 0;
		}else {
			this.track = track;
		}
		
		System.out.println("생성자(2)");
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {//메모리에 올린다. 추가 작업 -> 초기값 대입
		this(title,track); //다른 생성자를 호출한다.(사용한다)
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		
		System.out.println("생성자(6)");
	}
	
	
	//생성자 2 : 타이틀 트랙번호 --> 확인 String, String이 아니라 문제없다.
//	public Song(String title, int track) {
//		this.title = title;
//		this.track = track;
//	}

	//메소드 - getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	//메소드 - 일반메소드 showInfo()
	public void showInfo() {
		System.out.println(artist + "," + title + "(" + album +", " + year + "," + track + "번 track, " + composer +"작곡)");
	}

	//toSting[] 작성해보기
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
}

package com.javaex.ex03;

public class Song_simple {
		
		private String title;
		private String artist;
		private String album;
		private String composer;
		private String year;
		private int track;
		
		//단축키로 만들었다.
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

		//생성자
		//메소드 유사하다. 이름은 반드시 적어야 하고, return형은 없다.
		public Song_simple() { //default 값!
			//[SongApp] Song s01 = new Song(); 에서 Song();을 불러오는 것이다.
		}
		//
		
		//2번째 부분의 내용을 넣어주는 것이다.public Song()이 반복되어 나오지만 내용이 다르기 때문에 오류가 나지 않는다.
		public Song_simple(String title, String artist, String album, String composer, String year, int track) {
			//메모리에 올린다.
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.composer = composer;
			this.year = year;
			this.track = track;
		}
		
		public void showInfo() {
			System.out.println(artist + "," + title + "(" + album +", " + year + ", " + track + "번 track," + composer +"작곡)" );
		}
}

package com.javaex.ex09;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
/*	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
*/	
	public Tv(int channel, int volume, boolean power) {
		//this.channel = channel;
		//this.channel = channel;
		if(channel<255) {
			this.channel = channel;
		}else(channel >= 255) {
			this.channel = 255;
		}
		
		//this.volume = volume;
		if(volume<100) {
			this.volume = volume;
		}else(volume>=100){
			this.volume = 100;
		}		
		
		//this.power = power;
		if(power == true){
			this.power = true;
		}else if(power == false) {
			this.power = false;
		}else {
			this.power = up;
		}
		
	}
	
	//메소드
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	//일반 메소드
	public void status() {
		System.out.println("채널:"+ channel + ", 볼륨:" + volume + ", 전원:" +power);
	}
	
/*	public void status(boolean power) {
	}
*/
//	@Override
//	public String toString() {
//		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
}


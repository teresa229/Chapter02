package com.javaex.ex09;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv(int channel, int volume, boolean power) {
		//case 1: 볼륨과 채널 범위 체크없이 진행할 때
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
		//case 2: 볼륨과 채널 범위 체크하여 진행할 때
/*		channel(channel);
		volume(volume);
		this.power = power;
*/		
	}
	
	//메소드
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	//파워 관련
	public void power(boolean on) {
		this.power = on;
	}
	
	//볼륨 관련(0~100)
	public void volume(int volume) {
		if(power == true) { //power가 켜졌을 때만 볼륨값 변경됨.
			if(volume < 0) {//0보다 작은 수 입력되면 0 처리
				this.volume = 0;
			}else if(volume > 100) { //100보다 큰 수 입력되면 100처리
				this.volume = 100;
			}else {
				this.volume = volume;
			}	
		}
		} //else(power == false;)
	
	public void volume(boolean up) {
		if(up == true) {
			volume(this.volume+1);
		}else {
			volume(this.volume-1);
		}
	}
	
	//채널 관련
	public void channel(int channel) {
		if(power == true) { //power가 켜졌을 때만 볼륨값 변경됨.
			if(channel<1 ||	channel>255) {
				System.out.println("없는 채널입니다.");
			}else {
				this.channel = channel;
			}
		}
	}
	
	public void channel(boolean up) {
		if(up == true) {
			channel(this.channel+1);
		}else {
			channel(this.channel-1);
		}
	}

	//일반 메소드
	public void status() {
		System.out.println("채널:"+ channel + ", 볼륨:" + volume + ", 전원:" + power);
	}
	

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
}

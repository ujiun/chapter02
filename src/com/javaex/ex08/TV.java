package com.javaex.ex08;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
		
	//생성자
	public TV() {
	}		
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}


	//메소드-gs
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	
	//메소드-일반
	public void power(boolean on) {
		if(on==true) {
			this.power=true;
		}else if(on==false) {
			this.power=false;
		}
	}
	
	public void channel(int channel) {
		if(this.power==true) {
			if(channel<=1) {
				this.channel=1;
			}else if(channel>=225) {
				this.channel=225;
			}
		}
	}
	
	public void channel(boolean up) {
		if(this.power==true) {
			if(up==true && this.channel<225) {
				this.channel++;
			}else if(up==false && this.channel>1) {
				this.channel--;
			}
		}
	}
	
	public void volume(int voluem) {
		if(this.power==true) {
			if(voluem<=0) {
				this.volume=0;
			}else if(voluem>=100) {
				this.volume=100;
			}
		}
	}
	
	public void volume(boolean up) {
		if(this.power==true) {
			if(up==true && this.volume<100) {
				this.volume++;
			}else if(up==false && this.volume>0) {
				this.volume--;
			}
		}
	}
	
	
	
	public void status() {
		if(this.power==true) {
			System.out.println("채널- " + channel + "  볼륨- " + volume);
		}else if(this.power==false) {
			System.out.println("TV꺼짐");
		}
	}	
}

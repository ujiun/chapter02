package com.javaex.ex08;

public class TVApp {

	public static void main(String[] args) {
	
		TV tv = new TV(7, 20, false);
		tv.power(true);
		
		tv.channel(500);
		tv.status();
		tv.channel(-200);
		tv.status();
		tv.channel(true);
		tv.channel(true);
		tv.status();
		tv.channel(false);
		tv.status();
		
		tv.volume(-100);
		tv.status();
		tv.volume(false);
		tv.status();
		tv.volume(500);
		tv.status();
		tv.volume(true);
		tv.status();
		tv.volume(false);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		tv.volume(true);
		tv.status();
		tv.volume(true);
		tv.status();
		
		tv.power(true);
		tv.status();
	}
}

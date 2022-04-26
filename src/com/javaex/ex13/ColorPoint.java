package com.javaex.ex13;

public class ColorPoint extends Point {
	//필드
	private String color;


	//생성자
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}

	//메소드-gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//메소드-일반
	public void showinfo() {
		System.out.println("점X: " + x + "점Y: " + y + "색: " + color );
	}
	
}

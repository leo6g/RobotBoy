package com.leo.test;

public class DTMap {
	private int time;
	private double distance;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public DTMap( double distance,int time) {
		super();
		this.time = time;
		this.distance = distance;
	}
	
}

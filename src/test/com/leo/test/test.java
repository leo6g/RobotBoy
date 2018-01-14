package com.leo.test;

import com.leo.util.BaseRobot;

public class test {
	public static void main(String[] args) {
		String begin = "config/begin.png";
		String end = "config/end.png";
		BaseRobot r1 = new BaseRobot(50, 0.6f,10);
		BaseRobot r2 = new BaseRobot(50, 1.0f,0);
		try {
			System.out.println("移动到begin...");
			Thread.sleep(5000);
			int[] l1 = r1.getLocation(end);
			System.out.println("移动到end");
			Thread.sleep(5000);
			int[] l2 = r1.getLocation(end);
			double distance = Math.sqrt(Math.pow(Math.abs(l1[0]-l2[0]),2)+Math.pow(Math.abs(l1[1]-l2[1]),2));
			System.out.println(distance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}

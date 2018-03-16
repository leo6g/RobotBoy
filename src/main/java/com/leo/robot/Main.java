package com.leo.robot;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	public static void main(String[] args) throws Exception {
//		 BaseRobot robot = new BaseRobot(50,0.65f,10);
//		 robot.click("config/xiaomi/publish.png");
		XiaoMiZhiBoBoy boy = new XiaoMiZhiBoBoy();
		AtomicInteger d = new AtomicInteger(50);
		AtomicBoolean b = new AtomicBoolean(false);
		while(true) {
			Thread.sleep(10000);
			boy.publish(b.get()?"红包 ":""+"我要"+d.incrementAndGet()+"元的现金红包买手机 "+(b.get()?"小米666":""));
		}
	}
}

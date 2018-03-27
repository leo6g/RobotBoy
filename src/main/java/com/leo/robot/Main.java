package com.leo.robot;

import java.util.Random;

public class Main {
	public static void main(String[] args) throws Exception {
//		 BaseRobot robot = new BaseRobot(50,0.65f,10);
//		 robot.click("config/xiaomi/publish.png");
		XiaoMiZhiBoBoy boy = new XiaoMiZhiBoBoy();
		Random random = new Random();
		while(true) {
			boy.publish((random.nextBoolean()?"雪哥":"雷哥")+(random.nextBoolean()?"红包 ":"")+"我要"+random.nextInt(1000)+"元的现金红包 "+(random.nextBoolean()?"小米666":"买手机"));
			Thread.sleep(10000);
		}
	}
}

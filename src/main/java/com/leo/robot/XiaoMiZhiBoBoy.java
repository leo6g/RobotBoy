package com.leo.robot;

import com.leo.util.BaseRobot;
import com.leo.util.ClipboardUtil;

public class XiaoMiZhiBoBoy {
	private BaseRobot robot = new BaseRobot(50,0.65f,10);
	private String publish = "config/xiaomi/publish.png";
	private String publish2 = "config/xiaomi/publish2.png";
	public void publish(String comment) {
		ClipboardUtil.setSysClipboardText(comment);
		try {
			robot.click(publish, -139, 21);
			Thread.sleep(2000);
			robot.dbClick();
			Thread.sleep(2000);
			robot.paste(3000);
			Thread.sleep(2000);
			robot.click(publish2);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

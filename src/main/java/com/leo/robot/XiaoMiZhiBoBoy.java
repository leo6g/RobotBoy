package com.leo.robot;

import com.leo.util.BaseRobot;
import com.leo.util.ClipboardUtil;

public class XiaoMiZhiBoBoy {
	private BaseRobot robot = new BaseRobot(50,0.65f,10);
	private String publish = "config/xiaomi/publish.png";
	public void publish(String comment) {
		ClipboardUtil.setSysClipboardText(comment);
		try {
			robot.click(publish, -260, 26,2000);
			Thread.sleep(2000);
			robot.dbClick();
			Thread.sleep(2000);
			robot.paste(3000);
			Thread.sleep(2000);
			robot.click(publish);
			Thread.sleep(2000);
			robot.click(publish,-38,92);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

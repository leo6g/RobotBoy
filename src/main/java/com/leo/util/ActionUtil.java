package com.leo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActionUtil {
	protected static Logger logger = LoggerFactory.getLogger("ActionUtil");
	public static synchronized String do2(String machineCode){
		String regCode = "";
		BaseRobot robot = new BaseRobot();
		try {
			long start = System.currentTimeMillis();
			robot.click("image/win7/777.png",276,165);
			robot.selectAll(0);
			robot.del(1,0,0);
			ClipboardUtil.setSysClipboardText(machineCode);
			robot.paste(0);
			robot.click("image/win7/777.png",109,483);
			robot.click("image/win7/777.png",470,363);
			robot.move(0, 0);
			regCode=ClipboardUtil.getSysClipboardText();
			if(machineCode.equals(regCode)){
				//读取时复制注册码失败
			}
			long end = System.currentTimeMillis();
			logger.info(regCode+"用时："+(end-start)/1000+"s");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return regCode;
		
	}
	public static synchronized String do1(String machineCode){
		String regCode = "";
		BaseRobot robot = new BaseRobot();
		try {
			long start = System.currentTimeMillis();
			robot.click("image/win7/888.png",276,165);
			robot.selectAll(0);
			robot.del(1,0,0);
			ClipboardUtil.setSysClipboardText(machineCode);
			robot.paste(0);
			robot.click("image/win7/888.png",109,483);
			robot.click("image/win7/888.png",470,363);
			robot.move(0, 0);
			regCode=ClipboardUtil.getSysClipboardText();
			if(machineCode.equals(regCode)){
				//读取时复制注册码失败
			}
			long end = System.currentTimeMillis();
			logger.info(regCode+"用时："+(end-start)/1000+"s");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return regCode;
		
	}
}

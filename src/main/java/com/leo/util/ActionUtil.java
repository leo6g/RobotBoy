package com.leo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActionUtil {
	protected static Logger logger = LoggerFactory.getLogger("ActionUtil");
	public static synchronized String do2(String machineCode){
		String regCode = "";
		try {
			long start = System.currentTimeMillis();
			BaseRobot.click("image/win7/777.png",276,165);
			BaseRobot.selectAll(0);
			BaseRobot.del(1,0,0);
			ClipboardUtil.setSysClipboardText(machineCode);
			BaseRobot.paste(0);
			BaseRobot.click("image/win7/777.png",109,483);
			BaseRobot.click("image/win7/777.png",470,363);
			BaseRobot.move(0, 0);
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
		try {
			long start = System.currentTimeMillis();
			BaseRobot.click("image/win7/888.png",276,165);
			BaseRobot.selectAll(0);
			BaseRobot.del(1,0,0);
			ClipboardUtil.setSysClipboardText(machineCode);
			BaseRobot.paste(0);
			BaseRobot.click("image/win7/888.png",109,483);
			BaseRobot.click("image/win7/888.png",470,363);
			BaseRobot.move(0, 0);
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

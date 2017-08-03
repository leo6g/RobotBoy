package com.leo.test;

import com.leo.robot.DuanZiBoy;
import com.leo.util.BaseRobot;

public class MyTest {
	public static void main(String[] args) {
		String hours = "config/hours.png";
		String backButton = "config/backButton.png";
		DuanZiBoy dzBoy = new DuanZiBoy();
		BaseRobot robot = new BaseRobot(50, 0.50f);
		
		dzBoy.voteStrong();
	}
	/**  
	    * byte数组中取int数值，本方法适用于(低位在前，高位在后)的顺序。 
	    *   
	    * @param ary  
	    *            byte数组  
	    * @param offset  
	    *            从数组的第offset位开始  
	    * @return int数值  
	    */    
	public static int bytesToInt(byte[] ary, int offset) {  
	    int value;    
	    value = (int) ((ary[offset]&0xFF)   
	            | ((ary[offset+1]<<8) & 0xFF00)  
	            | ((ary[offset+2]<<16)& 0xFF0000)   
	            | ((ary[offset+3]<<24) & 0xFF000000));  
	    return value;  
	} 
}

package com.leo.test;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.leo.util.BaseRobot;

public class MyTest {
	public static void main(String[] args) {
		String strong = "config/strong.png";
		String vote = "config/vote.png";
		String voteMark = "config/voteMark.png";
		String sendVote = "config/sendVote.png";
		BaseRobot robot = new BaseRobot(50,0.65f);
		String s = "我是";
		String key = "没人";
		byte[] sb = s.getBytes();
		byte[] keyB = key.getBytes();
		String str = new String(sb);
		System.out.println(str);
		int keyi = bytesToInt(keyB,0);
		for (int i = 0; i < sb.length; i++) {
			System.out.println(sb[i]);
			System.out.println(sb[i]^keyi);
			System.out.println(sb[i]^keyi^keyi);
			byte b = sb[i];
		}
//		for (int i = 0; i < 20000; i++) {
//			try {
//				robot.click(strong);
//				Thread.sleep(1000);
//				robot.click(voteMark);
//				Thread.sleep(2000);
//				robot.click(vote);
//				ClipboardUtil.setSysClipboardText("用了3年多,没上过一次神评,都是凭运气。我觉得段子有后台,他们会推送那些搞笑的评论,而其他人习惯性地点前面几个");
//				robot.paste(0);
//				Thread.sleep(2000);
//				robot.click(sendVote);
//			} catch (Exception e) {
//				robot.rollDown(1,10);
//			}
//		}
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

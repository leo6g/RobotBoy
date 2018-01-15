package com.leo.robot;

import com.leo.util.BaseRobot;

public class DuanZiBoy {
	private BaseRobot robot = new BaseRobot(50,0.65f,0);
	private BaseRobot robot50 = new BaseRobot(50,0.50f,0);
	private BaseRobot exactRobot = new BaseRobot(50,1.00f,0);
	private String strong = "config/strong.png";
	private String vote = "config/vote.png";
	private String voteMark = "config/voteMark.png";
	private String sendVote = "config/sendVote.png";
	private String backButton = "config/backButton.png";
	private String homeButton = "config/homeButton.png";
	private String taskButton = "config/taskButton.png";
	private String duanxiLogo = "config/duanziLogo.png";
	private String hours = "config/hours.png";
	private int MaxRetryTimes = 10;
	public void voteStrong(){
		boolean isBottom = false;
		int retryTimes =0;
		while(!isBottom){
			boolean clicked =false;
			try {
				robot.click(strong);
				clicked = true;
				if(retryTimes>0){
					retryTimes=0;
				}
				Thread.sleep(100);
			} catch (Exception e) {
				if(robot50.isShow(hours)) break;
				if(!clicked){
					retryTimes++;
					robot.rollDown(1,10);
				}
				if(retryTimes>=MaxRetryTimes){
					isBottom = true;
				}
			}
		}
		try {
			exactRobot.click(backButton);
			Thread.sleep(5000);
			robot.rollDown(1,20);
			robot.click(voteMark);
			Thread.sleep(2000);
			//开启新线程调用 点赞方法
			new Thread(){
				public void run(){
					voteStrong();
				}
			}.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

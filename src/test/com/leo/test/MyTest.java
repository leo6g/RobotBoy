package com.leo.test;

import com.leo.util.BaseRobot;

public class MyTest {
	public static void main(String[] args) {
		/**
		 * 跳一跳 外挂
		 */

//	 	if(嘛哩嘛哩哄){
		
//				跳
		
//		}else{
		
//				也跳
		
//		}
	 	
//	 	波罗波罗蜜。。。。
	 	
		String begin = "config/begin.png";
		String end = "config/end2.png";
		BaseRobot r1 = new BaseRobot(50, 0.6f,10);
		BaseRobot r2 = new BaseRobot(50, 0.6f,10);
		DTMap[] dt = new DTMap[12];
		dt[0]= new DTMap(25.94d,100);
		dt[1]= new DTMap(39.40d,200);
		dt[2]= new DTMap(55.94d,300);
		dt[3]= new DTMap(96.15d,400);
		dt[4]= new DTMap(126.76d,500);
		dt[5]= new DTMap(150.08d,600);
		dt[6]= new DTMap(180.94d,700);
		dt[7]= new DTMap(209.40d,800);
		dt[8]= new DTMap(233.08d,900);
		dt[9]= new DTMap(256.26d,1000);
		dt[10]= new DTMap(263.42d,1100);
		dt[11]= new DTMap(271.42d,1200);
		try {
			Thread.sleep(3500);
			for(int e=0;e<1000;e++){
				System.out.println(".......移动到终点");
				Thread.sleep(3500);
				int[] l1 = r1.getLocation(begin);
				int[] l2 = r2.getLocation(end);
				double distance = Math.sqrt(Math.pow(Math.abs(l1[0]-l2[0]),2)+Math.pow(Math.abs(l1[1]-l2[1]),2));
				int holdTime = getTimeByDistance(distance,dt);
				r1.click(begin, holdTime);
				System.out.println("d="+distance+",t="+holdTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	public static int getTimeByDistance(double distance,DTMap[] dt){
		for(int i =0;i<dt.length;i++){
			if(distance>=dt[i].getDistance()&&distance<=dt[i+1].getDistance()) {
				return (dt[i].getTime()+new Double(((dt[i+1].getTime()-dt[i].getTime())*((distance-dt[i].getDistance())/(dt[i+1].getDistance()-dt[i].getDistance())))).intValue());
			}
		}
		return 0;
	}
}

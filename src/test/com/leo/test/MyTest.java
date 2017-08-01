package com.leo.test;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.leo.util.BaseRobot;
import com.leo.util.ClipboardUtil;

public class MyTest {
	public static void main(String[] args) {
		String strong = "config/strong.png";
		String vote = "config/vote.png";
		String voteMark = "config/voteMark.png";
		String sendVote = "config/sendVote.png";
		try {
//			for(int i= 0;i<8;i++){
//				
//				BaseRobot.click(strong);
//				Thread.sleep(2000);
//			}
			BaseRobot.click(voteMark);
			Thread.sleep(2000);
			BaseRobot.click(vote);
			ClipboardUtil.setSysClipboardText("用了3年多,没上过一次神评,都是凭运气。我觉得段子有后台,他们会推送那些搞笑的评论,而其他人习惯性地点前面几个");
			BaseRobot.paste(0);
			Thread.sleep(2000);
			BaseRobot.click(sendVote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

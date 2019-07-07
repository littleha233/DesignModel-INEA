package washer;

import java.util.Scanner;

//洗衣机定时器客户端
public class WasherTimeSetterClient {
	private Washer washer=new Washer(null);
	
	public void printTime() {
		System.out.println("洗衣机注水器将于"+washer.getTime()[0]+"分钟后停止工作");
		System.out.println("洗衣机滚筒将于"+washer.getTime()[1]+"分钟后停止工作");
	}
	
	public void setTime(String time1, String time2) {		
		washer.setTime(time1, time2);
	}
	
}

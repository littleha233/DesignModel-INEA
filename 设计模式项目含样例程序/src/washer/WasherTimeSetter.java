package washer;

import java.util.Scanner;

//ϴ�»���ʱ����
public class WasherTimeSetter {
	
	WasherZhuShuiQi  washerZhuShuiQi=new WasherZhuShuiQi();
	WasherGunTong    washerGunTong=new WasherGunTong();
	
	public void setTime(String time1, String time2) {		
		washerZhuShuiQi.setTime(time1);
		washerGunTong.setTime(time2);
	}
	
	public String[] getTime() {
		return new String[] {washerZhuShuiQi.getTime(),washerGunTong.getTime()};
	}
		
}

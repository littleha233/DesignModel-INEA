package washer;

import java.util.Scanner;

//ϴ�»���ʱ���ͻ���
public class WasherTimeSetterClient {
	private Washer washer=new Washer(null);
	
	public void printTime() {
		System.out.println("ϴ�»�עˮ������"+washer.getTime()[0]+"���Ӻ�ֹͣ����");
		System.out.println("ϴ�»���Ͳ����"+washer.getTime()[1]+"���Ӻ�ֹͣ����");
	}
	
	public void setTime(String time1, String time2) {		
		washer.setTime(time1, time2);
	}
	
}

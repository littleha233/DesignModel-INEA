package washer;

public class OrdinaryWash implements Wash {
	@Override
	public void washClothes() {
		System.out.println("���ڽ�����ͨϴ");
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("��ͨϴ�ѽ���");
	}
}

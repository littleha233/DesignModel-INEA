package washer;

public class StrongWash implements Wash {
	@Override
	public void washClothes() {
		System.out.println("���ڽ���ǿ��ϴ");
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("ǿ��ϴ�ѽ���");
	}
}

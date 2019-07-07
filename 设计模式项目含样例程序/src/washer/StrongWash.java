package washer;

public class StrongWash implements Wash {
	@Override
	public void washClothes() {
		System.out.println("正在进行强力洗");
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("强力洗已结束");
	}
}

package washer;

public class OrdinaryWash implements Wash {
	@Override
	public void washClothes() {
		System.out.println("正在进行普通洗");
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("普通洗已结束");
	}
}

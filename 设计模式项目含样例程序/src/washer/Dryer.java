package washer;

public class Dryer extends Washer {
	public Dryer(Wash decoratedWash) {
		super(decoratedWash);
	}

	@Override
	public void washClothes() {
		decoratedWash.washClothes();
		setDryer(decoratedWash);
	}

	private  void setDryer(Wash decoratedWash) {
		System.out.println("正在烘干");
		try {  
            Thread.sleep(1500);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("烘干结束");		
	}
}
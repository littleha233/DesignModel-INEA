package cookingsystem;

public class BigFire implements Fire{

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		System.out.println("大火加热了"+String.valueOf(time)+"分钟");
	}
	static BigFire bigFire=new BigFire();
	
	static BigFire getInstance() {
		return bigFire;
	}
	
}

package cookingsystem;

public class BigFire implements Fire{

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		System.out.println("��������"+String.valueOf(time)+"����");
	}
	static BigFire bigFire=new BigFire();
	
	static BigFire getInstance() {
		return bigFire;
	}
	
}

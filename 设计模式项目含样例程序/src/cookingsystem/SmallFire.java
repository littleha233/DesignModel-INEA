package cookingsystem;

public class SmallFire implements Fire {

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		System.out.println("小火加热了"+String.valueOf(time)+"分钟");
	}

	static SmallFire smallFire=new SmallFire();
	
	static SmallFire getInstance() {
		return smallFire;
	}
}

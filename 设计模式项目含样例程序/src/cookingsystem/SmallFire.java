package cookingsystem;

public class SmallFire implements Fire {

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		System.out.println("С�������"+String.valueOf(time)+"����");
	}

	static SmallFire smallFire=new SmallFire();
	
	static SmallFire getInstance() {
		return smallFire;
	}
}

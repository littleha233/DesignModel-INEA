package cookingsystem;

public class MediumFire implements Fire{

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		System.out.println("中火加热了"+String.valueOf(time)+"分钟");
	}
	static MediumFire mediumFire=new MediumFire();
	
	static MediumFire getInstance() {
		return mediumFire;
	}

}

package cookingsystem;

public class MediumFire implements Fire{

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		System.out.println("�л������"+String.valueOf(time)+"����");
	}
	static MediumFire mediumFire=new MediumFire();
	
	static MediumFire getInstance() {
		return mediumFire;
	}

}

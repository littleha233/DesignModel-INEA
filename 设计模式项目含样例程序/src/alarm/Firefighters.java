package alarm;

public class Firefighters extends Observer {//Observer�࣬����Ա���յ�������������������

	public Firefighters(Alarm alarm) {
		super(alarm);
	}

	@Override
	public void update() {
		System.out.println("���ܼҾ�ϵͳ�Ѳ���119��");
	}

}

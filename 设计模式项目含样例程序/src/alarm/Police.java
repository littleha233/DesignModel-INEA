package alarm;

public class Police extends Observer {//Observer�࣬���죬���յ���������������������

	public Police(Alarm alarm) {
		super(alarm);
	}

	@Override
	public void update() {
		System.out.println("���ܼҾ�ϵͳ�Ѳ���110��");
	}

}

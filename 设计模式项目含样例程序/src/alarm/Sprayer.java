package alarm;

public class Sprayer extends Observer {//���������ˮ�������յ�����������Smoke_Alarm)��������ˮ

	public Sprayer(Alarm alarm) {
		super(alarm);
	}
	
	@Override
	public void update() {
		System.out.println("�����Զ������ˮ����ʼ��ˮ��");
	}
	
}

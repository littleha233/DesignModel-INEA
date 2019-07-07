package alarm;

public class Firefighters extends Observer {//Observer类，消防员，收到烟雾报警器报警后运作

	public Firefighters(Alarm alarm) {
		super(alarm);
	}

	@Override
	public void update() {
		System.out.println("智能家居系统已拨打119！");
	}

}

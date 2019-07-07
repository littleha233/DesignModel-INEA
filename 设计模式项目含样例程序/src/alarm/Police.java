package alarm;

public class Police extends Observer {//Observer类，警察，在收到防盗报警器报警后运作

	public Police(Alarm alarm) {
		super(alarm);
	}

	@Override
	public void update() {
		System.out.println("智能家居系统已拨打110！");
	}

}

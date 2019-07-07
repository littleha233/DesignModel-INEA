package alarm;

public class Sprayer extends Observer {//室内灭火洒水器，在收到烟雾报警器（Smoke_Alarm)警报后洒水

	public Sprayer(Alarm alarm) {
		super(alarm);
	}
	
	@Override
	public void update() {
		System.out.println("室内自动灭火洒水器开始喷水！");
	}
	
}

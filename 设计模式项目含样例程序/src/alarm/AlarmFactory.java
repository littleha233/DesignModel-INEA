package alarm;

public class AlarmFactory {//����Alarm��Ĺ���
	
	public static Alarm getAlarm(String type) {//������������Alarm��
		if (type.equalsIgnoreCase("Smoke")) {
			Alarm ins = new Smoke_Alarm();
			new Firefighters(ins);
			new Sprayer(ins);
			return ins;
		}
		else if (type.equalsIgnoreCase("Burglar")) {
			Alarm ins = new Burglar_Alarm();
			new Police(ins);
			return ins;
		}
		return null;
	};
	
}

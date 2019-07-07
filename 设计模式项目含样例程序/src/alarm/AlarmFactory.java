package alarm;

public class AlarmFactory {//制作Alarm类的工厂
	
	public static Alarm getAlarm(String type) {//根据名字制作Alarm类
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

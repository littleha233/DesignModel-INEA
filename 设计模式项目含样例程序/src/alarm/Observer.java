package alarm;


public abstract class Observer {
	//Observer∏∏¿‡
	public Observer(Alarm alarm) {
		this.alarm = alarm;
		this.alarm.attach(this);
	}

    public Alarm alarm;
    public abstract void update() ;
}


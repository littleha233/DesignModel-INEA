package light;

import appliance.Appliance;

public abstract class Lights extends Appliance{//电灯抽象类

	public abstract void setMode(String _mode);//设置发光模式
	public abstract Boolean Check();//检查损坏
	public abstract Lights search(String _name);//查找
	public abstract void view();//展示电灯工作信息
}

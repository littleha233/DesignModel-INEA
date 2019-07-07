package light;
public class Bulb extends Lights {//电灯类，Lights的子类

	
	private String mode="normal";//初始模式为normal
	private LightMode lightMode;//发光模式
	public Boolean availability;//灯泡是否可工作，默认true，可正常工作
	public Bulb(String _name) {
		name=_name;
		power=5;//功率
		availability=true;
		state=State.working;
	}
	
	public String getName()
	{
		return name;
	}
	public State getState()
	{
		return state;
	}
	public int getPower()
	{
		return power;
	}
	public Boolean usedBy(String user)
	{
		return true;
	}
	public void open()
	{
		state=State.working;
		System.out.println(name+"已通电");
	}
	public void work()
	{
		if(availability)
		{
			System.out.println(name+"已开始工作，发光模式为"+mode);
		}
		else System.out.println(name+"已损坏");
	}
	public void close()
	{
		state=State.free;
		System.out.println(name+"已关闭");
	}

	@Override
	public Boolean Check() {//判断是否损坏
		// TODO 自动生成的方法存根
		if(!availability)
		{
			System.out.println(this.getName()+"已损坏");
			return false;
		}
		else return true;
	}

	@Override
	public void setMode(String _mode) {//利用策略模式进行发光模式变换
		// TODO 自动生成的方法存根
		if(availability)
		{
			if(_mode=="hard")
			{
				lightMode=new HardLightMode();
				lightMode.setMode(this.getName());
				mode=_mode;
			}
			else if(_mode=="normal")
			{
				lightMode=new NormalLightMode();
				lightMode.setMode(this.getName());
				mode=_mode;
			}
			else if(_mode=="gentle")
			{
				lightMode=new NormalLightMode();
				lightMode.setMode(this.getName());
				mode=_mode;
			}
		}
	}

	@Override
	public Lights search(String _name) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void view() {//展示电灯工作状态
		// TODO 自动生成的方法存根
		if(state==State.free)
			System.out.println(getName()+"未启动");
		else if(state==State.working)
		{
			if(mode=="hard")
			{
				System.out.println(getName()+"已开启，为强光模式");
			}
			else if(mode=="normal")
			{
				System.out.println(getName()+"已开启，为普通模式");
			}
			else if(mode=="gentle")
			{
				System.out.println(getName()+"已开启，为柔光模式");
			}
		}
			
	}
	

}

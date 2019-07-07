package light;
public class Bulb extends Lights {//����࣬Lights������

	
	private String mode="normal";//��ʼģʽΪnormal
	private LightMode lightMode;//����ģʽ
	public Boolean availability;//�����Ƿ�ɹ�����Ĭ��true������������
	public Bulb(String _name) {
		name=_name;
		power=5;//����
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
		System.out.println(name+"��ͨ��");
	}
	public void work()
	{
		if(availability)
		{
			System.out.println(name+"�ѿ�ʼ����������ģʽΪ"+mode);
		}
		else System.out.println(name+"����");
	}
	public void close()
	{
		state=State.free;
		System.out.println(name+"�ѹر�");
	}

	@Override
	public Boolean Check() {//�ж��Ƿ���
		// TODO �Զ����ɵķ������
		if(!availability)
		{
			System.out.println(this.getName()+"����");
			return false;
		}
		else return true;
	}

	@Override
	public void setMode(String _mode) {//���ò���ģʽ���з���ģʽ�任
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public void view() {//չʾ��ƹ���״̬
		// TODO �Զ����ɵķ������
		if(state==State.free)
			System.out.println(getName()+"δ����");
		else if(state==State.working)
		{
			if(mode=="hard")
			{
				System.out.println(getName()+"�ѿ�����Ϊǿ��ģʽ");
			}
			else if(mode=="normal")
			{
				System.out.println(getName()+"�ѿ�����Ϊ��ͨģʽ");
			}
			else if(mode=="gentle")
			{
				System.out.println(getName()+"�ѿ�����Ϊ���ģʽ");
			}
		}
			
	}
	

}

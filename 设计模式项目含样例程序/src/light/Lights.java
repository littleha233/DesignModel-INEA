package light;

import appliance.Appliance;

public abstract class Lights extends Appliance{//��Ƴ�����

	public abstract void setMode(String _mode);//���÷���ģʽ
	public abstract Boolean Check();//�����
	public abstract Lights search(String _name);//����
	public abstract void view();//չʾ��ƹ�����Ϣ
}

package appliance;

import java.util.ArrayList;

public class Appliance {
	
	//���Բ��֡���������������
	public String name;
	
	public enum State{
		//״̬Ϊ���� ������ ��
		free, working, broken
	}
	
	//����״̬
	public State state;
	
	//��������
	public int power;
	
	//��ʵ�����ĵ����б�
    ArrayList<Appliance> applianceList=new ArrayList<Appliance>();
	
	
	//�������֡�����������������
	
	//��ȡ�����������
    public String getName() {
    	return name;
    }
	
	//��ȡ������״̬
	public State getState()
	{
		return state;
	}
	
	//��ȡ����������
	public int getPower()
	{
		return power;
	}
	
	//��������ж�ʹ�����Ƿ���Ȩ��ʹ�õ���
	public Boolean usedBy() {
		return false;
	}
	
	//�򿪵���
	public void open() {
		//����״̬�ı�Ϊworking
	}
	
	//�������о��巽��
	public void work() {
		//ʵ�ֶ��ض������ľ������
		//�ο�������ʵ�ֵ������е��������
	}
	
	//�رյ���
	public void close() {
		//����״̬�ı��free
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
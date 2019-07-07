package light;
import java.util.*;

public class BulbSet extends Lights {//������࣬��ʾĳһ�����Ƶľۺ��Lights������

	public ArrayList<Lights> set=new ArrayList<Lights>();//���Lights��ArrayList
	
	public BulbSet(String _name)
	{
		
		name=_name;
		state=State.free;
	}

	public String getName()
	{
		return name;
	}
	public State getState()
	{
		return state;
	}
	public Boolean usedBy(String user)
	{
		return true;
	}
	public int getPower()//���õ������ݹ������ô˵����Ĺ��ʺ�
	{
		int tempPower = 0;
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			tempPower+=light.getPower();
			
		}
		return tempPower;
	}
	
	public void open()//���õ������ݹ��������������������Ԫ�ص�open����
	{

		state=State.working;
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.open();
		}
	}
	public void work()//���õ������ݹ��������������������Ԫ�ص�work����
	{
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.work();
		}
	}
	public void close()//���õ������ݹ��������������������Ԫ�ص�close����
	{
		Iterator<Lights> it=set.iterator();
		state=State.free;
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.close();
		}
	}

	public void add(Lights light)//��ArrayList���Ԫ��
	{
		set.add(light);
	}
	@Override
	public  void setMode(String _mode) {//���õ������ݹ����Ϊ������������Ԫ�ص����÷���ģʽ
		// TODO �Զ����ɵķ������
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.setMode(_mode);
		}
	}

	@Override
	public Boolean Check() {//���õ������ݹ����Ϊ������������Ԫ���Լ����
		
		// TODO �Զ����ɵķ������
		Boolean flag=true;
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			if(light.Check()==false)
			{
				flag= false;
			}
			
		}
		return flag;
	}
	
	@Override
	public void view()//���õ������ݹ����Ϊ������������Ԫ����չʾ�����Ϣ
	{
		// TODO �Զ����ɵķ������
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.view();
		}
	}
	
	public Lights findByOrder(int order)//��������ҵ�ָ���飬���ڽ�������
	{
		if(order<set.size())
		{
			return set.get(order-1);
		}
		else return null;
	}
	public Lights search(String _name)//����ָ��Ԫ��
	{
		
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			if(light.getName()==_name)
			{
				return light;
			}
			else light.search(_name);
		}
		return null;
	}
	
	public void print()//չʾ��ѡ����飬���ڽ�������
	{
		int i=1;
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			
			System.out.println("["+i+"]"+light.getName()+"  ");
			i++;
		}
	}
	
	

}

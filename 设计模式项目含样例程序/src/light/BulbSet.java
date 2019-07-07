package light;
import java.util.*;

public class BulbSet extends Lights {//电灯组类，表示某一区域电灯的聚合物，Lights的子类

	public ArrayList<Lights> set=new ArrayList<Lights>();//存放Lights的ArrayList
	
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
	public int getPower()//利用迭代器递归遍历求得此电灯组的功率和
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
	
	public void open()//利用迭代器递归遍历调用这个电灯组所有元素的open函数
	{

		state=State.working;
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.open();
		}
	}
	public void work()//利用迭代器递归遍历调用这个电灯组所有元素的work函数
	{
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.work();
		}
	}
	public void close()//利用迭代器递归遍历调用这个电灯组所有元素的close函数
	{
		Iterator<Lights> it=set.iterator();
		state=State.free;
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.close();
		}
	}

	public void add(Lights light)//向ArrayList添加元素
	{
		set.add(light);
	}
	@Override
	public  void setMode(String _mode) {//利用迭代器递归遍历为这个电灯组所有元素的设置发光模式
		// TODO 自动生成的方法存根
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.setMode(_mode);
		}
	}

	@Override
	public Boolean Check() {//利用迭代器递归遍历为这个电灯组所有元素以检查损坏
		
		// TODO 自动生成的方法存根
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
	public void view()//利用迭代器递归遍历为这个电灯组所有元素以展示电灯信息
	{
		// TODO 自动生成的方法存根
		Iterator<Lights> it=set.iterator();
		while(it.hasNext())
		{
			Lights light=(Lights) it.next();
			light.view();
		}
	}
	
	public Lights findByOrder(int order)//根据序号找到指定组，用于交互界面
	{
		if(order<set.size())
		{
			return set.get(order-1);
		}
		else return null;
	}
	public Lights search(String _name)//搜索指定元素
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
	
	public void print()//展示可选电灯组，用于交互界面
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

package light;

import java.util.Scanner;

import appliance.Appliance;

public class LightsTerminal extends Appliance{//电灯控制终端，作为一个电器
	private static LightsTerminal instance;//单例模式
	public LightsTerminal() {}
	
	public static LightsTerminal getInstance() {
		if(instance==null)
		{
			instance=new LightsTerminal();
		}
		return instance;
	}
	
	
	private BulbSet bulbSet=new BulbSet("root");//一个根电灯组，表示整个家
	private Lights current=bulbSet;
	private Boolean initCheck=false;
	
	public void init()//初始化函数
	{
		name="电灯控制终端";
		state=State.free;
		BulbSet livingroom=new BulbSet("客厅");
		BulbSet bedroom=new BulbSet("卧室");
		BulbSet diningroom=new BulbSet("饭厅");
		BulbSet kitchen=new BulbSet("厨房");
		Bulb l1=new Bulb("客厅大灯");
		Bulb l2=new Bulb("客厅背灯");
		Bulb l3=new Bulb("客厅壁灯");
		Bulb l4=new Bulb("客厅吊顶灯");
		Bulb b1=new Bulb("卧室大灯");
		Bulb b2=new Bulb("卧室台灯");
		Bulb d1=new Bulb("饭厅大灯");
		d1.availability=false;
		Bulb d2=new Bulb("饭厅壁灯");
		Bulb k1=new Bulb("厨房大灯");
		Bulb k2=new Bulb("厨房壁灯");
		livingroom.add(l1);
		livingroom.add(l2);
		livingroom.add(l3);
		livingroom.add(l4);
		bedroom.add(b1);
		bedroom.add(b2);
		diningroom.add(d1);
		diningroom.add(d2);
		kitchen.add(k1);
		kitchen.add(k2);
		bulbSet.add(livingroom);
		bulbSet.add(bedroom);
		bulbSet.add(diningroom);
		bulbSet.add(kitchen);
		initCheck=true;
		power=bulbSet.getPower();//利用BulbSet的getPower函数获得总功率

	}
	public String getName()
	{
		return name;
	}
	public State getState() 
	{
		return state;
	}
	public int Power()
	{
		return bulbSet.getPower();
	}
	public Boolean usedBy(String user)
	{
		return true;
	}
	public void open()
	{
		bulbSet.open();
		state=State.working;
		System.out.println("灯光控制中心启动！");
	}
	public void work()
	{
		init();
		if(initCheck)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("欢迎使用灯光控制系统！是否通电?[1]是 [2]否");
			int choice1=scanner.nextInt();
			if(choice1==1)
			{
				open();
				while(true)
				{
					System.out.println("请选择操作：[1]控制电灯 [2]检查故障 [3]查看当前所有灯泡状态 [4]退出（断电）");
					int choice2=scanner.nextInt();
					if(choice2==1)
					{
						System.out.println("当前系统内所有电灯组如下：");
						bulbSet.print();
						System.out.println("请输入要操控的电灯组的序号：");
						int sets=scanner.nextInt();
						current=bulbSet.findByOrder(sets);
						if(current!=null)
						{
							System.out.println("请选择操作：[1]强光模式 [2]普通模式 [3]柔光模式 [4]关闭电灯 [5]查看当前所有灯泡状态 ");
							int choice3=scanner.nextInt();
							if(choice3==1)
							{
								if(current.getState()==State.free)
								{
									current.open();
								}
								current.setMode("hard");
								current.work();
							}
							else if(choice3==2)
							{
								if(current.getState()==State.free)
								{
									current.open();
								}
								current.setMode("normal");
								current.work();
							}
							else if(choice3==3)
							{
								if(current.getState()==State.free)
								{
									current.open();
								}
								current.setMode("gentle");
								current.work();
							}
							else if(choice3==4)
							{
								current.close();
							}
							else if(choice3==5)
							{
								bulbSet.view();
							}
							
						}
						else System.out.println("输入错误");
						
					}
					else if(choice2==2)
					{
						if(bulbSet.Check())
						{
							System.out.println("没有损坏的灯泡");
						}
					}
					else if(choice2==3)
					{
						bulbSet.view();
					}
					else if(choice2==4)
					{
						break;
					}
				}
				
				
			}
			else {
				System.out.println("灯光系统未通电，已退出");
				
			}
		}
		else System.out.println("灯光系统未初始化，已退出");
		
	}
	public void close()
	{
		bulbSet.close();
		state=State.free;
	}
	

}

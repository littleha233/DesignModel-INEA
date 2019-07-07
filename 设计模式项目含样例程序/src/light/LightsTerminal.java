package light;

import java.util.Scanner;

import appliance.Appliance;

public class LightsTerminal extends Appliance{//��ƿ����նˣ���Ϊһ������
	private static LightsTerminal instance;//����ģʽ
	public LightsTerminal() {}
	
	public static LightsTerminal getInstance() {
		if(instance==null)
		{
			instance=new LightsTerminal();
		}
		return instance;
	}
	
	
	private BulbSet bulbSet=new BulbSet("root");//һ��������飬��ʾ������
	private Lights current=bulbSet;
	private Boolean initCheck=false;
	
	public void init()//��ʼ������
	{
		name="��ƿ����ն�";
		state=State.free;
		BulbSet livingroom=new BulbSet("����");
		BulbSet bedroom=new BulbSet("����");
		BulbSet diningroom=new BulbSet("����");
		BulbSet kitchen=new BulbSet("����");
		Bulb l1=new Bulb("�������");
		Bulb l2=new Bulb("��������");
		Bulb l3=new Bulb("�����ڵ�");
		Bulb l4=new Bulb("����������");
		Bulb b1=new Bulb("���Ҵ��");
		Bulb b2=new Bulb("����̨��");
		Bulb d1=new Bulb("�������");
		d1.availability=false;
		Bulb d2=new Bulb("�����ڵ�");
		Bulb k1=new Bulb("�������");
		Bulb k2=new Bulb("�����ڵ�");
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
		power=bulbSet.getPower();//����BulbSet��getPower��������ܹ���

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
		System.out.println("�ƹ��������������");
	}
	public void work()
	{
		init();
		if(initCheck)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("��ӭʹ�õƹ����ϵͳ���Ƿ�ͨ��?[1]�� [2]��");
			int choice1=scanner.nextInt();
			if(choice1==1)
			{
				open();
				while(true)
				{
					System.out.println("��ѡ�������[1]���Ƶ�� [2]������ [3]�鿴��ǰ���е���״̬ [4]�˳����ϵ磩");
					int choice2=scanner.nextInt();
					if(choice2==1)
					{
						System.out.println("��ǰϵͳ�����е�������£�");
						bulbSet.print();
						System.out.println("������Ҫ�ٿصĵ�������ţ�");
						int sets=scanner.nextInt();
						current=bulbSet.findByOrder(sets);
						if(current!=null)
						{
							System.out.println("��ѡ�������[1]ǿ��ģʽ [2]��ͨģʽ [3]���ģʽ [4]�رյ�� [5]�鿴��ǰ���е���״̬ ");
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
						else System.out.println("�������");
						
					}
					else if(choice2==2)
					{
						if(bulbSet.Check())
						{
							System.out.println("û���𻵵ĵ���");
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
				System.out.println("�ƹ�ϵͳδͨ�磬���˳�");
				
			}
		}
		else System.out.println("�ƹ�ϵͳδ��ʼ�������˳�");
		
	}
	public void close()
	{
		bulbSet.close();
		state=State.free;
	}
	

}

package appliance;

import java.util.*;

import airconditioner.AirConditioner;
import alarm.Alarm;
import appliance.Appliance.State;
import cookingsystem.Cook;
import fishtank.Fishtank;
import light.Bulb;
import light.LightsTerminal;
import refrigerator.Refrigerator;
import robotcleaner.Robotcleaner;
import scrubbers.Armchair;
import television.Television;
import washer.StrongWash;
import washer.Washer;



//次数使用到了单例模式--冯濛
public class SingleSystemControl {
	
	//创建唯一的一个对象
	private static SingleSystemControl instance=new SingleSystemControl();
	
	//构造函数
	private SingleSystemControl() {}
	
	//获取唯一可使用的对象
	public static SingleSystemControl getInstance() {
		return instance;
	}
	
	//显示菜单控制信息
	public void showControlPlat() {
		
    	System.out.println("***********************");
    	System.out.println("[0]查看当前电器使用情况");
    	System.out.println("[1]电视机");
    	System.out.println("[2]智能做饭系统");
    	System.out.println("[3]空调");
    	System.out.println("[4]洗衣机");
    	System.out.println("[5]冰箱");
    	System.out.println("[6]扫地机器人");
    	System.out.println("[7]智能鱼缸");
    	System.out.println("[8]报警器");
    	System.out.println("[9]按摩仪");
    	System.out.println("[10]智能电灯");
    	System.out.println("[11]退出访客模式");
    	System.out.println("**********************");
    	System.out.println("请输入你的指令:");
	}
	
	//设置命令
	public int order =-1;
	public void setOrder(int order) {
		this.order=order;
	}
	
	//存储正在使用的电器信息
	ArrayList<Appliance> list=new ArrayList<>();
	//根据命令执行相应的操作
	public void excuteOrder() throws java.util.NoSuchElementException{
		switch(order) {
		case 0:
			//查看当前电器的使用情况
			System.out.println("名称              状态          功率 ");
			for(int i=0;i<list.size();i++) {
				String name=String.format("%-10s", list.get(i).getName());
				State state=list.get(i).getState();
				String state1=state.toString();
				String state2=String.format("%-10s", state1);
				int power=list.get(i).getPower();
				System.out.println(name+" "+state2+" "+power);
			}			
			break;
		case 1:
			//电视机
			Television television=new Television();
			television.work();
			list.add(television);;
		    break;
		case 2:
			//做饭系统
			Cook cook=new Cook();
			list.add(cook);
			cook.work();
			break;
		case 3:
			//空调
			AirConditioner airConditioner=new AirConditioner();
			list.add(airConditioner);
			airConditioner.work();
			break;
		case 4:
			//洗衣机
			Washer washer =new Washer(new StrongWash());
			list.add(washer);
			washer.work();
			break;
			//Washer washer=new Washer(null);
			
		case 5:
			//调用冰箱
			Refrigerator refrigerator=new Refrigerator();
			list.add(refrigerator);
			refrigerator.work();
			break;
		case 6://扫地机器人
			Robotcleaner robotcleaner=new Robotcleaner();
			list.add(robotcleaner);
			robotcleaner.work();
			break;
		case 7:
			Fishtank fishtank=new Fishtank();
			fishtank.work();
			break;
		case 8:
			//报警器
			Alarm alarm=new Alarm();
			list.add(alarm);
			alarm.work();
			break;
		case 9:
			 Armchair armchair=new  Armchair();
			 armchair.work();
			break;
		case 10:
		    //智能电灯
			LightsTerminal lightsTerminal=new LightsTerminal();
			list.add(lightsTerminal);
			lightsTerminal.work();
			break;
		case 11:			
			System.out.println("已退出访客模式！");
			break;
		default:
			break;
		}
	}
    	

}

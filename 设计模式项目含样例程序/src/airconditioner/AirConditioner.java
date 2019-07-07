package airconditioner;

import java.util.Scanner;

import appliance.Appliance;
import appliance.Appliance.State;

public class AirConditioner extends Appliance{
	
	Dehumidifier dehumidifier;
	HeatExchanger heatExchanger;
	Refrigerators refrigerators;
	
	Run run;
	
	Integer temperature;
	
	private String name="空调";
	public String getName() {
		return name;
	}
	private State state=State.working;
	public State getState() {
		return state;
	}
	private int power=14;
	public int getPower() {
		return power;
	}
	
	public AirConditioner() {
		// TODO Auto-generated constructor stub
		dehumidifier=new Dehumidifier();
		heatExchanger=new HeatExchanger();
		refrigerators=new Refrigerators();
		temperature=25;
		run=new Run(refrigerators,temperature);//默认25度制冷
		System.out.println("创建新空调");
	}

	public boolean usedBy(String user) {
		// TODO Auto-generated method stub
		if (user.equals("child")) {
			return false;
		}
		else if (user.equals("father")||user.equals("mother")) {
			return true;
		}
		else {
			System.out.println("错误的使用者： "+user);
			return false;
		}
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		state=State.working;
		System.out.println("空调已通电");
	}

	
	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		if (!state.equals(State.working)) {
			System.out.println("请给空调通电");
		}
		System.out.println("空调打开");
		Scanner scanner=new Scanner(System.in);
		int j;
		do {
			System.out.println("请选择操作");
			System.out.println("[1]改变模式");
			System.out.println("[2]改变温度");
			System.out.println("[3]退出");
			
			j=scanner.nextInt();
			if (j==1) {
				changeMode();
			}
			else if (j==2) {
				changeTemperature();
			}
		}while(j!=3);
	}
	
	public void changeMode() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请选择空调模式");
		System.out.println("[1]制冷");
		System.out.println("[2]制热");
		System.out.println("[3]除湿");
		int type;
		type=scanner.nextInt();
		if (type==1) {
			run=new Run(refrigerators,temperature);
		}
		else if (type==2) {
			run=new Run(heatExchanger,temperature);
		}
		else {
			run=new Run(dehumidifier,temperature);
		}
		//scanner.close();
		run.running();
	}

	public void changeTemperature() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入需要调节的空调温度（15-30）");
		temperature=scanner.nextInt();
		run.setTemperature(temperature);
		run.running();
		//scanner.close();
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		state=State.free;
		System.out.println("空调断电");
	}
	
	
}

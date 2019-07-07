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
	
	private String name="�յ�";
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
		run=new Run(refrigerators,temperature);//Ĭ��25������
		System.out.println("�����¿յ�");
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
			System.out.println("�����ʹ���ߣ� "+user);
			return false;
		}
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		state=State.working;
		System.out.println("�յ���ͨ��");
	}

	
	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		if (!state.equals(State.working)) {
			System.out.println("����յ�ͨ��");
		}
		System.out.println("�յ���");
		Scanner scanner=new Scanner(System.in);
		int j;
		do {
			System.out.println("��ѡ�����");
			System.out.println("[1]�ı�ģʽ");
			System.out.println("[2]�ı��¶�");
			System.out.println("[3]�˳�");
			
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
		System.out.println("��ѡ��յ�ģʽ");
		System.out.println("[1]����");
		System.out.println("[2]����");
		System.out.println("[3]��ʪ");
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
		System.out.println("��������Ҫ���ڵĿյ��¶ȣ�15-30��");
		temperature=scanner.nextInt();
		run.setTemperature(temperature);
		run.running();
		//scanner.close();
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		state=State.free;
		System.out.println("�յ��ϵ�");
	}
	
	
}

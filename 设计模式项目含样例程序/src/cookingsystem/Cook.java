package cookingsystem;

import java.util.Scanner;

import appliance.Appliance;
import appliance.Appliance.State;

public class Cook extends Appliance  {

	
	private MealBuilder mealBuilder;
	
	
	public Cook() {
		mealBuilder = new MealBuilder();
		System.out.println("����������ϵͳ");
		
	}
	
	
	
	private String name="����ϵͳ";
	public String getName() {
		return name;
	}
	private State state=State.working;
	public State getState() {
		return state;
	}
	private int power=200;
	public int getPower() {
		return power;
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
		state=State.working;
		System.out.println("����ϵͳͨ��");
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void work() {
		if (!state.equals(State.working)) {
			System.out.println("�������ϵͳͨ��");
		}
		Scanner scanner=new Scanner(System.in);
		int j;
		do {
			System.out.println("��ѡ�����");
			System.out.println("[1]�����ײ�");
			System.out.println("[2]���ȵ�Ʒ");
			System.out.println("[3]�˳�");
			j=scanner.nextInt();
			if (j==1) {
				makeSet();
			}
			else if (j==2) {
				heating();
			}
		}while(j!=3);
		
		
		//scanner.close();
		// TODO Auto-generated method stub
		
	}
	
	private void heating() {
		int heatingTime,heatingType;
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������ʱ�䣨1-60��");
		heatingTime=scanner.nextInt();
		System.out.println("���������ģʽ");
		System.out.println("[1]С��");
		System.out.println("[2]�л�");
		System.out.println("[3]���");
		heatingType=scanner.nextInt();
		FunctionAdapter adapter=new FunctionAdapter(heatingType) {
		};
		adapter.heating(heatingTime);
		System.out.println("�������");
	}
	
	private void makeSet() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("��ѡ���ײ�����");
		System.out.println("[1]���+����+ţ��");
		System.out.println("[2]�׷�+�ײ�+����");
		System.out.println("[3]ը��+����+����");
		int type;
		type=scanner.nextInt();
		Meal meal = null;
		
		if (type==1) {
			meal=mealBuilder.set1();
		}
		else if (type==2) {
			meal=mealBuilder.set2();
		}
		else if (type==3) {
			meal=mealBuilder.set3();
		}
		meal.eatFoods();
	}
	
	

	@Override
	public void close() {
		state=State.free;
		System.out.println("����ϵͳ�ϵ�");
		// TODO Auto-generated method stub
		
	}
	
	

	
}

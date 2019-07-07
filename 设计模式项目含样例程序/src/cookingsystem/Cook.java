package cookingsystem;

import java.util.Scanner;

import appliance.Appliance;
import appliance.Appliance.State;

public class Cook extends Appliance  {

	
	private MealBuilder mealBuilder;
	
	
	public Cook() {
		mealBuilder = new MealBuilder();
		System.out.println("创建新做饭系统");
		
	}
	
	
	
	private String name="做饭系统";
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
			System.out.println("错误的使用者： "+user);
			return false;
		}
	}

	@Override
	public void open() {
		state=State.working;
		System.out.println("做饭系统通电");
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void work() {
		if (!state.equals(State.working)) {
			System.out.println("请给做饭系统通电");
		}
		Scanner scanner=new Scanner(System.in);
		int j;
		do {
			System.out.println("请选择操作");
			System.out.println("[1]制作套餐");
			System.out.println("[2]加热单品");
			System.out.println("[3]退出");
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
		System.out.println("请输入加热时间（1-60）");
		heatingTime=scanner.nextInt();
		System.out.println("请输入加热模式");
		System.out.println("[1]小火");
		System.out.println("[2]中火");
		System.out.println("[3]大火");
		heatingType=scanner.nextInt();
		FunctionAdapter adapter=new FunctionAdapter(heatingType) {
		};
		adapter.heating(heatingTime);
		System.out.println("加热完成");
	}
	
	private void makeSet() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("请选择套餐类型");
		System.out.println("[1]面包+鸡蛋+牛奶");
		System.out.println("[2]米饭+白菜+猪排");
		System.out.println("[3]炸鸡+汉堡+可乐");
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
		System.out.println("做饭系统断电");
		// TODO Auto-generated method stub
		
	}
	
	

	
}

package refrigerator;

import java.util.*;

import appliance.Appliance;


public class Refrigerator extends Appliance implements Container {

	// 存放食物
	public String foodNames[] = {"橘子","橙子","蓝莓","苹果","香蕉"};

	
	// 冰箱的属性
	private String name="冰箱";
	
	public State state = State.free; // 状态

	private int power = 20;// 功率

    public static int Room=20;//冰箱容积

	public int temperature = 0;// 当前温度

	public String workstate;// 冷藏或者是冷冻状态

	// 方法

	public void open() { // 启动
		// TODO Auto-generated method stub
		System.out.println("冰箱已启动！");
		state = State.working;
	}

	public void openRefri() // 打开冰箱门
	{
		System.out.println("冰箱门已打开!");
	}

	
	// 总览冰箱食物
	public void getFood(){
		   Refrigerator refrigerator=new Refrigerator();
		   
		   System.out.println("食物是：");
		    
		    for(MyIterator iter=refrigerator.getIterator();iter.hasNext();) {
		    	String name=(String)iter.next();
		    	System.out.println(name);
		    }
	}
	
	
	//迭代器相关部分
	@Override 
	public MyIterator getIterator() {
		return new RefrigeratorIterator();
	}
	
	private class RefrigeratorIterator implements MyIterator{
		int index;
		
		@Override
		public boolean hasNext() {
			if(index<foodNames.length) {
				return true;
			}
			return false;			
		}
		
		@Override
		public Object next() {
			if(this.hasNext()) {
				return foodNames[index++];
			}
			return null;
		}		
	}

	
	//选择饮料类型
	public void ChooseDrinkType() {
		
		AbstractFoodFactory drinkFactory=FoodFactoryProducer.getFactory("drink");
		System.out.println("你可以选择[1]冷饮 [2]常温饮料");
		
		Scanner scanner = new Scanner(System.in);
		int drinkChoice=scanner.nextInt();
		if(drinkChoice==1) {
			Drink drink1=drinkFactory.getType("Cold");
			drink1.show();
		}
		else if(drinkChoice==2) {
			Drink drink1=drinkFactory.getType("Warm");
			drink1.show();
		}
		
	}
	
	
	//选择水果类型
	public void ChooseFruitType() {
		
		AbstractFoodFactory fruitFactory=FoodFactoryProducer.getFactory("fruit");
		System.out.println("你可以选择[1]苹果 [2]香蕉");
		
		Scanner scanner = new Scanner(System.in);
		int fruitChoice=scanner.nextInt();
		if(fruitChoice==1) {
			Fruit fruit1=fruitFactory.getFruitType("Apple");
			fruit1.display();
		}
		else if(fruitChoice==2) {
			Fruit fruit2=fruitFactory.getFruitType("Banana");
			fruit2.display();
		}
		
	}
	
	
	// 设置冰箱工作状态--冷冻或冷藏
	public void SetRefrigeratorWorkstate() {
		System.out.println("请选择一种工作模式：[1]冷冻  [2]冷藏");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			workstate = "冷冻";
			System.out.println("现在冰箱已设置为冷冻状态！");
		}
		if (choice == 2) {
			workstate = "冷藏";
			System.out.println("现在冰箱已设置为冷藏状态！");
		}
	}

	// 关闭冰箱门
	public void closeRefri() {
		System.out.println("冰箱门已关闭！");
	}

	// 关掉冰箱，停止工作
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("冰箱已停止工作！");
		state = State.free;
	}
//------------------------------------------------------------------------

	//获取名字
	public String getName() {
		System.out.println("冰箱");
		return name;
	}
	
	//获取冰箱功率
	public int getPower() {
		System.out.println("冰箱功率是"+power);
		return power;
	}
//获取冰箱状态
	public State getstate() {
		System.out.println("状态是" + state);
		return state;
	}

	// 获取工作状态
	public void GetRefrigeratorWorkstate() {
		System.out.println("当前工作状态是:" + workstate);
	}
	

	// 电器使用权限
	public Boolean usedBy(String identity) {
		return true;		
	}
	
	//展示冰箱功能菜单
	public void showRefriMenu() {
		System.out.println("请选择你的操作:\n"
				+ "[1]总览冰箱食物\n"
				+ "[2]选择冷冻或冷藏\n"
				+ "[3]选择饮料\n"
				+ "[4]选择水果\n"
				+ "[0]退出");
	}

	// 冰箱的工作流程
	public void work() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//System.out.println("现在是否给冰箱通电:[1]是[2]否");
		int choice1 = 1;
		if (choice1 == 1) {
			open();
			System.out.println("现在是否打开冰箱:[1]是[2]否");
			int choice2 = scanner.nextInt();
			if (choice2 == 1) {

				while (true) {
					showRefriMenu();
					int choice3 = -1;
					choice3 = scanner.nextInt();
					if (choice3 == 0) {
						break;
					} else {

						if (choice3 == 1) {
							getFood();
						}
						if (choice3 ==2) {
							SetRefrigeratorWorkstate();
						}
						if (choice3 == 3) {
							ChooseDrinkType();
						}
						if (choice3 == 4) {
							ChooseFruitType();
						}
					}
				}

			} else {
				System.out.println("冰箱门未打开");
			}
		} else {
			System.out.println("冰箱未通电");
		}

	}

}

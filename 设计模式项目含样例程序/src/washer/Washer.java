package washer;


import java.util.Scanner;
import java.util.Timer;

import javax.print.attribute.standard.MediaSize.NA;

import appliance.Appliance;
import appliance.Appliance.State;

public class Washer extends Appliance implements Wash {

	// 洗衣机的属性
	public String name="洗衣机";  //名称
	public State state = State.free; // 状态
	private int power = 30;// 功率

	// 方法
	public Wash decoratedWash;

	
	
	public Washer(Wash decoratedWash) {
		this.decoratedWash = decoratedWash;
	}

	public void washClothes() {
		decoratedWash.washClothes();
	}
	
	//定时功能部分
	private WasherTimeSetter washerTimeSetter=new WasherTimeSetter();
	
	public void setTime(String time1,String time2) {
		washerTimeSetter.setTime(time1, time2);
	}
	
	public String[] getTime() {
		return washerTimeSetter.getTime();
	}
	
	public void setWasherTime() {
		WasherTimeSetterClient client=new WasherTimeSetterClient();
		System.out.println("请输入洗衣机注水器工作时长(分钟):");
		Scanner scanner3= new Scanner(System.in);
		String time1= scanner3.nextLine();
		System.out.println("请输入洗衣机滚筒工作时长(分钟):");
		Scanner scanner4= new Scanner(System.in);
		String time2= scanner4.nextLine();
		client.setTime(time1,time2);
		client.printTime();
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("洗衣机注水器已停止工作");
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("洗衣机滚筒已停止工作");
	}
	

	//桶自洁
	private void washerCleanItself() throws InterruptedException {
		System.out.println("正在进行桶自洁!");
        Thread.sleep(1200);
		System.out.println("桶自洁已结束!");
	}
    
	//获取名字
    public String getName() {
		return name;
    }
    
	// 读取到洗衣机状态
	public State getState() {
		return state;
	}

	// 读取到洗衣机功率
		public int getPower() {
			return power;
		}


	// 根据身份判断使用者是否有权限使用洗衣机
	public Boolean usedBy(String identity) {
		return true;
	}

	// 打开洗衣机
	public void open() {
		// 洗衣机状态改变为working
		System.out.println("洗衣机已启动！");
		state = State.working;
	}

	// 关闭洗衣机
	public void close() {
		// 洗衣机状态改变成free
		System.out.println("洗衣机已停止工作！");
		state = State.free;
	}
	//展示洗衣机功能菜单
	public void showWasherMenu() {
		System.out.println("请选择:\n"
				+"[1]桶自洁\n"
				+"[2]普通洗\n"
				+"[3]强力洗\n"
				+"[4]普通洗并烘干\n"
				+"[5]强力洗并烘干\n"
				+"[6]为洗衣机定时\n"
				+"[0]退出");
	}

	// 洗衣机运行具体方法
	public void work(){
		// 实现对特定洗衣机的具体操作
		// 参考冰箱类实现洗衣机运行的相关流程

		Scanner scanner = new Scanner(System.in);
		System.out.println("现在是否启动洗衣机:[1]是[2]否");
		int choice1 = scanner.nextInt();
		//int washiden=-1;
		if (choice1 == 1) {
			open();
			while (true) {
				showWasherMenu();
				Scanner scanner2 = new Scanner(System.in);
				int choice2 = scanner2.nextInt();
				if (choice2 == 0) {
					break;
				} else {
					switch (choice2) {
					case 1:
						try {
							washerCleanItself();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 2:
//						if(washiden==1) {
//							System.out.println("正在进行强力洗！");
//							break;
//						}
//						else {
//							Wash OrdinaryWash = new OrdinaryWash();
//							OrdinaryWash.washClothes();
//					        washiden=1;
//							break;
//						}
						Wash OrdinaryWash = new OrdinaryWash();
						OrdinaryWash.washClothes();
                        break;

					case 3:
//						if(washiden==1) {
//							System.out.println("正在进行普通洗！");
//							break;
//						}
//						else {
//							Wash StrongWash = new StrongWash();
//							StrongWash.washClothes();
//							washiden=1;
//							break;
//						}
						Wash StrongWash = new StrongWash();
						StrongWash.washClothes();
						break;

					case 4:
						Wash dryOrdinaryWash = new Dryer(new OrdinaryWash());
						dryOrdinaryWash.washClothes();
						break;

					case 5:
						Wash dryStrongWash = new Dryer(new StrongWash());
						dryStrongWash.washClothes();
						break;
						
					case 6:
						setWasherTime();
						break;

					default:
						break;
					}

				}

			}

		}

		else {
			System.out.println("洗衣机未启动!");
		}

	}
}
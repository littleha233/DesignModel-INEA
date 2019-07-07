package scrubbers;

import java.util.*;

import appliance.Appliance;
import appliance.Appliance.State;


public class Armchair extends Appliance {
	
// 按摩椅的属性
	private State state = State.working;// 状态
	
	private int power = 20;// 功率
	
	private String name="智能按摩仪";
//------------------------------------------------------------------------
	
// 方法
	
	public void open() { // 启动
		// TODO Auto-generated method stub
		System.out.println("按摩椅已启动！");
		state = State.working;
	}
	
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("按摩椅已停止工作！");
		state = State.free;
	}
//------------------------------------------------------------------------
	
	public String getName() {
		return name;
	}
	
	public int getPower() {
		return power;
	}
	
    //获取按摩椅状态	
	public State getstate() {
		
		return state;
	}
	
	// 电器使用权限
	public Boolean usedBy(String identity) {
		// TODO Auto-generated method stub
            return true;
	}
	
	//展示菜单
	public void showMenu() {
		System.out.println("请选择您要按摩的部位：[1]颈部 [2]手臂 [3]腰部"
				+"[4]腿部 [5]足部 [6]组合[0]退出");
	}
	
	
	// 按摩椅的工作流程
	public void work() {
		// TODO Auto-generated method stub
  
		Scanner scanner = new Scanner(System.in);
		System.out.println("现在是否启动按摩椅：[1]是 [2]否");
		int choice1 = scanner.nextInt();
		if(choice1 == 1) {
			while(true) {
				open();
				showMenu();
				int choice2 = scanner.nextInt();
				if(choice2==0) {
					break;
				}
				else {
					switch (choice2) {
					case 1:
						System.out.println("颈部按摩器已打开！");
						System.out.println("请输入频率：");
						int neckPower = scanner.nextInt();
						System.out.println("设置成功！");
						
						break;
					case 2:
						System.out.println("手臂按摩器已打开！");
						System.out.println("请输入频率：");
						int armPower = scanner.nextInt();
						System.out.println("设置成功！");
						
						break;
					case 3:
						System.out.println("腰部按摩器已打开！");
						System.out.println("请输入频率：");
						int waistPower = scanner.nextInt();
						System.out.println("设置成功！");
						
						break;
					case 4:
						System.out.println("腿部按摩器已打开！");
						System.out.println("请输入频率：");
						int legPower = scanner.nextInt();
						System.out.println("设置成功！");
						
						break;
					case 5:
						System.out.println("足部按摩器已打开！");
						System.out.println("请输入频率：");
						int footPower = scanner.nextInt();
						System.out.println("设置成功！");
						
						break;
					case 6:
						System.out.println("按摩器已按照您的要求打开！");
						System.out.println("请输入频率：");
						int power = scanner.nextInt();
						System.out.println("设置成功！");
						
						break;
					case 0:
						break;
					default:
						break;
					}
				}
			}
		}else {
			System.out.println("按摩椅未打开！");
		}
	}
}

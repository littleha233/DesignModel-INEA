package fishtank;

import java.util.*;

import appliance.Appliance;
import appliance.Appliance.State;

public class Fishtank extends Appliance{
	
	ArrayList<String> fish = new ArrayList<>(); // 浴缸里的鱼
	
	// 鱼缸的属性
	public State state = State.working; // 状态
	
	private int power = 10; // 功率
	
	public static int Room = 10; // 鱼缸容积
	
	public int temperature = 17; // 当前水温
	
	public String brightness; // 鱼缸内亮度
	
	public String lightcolor; // 鱼缸内光线的颜色
	
	// 方法
	
	public void open() {//启动
		System.out.println("鱼缸已启动！");
		state = State.working;
	}
	
	public void changeWater() {//换水
		System.out.println("鱼缸内的水已更换完毕！");
	}
	
	public void adjustBright() {//调节亮度
		System.out.println("亮度已调整到合适状态！");
	}
	
	public void feed() {//给鱼喂食
		System.out.println("喂食完毕！");
	}
	
	public void close() {//关闭
		System.out.println("鱼缸已停止工作！");
		state = State.free;
	}
	
	//获取鱼缸状态
	public State getState() {
		System.out.println("状态是" + state);
		return state;
	}
	
	//获取工作状态
	public void getFishtankWorkState() {
		System.out.println("当前工作状态是" + state);
	}
	
	//电器使用权限
	public Boolean usedBy(String identity) {
		// TODO Auto-generated method stub
		return true;
	}
	
	//智能鱼缸的工作流程
	public void work(){
		Scanner scanner = new Scanner(System.in);
//		System.out.println("现在是否给鱼缸通电：[1]是 [2]否");
		int choice1 = 1;
		if (choice1 == 1) {
			open();
			System.out.println("现在是否打开鱼缸：[1]是 [2]否");
			int choice2 = scanner.nextInt();
			if(choice2 == 1) {
				while(true) {
					System.out.println("请做出你的选择：[1]换水[2]调节亮度[3]调节温度"
							+"[4]给鱼喂食[0]退出");
					int choice3 = -1;
					choice3 = scanner.nextInt();
					if(choice3 == 0) {
						break;
					}else {
						if(choice3 == 1) {
							changeWater();
						}
						if(choice3 == 2) {
							adjustBright();
						}
						if(choice3 == 3) {
					        System.out.println("请输入当前温度");
					        int tempT=scanner.nextInt();
					        if(tempT>temperature) {
					        	HighApproTemp highApproTemp=new HighApproTemp();
					        	highApproTemp.adjust(temperature,tempT);
					    	   
					        }
					        else {
					        	 LowApproTemp lowApproTemp=new LowApproTemp();
						         lowApproTemp.adjust(temperature,tempT);
					        }
					    
						}
						if(choice3 == 4) {
							feed();
						}
					}
				}
			}else {
				System.out.println("鱼缸未打开！");
			}
		}else {
			System.out.println("鱼缸未通电！");
		}
	} 
}

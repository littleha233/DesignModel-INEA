package robotcleaner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;


public class Robotcleaner extends Visitor{
	private String curloc;
	
	Robotcleaner(String loc){//构造函数，参数指定需要打扫的位置
		curloc = loc;
	}
	
	public Robotcleaner(){//无参数默认将整个房子打扫一遍
		this("");
	}
	private String name="扫地机器人";
	
	public String getName() {
		return name;
	}
	
	private State state=State.working;
	public State getState() {
		return state;
	}
	
	private int power=50;
	public int getPower() {
		return power;
	}
	
	
	public Boolean usedBy(String identity) {
		return true;
	}
	@Override
	public void visit(Room room) {//访问房间
		String clean = cleanup();//打扫房间
		System.out.println(curloc + "/" + room + clean);
	}

	@Override
	public void visit(Compound compound) {//访问复合物
		//String clean = cleanup();//打扫房间
		System.out.println(curloc + "/" + compound);
		String saveloc = curloc;
		curloc += "/" + compound.getName();
		Iterator it = compound.iterator();
		while(it.hasNext()) {//递归访问整个房子
			Space space = (Space) it.next();
			space.accept(this);
		}
		curloc = saveloc;
	}
	
	private String cleanup() {//模拟扫地机器人打扫房间的动作
		return "打扫干净啦！";
	}
	
	public void work()  {//给定需要打扫的区域，开始工作
		Scanner sc = new Scanner(System.in);
        while(true) {
			System.out.println("\n请输入扫地机器人需要打扫的区域：");
			System.out.println("[1]温馨的家 [2]中厅 [3]主卧 [4]侧卧 [5]主卧室区域 [6]内卫");
			System.out.println("[7]主盥洗室 [8]开放式厨房 [9]客厅 [10]餐厅 [11]杂物间 [0]退出");

			int option = sc.nextInt();
			if(option == 0)break;
			Robotcleaner Rob = new Robotcleaner();
			Searchroom sh = new Searchroom();
			switch(option) {
			//case(0): break;
			case(1): {
				Rob.visit(Space.myhouse());
				break;
			}
			case(2): {
				sh.setloc("中厅");
				sh.visit(Space.myhouse());
				Rob.visit((Compound)sh.sp);
				break;
			}
			case(3): {
				sh.setloc("主卧");
				sh.visit(Space.myhouse());
				Rob.visit((Compound)sh.sp);
				break;
			}
			case(4): {
				sh.setloc("侧卧");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(5): {
				sh.setloc("主卧室区域");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(6): {
				sh.setloc("内卫");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(7): {
				sh.setloc("主盥洗室");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(8): {
				sh.setloc("开放式厨房");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(9): {
				sh.setloc("客厅");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(10): {
				sh.setloc("餐厅");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(11): {
				sh.setloc("杂物间");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			
			}
        }
	}

}

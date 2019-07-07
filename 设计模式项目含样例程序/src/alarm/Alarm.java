package alarm;
import java.util.ArrayList;
import java.util.List;

import appliance.Appliance;

public class Alarm extends Appliance{
	//使用Factory模式来创建Alarm类
	
	//使用Observer模式来通知Observer例如警察, 室内洒水器, 爸爸妈妈, 消防员 ...
	
	//这是一个报警器（Alarm）父类，包括烟雾报警器（Smoke_alarm）, 防盗报警器（Burglar_alarm）等等
	 public Alarm() {
		 
	 };
	 
	 
	 protected String name="报警器";
	 public String getName() {
		 return name;
	 }
	 private State state=State.working;
	 public State getState() {
		 return state;
	 }
	 private int power=12;
	 public int getPower() {
		 return power;
	 }
	 private List<Observer> observers 
     = new ArrayList<Observer>();//容器存放所有Observer

	 protected boolean is_alarming = false;//状态值（是否报警）
	
	 public boolean showState() {//显示目前状态值
	    return is_alarming;
	 }
	
	 public void alert(boolean state) {//此函数被调用时状态改变，若state为true则报警
		if(state) {
			System.out.println("报警！！！");
			notifyall();
		}
	    this.is_alarming = state;
	    
	 }
	
	 public void attach(Observer observer){//将新的Observer加入容器
	    observers.add(observer);      
	 }
	
	 public void notifyall() {//通知容器中所有Observer
	    for (Observer observer : observers) {
	       observer.update();
	    }
	 }  
	 
	 public static void work(String type) {//给定Alarm种类，创造Alarm并报警
		 Alarm ins = AlarmFactory.getAlarm(type);
		 if(ins != null) {
			 ins.alert(true);
		 }
		 else System.out.println("指定的警报器" + type + "不存在！");
	 }
	
	 public void work() {//默认work方法两个报警器都生成
		 Alarm.work("Smoke");
		 Alarm.work("Burglar");
	 }
	
}

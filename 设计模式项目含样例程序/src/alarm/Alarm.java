package alarm;
import java.util.ArrayList;
import java.util.List;

import appliance.Appliance;

public class Alarm extends Appliance{
	//ʹ��Factoryģʽ������Alarm��
	
	//ʹ��Observerģʽ��֪ͨObserver���羯��, ������ˮ��, �ְ�����, ����Ա ...
	
	//����һ����������Alarm�����࣬��������������Smoke_alarm��, ������������Burglar_alarm���ȵ�
	 public Alarm() {
		 
	 };
	 
	 
	 protected String name="������";
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
     = new ArrayList<Observer>();//�����������Observer

	 protected boolean is_alarming = false;//״ֵ̬���Ƿ񱨾���
	
	 public boolean showState() {//��ʾĿǰ״ֵ̬
	    return is_alarming;
	 }
	
	 public void alert(boolean state) {//�˺���������ʱ״̬�ı䣬��stateΪtrue�򱨾�
		if(state) {
			System.out.println("����������");
			notifyall();
		}
	    this.is_alarming = state;
	    
	 }
	
	 public void attach(Observer observer){//���µ�Observer��������
	    observers.add(observer);      
	 }
	
	 public void notifyall() {//֪ͨ����������Observer
	    for (Observer observer : observers) {
	       observer.update();
	    }
	 }  
	 
	 public static void work(String type) {//����Alarm���࣬����Alarm������
		 Alarm ins = AlarmFactory.getAlarm(type);
		 if(ins != null) {
			 ins.alert(true);
		 }
		 else System.out.println("ָ���ľ�����" + type + "�����ڣ�");
	 }
	
	 public void work() {//Ĭ��work��������������������
		 Alarm.work("Smoke");
		 Alarm.work("Burglar");
	 }
	
}

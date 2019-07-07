package appliance;

import java.util.*;

import airconditioner.AirConditioner;
import alarm.Alarm;
import appliance.Appliance.State;
import cookingsystem.Cook;
import fishtank.Fishtank;
import light.Bulb;
import light.LightsTerminal;
import refrigerator.Refrigerator;
import robotcleaner.Robotcleaner;
import scrubbers.Armchair;
import television.Television;
import washer.StrongWash;
import washer.Washer;



//����ʹ�õ��˵���ģʽ--���
public class SingleSystemControl {
	
	//����Ψһ��һ������
	private static SingleSystemControl instance=new SingleSystemControl();
	
	//���캯��
	private SingleSystemControl() {}
	
	//��ȡΨһ��ʹ�õĶ���
	public static SingleSystemControl getInstance() {
		return instance;
	}
	
	//��ʾ�˵�������Ϣ
	public void showControlPlat() {
		
    	System.out.println("***********************");
    	System.out.println("[0]�鿴��ǰ����ʹ�����");
    	System.out.println("[1]���ӻ�");
    	System.out.println("[2]��������ϵͳ");
    	System.out.println("[3]�յ�");
    	System.out.println("[4]ϴ�»�");
    	System.out.println("[5]����");
    	System.out.println("[6]ɨ�ػ�����");
    	System.out.println("[7]�������");
    	System.out.println("[8]������");
    	System.out.println("[9]��Ħ��");
    	System.out.println("[10]���ܵ��");
    	System.out.println("[11]�˳��ÿ�ģʽ");
    	System.out.println("**********************");
    	System.out.println("���������ָ��:");
	}
	
	//��������
	public int order =-1;
	public void setOrder(int order) {
		this.order=order;
	}
	
	//�洢����ʹ�õĵ�����Ϣ
	ArrayList<Appliance> list=new ArrayList<>();
	//��������ִ����Ӧ�Ĳ���
	public void excuteOrder() throws java.util.NoSuchElementException{
		switch(order) {
		case 0:
			//�鿴��ǰ������ʹ�����
			System.out.println("����              ״̬          ���� ");
			for(int i=0;i<list.size();i++) {
				String name=String.format("%-10s", list.get(i).getName());
				State state=list.get(i).getState();
				String state1=state.toString();
				String state2=String.format("%-10s", state1);
				int power=list.get(i).getPower();
				System.out.println(name+" "+state2+" "+power);
			}			
			break;
		case 1:
			//���ӻ�
			Television television=new Television();
			television.work();
			list.add(television);;
		    break;
		case 2:
			//����ϵͳ
			Cook cook=new Cook();
			list.add(cook);
			cook.work();
			break;
		case 3:
			//�յ�
			AirConditioner airConditioner=new AirConditioner();
			list.add(airConditioner);
			airConditioner.work();
			break;
		case 4:
			//ϴ�»�
			Washer washer =new Washer(new StrongWash());
			list.add(washer);
			washer.work();
			break;
			//Washer washer=new Washer(null);
			
		case 5:
			//���ñ���
			Refrigerator refrigerator=new Refrigerator();
			list.add(refrigerator);
			refrigerator.work();
			break;
		case 6://ɨ�ػ�����
			Robotcleaner robotcleaner=new Robotcleaner();
			list.add(robotcleaner);
			robotcleaner.work();
			break;
		case 7:
			Fishtank fishtank=new Fishtank();
			fishtank.work();
			break;
		case 8:
			//������
			Alarm alarm=new Alarm();
			list.add(alarm);
			alarm.work();
			break;
		case 9:
			 Armchair armchair=new  Armchair();
			 armchair.work();
			break;
		case 10:
		    //���ܵ��
			LightsTerminal lightsTerminal=new LightsTerminal();
			list.add(lightsTerminal);
			lightsTerminal.work();
			break;
		case 11:			
			System.out.println("���˳��ÿ�ģʽ��");
			break;
		default:
			break;
		}
	}
    	

}

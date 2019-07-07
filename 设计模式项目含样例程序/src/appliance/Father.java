package appliance;

import airconditioner.AirConditioner;
import cookingsystem.Cook;
import fishtank.Fishtank;
import light.LightsTerminal;
import refrigerator.Refrigerator;
import robotcleaner.Robotcleaner;
import scrubbers.Armchair;
import television.Television;
import washer.StrongWash;
import washer.Washer;

public class Father extends User {
    
	//���Բ���
	
	//  �������
	private String identity="father";
	private static Father instance=new Father();
	
	private Father() {}
	
	public static Father getInstance() {
		return instance;
	}
	
	
	
	//��������
	
	//����ģʽ��father��һ��
	public void fatherDay()
	{
		
/*      �ְ���ϴ��
 *      wash.work();
 *      
 *      �ְִ򿪱���ȥ����
 *      refrigerator.getfood();
 *      
 *      �������ṩһϵ�з���
 *      door.work();
 *      
 *      �򿪵��ӿ�����
 *      television.open();
 *      television.change();
 *      television.close();
 *      
 *      �ְ�������
 *      lamp��repair();
 *      
 *      ��Ħ���Ϸ���
 *      massagechair��work();
 */
	}
	
	//ʹ�õ���
	public void useTelevision()
	{
		   Television television=new Television();
	        if(!television.usedBy(identity)) {
		    System.out.println("������ʹ�øõ���");
		    }
	        else {
	           television.work();
	        }
	  
	}
    
	//ʹ��΢��¯
	public void usecookingSystem() {
		Cook cook=new Cook();
		
		if(!cook.usedBy(identity)) {
			 System.out.println("������ʹ�øõ���");
		   }
	    else{
		     cook.work();
	      }		

	}
	
	//ʹ�ñ���
	public void useRefrigerator() {
		Refrigerator refrigerator=new Refrigerator();
		 if(!refrigerator.usedBy(identity)) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		  else {
		       refrigerator.work();
		        }
	}
	
	//ʹ�ÿյ�
	public void useAirConditioner() {
		 AirConditioner airconditioner=new AirConditioner();
		 if(!airconditioner.usedBy(identity)) {
	    	 System.out.println("������ʹ�øõ���");
			 	   }
		  else {
		        airconditioner.work();
		      }
	}
	
	//ʹ��ϴ�»�
	public void useWashingMachine() {
		 Washer washer=new Washer(new StrongWash());
		 if(!washer.usedBy(identity)) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		  else {
		        washer.work();
		        }
	}
	
	//ʹ��ɨ�ػ�����
	public void useSweepRobot() {
		Robotcleaner robotcleaner=new Robotcleaner();
		if(!robotcleaner.usedBy(identity)) {
			System.out.println("������ʹ�øõ���");
		}
		else {
			robotcleaner.work();
		}
	}
	
	//ʹ���������
	public void useFishBowl() {
		Fishtank fishtank=new Fishtank();
		if(!fishtank.usedBy(identity)) {
			System.out.println("������ʹ�øõ���");
		}
		else {
            fishtank.work();
		}
	}
	
	//ʹ������ϴˢ��
	public void useWash() {
		/*
		 * Wash wash=new Wash;
		 * if(!wash.usedBy()) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		 * else {
		 *       wash.work();
		 *       }
		  */	
	}
	
	//ʹ�ñ�����
	public void useAlarm() {
		/*
		 * Alarm alarm=new Alarm;
		 * if(!alarm.usedBy()) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		 * else {
		 *       alarm.work();
		 *       }
		  */
	}
	
	//ʹ�ð�Ħ��
	public void useMassageChair() {
		Armchair armchair=new Armchair();
		if(!armchair.usedBy(identity)) {
			System.out.println("������ʹ�øõ���");
		}
		else {
			armchair.work();
		}
	}
	
	//ʹ�����ܵ��
	public void useLamp() {
		LightsTerminal lightsTerminal=new LightsTerminal();
		if(!lightsTerminal.usedBy()) {
			System.out.println("������ʹ�øõ���");
		}
		else {
			lightsTerminal.work();
			
		}
	}
	
	//ʹ��������
	public void useDoor() {
		/*
		 * Door door=new Door;
		 * if(!door.usedBy()) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		 * else {
		 *       door.work();
		 *       }
		  */	
	}
	
}

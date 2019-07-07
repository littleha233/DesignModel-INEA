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

public class Child extends User{
	//���Բ���
	
	//  �������
	String identity="child";
	
	
	
	
	//��������
	
	//����ģʽ��child��һ��
	public void childDay()
	{
		
/*   
 * ����ȥ����
 *      fishbowl��work();???
 * 
 * �ӱ�����ȡ���Ե�
 *      refrigerator��getfood();
 *  
 *   ���ӿ�����
 *      television.open();
 *      television.change();
 *      television.close();
 *      
 *      ���ӿ�����????
 *      door.open();
 *      door.close();
 *      
 *      �����ÿյ�
 *      ?????
 *      
 *      ���Ӵӱ����õ���
 *      refrigerator��open();
 *      refrigerator.getfood();
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
		
		/*
		 * FishBowl fishbowl=new FishBowl;
		 * if(!fishbowl.usedBy()) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		 * else {
		 *       fishbowl.work();
		 *       }
		  */
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
		/*
		 * MassageChair massagechair=new MassageChair;
		 * if(!massagechair.usedBy()) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		 * else {
		 *       massagechair.work();
		 *       }
		  */	
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
	
		/*
		 * Lamp lamp=new Lamp;
		 * if(!lamp.usedBy()) {
				 System.out.println("������ʹ�øõ���");
				 	   }
		 * else {
		 *       lamp.work();
		 *       }
		  */	
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

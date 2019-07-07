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
    
	//属性部分
	
	//  定义身份
	private String identity="father";
	private static Father instance=new Father();
	
	private Father() {}
	
	public static Father getInstance() {
		return instance;
	}
	
	
	
	//操作部分
	
	//场景模式下father的一天
	public void fatherDay()
	{
		
/*      爸爸起床洗漱
 *      wash.work();
 *      
 *      爸爸打开冰箱去饮料
 *      refrigerator.getfood();
 *      
 *      智能门提供一系列服务
 *      door.work();
 *      
 *      打开电视看球赛
 *      television.open();
 *      television.change();
 *      television.close();
 *      
 *      爸爸修理电灯
 *      lamp。repair();
 *      
 *      按摩椅上放松
 *      massagechair。work();
 */
	}
	
	//使用电视
	public void useTelevision()
	{
		   Television television=new Television();
	        if(!television.usedBy(identity)) {
		    System.out.println("您不能使用该电器");
		    }
	        else {
	           television.work();
	        }
	  
	}
    
	//使用微波炉
	public void usecookingSystem() {
		Cook cook=new Cook();
		
		if(!cook.usedBy(identity)) {
			 System.out.println("您不能使用该电器");
		   }
	    else{
		     cook.work();
	      }		

	}
	
	//使用冰箱
	public void useRefrigerator() {
		Refrigerator refrigerator=new Refrigerator();
		 if(!refrigerator.usedBy(identity)) {
				 System.out.println("您不能使用该电器");
				 	   }
		  else {
		       refrigerator.work();
		        }
	}
	
	//使用空调
	public void useAirConditioner() {
		 AirConditioner airconditioner=new AirConditioner();
		 if(!airconditioner.usedBy(identity)) {
	    	 System.out.println("您不能使用该电器");
			 	   }
		  else {
		        airconditioner.work();
		      }
	}
	
	//使用洗衣机
	public void useWashingMachine() {
		 Washer washer=new Washer(new StrongWash());
		 if(!washer.usedBy(identity)) {
				 System.out.println("您不能使用该电器");
				 	   }
		  else {
		        washer.work();
		        }
	}
	
	//使用扫地机器人
	public void useSweepRobot() {
		Robotcleaner robotcleaner=new Robotcleaner();
		if(!robotcleaner.usedBy(identity)) {
			System.out.println("您不能使用该电器");
		}
		else {
			robotcleaner.work();
		}
	}
	
	//使用智能鱼缸
	public void useFishBowl() {
		Fishtank fishtank=new Fishtank();
		if(!fishtank.usedBy(identity)) {
			System.out.println("您不能使用该电器");
		}
		else {
            fishtank.work();
		}
	}
	
	//使用智能洗刷器
	public void useWash() {
		/*
		 * Wash wash=new Wash;
		 * if(!wash.usedBy()) {
				 System.out.println("您不能使用该电器");
				 	   }
		 * else {
		 *       wash.work();
		 *       }
		  */	
	}
	
	//使用报警器
	public void useAlarm() {
		/*
		 * Alarm alarm=new Alarm;
		 * if(!alarm.usedBy()) {
				 System.out.println("您不能使用该电器");
				 	   }
		 * else {
		 *       alarm.work();
		 *       }
		  */
	}
	
	//使用按摩椅
	public void useMassageChair() {
		Armchair armchair=new Armchair();
		if(!armchair.usedBy(identity)) {
			System.out.println("您不能使用该电器");
		}
		else {
			armchair.work();
		}
	}
	
	//使用智能电灯
	public void useLamp() {
		LightsTerminal lightsTerminal=new LightsTerminal();
		if(!lightsTerminal.usedBy()) {
			System.out.println("您不能使用该电器");
		}
		else {
			lightsTerminal.work();
			
		}
	}
	
	//使用智能门
	public void useDoor() {
		/*
		 * Door door=new Door;
		 * if(!door.usedBy()) {
				 System.out.println("您不能使用该电器");
				 	   }
		 * else {
		 *       door.work();
		 *       }
		  */	
	}
	
}

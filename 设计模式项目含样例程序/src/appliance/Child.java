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
	//属性部分
	
	//  定义身份
	String identity="child";
	
	
	
	
	//操作部分
	
	//场景模式下child的一天
	public void childDay()
	{
		
/*   
 * 孩子去看鱼
 *      fishbowl。work();???
 * 
 * 从冰箱中取出吃的
 *      refrigerator。getfood();
 *  
 *   孩子看电视
 *      television.open();
 *      television.change();
 *      television.close();
 *      
 *      孩子开关门????
 *      door.open();
 *      door.close();
 *      
 *      孩子用空调
 *      ?????
 *      
 *      孩子从冰箱拿蛋糕
 *      refrigerator。open();
 *      refrigerator.getfood();
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
		
		/*
		 * FishBowl fishbowl=new FishBowl;
		 * if(!fishbowl.usedBy()) {
				 System.out.println("您不能使用该电器");
				 	   }
		 * else {
		 *       fishbowl.work();
		 *       }
		  */
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
		/*
		 * MassageChair massagechair=new MassageChair;
		 * if(!massagechair.usedBy()) {
				 System.out.println("您不能使用该电器");
				 	   }
		 * else {
		 *       massagechair.work();
		 *       }
		  */	
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
	
		/*
		 * Lamp lamp=new Lamp;
		 * if(!lamp.usedBy()) {
				 System.out.println("您不能使用该电器");
				 	   }
		 * else {
		 *       lamp.work();
		 *       }
		  */	
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

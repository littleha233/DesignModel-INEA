package appliance;

public class User {
	
	//属性部分。。。。。。。。。
	
	//使用者身份类型
	public enum userIdentity{
		father, mother, child
	}
	
	//身份
	public String identity;
	
	
	
	//操作部分。。。。。。。。。。。
	
	//构建一个使用者
	public void User(String identity)
	{
		this.identity=identity;
	}
	
	
	//使用电视机
	public void useTelevision()
	{
/*
 * Television television=new Television;
 * if(!microwave.usedBy()) {
		 System.out.println("您不能使用该电器");
		 	   }
 * else 
 *       television.work();
  */
	}
    
	//使用微波炉
	public void useMicrowave() {
		
		
//  举个例子仅供参考 新建一个微波炉对象
//  判断电器能否被使用的根据是canBeUsed函数返回的bool值
//  是真 可以使用 是假 不能使用
//	Boolean usedBy() {
//  
//	String identity;
//  爸爸妈妈不能用
//	if((identity=="father")&&(identity=="mother"))
//	{
//		return true;
//		}
//  孩子不能用
//	else if(identity="child")
//	{
//		return false;
//	}
//  默认不能用
//  return false;
//  }
//		
//	Microwave microwave=new Microwave;
//	if(!microwave.usedBy()) {
//		 System.out.println("您不能使用该电器");
//	   }
//  else
//		microwave.work();
	
		
	}
	
	//使用冰箱
	public void useRefrigerator() {
			
	}
	
	//使用空调
	public void useAirConditioner() {
		
	}
	
	//使用洗衣机
	public void useWashingMachine() {
		
	}
	
	//使用扫地机器人
	public void useSweepRobot() {
		
	}
	
	//使用智能鱼缸
	public void useFishBowl() {
		
	}
	
	//使用智能洗刷器
	public void useWash() {
		
	}
	
	//使用报警器
	public void useAlarm() {
		
	}
	
	//使用按摩椅
	public void useMassageChair() {
		
	}
	
	//使用智能电灯
	public void useLamp() {
		
	}
	
	//使用智能门
	public void useDoor() {
		
	}

}

package appliance;

public class User {
	
	//���Բ��֡�����������������
	
	//ʹ�����������
	public enum userIdentity{
		father, mother, child
	}
	
	//���
	public String identity;
	
	
	
	//�������֡���������������������
	
	//����һ��ʹ����
	public void User(String identity)
	{
		this.identity=identity;
	}
	
	
	//ʹ�õ��ӻ�
	public void useTelevision()
	{
/*
 * Television television=new Television;
 * if(!microwave.usedBy()) {
		 System.out.println("������ʹ�øõ���");
		 	   }
 * else 
 *       television.work();
  */
	}
    
	//ʹ��΢��¯
	public void useMicrowave() {
		
		
//  �ٸ����ӽ����ο� �½�һ��΢��¯����
//  �жϵ����ܷ�ʹ�õĸ�����canBeUsed�������ص�boolֵ
//  ���� ����ʹ�� �Ǽ� ����ʹ��
//	Boolean usedBy() {
//  
//	String identity;
//  �ְ����費����
//	if((identity=="father")&&(identity=="mother"))
//	{
//		return true;
//		}
//  ���Ӳ�����
//	else if(identity="child")
//	{
//		return false;
//	}
//  Ĭ�ϲ�����
//  return false;
//  }
//		
//	Microwave microwave=new Microwave;
//	if(!microwave.usedBy()) {
//		 System.out.println("������ʹ�øõ���");
//	   }
//  else
//		microwave.work();
	
		
	}
	
	//ʹ�ñ���
	public void useRefrigerator() {
			
	}
	
	//ʹ�ÿյ�
	public void useAirConditioner() {
		
	}
	
	//ʹ��ϴ�»�
	public void useWashingMachine() {
		
	}
	
	//ʹ��ɨ�ػ�����
	public void useSweepRobot() {
		
	}
	
	//ʹ���������
	public void useFishBowl() {
		
	}
	
	//ʹ������ϴˢ��
	public void useWash() {
		
	}
	
	//ʹ�ñ�����
	public void useAlarm() {
		
	}
	
	//ʹ�ð�Ħ��
	public void useMassageChair() {
		
	}
	
	//ʹ�����ܵ��
	public void useLamp() {
		
	}
	
	//ʹ��������
	public void useDoor() {
		
	}

}

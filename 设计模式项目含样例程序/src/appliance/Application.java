package appliance;

import java.util.*;


public class Application {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//------------------------------------------------------------------------------------------------------
		//���Բ���
		
		//------------------------------------------------------------------------------------------------------
		
        
		//���ڼ���Ĭ���аְ֣����裬����������ɫ
        System.out.println("��ӭ�����ִ����ܼҵ�ϵͳ�������ѡ��[1]�ÿ�ģʽ [2]��Ϸģʽ");
        int SysChoice = scanner.nextInt();
        int model=0;
        while(true) {
        	if(SysChoice==1) {
            	System.out.println("�����ڴ��ڷÿ�ģʽ��������ͨ���ҵ��ܿ���ϵͳ���������еļҵ繦��");
            	model=1;
            	break;
            }
            if(SysChoice==2) {
            	model=2;
            	System.out.println("�����ڴ�����Ϸģʽ�����������ѡ����Ľ�ɫ:");
            	break;
            }
            else {
            	System.out.println("������ѡ��ģʽ��");
            	SysChoice = scanner.nextInt();
            }
        }
        
        //�ÿ�ģʽ
        if(model==1) {
        	SingleSystemControl Panda=SingleSystemControl.getInstance();
        	System.out.println("�����ͨ��ѡ��˵���ť�Խ�����Ĳ���");
        	Panda.showControlPlat();
        	int CtrlChoice=scanner.nextInt();
        	while(true)
        	{
        		if(CtrlChoice==13)
        		{
        			System.out.println("���˳��ÿ�ģʽ");
        			break;
        		}
        		else {
                	Panda.setOrder(CtrlChoice);
                	Panda.excuteOrder();
                	Panda.showControlPlat();
                	CtrlChoice=scanner.nextInt();
        		}
        	}
        }

        
        //��Ϸģʽ�����Ҽ���Ϸ
		if(model==2) {
			System.out.println("[1]�ְ�  [2]����  [3]����");
			int choice=0;
			choice=scanner.nextInt();
			int identity=0;    //��ݵı�־
			while(true) {
				if(choice==1) {
					System.out.println("��ѡ��Ľ�ɫ�ǰְ֣����ڿ��Կ�ʼ���ܼҵ�����ϵͳ��!");
					identity=1;
					break;
				}
				if(choice==2) {
					System.out.println("��ѡ��Ľ�ɫ�����裬���ڿ��Կ�ʼ���ܼҵ�����ϵͳ��!");
					identity=2;
					break;
				}
				if(choice==3) {
					System.out.println("��ѡ��Ľ�ɫ�Ǻ��ӣ����ڿ��Կ�ʼ���ܼҵ�����ϵͳ��!");
					identity=3;
					break;
				}
				else {
					System.out.println("������ѡ����Ľ�ɫ�q(�s^�t)�r!");
					choice=scanner.nextInt();
				}
			}
	        if(identity==1) {
	        	//Ψһ����һ���ְֶ���
	        	Father father=Father.getInstance();
	       
	            System.out.println("���������������ְ���ȻҪȥ�ϰ�,�ְִ򿪱���ȡ��һЩ�Եľʹ�æ�ϰ�ȥ�ˡ�");
	          //���ñ�����ع��ܣ��������������̫����
	            father.useRefrigerator();        
	       
	            System.out.println("ʱ����ţ�һת�۵����°�ʱ��,�ְֻص��˼ҡ�");
	            System.out.println("�ְִ��˵��ӻ����뿴һ�����������");
	            //���õ��ӻ���ع���
	            father.useTelevision();
	            System.out.println("��������������ְּ߰���ĵ�ƻ��ˣ����ǰְ�ȥ�������ˡ�");
	            //�������ܵ����ع���
	            father.useLamp();
	            System.out.println("æ����һ��󣬰ְ��۵ò��У�����������Ħ��ǰ�úõط�����һ����");
	            //���ð�Ħ����ع���
	            father.useMassageChair();
	            System.out.println("ҹ����ְֽ��������硣");
	           
	            
	        }
	        if(identity==2) {
	        	Mother mother=Mother.getInstance();
	        	
	        	System.out.println("�������û�й����������������������Ϊһ����׼�����緹��");
	        	//����΢��¯��ع���
	        	mother.usecookingSystem();
	        	System.out.println("���Ż�����˯�ı��������費���Ľ�����������ȥ������һ�¿յ������±���������");
	        	//���ÿյ���ع���
	        	mother.useAirConditioner();
	        	System.out.println("�����������迪���˳�������ģʽ����ȡ��һ����·���׼���ú���ϴһ����");
	        	//����ϴ�»���ع���
	        	mother.useTelevision();
	        	System.out.println("ϴ���·���������ȥ���������ˣ�������ɨ�ػ����˵İ������ƺ����ⲻ��");
	        	//����ɨ�ػ�������ع���
	        	mother.useSweepRobot();
	        	System.out.println("������һֱ�԰�ȫ�������ӵ��������˼���ı�������");
	        	//���ñ�������ع���
	        	mother.useAlarm();
	        	System.out.println("æ����Щ�������ֿ�����׷��ģʽ������ܲ�����ƺ����첥���ˡ�");
	        	//���õ��ӻ���ع���
	        	mother.useTelevision();
	        	System.out.println("ҹĻ���٣�����̫�������ͽ���ɢȥ�������ϲ�������ϲ��õ��ǹ��財�");
	        	//�������ܵ�ƹ���
	        	mother.useLamp();
	        }
	        if(identity==3) {
	        	Child child=new Child();
	        	System.out.println("���ڵ���˫���գ���������������ģʽ�������ձ������Ǳ������ˣ��𴲺��һ���¾���ȥ���������㡣");
	        	//�������������ع���
	        	child.useFishBowl();
	        	System.out.println("��Ϊ�����ˣ�����û�г��緹��ֻ��ȥ�������ѹ�д�Ե��ˡ�");
	        	//���ñ�����ع���
	        	child.useRefrigerator();
	        	System.out.println("���궫���󣬸պõ��ˡ��ۺ���С��6���Ĳ���ʱ�䣬���Ȳ������ش򿪵��ӣ������ζ�ؿ���������");
	        	//���õ��ӻ���ع���
	        	child.useTelevision();
	        	System.out.println("����һ�ᣬ����������С���������棬�����ĵ�ȥ���š�");
	        	//������������ع���
	        	System.out.println("С�����÷������е��ȣ����Ǳ��������ÿյ���ֻ�ð��������ʹ�ÿյ���");
	        	//���ÿյ���ع���
	        	child.useAirConditioner();
	        	System.out.println("����ȥ�������õ����С��������ȴ���ֵ���û�ˣ�������ʧ������Ӧ�´��ڸ�С���ԡ�");
	        	//���ñ�����ع���	      
	        	child.useRefrigerator();
	        }
	        
		}
		
        
	}

}

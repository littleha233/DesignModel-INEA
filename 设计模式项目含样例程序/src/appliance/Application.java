package appliance;

import java.util.*;


public class Application {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//------------------------------------------------------------------------------------------------------
		//测试部分
		
		//------------------------------------------------------------------------------------------------------
		
        
		//现在家里默认有爸爸，妈妈，孩子三个角色
        System.out.println("欢迎体验现代智能家电系统，你可以选择[1]访客模式 [2]游戏模式");
        int SysChoice = scanner.nextInt();
        int model=0;
        while(true) {
        	if(SysChoice==1) {
            	System.out.println("您现在处于访客模式，您可以通过家电总控制系统来体验所有的家电功能");
            	model=1;
            	break;
            }
            if(SysChoice==2) {
            	model=2;
            	System.out.println("您现在处于游戏模式，现在你可以选择你的角色:");
            	break;
            }
            else {
            	System.out.println("请重新选择模式！");
            	SysChoice = scanner.nextInt();
            }
        }
        
        //访客模式
        if(model==1) {
        	SingleSystemControl Panda=SingleSystemControl.getInstance();
        	System.out.println("你可以通过选择菜单按钮以进行你的操作");
        	Panda.showControlPlat();
        	int CtrlChoice=scanner.nextInt();
        	while(true)
        	{
        		if(CtrlChoice==13)
        		{
        			System.out.println("已退出访客模式");
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

        
        //游戏模式，过家家游戏
		if(model==2) {
			System.out.println("[1]爸爸  [2]妈妈  [3]孩子");
			int choice=0;
			choice=scanner.nextInt();
			int identity=0;    //身份的标志
			while(true) {
				if(choice==1) {
					System.out.println("你选择的角色是爸爸，现在可以开始智能家电体验系统了!");
					identity=1;
					break;
				}
				if(choice==2) {
					System.out.println("你选择的角色是妈妈，现在可以开始智能家电体验系统了!");
					identity=2;
					break;
				}
				if(choice==3) {
					System.out.println("你选择的角色是孩子，现在可以开始智能家电体验系统了!");
					identity=3;
					break;
				}
				else {
					System.out.println("请重新选择你的角色╭(╯^╰)╮!");
					choice=scanner.nextInt();
				}
			}
	        if(identity==1) {
	        	//唯一创建一个爸爸对象
	        	Father father=Father.getInstance();
	       
	            System.out.println("今天是周六，但爸爸依然要去上班,爸爸打开冰箱取了一些吃的就匆忙上班去了。");
	          //调用冰箱相关功能，可能这个场景不太合适
	            father.useRefrigerator();        
	       
	            System.out.println("时间飞逝，一转眼到了下班时间,爸爸回到了家。");
	            System.out.println("爸爸打开了电视机，想看一场足球比赛。");
	            //调用电视机相关功能
	            father.useTelevision();
	            System.out.println("吃完晚饭后，妈妈告诉爸爸家里的电灯坏了，于是爸爸去修理电灯了。");
	            //调用智能电灯相关功能
	            father.useLamp();
	            System.out.println("忙活了一天后，爸爸累得不行，于是来到按摩仪前好好地放松了一番。");
	            //调用按摩仪相关功能
	            father.useMassageChair();
	            System.out.println("夜已深，爸爸进入了梦乡。");
	           
	            
	        }
	        if(identity==2) {
	        	Mother mother=Mother.getInstance();
	        	
	        	System.out.println("妈妈今天没有工作，不过她还是早早地起床为一家人准备了早饭。");
	        	//调用微波炉相关功能
	        	mother.usecookingSystem();
	        	System.out.println("看着还在熟睡的宝宝，妈妈不忍心叫醒他，于是去调节了一下空调，生怕宝宝着凉。");
	        	//调用空调相关功能
	        	mother.useAirConditioner();
	        	System.out.println("接下来，妈妈开启了超级主妇模式，她取来一大堆衣服，准备好好清洗一番。");
	        	//调用洗衣机相关功能
	        	mother.useTelevision();
	        	System.out.println("洗完衣服后，妈妈又去清理卫生了，不过有扫地机器人的帮助，似乎问题不大。");
	        	//调用扫地机器人相关功能
	        	mother.useSweepRobot();
	        	System.out.println("后来，一直对安全格外重视的妈妈检查了家里的报警器。");
	        	//调用报警器相关功能
	        	mother.useAlarm();
	        	System.out.println("忙完这些，妈妈又开启了追剧模式，《如懿传》似乎都快播完了。");
	        	//调用电视机相关功能
	        	mother.useTelevision();
	        	System.out.println("夜幕降临，家里太阳的余晖渐渐散去，妈妈很喜欢将晚上布置得星光璀璨。");
	        	//调用智能电灯功能
	        	mother.useLamp();
	        }
	        if(identity==3) {
	        	Child child=new Child();
	        	System.out.println("终于到了双休日，宝宝开启了赖床模式。但最终宝宝还是被叫醒了，起床后第一件事就是去看他养的鱼。");
	        	//调用智能鱼缸相关功能
	        	child.useFishBowl();
	        	System.out.println("因为起床晚了，宝宝没有吃早饭，只能去冰箱里搜刮写吃的了。");
	        	//调用冰箱相关功能
	        	child.useRefrigerator();
	        	System.out.println("吃完东西后，刚好到了《粉红猪小妹6》的播出时间，他迫不及待地打开电视，津津有味地看了起来。");
	        	//调用电视机相关功能
	        	child.useTelevision();
	        	System.out.println("过了一会，宝宝的朋友小依来找他玩，他开心地去开门。");
	        	//调用智能门相关功能
	        	System.out.println("小依觉得房间里有点热，但是宝宝不会用空调，只好把妈妈叫来使用空调。");
	        	//调用空调相关功能
	        	child.useAirConditioner();
	        	System.out.println("宝宝去冰箱里拿蛋糕给小依，但是却发现蛋糕没了，宝宝很失望，答应下次在给小依吃。");
	        	//调用冰箱相关功能	      
	        	child.useRefrigerator();
	        }
	        
		}
		
        
	}

}

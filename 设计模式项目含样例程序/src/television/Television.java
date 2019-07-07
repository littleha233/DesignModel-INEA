package television;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

import appliance.Appliance;

public class Television extends Appliance implements Proxy{
	
      //电视机的属性	
	  
      private State state = State.working;//电视机状态
      
      private String name ="电视机";
      
      private int screenSize = 14;//电视机屏幕大小尺寸
      
      private int power = 30 ;//电视功率
      
      public int cur,i=-1,j;
      
      private int column=0;  //初始化音量大小
      //方法
      public String getName() {
    	  return name;
      }
      
      public State getState() {
    	  return state;
      }
      public int getPower() {
    	  return power;
      }
       
      public void open() {  //打开电视机
    	  System.out.println("电视机已打开！");
    	  state = State.working;
      }
      
      public void close() {  //关闭电视机
    	  System.out.println("电视机已关闭！");
    	  state = State.free;
      }
      
      public Boolean usedBy(String user) {
    	  return true;
      }
      
      Scanner scanner=new Scanner(System.in);
      
      //电视工作方法
      public void work() {
    	  System.out.println("现在是否打开电视机[1]是[2]否");
    	  int choice1=scanner.nextInt();
    	  if(choice1==1) {
    		  open();
    		  showMenu();
    		 
    	  }
    	  else {
    		  System.out.println("电视机未打开，无法进行操作！");
    		  System.out.println("现在是否打开电视机[1]是[2]否");
    		  choice1=scanner.nextInt();
        	  if(choice1==1) {
        		  open();
        		  showMenu();
        		 
        	  }
    	  }
    	  
      }
      
      public void showMenu(){
    	  System.out.println("请选择你的操作：[1]调节音量 [2]选择节目类型[3]返回上一个节目[0]退出");
    	  
    	  int choice2=scanner.nextInt();
		  switch(choice2) {
		  case 1:
			  setColumn();
			  break;
		  case 2:
			  initChannel();
			  selectChannel();
			  break;
		  case 3:
			  backChannel();
		  case 0:
			  close();
		  }
    	  
      }
      
      public int getColumn() {
    	  return column;
      }
      
      public void setColumn() {
    	  System.out.println("输入音量");
    	  int col=scanner.nextInt();
    	  column=col;
    	  System.out.println("现在音量是"+getColumn());
    	  
      }
      
      List<Channel> channels = new ArrayList<Channel>();
      
     //初始化节目列表
      public void initChannel() {
    
    	  
    	//添加已有的节目
  		channels.add(new Channel("篮球"  ,"体育",1));
  		channels.add(new Channel("足球"  ,"体育",2));
  		channels.add(new Channel("羽毛球","体育",3));
  		channels.add(new Channel("游泳"  ,"体育",4));
  		channels.add(new Channel("军事"  ,"新闻" ,5));
  		channels.add(new Channel("经济"  ,"新闻" ,6));
  		channels.add(new Channel("文化"  ,"新闻" ,7));
  		channels.add(new Channel("快乐大本营" ,"娱乐",8));
  		channels.add(new Channel("脱口秀","娱乐",9));
  		channels.add(new Channel("旅游"  ,"娱乐",10));
      }
      
      //选择节目类型
      public void selectChannel() {
    	  System.out.println("输入你选择的节目类型[1]体育 [2]新闻 [3]娱乐");
    	  int choice3 = scanner.nextInt();
    	  switch(choice3) {
    	  case 1:
    		  Criteria sport = new CriteriaSport();
    		  System.out.println("体育: ");
    		  printChannels(sport.meetCriteria(channels));
    		  selectChannelNum();
    		  break;
    	  case 2:
    		  Criteria news = new CriteriaNews();
    		  System.out.println("新闻: ");
    		  printChannels(news.meetCriteria(channels));
    		  selectChannelNum();
    		  break;
    	  case 3:
    		  Criteria variety = new CriteriaVariety();
    		  System.out.println("娱乐: ");
    		  printChannels(variety.meetCriteria(channels));
    		  selectChannelNum();
    		  break;
    	  }
    	  
      }
		
      
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      
      //选择具体节目频道数，
      public void selectChannelNum() {
    	  System.out.println("输入你选择的节目的频道数：");
    	  int channelNum = scanner.nextInt();
    	  cur=channelNum;
    	  for(Channel channel : channels) {
    		  if(channel.getNum()==cur) {
    			  System.out.println("您当前正在观看频道"+channel.getNum()+","+channel.getKind()
    			  +"中的"+channel.getName());
    		  }
    	  }
          
          originator.setNumber(cur);
          careTaker.add(originator.saveNumberToMemento());
          i++;
          j=i;
    	  showMenu();
      }
	
      //返回上一个节目频道
      public void backChannel() {
    	  if(i>=0) {
    	    originator.getNumberFromMemento(careTaker.get(--i));
    	    for(Channel channel : channels) {
     		  if(channel.getNum()==originator.getNumber()) {
     			  System.out.println("您当前正在观看频道"+channel.getNum()+","+channel.getKind()
     			  +"中的"+channel.getName());
     		  }
    	    }
    	  }
    	  else {
    		  i=j;
    		  originator.getNumberFromMemento(careTaker.get(j));
    		  for(Channel channel : channels) {
         		  if(channel.getNum()==originator.getNumber()) {
         			  System.out.println("您当前正在观看频道"+channel.getNum()+","+channel.getKind()
         			  +"中的"+channel.getName());
         		  }
        	  }
    	  }
    	  showMenu();
      }
	    
	//输出节目分类
	public static void printChannels(List<Channel> channels){
	   for (Channel channel : channels) {
	   System.out.println("Channel : [ Name : " + channel.getName() 
	   +", Kind : " + channel.getKind() 
	   +", Num : " + channel.getNum()
	   +" ]");
	   }
	}  

      
      
      
      
}

package television;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

import appliance.Appliance;

public class Television extends Appliance implements Proxy{
	
      //���ӻ�������	
	  
      private State state = State.working;//���ӻ�״̬
      
      private String name ="���ӻ�";
      
      private int screenSize = 14;//���ӻ���Ļ��С�ߴ�
      
      private int power = 30 ;//���ӹ���
      
      public int cur,i=-1,j;
      
      private int column=0;  //��ʼ��������С
      //����
      public String getName() {
    	  return name;
      }
      
      public State getState() {
    	  return state;
      }
      public int getPower() {
    	  return power;
      }
       
      public void open() {  //�򿪵��ӻ�
    	  System.out.println("���ӻ��Ѵ򿪣�");
    	  state = State.working;
      }
      
      public void close() {  //�رյ��ӻ�
    	  System.out.println("���ӻ��ѹرգ�");
    	  state = State.free;
      }
      
      public Boolean usedBy(String user) {
    	  return true;
      }
      
      Scanner scanner=new Scanner(System.in);
      
      //���ӹ�������
      public void work() {
    	  System.out.println("�����Ƿ�򿪵��ӻ�[1]��[2]��");
    	  int choice1=scanner.nextInt();
    	  if(choice1==1) {
    		  open();
    		  showMenu();
    		 
    	  }
    	  else {
    		  System.out.println("���ӻ�δ�򿪣��޷����в�����");
    		  System.out.println("�����Ƿ�򿪵��ӻ�[1]��[2]��");
    		  choice1=scanner.nextInt();
        	  if(choice1==1) {
        		  open();
        		  showMenu();
        		 
        	  }
    	  }
    	  
      }
      
      public void showMenu(){
    	  System.out.println("��ѡ����Ĳ�����[1]�������� [2]ѡ���Ŀ����[3]������һ����Ŀ[0]�˳�");
    	  
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
    	  System.out.println("��������");
    	  int col=scanner.nextInt();
    	  column=col;
    	  System.out.println("����������"+getColumn());
    	  
      }
      
      List<Channel> channels = new ArrayList<Channel>();
      
     //��ʼ����Ŀ�б�
      public void initChannel() {
    
    	  
    	//������еĽ�Ŀ
  		channels.add(new Channel("����"  ,"����",1));
  		channels.add(new Channel("����"  ,"����",2));
  		channels.add(new Channel("��ë��","����",3));
  		channels.add(new Channel("��Ӿ"  ,"����",4));
  		channels.add(new Channel("����"  ,"����" ,5));
  		channels.add(new Channel("����"  ,"����" ,6));
  		channels.add(new Channel("�Ļ�"  ,"����" ,7));
  		channels.add(new Channel("���ִ�Ӫ" ,"����",8));
  		channels.add(new Channel("�ѿ���","����",9));
  		channels.add(new Channel("����"  ,"����",10));
      }
      
      //ѡ���Ŀ����
      public void selectChannel() {
    	  System.out.println("������ѡ��Ľ�Ŀ����[1]���� [2]���� [3]����");
    	  int choice3 = scanner.nextInt();
    	  switch(choice3) {
    	  case 1:
    		  Criteria sport = new CriteriaSport();
    		  System.out.println("����: ");
    		  printChannels(sport.meetCriteria(channels));
    		  selectChannelNum();
    		  break;
    	  case 2:
    		  Criteria news = new CriteriaNews();
    		  System.out.println("����: ");
    		  printChannels(news.meetCriteria(channels));
    		  selectChannelNum();
    		  break;
    	  case 3:
    		  Criteria variety = new CriteriaVariety();
    		  System.out.println("����: ");
    		  printChannels(variety.meetCriteria(channels));
    		  selectChannelNum();
    		  break;
    	  }
    	  
      }
		
      
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      
      //ѡ������ĿƵ������
      public void selectChannelNum() {
    	  System.out.println("������ѡ��Ľ�Ŀ��Ƶ������");
    	  int channelNum = scanner.nextInt();
    	  cur=channelNum;
    	  for(Channel channel : channels) {
    		  if(channel.getNum()==cur) {
    			  System.out.println("����ǰ���ڹۿ�Ƶ��"+channel.getNum()+","+channel.getKind()
    			  +"�е�"+channel.getName());
    		  }
    	  }
          
          originator.setNumber(cur);
          careTaker.add(originator.saveNumberToMemento());
          i++;
          j=i;
    	  showMenu();
      }
	
      //������һ����ĿƵ��
      public void backChannel() {
    	  if(i>=0) {
    	    originator.getNumberFromMemento(careTaker.get(--i));
    	    for(Channel channel : channels) {
     		  if(channel.getNum()==originator.getNumber()) {
     			  System.out.println("����ǰ���ڹۿ�Ƶ��"+channel.getNum()+","+channel.getKind()
     			  +"�е�"+channel.getName());
     		  }
    	    }
    	  }
    	  else {
    		  i=j;
    		  originator.getNumberFromMemento(careTaker.get(j));
    		  for(Channel channel : channels) {
         		  if(channel.getNum()==originator.getNumber()) {
         			  System.out.println("����ǰ���ڹۿ�Ƶ��"+channel.getNum()+","+channel.getKind()
         			  +"�е�"+channel.getName());
         		  }
        	  }
    	  }
    	  showMenu();
      }
	    
	//�����Ŀ����
	public static void printChannels(List<Channel> channels){
	   for (Channel channel : channels) {
	   System.out.println("Channel : [ Name : " + channel.getName() 
	   +", Kind : " + channel.getKind() 
	   +", Num : " + channel.getNum()
	   +" ]");
	   }
	}  

      
      
      
      
}

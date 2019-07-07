package washer;


import java.util.Scanner;
import java.util.Timer;

import javax.print.attribute.standard.MediaSize.NA;

import appliance.Appliance;
import appliance.Appliance.State;

public class Washer extends Appliance implements Wash {

	// ϴ�»�������
	public String name="ϴ�»�";  //����
	public State state = State.free; // ״̬
	private int power = 30;// ����

	// ����
	public Wash decoratedWash;

	
	
	public Washer(Wash decoratedWash) {
		this.decoratedWash = decoratedWash;
	}

	public void washClothes() {
		decoratedWash.washClothes();
	}
	
	//��ʱ���ܲ���
	private WasherTimeSetter washerTimeSetter=new WasherTimeSetter();
	
	public void setTime(String time1,String time2) {
		washerTimeSetter.setTime(time1, time2);
	}
	
	public String[] getTime() {
		return washerTimeSetter.getTime();
	}
	
	public void setWasherTime() {
		WasherTimeSetterClient client=new WasherTimeSetterClient();
		System.out.println("������ϴ�»�עˮ������ʱ��(����):");
		Scanner scanner3= new Scanner(System.in);
		String time1= scanner3.nextLine();
		System.out.println("������ϴ�»���Ͳ����ʱ��(����):");
		Scanner scanner4= new Scanner(System.in);
		String time2= scanner4.nextLine();
		client.setTime(time1,time2);
		client.printTime();
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("ϴ�»�עˮ����ֹͣ����");
		try {  
            Thread.sleep(1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();
        }
		System.out.println("ϴ�»���Ͳ��ֹͣ����");
	}
	

	//Ͱ�Խ�
	private void washerCleanItself() throws InterruptedException {
		System.out.println("���ڽ���Ͱ�Խ�!");
        Thread.sleep(1200);
		System.out.println("Ͱ�Խ��ѽ���!");
	}
    
	//��ȡ����
    public String getName() {
		return name;
    }
    
	// ��ȡ��ϴ�»�״̬
	public State getState() {
		return state;
	}

	// ��ȡ��ϴ�»�����
		public int getPower() {
			return power;
		}


	// ��������ж�ʹ�����Ƿ���Ȩ��ʹ��ϴ�»�
	public Boolean usedBy(String identity) {
		return true;
	}

	// ��ϴ�»�
	public void open() {
		// ϴ�»�״̬�ı�Ϊworking
		System.out.println("ϴ�»���������");
		state = State.working;
	}

	// �ر�ϴ�»�
	public void close() {
		// ϴ�»�״̬�ı��free
		System.out.println("ϴ�»���ֹͣ������");
		state = State.free;
	}
	//չʾϴ�»����ܲ˵�
	public void showWasherMenu() {
		System.out.println("��ѡ��:\n"
				+"[1]Ͱ�Խ�\n"
				+"[2]��ͨϴ\n"
				+"[3]ǿ��ϴ\n"
				+"[4]��ͨϴ�����\n"
				+"[5]ǿ��ϴ�����\n"
				+"[6]Ϊϴ�»���ʱ\n"
				+"[0]�˳�");
	}

	// ϴ�»����о��巽��
	public void work(){
		// ʵ�ֶ��ض�ϴ�»��ľ������
		// �ο�������ʵ��ϴ�»����е��������

		Scanner scanner = new Scanner(System.in);
		System.out.println("�����Ƿ�����ϴ�»�:[1]��[2]��");
		int choice1 = scanner.nextInt();
		//int washiden=-1;
		if (choice1 == 1) {
			open();
			while (true) {
				showWasherMenu();
				Scanner scanner2 = new Scanner(System.in);
				int choice2 = scanner2.nextInt();
				if (choice2 == 0) {
					break;
				} else {
					switch (choice2) {
					case 1:
						try {
							washerCleanItself();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 2:
//						if(washiden==1) {
//							System.out.println("���ڽ���ǿ��ϴ��");
//							break;
//						}
//						else {
//							Wash OrdinaryWash = new OrdinaryWash();
//							OrdinaryWash.washClothes();
//					        washiden=1;
//							break;
//						}
						Wash OrdinaryWash = new OrdinaryWash();
						OrdinaryWash.washClothes();
                        break;

					case 3:
//						if(washiden==1) {
//							System.out.println("���ڽ�����ͨϴ��");
//							break;
//						}
//						else {
//							Wash StrongWash = new StrongWash();
//							StrongWash.washClothes();
//							washiden=1;
//							break;
//						}
						Wash StrongWash = new StrongWash();
						StrongWash.washClothes();
						break;

					case 4:
						Wash dryOrdinaryWash = new Dryer(new OrdinaryWash());
						dryOrdinaryWash.washClothes();
						break;

					case 5:
						Wash dryStrongWash = new Dryer(new StrongWash());
						dryStrongWash.washClothes();
						break;
						
					case 6:
						setWasherTime();
						break;

					default:
						break;
					}

				}

			}

		}

		else {
			System.out.println("ϴ�»�δ����!");
		}

	}
}
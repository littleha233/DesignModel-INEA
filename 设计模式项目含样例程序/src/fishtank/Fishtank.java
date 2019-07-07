package fishtank;

import java.util.*;

import appliance.Appliance;
import appliance.Appliance.State;

public class Fishtank extends Appliance{
	
	ArrayList<String> fish = new ArrayList<>(); // ԡ�������
	
	// ��׵�����
	public State state = State.working; // ״̬
	
	private int power = 10; // ����
	
	public static int Room = 10; // ����ݻ�
	
	public int temperature = 17; // ��ǰˮ��
	
	public String brightness; // ���������
	
	public String lightcolor; // ����ڹ��ߵ���ɫ
	
	// ����
	
	public void open() {//����
		System.out.println("�����������");
		state = State.working;
	}
	
	public void changeWater() {//��ˮ
		System.out.println("����ڵ�ˮ�Ѹ�����ϣ�");
	}
	
	public void adjustBright() {//��������
		System.out.println("�����ѵ���������״̬��");
	}
	
	public void feed() {//����ιʳ
		System.out.println("ιʳ��ϣ�");
	}
	
	public void close() {//�ر�
		System.out.println("�����ֹͣ������");
		state = State.free;
	}
	
	//��ȡ���״̬
	public State getState() {
		System.out.println("״̬��" + state);
		return state;
	}
	
	//��ȡ����״̬
	public void getFishtankWorkState() {
		System.out.println("��ǰ����״̬��" + state);
	}
	
	//����ʹ��Ȩ��
	public Boolean usedBy(String identity) {
		// TODO Auto-generated method stub
		return true;
	}
	
	//������׵Ĺ�������
	public void work(){
		Scanner scanner = new Scanner(System.in);
//		System.out.println("�����Ƿ�����ͨ�磺[1]�� [2]��");
		int choice1 = 1;
		if (choice1 == 1) {
			open();
			System.out.println("�����Ƿ����ף�[1]�� [2]��");
			int choice2 = scanner.nextInt();
			if(choice2 == 1) {
				while(true) {
					System.out.println("���������ѡ��[1]��ˮ[2]��������[3]�����¶�"
							+"[4]����ιʳ[0]�˳�");
					int choice3 = -1;
					choice3 = scanner.nextInt();
					if(choice3 == 0) {
						break;
					}else {
						if(choice3 == 1) {
							changeWater();
						}
						if(choice3 == 2) {
							adjustBright();
						}
						if(choice3 == 3) {
					        System.out.println("�����뵱ǰ�¶�");
					        int tempT=scanner.nextInt();
					        if(tempT>temperature) {
					        	HighApproTemp highApproTemp=new HighApproTemp();
					        	highApproTemp.adjust(temperature,tempT);
					    	   
					        }
					        else {
					        	 LowApproTemp lowApproTemp=new LowApproTemp();
						         lowApproTemp.adjust(temperature,tempT);
					        }
					    
						}
						if(choice3 == 4) {
							feed();
						}
					}
				}
			}else {
				System.out.println("���δ�򿪣�");
			}
		}else {
			System.out.println("���δͨ�磡");
		}
	} 
}

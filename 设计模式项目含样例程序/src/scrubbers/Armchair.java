package scrubbers;

import java.util.*;

import appliance.Appliance;
import appliance.Appliance.State;


public class Armchair extends Appliance {
	
// ��Ħ�ε�����
	private State state = State.working;// ״̬
	
	private int power = 20;// ����
	
	private String name="���ܰ�Ħ��";
//------------------------------------------------------------------------
	
// ����
	
	public void open() { // ����
		// TODO Auto-generated method stub
		System.out.println("��Ħ����������");
		state = State.working;
	}
	
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("��Ħ����ֹͣ������");
		state = State.free;
	}
//------------------------------------------------------------------------
	
	public String getName() {
		return name;
	}
	
	public int getPower() {
		return power;
	}
	
    //��ȡ��Ħ��״̬	
	public State getstate() {
		
		return state;
	}
	
	// ����ʹ��Ȩ��
	public Boolean usedBy(String identity) {
		// TODO Auto-generated method stub
            return true;
	}
	
	//չʾ�˵�
	public void showMenu() {
		System.out.println("��ѡ����Ҫ��Ħ�Ĳ�λ��[1]���� [2]�ֱ� [3]����"
				+"[4]�Ȳ� [5]�㲿 [6]���[0]�˳�");
	}
	
	
	// ��Ħ�εĹ�������
	public void work() {
		// TODO Auto-generated method stub
  
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����Ƿ�������Ħ�Σ�[1]�� [2]��");
		int choice1 = scanner.nextInt();
		if(choice1 == 1) {
			while(true) {
				open();
				showMenu();
				int choice2 = scanner.nextInt();
				if(choice2==0) {
					break;
				}
				else {
					switch (choice2) {
					case 1:
						System.out.println("������Ħ���Ѵ򿪣�");
						System.out.println("������Ƶ�ʣ�");
						int neckPower = scanner.nextInt();
						System.out.println("���óɹ���");
						
						break;
					case 2:
						System.out.println("�ֱ۰�Ħ���Ѵ򿪣�");
						System.out.println("������Ƶ�ʣ�");
						int armPower = scanner.nextInt();
						System.out.println("���óɹ���");
						
						break;
					case 3:
						System.out.println("������Ħ���Ѵ򿪣�");
						System.out.println("������Ƶ�ʣ�");
						int waistPower = scanner.nextInt();
						System.out.println("���óɹ���");
						
						break;
					case 4:
						System.out.println("�Ȳ���Ħ���Ѵ򿪣�");
						System.out.println("������Ƶ�ʣ�");
						int legPower = scanner.nextInt();
						System.out.println("���óɹ���");
						
						break;
					case 5:
						System.out.println("�㲿��Ħ���Ѵ򿪣�");
						System.out.println("������Ƶ�ʣ�");
						int footPower = scanner.nextInt();
						System.out.println("���óɹ���");
						
						break;
					case 6:
						System.out.println("��Ħ���Ѱ�������Ҫ��򿪣�");
						System.out.println("������Ƶ�ʣ�");
						int power = scanner.nextInt();
						System.out.println("���óɹ���");
						
						break;
					case 0:
						break;
					default:
						break;
					}
				}
			}
		}else {
			System.out.println("��Ħ��δ�򿪣�");
		}
	}
}

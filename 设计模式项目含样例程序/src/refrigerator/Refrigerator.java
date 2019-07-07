package refrigerator;

import java.util.*;

import appliance.Appliance;


public class Refrigerator extends Appliance implements Container {

	// ���ʳ��
	public String foodNames[] = {"����","����","��ݮ","ƻ��","�㽶"};

	
	// ���������
	private String name="����";
	
	public State state = State.free; // ״̬

	private int power = 20;// ����

    public static int Room=20;//�����ݻ�

	public int temperature = 0;// ��ǰ�¶�

	public String workstate;// ��ػ������䶳״̬

	// ����

	public void open() { // ����
		// TODO Auto-generated method stub
		System.out.println("������������");
		state = State.working;
	}

	public void openRefri() // �򿪱�����
	{
		System.out.println("�������Ѵ�!");
	}

	
	// ��������ʳ��
	public void getFood(){
		   Refrigerator refrigerator=new Refrigerator();
		   
		   System.out.println("ʳ���ǣ�");
		    
		    for(MyIterator iter=refrigerator.getIterator();iter.hasNext();) {
		    	String name=(String)iter.next();
		    	System.out.println(name);
		    }
	}
	
	
	//��������ز���
	@Override 
	public MyIterator getIterator() {
		return new RefrigeratorIterator();
	}
	
	private class RefrigeratorIterator implements MyIterator{
		int index;
		
		@Override
		public boolean hasNext() {
			if(index<foodNames.length) {
				return true;
			}
			return false;			
		}
		
		@Override
		public Object next() {
			if(this.hasNext()) {
				return foodNames[index++];
			}
			return null;
		}		
	}

	
	//ѡ����������
	public void ChooseDrinkType() {
		
		AbstractFoodFactory drinkFactory=FoodFactoryProducer.getFactory("drink");
		System.out.println("�����ѡ��[1]���� [2]��������");
		
		Scanner scanner = new Scanner(System.in);
		int drinkChoice=scanner.nextInt();
		if(drinkChoice==1) {
			Drink drink1=drinkFactory.getType("Cold");
			drink1.show();
		}
		else if(drinkChoice==2) {
			Drink drink1=drinkFactory.getType("Warm");
			drink1.show();
		}
		
	}
	
	
	//ѡ��ˮ������
	public void ChooseFruitType() {
		
		AbstractFoodFactory fruitFactory=FoodFactoryProducer.getFactory("fruit");
		System.out.println("�����ѡ��[1]ƻ�� [2]�㽶");
		
		Scanner scanner = new Scanner(System.in);
		int fruitChoice=scanner.nextInt();
		if(fruitChoice==1) {
			Fruit fruit1=fruitFactory.getFruitType("Apple");
			fruit1.display();
		}
		else if(fruitChoice==2) {
			Fruit fruit2=fruitFactory.getFruitType("Banana");
			fruit2.display();
		}
		
	}
	
	
	// ���ñ��乤��״̬--�䶳�����
	public void SetRefrigeratorWorkstate() {
		System.out.println("��ѡ��һ�ֹ���ģʽ��[1]�䶳  [2]���");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			workstate = "�䶳";
			System.out.println("���ڱ���������Ϊ�䶳״̬��");
		}
		if (choice == 2) {
			workstate = "���";
			System.out.println("���ڱ���������Ϊ���״̬��");
		}
	}

	// �رձ�����
	public void closeRefri() {
		System.out.println("�������ѹرգ�");
	}

	// �ص����䣬ֹͣ����
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("������ֹͣ������");
		state = State.free;
	}
//------------------------------------------------------------------------

	//��ȡ����
	public String getName() {
		System.out.println("����");
		return name;
	}
	
	//��ȡ���书��
	public int getPower() {
		System.out.println("���书����"+power);
		return power;
	}
//��ȡ����״̬
	public State getstate() {
		System.out.println("״̬��" + state);
		return state;
	}

	// ��ȡ����״̬
	public void GetRefrigeratorWorkstate() {
		System.out.println("��ǰ����״̬��:" + workstate);
	}
	

	// ����ʹ��Ȩ��
	public Boolean usedBy(String identity) {
		return true;		
	}
	
	//չʾ���书�ܲ˵�
	public void showRefriMenu() {
		System.out.println("��ѡ����Ĳ���:\n"
				+ "[1]��������ʳ��\n"
				+ "[2]ѡ���䶳�����\n"
				+ "[3]ѡ������\n"
				+ "[4]ѡ��ˮ��\n"
				+ "[0]�˳�");
	}

	// ����Ĺ�������
	public void work() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//System.out.println("�����Ƿ������ͨ��:[1]��[2]��");
		int choice1 = 1;
		if (choice1 == 1) {
			open();
			System.out.println("�����Ƿ�򿪱���:[1]��[2]��");
			int choice2 = scanner.nextInt();
			if (choice2 == 1) {

				while (true) {
					showRefriMenu();
					int choice3 = -1;
					choice3 = scanner.nextInt();
					if (choice3 == 0) {
						break;
					} else {

						if (choice3 == 1) {
							getFood();
						}
						if (choice3 ==2) {
							SetRefrigeratorWorkstate();
						}
						if (choice3 == 3) {
							ChooseDrinkType();
						}
						if (choice3 == 4) {
							ChooseFruitType();
						}
					}
				}

			} else {
				System.out.println("������δ��");
			}
		} else {
			System.out.println("����δͨ��");
		}

	}

}

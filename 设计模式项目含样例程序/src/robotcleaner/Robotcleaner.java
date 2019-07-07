package robotcleaner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;


public class Robotcleaner extends Visitor{
	private String curloc;
	
	Robotcleaner(String loc){//���캯��������ָ����Ҫ��ɨ��λ��
		curloc = loc;
	}
	
	public Robotcleaner(){//�޲���Ĭ�Ͻ��������Ӵ�ɨһ��
		this("");
	}
	private String name="ɨ�ػ�����";
	
	public String getName() {
		return name;
	}
	
	private State state=State.working;
	public State getState() {
		return state;
	}
	
	private int power=50;
	public int getPower() {
		return power;
	}
	
	
	public Boolean usedBy(String identity) {
		return true;
	}
	@Override
	public void visit(Room room) {//���ʷ���
		String clean = cleanup();//��ɨ����
		System.out.println(curloc + "/" + room + clean);
	}

	@Override
	public void visit(Compound compound) {//���ʸ�����
		//String clean = cleanup();//��ɨ����
		System.out.println(curloc + "/" + compound);
		String saveloc = curloc;
		curloc += "/" + compound.getName();
		Iterator it = compound.iterator();
		while(it.hasNext()) {//�ݹ������������
			Space space = (Space) it.next();
			space.accept(this);
		}
		curloc = saveloc;
	}
	
	private String cleanup() {//ģ��ɨ�ػ����˴�ɨ����Ķ���
		return "��ɨ�ɾ�����";
	}
	
	public void work()  {//������Ҫ��ɨ�����򣬿�ʼ����
		Scanner sc = new Scanner(System.in);
        while(true) {
			System.out.println("\n������ɨ�ػ�������Ҫ��ɨ������");
			System.out.println("[1]��ܰ�ļ� [2]���� [3]���� [4]���� [5]���������� [6]����");
			System.out.println("[7]����ϴ�� [8]����ʽ���� [9]���� [10]���� [11]����� [0]�˳�");

			int option = sc.nextInt();
			if(option == 0)break;
			Robotcleaner Rob = new Robotcleaner();
			Searchroom sh = new Searchroom();
			switch(option) {
			//case(0): break;
			case(1): {
				Rob.visit(Space.myhouse());
				break;
			}
			case(2): {
				sh.setloc("����");
				sh.visit(Space.myhouse());
				Rob.visit((Compound)sh.sp);
				break;
			}
			case(3): {
				sh.setloc("����");
				sh.visit(Space.myhouse());
				Rob.visit((Compound)sh.sp);
				break;
			}
			case(4): {
				sh.setloc("����");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(5): {
				sh.setloc("����������");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(6): {
				sh.setloc("����");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(7): {
				sh.setloc("����ϴ��");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(8): {
				sh.setloc("����ʽ����");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(9): {
				sh.setloc("����");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(10): {
				sh.setloc("����");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			case(11): {
				sh.setloc("�����");
				sh.visit(Space.myhouse());
				Rob.visit((Room)sh.sp);
				break;
			}
			
			}
        }
	}

}

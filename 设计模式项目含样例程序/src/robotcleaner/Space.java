package robotcleaner;

public abstract class Space {
	
	public abstract String getName(); //ȡ������
	
	public abstract int getSize(); //ȡ���С
	
	public String toString() { //string ��ʽ
		return getName() + " (" + getSize() + ")";
	}

	public abstract void accept(Visitor v);
	
	public static Compound myhouse() {//����һ����������Ϊ����ܰ�ļҡ���Compound��
		Compound house = new Compound("��ܰ�ļ�");
		Compound middle_space = new Compound("����");
		Compound main_bedroom = new Compound("����");
		Room side_bedroom = new Room("����" , 20);
		Room main_bed = new Room("����������" , 30);
		Room in_bathroom = new Room("����" , 10);
		Room main_bathroom = new Room("����ϴ��" , 15);
		Room kitchen = new Room("����ʽ����" , 10);
		Room living_room = new Room("����" , 40);
		Room dining_room = new Room("����" , 20);
		Room utility_room = new Room("�����", 20);
		
		house.add(middle_space);
		house.add(main_bedroom);
		house.add(side_bedroom);
		house.add(main_bathroom);
		house.add(utility_room);
		
		middle_space.add(living_room);
		middle_space.add(kitchen);
		middle_space.add(dining_room);
		
		main_bedroom.add(main_bed);
		main_bedroom.add(in_bathroom);
		
		return house;
	}

}

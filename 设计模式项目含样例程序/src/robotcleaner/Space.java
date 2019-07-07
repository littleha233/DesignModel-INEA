package robotcleaner;

public abstract class Space {
	
	public abstract String getName(); //取其名称
	
	public abstract int getSize(); //取其大小
	
	public String toString() { //string 格式
		return getName() + " (" + getSize() + ")";
	}

	public abstract void accept(Visitor v);
	
	public static Compound myhouse() {//返回一个构建的名为“温馨的家”的Compound类
		Compound house = new Compound("温馨的家");
		Compound middle_space = new Compound("中厅");
		Compound main_bedroom = new Compound("主卧");
		Room side_bedroom = new Room("侧卧" , 20);
		Room main_bed = new Room("主卧室区域" , 30);
		Room in_bathroom = new Room("内卫" , 10);
		Room main_bathroom = new Room("主盥洗室" , 15);
		Room kitchen = new Room("开放式厨房" , 10);
		Room living_room = new Room("客厅" , 40);
		Room dining_room = new Room("餐厅" , 20);
		Room utility_room = new Room("杂物间", 20);
		
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

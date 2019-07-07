package robotcleaner;

public class Room extends Space {//房间类，代表最小粒度的空间，不可再细分
	private String name;
	private int size;
	
	public Room(String name, int size) {//ctor
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public void accept(Visitor v) {//回应Visitor
		v.visit(this);
	}
}

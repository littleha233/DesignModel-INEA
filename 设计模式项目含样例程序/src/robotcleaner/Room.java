package robotcleaner;

public class Room extends Space {//�����࣬������С���ȵĿռ䣬������ϸ��
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
	
	public void accept(Visitor v) {//��ӦVisitor
		v.visit(this);
	}
}

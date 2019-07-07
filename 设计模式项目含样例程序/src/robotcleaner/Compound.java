package robotcleaner;

import java.util.Iterator;
import java.util.Vector;

public class Compound extends Space {//���Ͽռ��ࣨCompositeģʽ�������п��ܰ���Compound��room
	private String name; //Ŀ¼����
	//private Vector comp = new Vector(); 
	private Vector<Space> comp = new Vector<Space>();//����
	public Compound(String name) { //ctor
		this.name = name;
	}
	
	public String getName() { //��ø��Ͽռ�����
		return name;
	}
	
	public int getSize() { //��ø��Ͽռ��С
		int size = 0;
		Iterator<Space> it = comp.iterator();
		while (it.hasNext()) {
		//Space space = (Space)it.next();
		Space space = it.next(); //ȡ��Ԫ�ز�ǰ��
		size += space.getSize();
		}
		return size;
	}
	
	public Space add(Space space) { //����Space��Room����Compound��
		comp.add(space); //����һ��Space ��������
		return this;
	}
	
	public Iterator iterator() {//���ش˸��Ͽռ�����������
		return comp.iterator();
	}
	
	public void accept(Visitor v) {//��ӦVisitor���ʲ��ݹ�
		v.visit(this);
	}
}



package robotcleaner;

import java.util.Iterator;
import java.util.Vector;

public class Compound extends Space {//复合空间类（Composite模式），其中可能包含Compound和room
	private String name; //目录名称
	//private Vector comp = new Vector(); 
	private Vector<Space> comp = new Vector<Space>();//容器
	public Compound(String name) { //ctor
		this.name = name;
	}
	
	public String getName() { //获得复合空间名称
		return name;
	}
	
	public int getSize() { //获得复合空间大小
		int size = 0;
		Iterator<Space> it = comp.iterator();
		while (it.hasNext()) {
		//Space space = (Space)it.next();
		Space space = it.next(); //取其元素并前进
		size += space.getSize();
		}
		return size;
	}
	
	public Space add(Space space) { //新增Space（Room或者Compound）
		comp.add(space); //把这一块Space 加入容器
		return this;
	}
	
	public Iterator iterator() {//返回此复合空间容器迭代器
		return comp.iterator();
	}
	
	public void accept(Visitor v) {//回应Visitor访问并递归
		v.visit(this);
	}
}



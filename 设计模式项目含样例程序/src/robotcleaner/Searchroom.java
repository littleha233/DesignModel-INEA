package robotcleaner;

import java.util.Iterator;

public class Searchroom extends Visitor {//此类用于寻找指定名字的房间
	public String loc;
	public Space sp;
	
	Searchroom(String loc){
		this.loc = loc;
		this.sp = Space.myhouse();
	}
	
	Searchroom(){
		this("温馨的家");
	}
	
	public void setloc(String loc) {
		this.loc = loc;
	}
	@Override
	public void visit(Room room) {
		if(room.getName().equals(loc))sp = room;
	}

	@Override
	public void visit(Compound compound) {
		Iterator it = compound.iterator();
		while(it.hasNext()) {//递归访问整个房子
			Space space = (Space) it.next();
			if(space.getName().equals(loc))sp = space;
			space.accept(this);
		}
	}

}

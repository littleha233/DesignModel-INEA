package television;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = 
			new ArrayList<Memento>();

	public void add(Memento number){
	      mementoList.add(number);
	   }
	
	public Memento get(int index){
	      return mementoList.get(index);
	   }
	
}

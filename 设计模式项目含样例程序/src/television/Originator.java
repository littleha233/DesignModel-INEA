package television;

public class Originator {
	private int number;
	
	public void setNumber(int number) {
		this.number=number;
	} 

	public int getNumber() {
		return number;
	}
	
	public Memento saveNumberToMemento(){
	      return new Memento(number);
	}
	
	public void getNumberFromMemento(Memento Memento){
	      number = Memento.getNumber();
	}
	
}

package alarm;

public class Burglar_Alarm extends Alarm {//������������Alarm�ࣩ
	
	public Burglar_Alarm() {
		name = "����������";
	}
	
	@Override
	public void alert(boolean state) {//�˺���������ʱ״̬�ı䣬��stateΪtrue�򱨾�
		if(state) {
			System.out.println("��������������");
			notifyall();
		}
	    this.is_alarming = state;
	    
	 }
	
}

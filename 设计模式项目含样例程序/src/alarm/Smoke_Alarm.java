package alarm;

public class Smoke_Alarm extends Alarm {//����������Alarm�ࣩ

	public Smoke_Alarm() {
		name = "��������";
	}
	
	@Override
	public void alert(boolean state) {//�˺���������ʱ״̬�ı䣬��stateΪtrue�򱨾�
		if(state) {
			System.out.println("������������");
			notifyall();
		}
	    this.is_alarming = state;
	    
	 }
	

}

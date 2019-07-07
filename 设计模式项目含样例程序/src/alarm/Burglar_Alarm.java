package alarm;

public class Burglar_Alarm extends Alarm {//防盗报警器（Alarm类）
	
	public Burglar_Alarm() {
		name = "防盗警报器";
	}
	
	@Override
	public void alert(boolean state) {//此函数被调用时状态改变，若state为true则报警
		if(state) {
			System.out.println("防盗报警！！！");
			notifyall();
		}
	    this.is_alarming = state;
	    
	 }
	
}

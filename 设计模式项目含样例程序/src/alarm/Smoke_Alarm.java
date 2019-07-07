package alarm;

public class Smoke_Alarm extends Alarm {//烟雾报警器（Alarm类）

	public Smoke_Alarm() {
		name = "烟雾警报器";
	}
	
	@Override
	public void alert(boolean state) {//此函数被调用时状态改变，若state为true则报警
		if(state) {
			System.out.println("烟雾报警！！！");
			notifyall();
		}
	    this.is_alarming = state;
	    
	 }
	

}

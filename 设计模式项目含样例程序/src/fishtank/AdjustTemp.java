package fishtank;

public class AdjustTemp {
	
	//持有状体处理对象
	
	private TempState state = null;
	
	//方法
	
	public void adjust(Integer approTemp, Integer naturalTemp) {
		if(approTemp < naturalTemp) {
			state = new HighApproTemp();
		}
		if(approTemp > naturalTemp) {
			state = new LowApproTemp();
		}
	}
}

package fishtank;

public class AdjustTemp {
	
	//����״�崦�����
	
	private TempState state = null;
	
	//����
	
	public void adjust(Integer approTemp, Integer naturalTemp) {
		if(approTemp < naturalTemp) {
			state = new HighApproTemp();
		}
		if(approTemp > naturalTemp) {
			state = new LowApproTemp();
		}
	}
}

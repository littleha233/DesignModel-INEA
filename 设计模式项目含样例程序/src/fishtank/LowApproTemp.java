package fishtank;

public class LowApproTemp implements TempState {//温度低于合适温度
	
	public void adjust(Integer approTemp, Integer naturalTemp) {
		//将低于合适温度的值调整到合适温度
		naturalTemp = approTemp;
		System.out.println("水温已适当调高！");
	}
}

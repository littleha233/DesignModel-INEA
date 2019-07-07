package airconditioner;

public class HeatExchanger implements API{

	@Override
	public void running(Integer temperature) {
		// TODO Auto-generated method stub
		System.out.println("制热中,温度"+String.valueOf(temperature)+"摄氏度");
	}

}

package airconditioner;

public class Refrigerators implements API{

	@Override
	public void running(Integer temperature) {
		// TODO Auto-generated method stub
		System.out.println("制冷中,温度"+String.valueOf(temperature)+"摄氏度");
	}

}

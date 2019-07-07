package airconditioner;

public class Run extends Shape{

	public Run(API api,Integer temperature) {
		// TODO Auto-generated constructor stub
		super(api);
		this.temperature=temperature;
	}
	
	private Integer temperature;
	
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	@Override
	public void running() {
		// TODO Auto-generated method stub
		api.running(temperature);
	}

}

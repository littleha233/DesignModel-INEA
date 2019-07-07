package cookingsystem;

public abstract class FunctionAdapter implements Heat{
	private Fire function;
	
	public FunctionAdapter(int heatingType) {
		switch (heatingType) {
		case 1:
			function=SmallFire.getInstance();
			break;
		case 2:
			function=MediumFire.getInstance();
			break;
		case 3:
			function=BigFire.getInstance();
			break;

		default:
			break;
		}
	}

	@Override
	public void heating(int time) {
		// TODO Auto-generated method stub
		function.heating(time);
	}
}

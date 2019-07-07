package television;

public class Telecontroller implements Proxy{

	
	private Television myTelevision;
	public void setTv(Television tv)
	{
		myTelevision=tv;
	}
	
	public void open()
	{
		myTelevision.open();
	}
	
	public void close()
	{
		myTelevision.close();
	}
	
	
}

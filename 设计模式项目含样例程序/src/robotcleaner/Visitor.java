package robotcleaner;

import appliance.Appliance;

public abstract class Visitor extends Appliance {//Visitor∏∏¿‡
	public abstract void visit(Room room);
	public abstract void visit(Compound compound);
}

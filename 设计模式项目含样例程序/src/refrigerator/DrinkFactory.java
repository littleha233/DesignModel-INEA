package refrigerator;

//抽象工厂模式
public class DrinkFactory extends AbstractFoodFactory{
	
	@Override
	public Drink getType(String type) {
		if(type==null) {
			return null;
		}
		if(type.equals("Cold")) {
			return new ColdDrink();
		}
		else if(type.equals("Warm")) {
			return new WarmDrink();
		}
		
		return null;
	}

	@Override 
	public Fruit getFruitType(String fruitType) {
		return null;
	};
	
}

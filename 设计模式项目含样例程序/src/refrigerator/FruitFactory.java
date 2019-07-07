package refrigerator;

//抽象工厂模式
public class FruitFactory extends AbstractFoodFactory{
	
	//@Override
	public Drink getType(String type) {
		return null;
	};
	
	//@Override
	public Fruit getFruitType(String fruitType) {
		if(fruitType==null) {
			return null;
		}
		if(fruitType.equals("Apple")) {
			return new AppleFruit();
		}
		else if(fruitType.equals("Banana")) {
			return new BananaFruit();
		}
		
		return null;
	}

}

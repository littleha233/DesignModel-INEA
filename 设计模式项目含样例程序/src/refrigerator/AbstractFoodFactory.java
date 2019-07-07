package refrigerator;


//抽象工厂模式
public abstract class AbstractFoodFactory {

	public abstract Drink getType(String type);
	public abstract Fruit getFruitType(String fruitType);
}

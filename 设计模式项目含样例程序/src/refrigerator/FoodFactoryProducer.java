package refrigerator;

//抽象工厂模式--冯濛
public class FoodFactoryProducer {
     public static AbstractFoodFactory getFactory(String choice) {
    	 if(choice.equals("drink")) {
    		 return new DrinkFactory();
    	 } else if(choice.equals("fruit")){
             return new FruitFactory();
    	 }
    	 
    	 return null;
     }
}

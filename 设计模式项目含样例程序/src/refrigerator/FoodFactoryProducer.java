package refrigerator;

//���󹤳�ģʽ--���
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

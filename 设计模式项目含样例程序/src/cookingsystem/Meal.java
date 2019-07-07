package cookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	 private List<Food> foods = new ArrayList<Food>();    
	 
	   public void addItem(Food food){
		   System.out.println("做出了"+food.name());
		   foods.add(food);
	   }
	 
	 
	   public void eatFoods(){
	      for (Food food : foods) {
	         System.out.println("吃掉了"+food.name());
	      }        
	   }    

}

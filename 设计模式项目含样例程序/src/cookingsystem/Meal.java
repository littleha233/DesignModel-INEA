package cookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	 private List<Food> foods = new ArrayList<Food>();    
	 
	   public void addItem(Food food){
		   System.out.println("������"+food.name());
		   foods.add(food);
	   }
	 
	 
	   public void eatFoods(){
	      for (Food food : foods) {
	         System.out.println("�Ե���"+food.name());
	      }        
	   }    

}

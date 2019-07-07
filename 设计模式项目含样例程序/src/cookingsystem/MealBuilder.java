package cookingsystem;

public class MealBuilder {
	public Meal set1 (){
	      Meal meal = new Meal();
	      meal.addItem(new Beard());
	      meal.addItem(new Egg());
	      meal.addItem(new Milk());
	      return meal;
	}   
	public Meal set2 (){
	      Meal meal = new Meal();
	      meal.addItem(new Rice());
	      meal.addItem(new Cabbage());
	      meal.addItem(new Chop());
	      return meal;
	}   
	public Meal set3 (){
	      Meal meal = new Meal();
	      meal.addItem(new FriedChicken());
	      meal.addItem(new Hamburger());
	      meal.addItem(new Cola());
	      return meal;
	}   
}

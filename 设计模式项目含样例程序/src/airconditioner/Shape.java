package airconditioner;

public abstract class Shape {
	   protected API api;
	   
	   protected Shape(API api){
	      this.api = api;
	   }
	   
	   public abstract void running();  
	  
}

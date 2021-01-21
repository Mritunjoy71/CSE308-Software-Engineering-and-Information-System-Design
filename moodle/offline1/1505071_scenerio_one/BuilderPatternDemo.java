package senerio.one;

public class BuilderPatternDemo {
	   public static void main(String[] args) {
	   
	      MealBuilder mealBuilder = new MealBuilder();
	      
	      System.out.println("Menu:\n1.Chicken burger:\na.patty\tb.sauce\tc.cheese\n2.Beef burger:\na.patty\tb.sauce\tc.cheese\n");

	     /*
	      Meal chickenburger = mealBuilder.chickenburger();
	      System.out.println("Chicken Burger");
	      chickenburger.showItems();
	      System.out.println("Total Cost: " + chickenburger.getCost());

	      Meal beefburger = mealBuilder.beefburger();
	      System.out.println("\n\nBeef Burger");
	      beefburger.showItems();
	      System.out.println("Total Cost: " + beefburger.getCost()); 
	       */
	      
	      Meal meal= mealBuilder.burgermaker();
	      System.out.println("Ordered items:\n");
	      meal.showItems();
	      System.out.println("Total Cost: " + meal.getCost()); 
	      
	     
	     
	   }
	}

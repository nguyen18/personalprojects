/*
 * Taylor Nguyen
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * Blackboard assignment #2
 */
import java.util.*;
/**
 * This demo class runs the client which makes the Noodles objects and simulates the
 * Noodle shop to test the extra methods of the Noodles class
 * 
 * @author Taylor
 *
 */
public class Demo {

	/**
	 * Main method makes Noodles objects and runs the "noodle shop" which tests the extra
	 * methods of the Noodles class. Void return.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//makes objects with default constructor
		Noodles pho = new Noodles(); 
		Noodles ramen = new Noodles();
		
		pho.setOrder("pho");
		pho.setSoupType("beef broth soup");
		pho.setPrice(8.50);
		pho.setSpicy(false);
		
		ramen.setOrder("ramen");
		ramen.setSoupType("rich miso soup");
		ramen.setPrice(10.50);
		ramen.setSpicy(true);
		
		//makes objects with parameterized constructors
		Noodles alfredoPasta = new Noodles("alfredo pasta", "no soup", 12.20, false);
		Noodles sphegetti = new Noodles("sphegetti", "no soup", 12.0, false);
		
		ArrayList<Noodles> myDishes = new ArrayList<Noodles>();
		
		myDishes.add(pho);
		myDishes.add(ramen);
		myDishes.add(alfredoPasta);
		myDishes.add(sphegetti);
		
		System.out.println("PRINTING THE FIELDS OF EACH INSTANCE OF NOODLES");
		System.out.println();
		
		//uses for loop to print objects from arraylist
		for(int i = 0; i < myDishes.size(); i++) {
			myDishes.get(i).displayData();
			System.out.println();
		}
		
		System.out.println("TESTING THE REST OF THE NOODLES CLASS METHODS BELOW:");
		System.out.println("-----------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		Noodles userNoodles = new Noodles(); //makes user's Noodles object to modify in shop
		
		System.out.println("Hello welcome to the noodle shop! ^-^");
		System.out.println();
		
		//runAgain variable determines if user will order from the shop again
		String runAgain;
		
		do {
		userNoodles.makeOrder();
		userNoodles.serveOrder();
		
		System.out.println();
		System.out.println("Would you like to order again?");
		runAgain = scan.nextLine();
		
		} while (runAgain.toLowerCase().equals("yes"));
		
		System.out.println();
		System.out.println("Goodbye!");
		 
	}

}

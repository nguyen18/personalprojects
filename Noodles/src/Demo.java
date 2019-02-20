import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		Noodles garlicNoodles = new Noodles(); 
		Noodles ramen = new Noodles();
		
		garlicNoodles.setOrder("garlic noodles");
		garlicNoodles.setSoupType("no soup");
		garlicNoodles.setPrice(9.50);
		garlicNoodles.setSpicy(false);
		
		ramen.setOrder("ramen");
		ramen.setSoupType("rich miso soup");
		ramen.setPrice(10.50);
		ramen.setSpicy(true);
		
		Noodles alfredoPasta = new Noodles("alfredo pasta", "no soup", 12.20, false);
		Noodles sphegetti = new Noodles("sphegetti", "no soup", 12.0, false);
		
		ArrayList<Noodles> myDishes = new ArrayList<Noodles>();
		
		myDishes.add(garlicNoodles);
		myDishes.add(ramen);
		myDishes.add(alfredoPasta);
		myDishes.add(sphegetti);
		
		System.out.println("printing the fields on each instance of Noodles object");
		System.out.println();
		
		for(int i = 0; i < myDishes.size(); i++) {
			myDishes.get(i).displayData();
			System.out.println();
		}
		
		System.out.println("Testing the rest of the Noodles class methods below");
		System.out.println("-----------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		Noodles userNoodles = new Noodles();
		
		System.out.println("Hello welcome to the noodle shop!");
		System.out.println();
		
		String runAgain;
		do {
		System.out.println("Here is the menu:");
		System.out.println("- pho \n- ramen \n- garlic noodles \n- custom \n**please spell correctly!**");
		String desiredDish = scan.nextLine();
		
		userNoodles.makeOrder(desiredDish);
		userNoodles.serveOrder();
		
		System.out.println();
		System.out.println("Would you like to order again?");
		runAgain = scan.nextLine();
		
		} while (runAgain.toLowerCase().equals("yes"));
		
		System.out.println();
		System.out.println("Goodbye!");
		 
	}

}

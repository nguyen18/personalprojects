/**
 * TacoTuesday class
 * Student name: Taylor Nguyen
 * CS 108
 */
import java.util.ArrayList;
import java.util.*;

/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA5
 */
/**
 * TacoTuesday class runs the main method.
 * 
 * @author Taylor
 *
 */
public class TacoTuesday {

	/**
	 * Main method runs the client. Void return.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Taco> tacoPlatter = new ArrayList<Taco>();
		
		tacoPlatter.add(new Taco("Shrimp", 10, 2.99));
		tacoPlatter.add(new Taco("Mahi-Mahi", 12, 3.99));
		tacoPlatter.add(new Taco("Carne Asada", 11, 2.49));
		tacoPlatter.add(new Taco("Chicken", 14, 2.19));
		tacoPlatter.add(new Taco("Vegan", 4, 8.99));
		tacoPlatter.add(new Taco("Fish", 10, 2.99));
		tacoPlatter.add(new Taco("Calamari", 13, 3.49));
		
		//sorts tacoPlatter ArrayList
		tacoPlatter = selectionSort(tacoPlatter);
		
		//finds the index of the taco of the specified price in the tacoPlatter ArrayList
		int tacoIndex = binarySearch(tacoPlatter, 3.99);

		//recursively eats the taco at the specified index of tacoPlatter
		eatTaco(tacoPlatter.get(tacoIndex));

	}

	/**
	 * Sorts the given Taco ArrayList in order from lowest to highest taco price.
	 * 
	 * I chose to do selection sort because it was the easiest sort to implement.
	 * Depending on how many elements and how you need to sort it can help you 
	 * determine which sorting algorithm is best to implement but since tacoPlatter doesn't
	 * have that many elements, the time difference between each sort algorithm would
	 * not make much of a difference. Since the time difference did not make that much 
	 * of a difference I chose to implement the one with the least amount of code.
	 * 
	 * @param tacoPlatter
	 * @return ArrayList<Taco>
	 */
	public static ArrayList<Taco> selectionSort(ArrayList<Taco> tacoPlatter) {
		
		for(int i = 0; i < tacoPlatter.size(); i++) {
			for(int j = i+1; j < tacoPlatter.size(); j++) {
				if(tacoPlatter.get(i).getPrice() > tacoPlatter.get(j).getPrice()) {
					Taco temp = tacoPlatter.get(i);
					tacoPlatter.set(i, tacoPlatter.get(j));
					tacoPlatter.set(j, temp);
				}
			}
		}
		return tacoPlatter;
	}
	
	/**
	 * binarySearch searches for the desiredPrice to be found within the ArrayList tacoPlatter.
	 * 
	 * @param tacoPlatter
	 * @param desiredPrice
	 * @return int
	 */
	public static int binarySearch(ArrayList<Taco> tacoPlatter, double desiredPrice) {
		
		int start = 0;
		int end = tacoPlatter.size();
		int priceIndex = 0;
		
		while (start < end) {
			priceIndex = (start + end)/2;
			if(desiredPrice == tacoPlatter.get(priceIndex).getPrice()) 
				return priceIndex;
			
			if(desiredPrice > tacoPlatter.get(priceIndex).getPrice()) 
				start = priceIndex + 1;
			
			if(desiredPrice < tacoPlatter.get(priceIndex).getPrice()) 
				end = priceIndex - 1;
			
		}
		return priceIndex-1;
	}
	
	/**
	 * eatTaco recursively eats a taco and subtracts 1 ounce from the taco's weight
	 * with every recursive call. Void return
	 * 
	 * @param t
	 */
	public static void eatTaco(Taco t) {
		
		if(t.getOunces() == 0) {
			System.out.println("Done. There is 0 ounces of " + t.getType() + " taco remaining.");
		}
		if(t.getOunces() > 0) {
			System.out.println("There are " + t.getOunces() + " ounce(s) of " +
			t.getType() + " taco remaining.");
			t.setOunces(t.getOunces()-1);
			eatTaco(t);
		}
	}
		
}
	
	
/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA3
 */
import java.util.*;

/**
 * The Demo class contains main method which runs the client.
 * 
 * @author Taylor
 *
 */
public class Demo {

	/**
	 * Main method, runs the client. Void return.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//create new objects
		Animal human = new Animal(); //uses a default constructor --> sets default values
		Bird ostrich = new Bird(2, true, 100, 70, "big", false); //uses a parameterized constructor --> sets custom values
		HummingBird bluebird = new HummingBird();
		Mammal dog = new Mammal();
		
		//ArrayList of Animal objects
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		myAnimals.add(human);
		myAnimals.add(ostrich); //can put subclass objects in superclass object ArrayList since it extends the base class
		myAnimals.add(bluebird);
		myAnimals.add(dog);
		
		//for each loop calls the speak() method for each object
		for(Animal pet : myAnimals) {
			pet.speak();
		}
	}

}

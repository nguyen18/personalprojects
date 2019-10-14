/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA3
 */

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
		
		//Array of Animal objects
		Animal[] myAnimals = {human, ostrich, bluebird, dog};
		
		//for each loop calls the speak() method for each element of myAnimals
		for(Animal pet : myAnimals) {
			pet.speak();
		}
	}

}

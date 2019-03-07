/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA3
 */

/**
 * The Mammal class extends the Animal super class.
 * Creates Mammal objects
 * 
 * @author Taylor
 *
 */
public class Mammal extends Animal{
	
	//field
	protected boolean furry; 
	
	/**
	 * This is the default Mammal constructor. No parameters and no return.
	 */
	public Mammal() {
		this(4, false, 100, 60, true); //uses other constructor in same class to set default values
	}
	
	/**
	 * This is the parameterized Mammal constructor. No return.
	 * 
	 * @param numLegs
	 * @param hasWings
	 * @param weight
	 * @param heightInInches
	 * @param furry
	 */
	public Mammal(int numLegs, boolean hasWings, double weight, double heightInInches,
			boolean furry) {
		super(numLegs, hasWings, weight, heightInInches);
		this.furry = furry;
	}

	/**
	 * The speak() method prints the sound the animal makes. Void return, no parameters.
	 * Overrides Animal speak() method
	 */
	@Override
	public void speak() {
		System.out.println("mammal says \"pikachu\"");
	}
	
	/**
	 * Gets the value of furry variable. Returns a boolean, no parameters.
	 * 
	 * @return furry
	 */
	public boolean isFurry() {
		return furry;
	}

	/**
	 * Sets the value of field furry to parameter furry. Void return.
	 * 
	 * @param furry
	 */
	public void setFurry(boolean furry) {
		this.furry = furry;
	}

}

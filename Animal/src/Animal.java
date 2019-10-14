/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA3
 */

/**
 * The Animal class is the base class
 * Creates Animal objects
 * 
 * @author Taylor
 *
 */
public class Animal {
	
	//fields
	protected int numLegs;
	protected boolean hasWings;
	protected double weight;
	protected double heightInInches;
	
	/**
	 * This is the default Animal constructor. No parameters and no return.
	 */
	public Animal() {
		this(2, false, 120, 60); //uses other constructor in same class to set default values
	}
	
	/**
	 * This is the parameterized Animal constructor. No return.
	 * 
	 * @param numLegs
	 * @param hasWings
	 * @param weight
	 * @param heightInInches
	 */
	public Animal(int numLegs, boolean hasWings, double weight, double heightInInches) {
		this.numLegs = numLegs;
		this.hasWings = hasWings;
		this.weight = weight;
		this.heightInInches = heightInInches;
	}
	
	/**
	 * The speak() method prints the sound the animal makes. Void return, no parameters.
	 */
	public void speak() {
		System.out.println("animal says \"boop boop\"");
	}
	
	/**
	 * Gets the value of the numLegs variable. Returns an int, no parameters.
	 * 
	 * @return numLegs
	 */
	public int getNumLegs() {
		return numLegs;
	}
	
	/**
	 * Gets the value of hasWings variable. Returns a boolean, no parameters.
	 * 
	 * @return hasWings;
	 */
	public boolean isHasWings() {
		return hasWings;
	}
	
	/**
	 * Gets the value of the weight variable. Returns a double, no paramters.
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Gets the value of heightInInches variable. Returns a double, no parameters.
	 * 
	 * @return heightInInches
	 */
	public double getHeightInInches() {
		return heightInInches;
	}
	
	/**
	 * Sets the value of field numLegs to parameter numLegs. Void return.
	 * 
	 * @param numLegs
	 */
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	
	/**
	 * Sets the value of field hasWings to parameter hasWings. Void return.
	 * 
	 * @param hasWings
	 */
	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	
	/**
	 * Sets the value of field weight to parameter weight. Void return.
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Sets the value of field heightInInches to parameter heightInInches. Void return.
	 * 
	 * @param heightInInches
	 */
	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}
	
	

}

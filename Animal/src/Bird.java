/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA3
 */

/**
 * The Bird class extends the Animal super class
 * Creates Bird objects
 * 
 * @author Taylor
 *
 */
public class Bird extends Animal{

	//fields
	protected String beakLength;
	protected boolean canFly;
	
	/**
	 * This is the default Bird constructor. No parameters and no return.
	 */
	public Bird() {
		this(2, true, 3.0, 6.0, "short", true); //uses other constructor in same class to set default values
	}
	
	/**
	 * This is the parameterized Bird constructor. No return.
	 * 
	 * @param numLegs
	 * @param hasWings
	 * @param weight
	 * @param heightInInches
	 * @param beakLength
	 * @param canFly
	 */
	public Bird(int numLegs, boolean hasWings, double weight, double heightInInches, 
			String beakLength, boolean canFly) {
		
		super(numLegs, hasWings, weight, heightInInches);
		this.beakLength = beakLength;
		this.canFly = canFly;
	}
	
	/**
	 * The speak() method prints the sound the animal makes. Void return, no parameters.
	 * Overrides Animal speak() method
	 */
	@Override
	public void speak() {
		System.out.println("bird says \"chirp chirp\"");
	}

	/**
	 * Gets the value of beakLength variable. Returns a String, no parameters.
	 * 
	 * @return beakLength;
	 */
	public String getBeakLength() {
		return beakLength;
	}
	/**
	 * Gets the value of canFly variable. Returns a boolean, no parameters.
	 * 
	 * @return canFly;
	 */
	public boolean getCanFly() {
		return canFly;
	}

	/**
	 * Sets the value of field beakLength to parameter beakLength. Void return.
	 * 
	 * @param beakLength
	 */
	public void setBeakLength(String beakLength) {
		this.beakLength = beakLength;
	}

	/**
	 * Sets the value of field canFly to parameter canFly. Void return.
	 * 
	 * @param canFly
	 */
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}

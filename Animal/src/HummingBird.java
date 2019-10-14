/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA3
 */

/**
 * The HummingBird class extends the Bird super class
 * Creates HummingBird objects
 * 
 * @author Taylor
 *
 */
public class HummingBird extends Bird{

	//field
	protected String featherColor;
	
	/**
	 * This is the default HummingBird constructor. No parameters and no return.
	 */
	public HummingBird() {
		this(2, true, 0.5, 3, "long", true, "blue"); //uses other constructor in same class to set default values
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
	 * @param featherColor
	 */
	public HummingBird(int numLegs, boolean hasWings, double weight, double heightInInches, 
			String beakLength, boolean canFly, String featherColor) {
		
		super(numLegs, hasWings, weight, heightInInches, beakLength, canFly);
		this.featherColor = featherColor;
	}
	
	/**
	 * The speak() method prints the sound the animal makes. Void return, no parameters.
	 * Overrides Bird speak() method
	 */
	@Override
	public void speak() {
		System.out.println("Hummingbird says \"hum hum\"");
	}

	/**
	 * Gets the value of featherColor variable. Returns a String, no parameters.
	 * 
	 * @return featherColor
	 */
	public String getFeatherColor() {
		return featherColor;
	}

	/**
	 * Sets the value of field featherColor to parameter featherColor. Void return.
	 * 
	 * @param featherColor
	 */
	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

}

/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA4
 */

/**
 * Recycleable interface implements certain behavior for classes who implement it
 * @author Taylor
 *
 */
public interface Recycleable {
	
	//constant fields
	final double ALUMINUMPRICE = 1.60;
	final double PLASTICPRICE = 0.58;
	final double GLASSPRICE = 0.10;
	
	/**
	 * reuse method signature. No parameters. No return.
	 */
	public void reuse();
	
	/**
	 * recycle method signature. no parameters
	 * 
	 * @return a double
	 */
	public double recycle();

	/**
	 * getName method signature. no parameters.
	 * 
	 * @return a String
	 */
	public String getName();
	
	/**
	 * getMaterial method signature. No parameters.
	 * 
	 * @return a String
	 */
	public String getMaterial();
	
	/**
	 * getWeight method signature. No Parameters. 
	 * 
	 * @return a double
	 */ 
	public double getWeight();
	
	
}

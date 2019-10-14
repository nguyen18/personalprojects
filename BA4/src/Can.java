/*
 * Taylor Nguyen 
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * BA4
 */

/**
 * Can class creates Can objects
 * Can class implements the Recycleable interface
 * 
 * @author Taylor
 *
 */
public class Can implements Recycleable{
	
	//fields
	private String name;
	private String material;
	private double weight;
	
	/**
	 * Default constructor for Can class. No return, No parameters.
	 */
	public Can() {
		this("item", "brand", 1.0);
	}
	
	/**
	 * Parameterized constructor. no return. sets fields to parameters
	 * 
	 * @param name
	 * @param material
	 * @param weight
	 */
	public Can(String name, String material, double weight) {
		this.name = name;
		this.material = material;
		this.weight = weight;
	}
	
	/**
	 * method tells the user they can reuse item. void return. no parameters.
	 */
	@Override
	public void reuse() {
		System.out.println("Please reuse this can! make something cool out of it :-)");
		
	}

	/**
	 * method calculates how much money user will get depending on material
	 * that is recycled. Return a double. No parameters.
	 * 
	 * @return a double value
	 */
	@Override
	public double recycle() {
		if(material.toLowerCase().equals("aluminum")) {
			return weight * ALUMINUMPRICE;
		}
		if(material.toLowerCase().equals("plastic")) {
			return weight * PLASTICPRICE;
		}
		if(material.toLowerCase().equals("glass")) {
			return weight * GLASSPRICE;
		}
		else {
			return 0.0;
		}
		
	}

	/**
	 * Gets the value of getName() variable. Returns a String, no parameters.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the value of getMaterial() variable. Returns a String, no parameters.
	 * 
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Gets the value of getWeight() variable. Returns a double, no parameters.
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the value of field name to parameter name. Void return.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the value of field material to parameter material. Void return.
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Sets the value of field weight to parameter weight. Void return.
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}

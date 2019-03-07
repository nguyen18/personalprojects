/*
 * Taylor Nguyen
 * CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * Blackboard assignment #2
 */
import java.util.*;
/**
 * The Noodles class is to create Noodles objects (aka my favorite item)
 * 
 * @author Taylor
 */
public class Noodles {
	
	//my private fields with at least 3 different data types
	private String soupType;
	private String order;
	private double price;
	private boolean spicy;
	
	/**
	 * This is the default Noodles constructor. No parameters and no return.
	 */
	public Noodles() {
		this("Chicken Noodle Soup", "chicken soup", 8.50, false);
	}
	
	/**
	 * This is parameterized constructor. Overloads default constructor.
	 * 
	 * @param order
	 * @param soupType
	 * @param price
	 * @param spicy
	 */
	public Noodles(String order, String soupType, double price, boolean spicy) {
		this.order = order; //use this keyword to differentiate between field and parameter
		this.soupType = soupType;
		this.price = price;
		this.spicy = spicy;
	}
	
	/**
	 * This method gets the value from the order variable. Returns a String.
	 * 
	 * @return order 
	 */
	public String getOrder() {
		return order;
	}
	
	/**
	 * This method gets the value from the soupType variable. returns a String.
	 * 
	 * @return soupType
	 */
	public String getSoupType() {
		return soupType;
	}
	
	/**
	 * This method gets the value from the price variable. Returns a double.
	 * 
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * This method gets the value from the spicy variable. Returns a boolean.
	 * 
	 * @return spicy
	 */
	public boolean getSpicy() {
		return spicy;
	}
	
	/**
	 * This method sets the field order to the parameter order. Void return.
	 * 
	 * @param order
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	
	/**
	 * this method sets the field soupType to the parameter soupType. Void return.
	 * 
	 * @param soupType
	 */
	public void setSoupType(String soupType) {
		this.soupType = soupType;
	}
	
	/**
	 * This method sets the field price to the parameter price. Void return.
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Thsi method sets the field spicy to the parameter spicy. Void return.
	 * 
	 * @param spicy
	 */
	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}
	
	/**
	 * This method prints the values from the fields. No parameters.
	 * Void return, instead it prints the output.
	 */
	public void displayData() {
		System.out.println("order: " + order);
		System.out.println("soup: " + soupType);
		System.out.println("price:" + price);
		System.out.println("spicy: " + spicy);
	}
	
	/**
	 * This method takes the user's selection of what item on the menu and stores it 
	 * in the String variable menuItem. The method compares menuItem to options on the 
	 * menu and personalizes the user's Noodles object based on menuItem. Void return.
	 * 
	 * @param menuItem
	 */
	public void makeOrder() {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Here is the menu:");
		System.out.println("- pho \n- ramen \n- garlic noodles \n- custom \n**please spell correctly!**");
		System.out.println();
		System.out.println("What would you like to order?");
		String menuItem = userInput.nextLine();
		
		if(menuItem.toLowerCase().equals("pho")) {
			order = "pho";
			soupType = "beef broth soup";
			price = 8.50;
		} 
		else if(menuItem.toLowerCase().equals("garlic noodles")) {
			order = "garlic noodles";
			soupType = "garlic sauce";
			price = 9.50;
		} 
		else if(menuItem.toLowerCase().equals("ramen")) {
			order = "ramen";
			soupType = "rich miso soup";
			price = 10.50;
		} 
		else { //if menuItem doesn't match any options then make custom order
			order = "custom";
			
			System.out.println("What kind of soup would you like? (type no soup for no soup)");
			soupType = userInput.nextLine();

		}
		
		System.out.println("Do you like spicy?");
		String spicyAnswer = userInput.nextLine();
		
			if(spicyAnswer.toLowerCase().equals("yes")) {
				spicy = true;
			} else {
				spicy = false;
			}
	}

	/**
	 * This method checks if spicy is true or false. If spicy is true, it adds "spicy"
	 * to the soupType string. If spicy is false, it does nothing. Prints the user's order.
	 * Void return.
	 */
	public void serveOrder() {
		System.out.println("Your " + order + " order is: ");
		
		if(spicy == true) {
			soupType = "spicy " + soupType; //makes the soupType spicy
		} else {
			soupType = "non-spicy " + soupType; 
		}
		
		System.out.println(soupType + " and some yummy noodles. This will cost $" + price);
		
	}
	
}

import java.util.*;

public class Noodles {

	private String soupType;
	private double price;
	private boolean spicy;
	
	public Noodles() { //default constructor
		this("beef broth", 100, false);
	}
	
	public Noodles(String soupType, double price, boolean spicy) {
		this.soupType = soupType;
		this.price = price;
		this.spicy = spicy;
	}
	
	public String getSoupType() {
		return soupType;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean getSpicy() {
		return spicy;
	}
	
	public void setSoupType(String soupType) {
		this.soupType = soupType;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}
	
	public void displayData() {
		System.out.println("soup: " + soupType);
		System.out.println("price:" + price);
		System.out.println("spicy: " + spicy);
	}
	
	public void makeOrder(String menuItem) {
		if(menuItem.toLowerCase().equals("pho")) {
			soupType = "beef broth";
			price = 8.50;
		} 
		else if(menuItem.toLowerCase().equals("garlic noodles")) {
			soupType = "no";
			price = 9.50;
		} 
		else if(menuItem.toLowerCase().equals("ramen")) {
			soupType = "rich miso";
			price = 10.50;
		} 
		else {
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("What kind of soup would you like? (type no for no soup)");
			soupType = userInput.nextLine();
			
			System.out.println("Do you like spicy?");
			String spicyAnswer = userInput.nextLine();
			
				if(spicyAnswer.toLowerCase().equals("yes")) {
					spicy = true;
				} else {
					spicy = false;
				}
		}
		
	}
	
	public void serveOrder() {
		System.out.println("Your order is: ");
		System.out.println();
		
		if(spicy == true) {
			soupType = "spicy " + soupType;
		}
		
		System.out.println(soupType + " soup. This will cost " + price);
		
	}
	
}

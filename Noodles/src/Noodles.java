import java.util.*;

public class Noodles {

	private String soupType;
	private String order;
	private double price;
	private boolean spicy;
	
	public Noodles() { //default constructor
		this("Chicken Noodle Soup", "chicken soup", 8.50, false);
	}
	
	public Noodles(String order, String soupType, double price, boolean spicy) {
		this.order = order;
		this.soupType = soupType;
		this.price = price;
		this.spicy = spicy;
	}
	
	public String getOrder() {
		return order;
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
	
	public void setOrder(String order) {
		this.order = order;
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
		System.out.println("order: " + order);
		System.out.println("soup: " + soupType);
		System.out.println("price:" + price);
		System.out.println("spicy: " + spicy);
	}
	
	public void makeOrder(String menuItem) {
		
		Scanner userInput = new Scanner(System.in);
		
		if(menuItem.toLowerCase().equals("pho")) {
			order = "pho";
			soupType = "beef broth soup";
			price = 8.50;
		} 
		else if(menuItem.toLowerCase().equals("garlic noodles")) {
			order = "garlic noodles";
			soupType = "no soup";
			price = 9.50;
		} 
		else if(menuItem.toLowerCase().equals("ramen")) {
			order = "ramen";
			soupType = "rich miso soup";
			price = 10.50;
		} 
		else {
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
	
	public void serveOrder() {
		System.out.println("Your " + order + " order is: ");
		System.out.println();
		
		if(spicy == true) {
			soupType = "spicy, " + soupType;
		}
		
		System.out.println(soupType + " and some yummy noodles. This will cost " + price);
		
	}
	
}

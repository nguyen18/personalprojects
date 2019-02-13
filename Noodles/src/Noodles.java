
public class Noodles {

	private String soup;
	private String utensil;
	private int numNoodles;
	private boolean spicy;
	
	public Noodles() { //default constructor
		soup = "beef broth";
		utensil = "chopsticks";
		numNoodles = 100;
		spicy = false;
	}
	
	public Noodles(String soup, String utensil, int numNoodles, boolean spicy) {
		this.soup = soup;
		this.utensil = utensil;
		this.numNoodles = numNoodles;
		this.spicy = spicy;
	}
	
	public String getSoup() {
		return soup;
	}
	
	public String getUtensil() {
		return utensil;
	}
	
	public int getNumNoodles() {
		return numNoodles;
	}
	
	public boolean getSpicy() {
		return spicy;
	}
	
	public void setSoup(String soup) {
		this.soup = soup;
	}
	
	public void setUtensil(String utensil) {
		this.utensil = utensil;
	}
	
	public void setNumNoodles(int numNoodles) {
		this.numNoodles = numNoodles;
	}
	
	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}
	
	public void display() {
		System.out.println("Your order is: ");
		System.out.println();
		
		if(spicy == true) {
			soup = "spicy " + soup;
		}
		
		System.out.println(numNoodles + " noodles with " + soup + "!");
		System.out.println("Enjoy with " + utensil);
	}
}

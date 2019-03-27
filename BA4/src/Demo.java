import java.io.*;
import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		
		Can cokeCan = new Can("Coke", "Aluminum", 0.5);
		Bottle spriteBottle = new Bottle("Sprite", "Glass", 0.8);
		
		ArrayList<Recycleable> recyclingList = new ArrayList<Recycleable>();

		
		String answer = "yes";
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Welcome to the Recycling center!");
		System.out.println("Please input the name of the item you would like to recycle");
		String item = input.nextLine();
		
		System.out.println("Please input whether the material is glass, aluminum, or plastic");
		String material = input.nextLine();
		
		System.out.println("Please input the weight of how many of these items you would like to recycle (oz)");
		double weight = input.nextDouble();
		input.nextLine();
		
		if(material.equals("aluminum")) {
			recyclingList.add(new Can(item, material, weight));
		} else {
			recyclingList.add(new Bottle(item, material, weight));
		}
		
		System.out.println("Would you like to add another item?");
		answer = input.nextLine();
		
		} while (answer.equals("yes"));
		
		System.out.println("Thank you! Your recycling spreadsheet is ready");
		createSpreadsheet(recyclingList);
		
		
	}
	
	public static void createSpreadsheet(ArrayList<Recycleable> recyclingList) {
	
		PrintWriter spreadsheet;
		try {
			spreadsheet = new PrintWriter("recycle.csv");
	
		double totalSum = 0.0;
		
		spreadsheet.println("Item, Material, Weight, Recycle amount");
		for(Recycleable item : recyclingList) {
			spreadsheet.println(item.getName() + "," + item.getMaterial() + "," +  item.getWeight() + "," +  item.recycle());
			totalSum += item.recycle();
		}
		spreadsheet.println("TOTAL,,," + totalSum);
		spreadsheet.close();
	} catch (FileNotFoundException e) {
		System.out.println("where da file");
	}
	}
}

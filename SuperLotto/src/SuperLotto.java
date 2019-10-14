/*
 * Taylor Nguyen CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 * First programming assignment: SuperLotto
 */
import java.util.*;

/**
 * This SuperLotto program generates random integers for the user to use for the lottery.
 * 
 * @author Taylor Nguyen
 */
public class SuperLotto {

	/**
	 * The method quickPick() randomly selects 5 lotto numbers and 1 mega number. No parameters.
	 * 
	 *  @return lottoNums which stores the 6 lotto numbers
	 */	
	public static int[] quickPick() {
		
		// creates Random object for random number and declare integer array with 6 elements to store lotto numbers in
		Random rand = new Random();
		int[] lottoNums = new int[6];
		
		do {
			// I did lottoNums.length-1 so that it would test only the first 5 elements of the array
			// i stands for index
			for (int i = 0; i < lottoNums.length-1; i++) {
				lottoNums[i] = rand.nextInt(47) + 1;
			}

		// isDuplicate() checks whether there are any duplicate numbers, if so, it reruns the for-loop and generates 5 new numbers 
		} while (isDuplicate(lottoNums) == true);
	
		 // selects MEGA number and assigns it to last index of array 
		lottoNums[5] = rand.nextInt(27) + 1; 

		// returns lottoNums array
		return lottoNums;
	}
	
	/** 
	 * The method isDuplicate() checks to see if any of the first 5 numbers are duplicate lotto numbers.
	 * 
	 * @param lottoNums
	 * @return true if duplicate numbers
	 * @return false if no duplicate numbers
	 */
	public static boolean isDuplicate(int[] lottoNums) {
		
		// declares boolean and initialize it with false so that lottoNums automatically has return value
		boolean duplicate = false;
		
		// nested for loops tests whether each number matches any of the other first 5 numbers
		for(int testNum = 0; testNum < lottoNums.length-1; testNum++) {

			// I did lottoNums.length-1 so that it only checks the first 5 elements
			for(int num = testNum + 1; num < lottoNums.length-1; num++) {
				
				if(lottoNums[testNum] == lottoNums[num]) {
					// if two elements have equal value, assign duplicate with true
					duplicate = true;
				}
			}
		}
	
		// return boolean duplicate
		return duplicate;
	}
	
	/**
	 * The method printNumbers() prints lottoNums array however many times the user requests. No return value.
	 * 
	 * @param numTickets
	 */
	public static void printNumbers(int numTickets) {
		
		// declare integer array to store lotto numbers
		int[] lottoNums;
		
		// using nested for-loop, print set of lotto numbers as many times as user requests through the numTickets variable
		for (int num = 1; num <= numTickets; num++) {
			
			//assign lottoNums with random set of lotto numbers
			lottoNums = quickPick();
			
			// Use lottoNums.length-1 to parse/print only the first 5 elements
			// i stands for index
			for(int i = 0; i < lottoNums.length-1; i++) {
				System.out.print(lottoNums[i] + " ");
			}
			
			//prints last element/MEGA number in its own parentheses
			System.out.println("(MEGA: " + lottoNums[lottoNums.length-1] + ")");
		}
	}
	
	/**
	 * Main method, runs the client
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare Scanner object, Strings and integer
		Scanner scan = new Scanner(System.in);
		
		// variable to store user's name
		String name;
		
		// variable to store number 
		int numTickets;
		
		// variable to store "yes" or "no" to determine if do-while loop runs again
		String runAgain;
		
		// variable to store the rest of the line after scan.nextInt()
		String extraLine;
		
		do {
			// prompts user to input info
			System.out.println("Welcome to Super Lotto mart! What is your name?");
			name = scan.nextLine(); // assigns variable with the user's input
			System.out.println();
			
			System.out.println("Hi " + name + ", how many Super Lotto tickets would you like?");
			numTickets = scan.nextInt();
			extraLine = scan.nextLine(); // takes in the rest of line so that the next nextLine() executes correctly
			System.out.println();
			
			printNumbers(numTickets);
			
			System.out.println();
			System.out.println("Hope you win! Would you like to run this program again?");
			runAgain = scan.nextLine();
			System.out.println();
			
			// if runAgain equals to yes then runs do-while loop again
		} while (runAgain.toLowerCase().equals("yes"));
		
		// end of program
		System.out.println("Goodbye!");

	}

}

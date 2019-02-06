/* Taylor Nguyen CS108 2PM Lecture Mondays  & Wednesdays
 * Professor Gappy
 */
import java.util.*;

public class SuperLotto {

	public static int[] quickPick() {
		
		Random rand = new Random();
		int[] lottoNums = new int[6];
		
		do {
			for (int i = 0; i < lottoNums.length-1; i++) {
				lottoNums[i] = rand.nextInt(47) + 1;
			}
		} while (isDuplicate(lottoNums) == false);
	
		lottoNums[5] = rand.nextInt(27) + 1; 
		
		return lottoNums;
		
		
	}
	
	public static boolean isDuplicate(int[] lottoNums) {
		boolean duplicate = false;
		
		for (int num : lottoNums) {
			
			for(int testNum = 0; testNum < lottoNums.length-1; testNum++) {
				
				if(num == lottoNums[testNum]) {
					duplicate = true;
				}
			}
		}
	
		return duplicate;
	}
	
	public static void printNumbers(int numTickets) {
		int[] lottoNums;
		for (int i = 1; i <= numTickets; i++) {
			lottoNums = quickPick();
			
			for(int j = 0; j < lottoNums.length-1; j++) {
				System.out.print(lottoNums[j] + " ");
			}
			System.out.println("(MEGA: " + lottoNums[lottoNums.length-1] + ")");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lottoNums;
		String name; 
		int numTickets;
		String runAgain = "no";
		
		do {
			System.out.println("Welcome to Super Lotto mart! What is your name?");
			name = scan.nextLine();
			System.out.println();
			
			System.out.println("Hi " + name + ", how many Super Lotto tickets would you like?");
			numTickets = scan.nextInt();
			System.out.println();
			
			printNumbers(numTickets);
			
			System.out.println();
			System.out.println("Good luck! Would you like to run this program again?");
			runAgain = scan.nextLine();
			System.out.println();
			
		} while (runAgain.toLowerCase().equals("yes"));
		
		
		System.out.println("Goodbye!");

	}

}

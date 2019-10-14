import java.util.*;
public class FibonacciNum {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter in the number of fibonacci numbers");
		String user = input.nextLine();
		int n = Integer.parseInt(user);
		
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		int prev = 0;
		int sum;

		for(int prevPrev = 0; prevPrev < n-1; prevPrev++) {
			prev = prevPrev+1;
			sum = fib.get(prev) + fib.get(prevPrev);
			fib.add(sum);
		}
		
		for(int i = 0; i < fib.size(); i++) {
			System.out.println(fib.get(i));
		}
	}
}

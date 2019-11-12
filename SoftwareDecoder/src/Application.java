/*
	Taylor Nguyen
	822817405
	CS310 Healey Tuesday and Thursday 5:30pm-6:45pm
*/
import java.util.*;
import java.io.*;

/**
 * This Application class runs the Software Decoder program
 * @author Taylor
 *
 */
public class Application {

	/**
	 * Main method runs the Application. Void returns
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		File patternsFile;
		File undecodedMessageFile;
		Queue undecodedMessage;
		ArrayList<ArrayList<Integer>> patterns;

		//if statement that handles if user inputs two files
		if(args.length == 2) {
			//first input should be the patterns file
			patternsFile = new File(args[0]); 
			
			//second input should be the undecoded message
			undecodedMessageFile = new File(args[1]); 
			
			//puts the undecoded message into a custom queue
			undecodedMessage = putInQueue(undecodedMessageFile); 
			
			//puts the patterns into an ArrayList of ArrayList<Integer>. Each element is its own pattern
			patterns = extractPattern(patternsFile); 
			
			Queue q = decoder(patterns,undecodedMessage);
			System.out.println(q.getValues());
			printOutputFile(q);
			
			//prompts the user that the file has been printed and the program has ended
			System.out.println("your file is ready under decodedmessage.csv");
			
		//if statement that handles if user inputs more than 3 files
		} else if(args.length > 2) 
			System.out.println("too many files were given");
		
		//if statement that handles if user inputs only one file
		else if(args.length == 1)
			System.out.println("Missing the file to decode, please exit program and start again.");
		
		//if statement that handles if user inputs no files
		else if(args.length == 0)
			System.out.println("no files were given, please exit program and start again");
		
	}
	
	/**
	 * putInQueue method accepts a File parameter and puts the contents of type int of that file into a queue.
	 * The undecoded message should be in the parameter.
	 * 
	 * @param codeFile
	 * @return type Queue
	 */
	public static Queue putInQueue(File codeFile) {
		//instantiates new Queue object/custom data structure
		Queue code = new Queue(codeFile);
		
		return code;
	}
	
	
	/**
	 * extractPattern should accept a File parameter and put the contents of type int into an ArrayList of ArrayList<Integer>.
	 * The file should have each pattern be on its own line for proper extraction
	 * 
	 * @param patternFile
	 * @return type ArrayList<ArrayList<Integer>>, listOfPatterns
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<ArrayList<Integer>> extractPattern(File patternFile) {
		//variable declarations
		ArrayList<ArrayList<Integer>> listOfPatterns = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> pattern = new ArrayList<Integer>();
		ArrayList<Integer> addPattern = new ArrayList<Integer>();
		String[] values;
		BufferedReader br = null;
		String toDecode = null;
		
		try {
				br = new BufferedReader(new FileReader(patternFile));
			
				/*
				 * for each line till it is null (no pattern), split that line to parse into an array of Strings 
				 * then parse that array and put it into the pattern ArrayList<Integer>
				 */
				while ((toDecode = br.readLine()) != null) {
					//split non-null line and place into String array
					values = toDecode.split(",");
					//parse each element for an int in the array called values. Add this integer to pattern
					for(int i = 0; i < values.length; i++) {
						pattern.add(Integer.parseInt(values[i]));
					}
					//sets addPattern to the cloned contents of pattern so that pattern can be cleared and refilled
					addPattern = (ArrayList<Integer>) pattern.clone();
					//add addPattern to the listOfPatterns
					listOfPatterns.add(addPattern);
					//clear pattern so that it can go through the loop again.
					pattern.clear();
				}	
				
				br.close();
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//return the listOfPatterns
		return listOfPatterns;
	}
	
	/**
	 * decoder method takes in two parameters (patterns, toDecode) and uses the patterns to decode the toDecode queue.
	 *  
	 * @param patterns
	 * @param toDecode 
	 * @return type Queue, decodedMessage
	 */
	public static Queue decoder(ArrayList<ArrayList<Integer>> patterns, Queue toDecode) {
		Queue decodedMessage = new Queue();
		int[] peekArr;
		
		/*
		 * this while loop handles noise and dequeues the beginning 6 if a pattern match is found 
		 * and dequeues only one if the beginning is a noise/irrelevant value
		 */
		while(toDecode.size() >= 7) {
			toDecode.normalize();
			peekArr = toDecode.peek(7);
			
			//if findCodeNum finds a code number then it loads the code number into the decodeMessage queue
			if(findCodeNum(peekArr, patterns) != -1) {
				decodedMessage.loadValue(findCodeNum(peekArr, patterns));
				
				//dequeues the found sequence in toDecode so that the next set of elements can be tested
				for(int i = 1; i <= 6; i++) 
					toDecode.nextValue();
			}
			//if findCodeNum does not find a code number then it dequeues the beginning of toDecode
			else 
				toDecode.nextValue();
		}
		
		//this if statement doesn't handle noise
		if(toDecode.size() == 6) {
			toDecode.normalize();
			peekArr = toDecode.peek(toDecode.size());
			
			//if code number is found then load the code number into the decodeMessage queue
			if(findCodeNum(peekArr, patterns) != -1) {
				decodedMessage.loadValue(findCodeNum(peekArr, patterns));
			}
		}
		
		//return the decoded message (code numbers)
		return decodedMessage;
	}
	
	/**
	 * findCodeNum method takes in 2 parameters (peekArr, patterns) and finds a match between the peekArr
	 * and one of the patterns in the listOfPatterns. If pattern is found return the code number of that pattern.
	 * If not found, return -1
	 * 
	 * @param peekArr
	 * @param patterns
	 * @return type int, code number, -1
	 */
	public static int findCodeNum(int[] peekArr, ArrayList<ArrayList<Integer>> listOfPatterns) {
		//variable declarations/initializations
		int numOfMatchingValues = 0;
		int noise = 0;
		int pattern = 0;
		int patternValue = 0;
		boolean foundMatch = false;
		
		/*
		 * this do-while loop finds a match between the peekArr and a pattern in the listOfPatterns
		 * stops running when foundMatch = true
		 * or when pattern > listOfPatterns.size()-1 (handles arrayOutOfBounds error for listOfPatterns)
		 */
		
		do {
			for(int i = 0; i < peekArr.length; i++) {
				//if element matches an element from the pattern, increment number of matching values
				if((peekArr[i] == listOfPatterns.get(pattern).get(patternValue)) && (noise < 2)) {
					numOfMatchingValues++;
					//patternValue only increments if there is a match between peekArr's element and the pattern its being compared to
					patternValue++;
					//noise values at the beginning or end of peekArr do not count as noise values because that is before or after the sequence
					//increments noise if there is not a match between peekArr's element and the pattern value its being compared to
				} else if((noise < 2) && (i != 0) && (i != peekArr.length-1))
					noise++;
				//if there is more than 1 noise, break the loop
				else if(noise >= 2) 
					break;
			}

			//the number of matching values between the peekArr and the pattern is 6, foundMatch = true
			if(numOfMatchingValues >= 6) 
				foundMatch = true;
			else {
				//if there is less than 6 matches between peekArr and the pattern then reset counters and increment to the next pattern in list of patterns
				numOfMatchingValues = 0;
				noise = 0;
				patternValue = 0;
				pattern++;
				//this if statements handles the arrayOutOfBounds error for listOfPatterns
				//if the pattern is bigger than its size()-1, return -1 (no code num found)
				if(pattern > listOfPatterns.size()-1) {
					return -1;
				}
			}
	
		//only do this loop while a match pattern has not been found
		} while(foundMatch == false);
		
		//if match has been found, return the codenum in the pattern which should be the last element of pattern
		if(foundMatch = true)
			return listOfPatterns.get(pattern).get(6);
		else
			return -1; //if no match has been found then return -1
	}

	/**
	 * printOutputFile method prints the decodedMessage onto a csv file. Void return
	 * 
	 * @param decodedMessage
	 */
	public static void printOutputFile(Queue decodedMessage) {
		PrintWriter output;
		System.out.println(decodedMessage.size());
		int[] peekArr = decodedMessage.peek(decodedMessage.size());
		try {
			String outputContent = "";
			output = new PrintWriter("decodedMessage.csv");

			for(int i = 0; i < peekArr.length-1; i++) {
				outputContent+= peekArr[i] + ",";
				
			}
			outputContent += peekArr[peekArr.length-1];
			output.print(outputContent);
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}

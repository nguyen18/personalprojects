/*
	Taylor Nguyen
	822817405
	CS310 Healey Tuesday and Thursday 5:30pm-6:45pm
*/
import java.util.*;
import java.io.*;

/**
 * This class is a custom queue made with the help of ArrayList composition
 * 
 * @author Taylor
 *
 */
public class Queue {

	//fields
	private ArrayList<Integer> message;
	
	/**
	 * constructor without parameters
	 */
	public Queue() {
		message = new ArrayList<Integer>();
	}
	
	/**
	 * constructor with one File parameter 
	 * puts the contents of file into queue
	 * 
	 * @param messageFile
	 */
	public Queue(File messageFile) {
		this();
		String[] values;
		String toDecode = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(messageFile));
			
			//while each line has data, parse it into a String[] with .split()
			while ((toDecode = br.readLine()) != null) {
				values = toDecode.split(",");
				for(int i = 0; i < values.length; i++) {
					//parse the values array for ints and add to message (adding to queue)
					message.add(Integer.parseInt(values[i]));
				}
			}	
			
			br.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method returns the values of message
	 * 
	 * @return type ArrayList<Integer>
	 */
	public ArrayList<Integer> getValues() {
		return message;
	}
	
	/**
	 * this method finds if the queue is empty. true if empty, false if not
	 * 
	 * @return type boolean
	 */
	public boolean isEmpty() {
		//if .size() is bigger than 0 then there are elements in queue
		if(message.size() > 0)
			return false;
			else
				return true;
	}
	
	/**
	 * this method adds in a values to the queue at the tail end. void return
	 * @param val
	 */
	public void loadValue(int val) {
		message.add(val);
	}
	
	/**
	 * this method removes the head element of the queue
	 * 
	 * @return type int
	 */
	public int nextValue() {
		if(isEmpty() != true) 
			return message.remove(0);
			else
			return -1;
	}
	
	/**
	 * this method subtracts the first (head) value from every element of queue. void return
	 */
	public void normalize() {
		if(message.size() > 0) {
			int subThis = message.get(0);
			for(int i = 0; i < message.size(); i++) {
				message.set(i, message.get(i) - subThis);
			}
		} 
	}
	
	/**
	 * this method creates an array the size of num. If message.size() is smaller than num then
	 * make an array the size of message.size()
	 * 
	 * @param num
	 * @return type int[]
	 */
	public int[] peek(int num) {
		int[] arr;
		
		//if message has enough elements to make an array the size of num then make array size num
		if(message.size() >= num) {
		arr = new int[num];
		for(int i = 0; i < num; i++) 
			arr[i] = message.get(i);
		} else {
			//if message does not have enough elements to make an array the size of num
			//then make an array the size of message.size()
		arr = new int[message.size()];
		for(int i = 0; i < message.size(); i++) 
			arr[i] = message.get(i);
		}
		return arr;
		
	}
	
	/**
	 * this method returns the number of elements/size of queue
	 * 
	 * @return type int
	 */
	public int size() {
		return message.size();
	}
	
}


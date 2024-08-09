package strings;

import java.util.Scanner;

public class KeepStringInOrder {

	//This line defines the main method, which serves as the entry point for the program.
	//The method takes an array of strings (args) as its parameter.

	public static void main(String[] args) {
		
		//This line creates a Scanner object named scanner to read input from the standard input (keyboard).
		Scanner scanner = new Scanner(System.in);
		
		//This line prints the message “Enter a string” to prompt the user to input a string
		System.out.println("Enter a string");
		
		//This line reads a line of text (the user’s input) and assigns it to the input variable.
		String input = scanner.nextLine();
		
		//This line calls the getCharacterCount method with the input string and assigns the result to the output variable.
		String output=getCharacterCount(input);
		
		//This line prints the output string (result of getCharacterCount) along with the message "Output: ".
		System.out.println("Output: " + output);
		
	}

	// This line defines the getCharacterCount method, which takes a string (str) as its parameter and returns a string.
	public static String getCharacterCount(String str) {
		
		//Creates a StringBuilder object named result to build the final output string.
		StringBuilder result = new StringBuilder();
		
		//Initializes an integer variable count to keep track of consecutive character occurrences (starts at 1).
		int count =1;
		
		//Starts a loop that iterates through each character in the input string (str).		
		for(int i = 0; i <str.length(); i++) {
			
			//Checks if the current character is the same as the next character (consecutive occurrence).
			if(i + 1 <str.length() && str.charAt(i) == str.charAt(i+1)) {
				count++;//If consecutive, increments the count
			}
			else {//if the next character is different or the end of the string is reached
				result.append(str.charAt(i)).append(count);//Appends the current character and its count to the result.
				count=1; //Reset the count
			}
		}
		return result.toString();//Returns the result as a string.
	}
}

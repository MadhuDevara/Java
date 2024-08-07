//Java program to count the number of words in a string

package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		
		//Print Statement: This prints the message "Enter the String" to the console, prompting the user to input a string.
		System.out.println("Enter the String");
		
		//This creates a new Scanner object named SC that reads input from the standard input stream
		Scanner sc = new Scanner(System.in);
		
		//This reads the entire line of input entered by the user and stores it in the String variable s.
		String s = sc.nextLine();
		
		//Initialize Counter: This initializes an integer variable count to 1. This assumes that there is at least one word in the input string.
		int count = 1;
		
		//For Loop: This starts a for loop that iterates over the characters of the string s from index 0 to s.length() - 2
		for (int i = 0; i < s.length() - 1; i++) 
		{
			//If Condition: This checks if the current character s.charAt(i) is a space and the next character s.charAt(i + 1) is not a space. If this condition is true, it indicates a word boundary.
			if((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				//Increment Counter: If the if condition is true, this line increments the count variable by 1, indicating the start of a new word.
				count++;
			}
			
		}
		
		//Print Result: This prints the total number of words counted in the string.
		System.out.println("Number of words in a string: " + count); 
	}
		
}

/*
 * Explanation of the Program The program prompts the user to enter a string. It
 * then initializes a counter count to 1, assuming there is at least one word in
 * the input string. The for loop iterates through the string, checking for
 * spaces followed by non-space characters to count the words. The corrected if
 * condition (s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ') ensures that a
 * word boundary is detected. Finally, the program prints the total number of
 * words in the input string.
 */
//Java program to reverse a string

package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
        // Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
        // Prompt the user to enter a string
		System.out.println("Enter a String: ");
		
        // Read the input string
		String input = scanner.nextLine();
		
		//Variable Initialization
		char ch;
		
        // Initialize an empty string to hold the reversed string
		String nstr = " ";

        // Loop through each character of the input string

		for (int i = 0; i < input.length(); i++) { 
			
            // Extract each character from the input string
			ch = input.charAt(i);
			
            // Concatenate the character to the beginning of the reversed string
			nstr = ch + nstr;
	}
        
		// Print the reversed string
		System.out.println("Reveresed String : " + nstr);
		
		scanner.close();
		
	}

}

/*
 * Example Execution Let's go through an example where the input string is
 * "hello":
 * 
 * Initial state:
 * input = "hello" 
 * nstr = " " 
 * 
 * Loop iterations:
 * First iteration (i = 0):
 * ch = input.charAt(0) = 'h' 
 * nstr = 'h' + " " = "h "
 * 
 * Second iteration (i = 1): 
 * ch = input.charAt(1) = 'e' 
 * nstr = 'e' + "h " = "eh " 
 * 
 * Third iteration (i = 2): 
 * ch = input.charAt(2) = 'l' 
 * nstr = 'l' + "eh " = "leh " 
 * Fourth iteration (i = 3): 
 * ch = input.charAt(3) = 'l' nstr = 'l' + "leh " = "lleh " 
 * 
 * Fifth iteration (i = 4): 
 * ch = input.charAt(4) = 'o' 
 * nstr = 'o' + "lleh " = "olleh " 
 * 
 * Final state:
 * nstr = "olleh "
 * 
 * Summary
The program reads a string input from the user.
It initializes an empty string to store the reversed string.
It loops through each character of the input string, extracts the character, and concatenates 
it to the beginning of the reversed string.
It prints the reversed string.
This program effectively demonstrates how to reverse a string by iterating
through its characters from the beginning and building a new string by adding each character 
to the beginning of the new string.
 */





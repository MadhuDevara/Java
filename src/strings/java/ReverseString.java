//Java program to reverse a string

package strings.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
        // Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
        // Prompt the user to enter a string
		System.out.println("Enter a String: ");
		
        // Read the input string
		String input = scanner.nextLine();
		
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

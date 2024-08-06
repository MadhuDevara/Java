
package numbers;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {

		int factorial = 1;
		
        // Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter number
		System.out.println("Enter a number ");
		
		//Initialize the number with user input
		int number = scanner.nextInt();
		
        // Calculate factorial
		for (int i = 1; i <= number; i++)
		{
			factorial = factorial * i;
		}
		
        // Print the factorial
		System.out.println("Factorial of " + number + " is: " + factorial);
		
        // Close the scanner
		scanner.close();
				
	}
}

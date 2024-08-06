// Explain the below in detail

package numbers;

import java.util.Scanner;

public class NumberSwapping {

	public static void main(String[] args) {
				
        // Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
		System.out.println("Enter the firt number: ");
		
        // Initialize the first number (in reality, this should read from scanner)
		int a = scanner.nextInt();

        // Prompt user to enter the second number
		System.out.println("Enter second number: ");
		
        // Initialize the second number (in reality, this should read from scanner)
		int b = scanner.nextInt();
		
        // Print initial values of a and b
		System.out.println("After swapping: " + a + ", b= " + b);
		
        // Swap values of a and b
		a = a+b;
		b = a-b;
		a = a-b;

		// Print values after swapping
		System.out.println("After swapping: a = " + a + ", b = " + b);
		
        // Close the scanner object
		scanner.close();
		
	}

}

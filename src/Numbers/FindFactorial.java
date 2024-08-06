package Numbers;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {

		int factorial = 1;
		
        // Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);

		//Prompt user to enter number
		System.out.println("Enter a number ");
		
		//Initialize the first number
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		scanner.close();
				
	}

}

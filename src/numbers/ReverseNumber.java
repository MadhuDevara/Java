
package numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		/*
		 * These lines declare four integer variables:
		 * 
		 * no: To store the number entered by the user.
		 * rev: To store the reversed number, initialized to 0. 
		 * r: To store the remainder when the number is divided by 10.
		 * a: To store the original number entered by the user.
		 */		
				
		int no, rev=0,r,a;
		
		//Creating a scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user to enter a number
		System.out.println("Enter a number: ");
		
        // Read the number entered by the user
		no = scanner.nextInt();
		
        // Store the original number
		a = no;
		
        // Reverse the number
		while(no>0) 
		{
            // Get the last digit of the number
			r = no % 10;
			
            // Add the last digit to the reversed number
			rev = rev *10 + r;
			
            // Remove the last digit from the number
			no = no/10;
		}
		
        // Print the reversed number
		System.out.println("Reverse : " +rev);
		
        // Close the scanner object
        scanner.close();
		
	}
}

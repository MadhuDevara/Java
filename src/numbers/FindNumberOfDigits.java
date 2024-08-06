//Java program to find number of digits in given number

package numbers;

import java.util.Scanner;

public class FindNumberOfDigits {

	public static void main(String[] args) {
		
		int no = 0, a = 0;
		
		//Creating a scanner object
		Scanner scanner = new Scanner(System.in);
		
        // Prompt user to enter a number
		System.out.println("Enter a number: ");

        // Read the number entered by the user
		no=scanner.nextInt();
		
        // Convert negative number to positive
		if(no<0) 
		{
			no=no * -1;
		}
		
        // Handle the special case for zero
		else if(no==0) 
		{
			no=1;
		}
		
		// Count the number of digits
		while(no>0) 
		{
			no=no/10;
			a++;
		}
		
        // Print the number of digits
		System.out.println("Number of digits in given number is:"+a);
		
		scanner.close();
		
	}
}

/*
 * Summary 
 * 
 * The program reads an integer from the user. It handles negative
 * numbers by converting them to positive. It specifically handles zero as a
 * special case. It counts the number of digits in the number using a loop. It
 * prints the count of digits. This program effectively determines the number of
 * digits in any integer input by the user.
 * 
 */
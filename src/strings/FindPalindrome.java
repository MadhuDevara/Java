//Java program to find Palindrome number

package strings;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {

		//Creating the scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user to enter a number
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if (ispalindrome(number)) 
		{
			System.out.println(number + " is a plaindrome.");
		}
		else 
		{
			System.out.println(number + "is not a palindrome. ");
		}
		
	}

	private static boolean ispalindrome(int num) {
		
		int originalNumber = num;
		int reverseNumber = 0;
		
		while (num !=0) {
			int digit = num %10;
			reverseNumber = reverseNumber * 10 + digit;
			num = num/10;
		}
				
		return originalNumber == reverseNumber;
	}

}

/*SUMMARTY:
 * 
 * This program effectively checks whether a given number is a palindrome by
 * reversing the number and comparing it with the original number.
 * 121,133,12321,45654,98789
 */

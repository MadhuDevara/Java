//This Java program reads a string from the user and prints the characters that are located at even indices in the string.

package strings;

import java.util.Scanner;

public class PrintEvenIndexed {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();	
		
		//The program prints a message indicating that it will display the characters at even indices from the input string.	
		System.out.println("Even indexed characters in\"" + input +"\":");
		
		//The printEvenIndexedCharacters method is called with the input string as an argument.
		printEvenIndexedCharacters(input);
				
	}

   // this method takes a String parameter str and prints out the characters at even indices.
   static void printEvenIndexedCharacters(String str) {
	
       //A for loop is used to iterate through each character of the string str.

	   for(int i=0; i<str.length();i++) {
			if (i%2==0) { //The program checks if the current index i is even (i.e., divisible by 2).

		// If the index is even, the character at that index is printed.

				System.out.print(str.charAt(i));
			}
		}
	}
}

	/*	OUTPUT:
		Enter a string: Automation
		Even indexed characters in "Automation":
		Atmto
		
		This program demonstrates basic string manipulation and user interaction in Java.

	*/


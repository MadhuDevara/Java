// Java program to print unqiue characters
	
	/*Explanation of the Java Program
	  This Java program reads a string input from the
	  user and prints the unique characters in the string. 
	  It uses a boolean array to track the occurrence of characters.
	*/

package strings;

import java.util.Scanner;

	/*
	  import Statement: This imports the Scanner class from the java.util package,
	  which is used for reading user input.
	*/

public class PrintUnqiueCharacters {

	public static void main(String[] args) {
		
		/*
		 * Main Method: This is the entry point of the program.
		 * 
		 * It creates a Scanner object to read input from the user. It prompts the user
		 * to enter a string and reads the input using scanner.nextLine(). It prints a
		 * message indicating that it will display the unique characters in the input
		 * string. It calls the printUniqueCharacters method with the user input as an
		 * argument.
		 */		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
		
		System.out.println("Unique characters in\" " + input + "\":");
		printUniqueCharacters(input);
		
	}

	static void printUniqueCharacters(String str) {
    // Assume ASCII characters (0-127), use boolean array to track character occurrences		
	
		/*
		printUniqueCharacters Method: This method prints the unique characters in the input string str.

	    It initializes a boolean array unique of size 128 (to cover ASCII characters).
	    It iterates over each character in the string str.
	    For each character ch, it checks if unique[ch] is false (indicating that the character has not been encountered before).
	    If the character is unique, it sets unique[ch] to true and prints the character.	
		
		*/
		
	boolean[]	unique = new boolean[128];
	
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(!unique[ch]) {
			unique[ch] = true;
				System.out.print(ch + " ");
			}
		}
	}
}


	
	/*OUTPUT
		Enter a string
		Hello world
		Unique characters in" Hello world":
		H e l o   w r d 
	*/
			
	/*
	Detailed Explanation of the Process
	Initial Input
	
	    User is prompted to enter a string.
	    Example input: "Hello World"
	
	Variable Initialization
	
	    Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();
	    boolean[] unique = new boolean[128]; (all values initially false)
	
	Iteration Over Characters

    First Iteration (ch = 'H'):
        unique['H'] is false
        Set unique['H'] to true
        Print H
    Second Iteration (ch = 'e'):
        unique['e'] is false
        Set unique['e'] to true
        Print e
    Third Iteration (ch = 'l'):
        unique['l'] is false
        Set unique['l'] to true
        Print l
    Fourth Iteration (ch = 'l'):
        unique['l'] is true (already encountered)
        Skip printing
    Fifth Iteration (ch = 'o'):
        unique['o'] is false
        Set unique['o'] to true
        Print o
    Sixth Iteration (ch = ' '):
        unique[' '] is false
        Set unique[' '] to true
        Print
    Seventh Iteration (ch = 'W'):
        unique['W'] is false
        Set unique['W'] to true
        Print W
    Eighth Iteration (ch = 'o'):
        unique['o'] is true (already encountered)
        Skip printing
    Ninth Iteration (ch = 'r'):
        unique['r'] is false
        Set unique['r'] to true
        Print r
    Tenth Iteration (ch = 'l'):
        unique['l'] is true (already encountered)
        Skip printing
    Eleventh Iteration (ch = 'd'):
        unique['d'] is false
        Set unique['d'] to true
        Print d

        Summary

        The program reads a string input from the user and prints the unique characters in the string.
        It uses a boolean array to track the occurrence of each character.
        It iterates over the characters in the string, printing each unique character only once.
        The program assumes the use of ASCII characters for simplicity.

	 */        
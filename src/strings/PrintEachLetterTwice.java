//This Java program takes a string input from the user and prints a new string where each character from the original string is repeated twice.

package strings;

import java.util.Scanner;

public class PrintEachLetterTwice {

	public static void main(String[] args) {
	
		//A Scanner object named scanner is created to read input from the standard input (usually the keyboard).
		Scanner scanner = new Scanner(System.in);
		
		//The program prompts the user to enter a string.
		System.out.println("Enter a String: ");

		// The program reads the entire line of text entered by the user and stores it in the variable input.
		String input = scanner.nextLine();
		
		// The doubleCharacters method is called with the input string as an argument. This method returns a new string where each character from the original string is repeated twice, and the result is stored in doubledString.
		String doubledString = doubleCharacters(input);
		
		//The program prints the new string with doubled characters.
		System.out.println("Doubled characters: " + doubledString);
	}

	// This is a static method that takes a String parameter str and returns a new string where each character is repeated twice.
	static String doubleCharacters(String str) {
		
		//A StringBuilder object named doubled is created to efficiently build the new string with doubled characters.
		StringBuilder doubled = new StringBuilder();

		//A for loop is used to iterate through each character in the string str.
		for(int i=0;i<str.length();i++) {
			
			//The program retrieves the character at index i, stores it in the variable ch, and appends it twice to the StringBuilder object doubled.
			char ch = str.charAt(i);
			doubled.append(ch).append(ch);//Append each character twice
		}
		
		//After the loop completes, the StringBuilder object is converted to a String using toString() and returned as the result.
		return doubled.toString();
	}
}

/*
Summary:
This program demonstrates how to manipulate strings by iterating through each character and appending it twice to create a new string. The use of StringBuilder makes this approach efficient, especially for longer strings. 
This program is useful for tasks where you need to repeat or emphasize each character in a string.

Enter a String: 
Hello
Doubled characters: HHeelllloo

*/
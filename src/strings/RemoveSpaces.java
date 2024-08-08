package strings;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		//A Scanner object named scanner is created to read input from the standard input.
		Scanner scanner = new Scanner(System.in);

		//The program prompts the user to enter a string that may contain spaces.
		System.out.println("Enter a String with spaces");

		//The program reads the user's input string, including any spaces, and stores it in the variable input.
		String input = scanner.nextLine();
		
		//The program calls the removeSpaces method, passing the input string to it. The method returns a new string with all spaces removed, which is stored in the stringWithoutSpaces variable. 
		String stringWithoutSpaces = removeSpaces(input);
		
		//The program prints the new string, which does not contain any spaces.
		System.out.println("String without spaces:" + stringWithoutSpaces);
	}
	//This is a static method that takes a String parameter str and returns a new string with spaces removed.
	static String removeSpaces(String str) {
	
		//A StringBuilder object named result is created to efficiently build the new string without spaces.
		StringBuilder result = new StringBuilder();
		
		//A for loop is used to iterate through each character of the string str.
		for(int i=0; i< str.length();i++) {
			
			//The program checks if the current character at index i is not a space.
			if(str.charAt(i)!=' ') {
				//If the character is not a space, it is appended to the StringBuilder object result.
				
                //After the loop finishes, the StringBuilder object is converted back to a String using toString() and returned.
				result.append(str.charAt(i));
			}
		}
		
		return result.toString();
	}

}



/*OUTPUT:
 * Enter a String with spaces
 * Java is programming lang
 * String without spaces:Javaisprogramminglang
 * 
 * 
 * Summary:
 * This program demonstrates how to manipulate strings in Java by removing spaces using a StringBuilder and iterating through the characters of a string. It's an efficient way to create a new string without spaces, especially for larger inputs.
*/



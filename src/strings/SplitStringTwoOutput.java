//Java program to gives two Output: “Subburaj”, “123” for the Input String Str = “Subbu123raj”

package strings;

import java.util.Scanner;

public class SplitStringTwoOutput {

	public static void main(String[] args) {

		//Creates a Scanner object to read input from the standard input (keyboard).
		Scanner scanner = new Scanner(System.in);
		
		//This line prints enter the string
		System.out.println("Enter the string");
		
		//This line read the string and assign to a variable
		String input = scanner.nextLine();
		
		System.out.println("Original String is:"+input);
		
		//This method is called with the user input string as an argument. It handles the separation of alphabetic and numeric characters.
		separateAplhaAndNumeric(input);
		
	}

	//Separate Alpha and Numeric Method
	public static void separateAplhaAndNumeric(String input) {
		
		//objects are created to store the alphabetic and numeric characters separately.
		StringBuilder alphaPart = new StringBuilder();
		StringBuilder numericPart = new StringBuilder();
		
		for(char ch: input.toCharArray()) //This loop iterates through each character in the input string.
		{
			if(Character.isLetter(ch)) { //If the character is alphabetic (a-z or A-Z), it is added to alphaPart.
				alphaPart.append(ch); //
			}
			else if(Character.isDigit(ch)) //If the character is numeric (0-9), it is added to numericPart.
			{
				numericPart.append(ch);
			}
		}
		
		//This prints the separated alphabetic characters.
		System.out.println("Output in Alpha: "+alphaPart.toString());
		//This prints the separated numeric characters.
		System.out.println("Output in Numeric: "+numericPart.toString());
	}
}

	/*OUTPUT:
	Enter the string
	Subbu123raj
	Original String is:Subbu123raj
	Output in Alpha: Subburaj
	Output in Numeric: 123
	This program effectively separates alphabetic and numeric characters in any given string input by the user.
	*/
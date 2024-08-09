package strings;

import java.util.Scanner;

public class UpperLowerCaseShuffle {

	public static void main(String[] args) {
		
		//Creates a Scanner object to read input from the standard input (keyboard).
		Scanner scanner = new Scanner(System.in);
		//Prompt the user to input a string
		System.out.println("Enter a string: ");
		
		//This line reads a line of text from the user (the first string) and assigns it to the variable str1.
		String input = scanner.nextLine();
		
		//when this line executes, it will print the original input string (stored in the input variable) along with the message "Original string is: 
		System.out.println("Original string is: "+ input);
		
		//Calls the separateCharacters method with the input string.
		separateCharacters(input);
		
	}

	//Defines the separateCharacters method, which takes a string (input) as a parameter.
	public static void separateCharacters(String input) {
		
		//Initializes two StringBuilder objects: lowerCase and upperCase
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		
		//Iterates through each character in the input string
		for(char ch: input.toCharArray()) 
		{	
			//Checks if the current character is lowercase.
			if(Character.isLowerCase(ch)) 
			{	
				//If lowercase, appends it to the lowerCase StringBuilder
				lowerCase.append(ch);
			}
			else//If not lowercase (i.e., uppercase)
			{
				upperCase.append(ch);//Appends it to the upperCase StringBuilder
			}
		}
		//Prints the characters collected in lowerCase
		System.out.println("Output in lowercase: "+lowerCase);
		//Prints the characters collected in upperCase
		System.out.println("Output in uppercase: "+upperCase);
		
	}
}

	/*
	OUTPUT
	Enter a string: 
	aABbCcDdEeFfGgHh
	Original string is: aABbCcDdEeFfGgHh
	Output in lowercase: abcdefgh
	Output in uppercase: ABCDEFGH
	
	Summary: The program separates the input string into lowercase and uppercase 
	characters, storing them in separate StringBuilder objects. It then prints both the original input string and the separated characters.
	*/




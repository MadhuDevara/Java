// Java program to swap two string without using 3rd variable

package strings;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
	
	//This line creates a Scanner object named scanner to read input from the standard input (keyboard).	
	Scanner scanner = new Scanner(System.in);
	
	//This line prints the message “Enter first string” to prompt the user to input the first string.
	System.out.println("Enter first string");

	//This line reads a line of text from the user (the first string) and assigns it to the variable str1.
	String str1 = scanner.nextLine();
	
	//This line prints the message “Enter second string” to prompt the user to input the second string.
	System.out.println("Enter second string");

	//This line reads another line of text from the user (the second string) and assigns it to the variable str2.
	String str2 = scanner.nextLine();
	
	//This line prints the original values of str1 and str2.
	System.out.println("Before swapping str1 = " + str1 + ", str2 = " + str2);
	
	//Swapping with out using third variable
	
	//concatenate str1 and str2 and store in str1
	str1 = str1 + str2; 
	
	//Extract the initial part (original str1) from the concatenated string
	str2 = str1.substring(0, str1.length() - str2.length());
	
	//Extract the remaining part (original str2) from the concatenated string
	str1 = str1.substring(str2.length());
	
	//This line prints the updated values of str1 and str2 after the swapping process.
	System.out.println("After swapping: str1 = " + str1 +", str2="+str2);
	
	}
}

/* OUTPUT:
 * 
 * Enter first string
 * java
 * Enter second string
 * program
 * Before swapping str1 = java, str2 = program
 * After swapping: str1 = program, str2=java

   Summary, 
   this program reads two strings from the user, swaps their values without
   using a third variable, and displays the swapped strings. If you run this
   program, you can input any two strings, and it will demonstrate the swapping technique. 


 */
	
//Java program to reverse each word of a given string

package strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		reverseEachWordOfString("Java is good programming language");
		
	}

	static void reverseEachWordOfString(String inputString) 
	{
        // Split the input string into words
		String[] words = inputString.split(" ");
		
        // Initialize an empty string to hold the reversed words
		String reverseString = "";

        // Loop through each word in the array
		for (int i = 0; i < words.length; i++) {
			
            // Get the current word
			String word = words[i];
			String nstr = "";
			char ch;
			
            // Loop through each character in the word
			for (int j = 0; j< word.length(); j++) {
				ch = word.charAt(j);
				nstr = ch + nstr;
			}
			
            // Add the reversed word to the final string with a space
			reverseString = reverseString + nstr + " ";
		}
		
        // Print the original input string
		System.out.println(inputString);

        // Print the final reversed string
		System.out.println(reverseString);
	}

}


/*
 * Summary
 * 
 * The program reads a string input. 
 * It splits the input string into words. 
 * It reverses each word individually. 
 * It constructs a new string with each reversed word. 
 * It prints the original and the reversed strings. 
 * 
 * This corrected program effectively demonstrates how to reverse each word in a
 * given string and handle common issues such as incorrect loop ranges.
 * 
 */


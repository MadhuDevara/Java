/*This Java program is designed to find the length of the longest substring in a given string that contains no repeating characters. Let's break down the code and explain how it works.
*/

package strings;

import java.util.HashSet;

public class LongStringNoRepeat {

	public static void main(String[] args) {

		//These lines define four string variables (s1, s2, s3, and s4) with different values. These strings will be used as input to test the lengthOfLongestSubString method.
		String s1 ="abcabcbb"; 
		String s2 ="bbbbb";
		String s3 ="pwwkew";
		String s4 ="";
		
		//Purpose: This line prints the length of the longest substring without repeating characters in s1. It calls the lengthOfLongestSubString method with s1 as the argument, concatenates the result with a descriptive message, and prints it to the console.
		
		System.out.println("Longest substring without repeating characters in s1: "
				+ lengthOfLongestSubString(s1));
		
		System.out.println("Longest substring without repeating characters in s2: "
				+ lengthOfLongestSubString(s2));
		
		System.out.println("Longest substring without repeating characters in s3: "
				+ lengthOfLongestSubString(s3));
		
		System.out.println("Longest substring without repeating characters in s4: "
				+ lengthOfLongestSubString(s4));
		
	}

	//This declares a static method named lengthOfLongestSubString that takes a string s as input and returns an integer. The method is static, meaning it can be called without creating an instance of the class. It computes the length of the longest 
	// substring without repeating characters in the input string s.
	
	
	public static int lengthOfLongestSubString(String s) {
		
		//This line creates a new HashSet named set that will store characters from the string. The HashSet is used to keep track of characters in the current substring being considered, ensuring that all characters in the substring are unique.
		HashSet<Character>	set = new HashSet<>();
		
		//This initializes an integer variable maxLength to 0. This variable will store the length of the longest substring without repeating characters found so far.
		int maxLength = 0;
		
		//These lines initialize two integer variables, start and end, both to 0. These variables act as pointers or indices that define the current substring (window) being examined within the string s
		int start = 0;
		int end =0;
	
		//This line starts a while loop that continues as long as end is less than the length of the string s. The loop iterates through the string character by character, with end moving forward to expand the current substring (window)
		while (end <s.length()) {
			
			//This line retrieves the character at the current end index from the string s and stores it in the currentChar variable.
			char currentChar =s.charAt(end);
			
			//This checks if currentChar is not already in the set. If it isn't, it means that the character hasn't been encountered before in the current substring, so it can be added to the substring without violating the rule of unique characters.
			if(!set.contains(currentChar)) {
				
				//This adds currentChar to the set, signifying that this character is now part of the current substring being considered.
				set.add(currentChar);
			
				//This updates maxLength to be the maximum of its current value and the length of the current substring (which is end - start + 1). This ensures that maxLength always holds the length of the longest valid substring found so far.
				maxLength = Math.max(maxLength, end - start +1);
				
				//This increments the end pointer, expanding the current substring by one character.
				end++;
				
			}else {
					set.remove(s.charAt(start));
					start++;
					/*
					Purpose: This else block is executed if currentChar is already in the set, meaning a repeating character is found in the current substring. To handle this:
						set.remove(s.charAt(start)): Removes the character at the start index from the set, effectively shrinking the current substring from the left.
						start++: Increments the start pointer, moving the beginning of the current substring to the right by one character.		
					*/
					
			}
			
		}
		
		return maxLength;
		
		/*
		 * After the loop completes, this line returns the value of maxLength, which now holds the length of the longest substring without repeating characters in the string s.
		 */
		
	}

}

	/*
	 * 
	Summary:
	The program calculates the length of the longest substring without repeating characters for several test strings using a sliding window approach. The HashSet is crucial for quickly checking and maintaining unique characters in the current window (substring). The maxLength variable ensures that the program correctly identifies and returns the maximum length found.
	
	Longest substring without repeating characters in s1: 3
	Longest substring without repeating characters in s2: 1
	Longest substring without repeating characters in s3: 3
	Longest substring without repeating characters in s4: 0
	
	*/



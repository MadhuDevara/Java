package strings;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		duplicateCharacterCount("Learn Java Programming");
	}

	static void duplicateCharacterCount(String inputString) {

		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		// Convert to lowerCase to handle case sensitivity
		char[] strArray = inputString.toLowerCase().toCharArray();
		
		//Count characters
		for (char c : strArray) {
			if(c != ' ') { // Ignore whitespace characters
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}
		}
		
		Set<Character> charInString = charCountMap.keySet();
		System.out.println("Duplicate Characters in : " + inputString);
		
		// Print characters with count greater than 1 
		for (Character ch: charInString) {
			if(charCountMap.get(ch) > 1) {
				System.out.println(ch+ " : " + charCountMap.get(ch));
			}
		}
	}
}


/*
 * Method to Find Duplicate Characters:
 * 
 * static void duplicateCharacterCount(String inputString): Creates a HashMap to
 * store character counts. Converts the input string to a character array.
 * Iterates through the array, updating the HashMap with character counts.
 * Prints characters that appear more than once.
 * 
 * Summary of Changes
 * Converted the input string to lowerCase to handle case sensitivity.
 * Ignored whitespace characters during counting.
 * Simplified the charCountMap.put logic using getOrDefault for readability.
 * 
 */




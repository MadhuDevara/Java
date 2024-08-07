// Java program to count Occurrences of Each Character in String

package strings;

import java.util.HashMap;

public class CountOccurrences {

	public static void main(String[] args) {
		
		CharacterCount("Test Automation Java Automation");
	}

	static void CharacterCount(String inputString) {
	
		//This creates a HashMap named charCountMap to store words (keys) and their occurrences (values).
		HashMap<String, Integer> charCountMap = new HashMap<>();
		
		//Splitting the String and Looping:
		for(String s : inputString.split(" "))
		{
			//Updating the HashMap:
			if(charCountMap.containsKey(s)) 
			{
				charCountMap.put(s, charCountMap.get(s) + 1);
			}
			else
			{
				charCountMap.put(s, 1);
			}
			
		}
			System.out.println("Count of characters in a given string: "
					+ "" + charCountMap);
			
	}

}

/*
 * This output indicates that the word "Test" appears once, "Automation" appears
 * twice, and "Java" appears once in the given string.
 */







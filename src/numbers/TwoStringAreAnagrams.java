/* Java program to determine if Two Strings are Anagrams

 1.This Java program checks if two given strings are anagrams of 
 each other. An anagram is a word or phrase formed by rearranging 
 the letters of another, such as "listen" and "silent".

*/

package numbers;

public class TwoStringAreAnagrams {

	public static void main(String[] args) {
    
	// It defines two strings str1 with the value "listen" and str2 with the value "silent".
	// It calls the areAnagrams method with str1 and str2 as arguments and prints the result.	
		
		String str1 = "listen";
		String str2 = "silent";
		System.out.println(areAnagrams(str1,str2));
	}

	static boolean areAnagrams(String str1, String str2) {
		
	// his method checks if the input strings str1 and str2 are anagrams. It returns 
	// a boolean value (true if the strings are anagrams, false otherwise).	
	
	// Length Check: If the lengths of str1 and str2 are not equal,
 	// the method returns false immediately, as strings of different lengths cannot be anagrams.	
		
		if (str1.length() !=str2.length()) {
			return false;
		}
		
	
	// Character Count Array: An integer array charCount of size 256 is created to store the
	//count of each character. The size 256 is chosen to accommodate all ASCII characters.	
	
		int[]charCount = new int[256];
		
	
	/*
	 * Count Characters: A for loop iterates over each character of the strings.
	 * For each character in str1, the corresponding position in charCount is
	 * incremented. For each character in str2, the corresponding position in
	 * charCount is decremented. This way, if the strings are anagrams, each
	 * increment by str1 will be offset by a corresponding decrement by str2.
	 */
	
		for(int i=0; i<str1.length();i++) 
		{
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}
	
	/*
	* Check Counts: A for-each loop iterates over the charCount array.
	* If any value in charCount is not zero, it means that str1 and str2 have
	* different characters or different counts of the same character. In this case,
	* the method returns false.
	*/
		
		for(int count:charCount) 
		{
			if(count !=0) 
			{
				return false;
			}
		}
	
	/*
	 * Return True: If all values in charCount are zero, the method returns true,
	 * indicating that str1 and str2 are anagrams.
	 */	
		
		return true;
	}
}

/*
 * Detailed Explanation of the Process Initial Call
 * 
 * areAnagrams("listen", "silent")
  
 * Length Check
 * str1.length() == str2.length() (both are 6)
 
 * Character Count Array Initialization
 * charCount = new int[256] (array initialized with zeros)
 
 * Counting Characters
 * Loop iteration i=0:
 * str1.charAt(0) is 'l' (ASCII value 108)
 * charCount[108]++ * (increment position 108)
 * str2.charAt(0) is 's' (ASCII value 115)
 * charCount[115]-- (decrement position 115)
 
 * Loop iteration i=1:
 * str1.charAt(1) * is 'i' (ASCII value 105)
 * charCount[105]++
 * str2.charAt(1) is 'i' (ASCII value 105)
 * charCount[105]--
 
 * Loop iteration i=2: 
 * str1.charAt(2) is 's' (ASCII value 115)
 * charCount[115]++ str2.
 * charAt(2) is 'l' (ASCII value 108)
 * charCount[108]-- 
 * 
 * Loop iteration i=3:
 * str1.charAt(3) is 't' (ASCII value 116)
 * charCount[116]++
 * str2.charAt(3) is 'e' (ASCII value 101)
 * charCount[101]--
 
 * Loop iteration i=4:
 * str1.charAt(4) is 'e' (ASCII value 101)
 * charCount[101]++
 * str2.charAt(4) is 'n' (ASCII value 110)
 * charCount[110]--
 
 * Loop iteration i=5:
 * str1.charAt(5) is 'n' (ASCII value 110)
 * charCount[110]++ 
 * str2.charAt(5) is't' (ASCII value 116) 
 * charCount[116]--
 * 
 * Check Counts
 * 
 * The charCount array should have all zeros if str1 and str2 are anagrams.
 * 
 * Return True
 * 
 * Since all counts are zero, the method returns true.
 */




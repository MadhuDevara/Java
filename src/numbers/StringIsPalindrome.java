// Java program to find if a string is Palindrome

package numbers;

public class StringIsPalindrome {

	public static void main(String[] args) {

	// It defines a string str with the value "madam".
	// It calls the isPalindrome method with str as an argument and prints the result.	
			
		String str = "racecar";
		System.out.println(isPalindrome(str));
		
	}

   // isPalindrome Method: This method checks if the input string str is a 
   // palindrome. It returns a boolean value (true if the string is a palindrome, false otherwise).
	
	static boolean isPalindrome(String str) {
	
   // Initialize Pointers: Two pointers are initialized:
   // start points to the beginning of the string.
   // end points to the end of the string.		
		
		int start = 0;
		int end = str.length() -1;
		
		while (start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}

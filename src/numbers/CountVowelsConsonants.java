// This Java program counts the number of vowels and consonants in a given
// string. It prints the counts of vowels and consonants separately.
 

package numbers;

public class CountVowelsConsonants {

	/*
	 * Main Method: This is the entry point of the program.
	 * 
	 * It defines a string str with the value "Hello World". It calls the
	 * VowelConsonantCount method with str as an argument.
	 */	
	
	public static void main(String[] args) {

		String str = "Hello World";
		VowelConsonantCount(str);
	}
	
	/*
	 * VowelConsonantCount Method: This method counts the number of vowels and
	 * consonants in the input string str.
	 * It initializes two integer variables vowels and consonants to 0. It converts
	 * the string str to lowercase to make the comparison case-insensitive.
	 */	
		
	static void VowelConsonantCount(String str) {
		
		int vowels =0, consonants = 0;
		str = str.toLowerCase();
		
	/*
	 * For-Each Loop: This loop iterates over each character c in the string str.
	 */	
		for(char c: str.toCharArray()) {
	
	/*
	 * Vowel Check: If the character c is one of the vowels ('a', 'e', 'i', 'o',
	 * 'u'), it increments the vowels counter.
	 
	 * Consonant Check: If the character c is an alphabetic letter but not a vowel, it increments the consonants
	 * counter.
	 */			
			
			if(c>='a' && c<='z') {
				if(c== 'a'|| c=='e' || c=='i' || c=='o' || c =='u') {
					
					vowels++;
					
				}else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels: "+ vowels);
		System.out.println("Consonants: " + consonants);
		
	}

}

/*Detailed Explanation of the Process
Initial Call

    VowelConsonantCount("Hello World")

Initialization

    vowels = 0
    consonants = 0
    Convert str to lowercase: str = "hello world"

Loop Iteration

    First Iteration (c = 'h'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 1
    Second Iteration (c = 'e'):
        c is between 'a' and 'z'
        c is a vowel
        Increment vowels: vowels = 1
    Third Iteration (c = 'l'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 2
    Fourth Iteration (c = 'l'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 3
    Fifth Iteration (c = 'o'):
        c is between 'a' and 'z'
        c is a vowel
        Increment vowels: vowels = 2
    Sixth Iteration (c = ' '):
        c is not between 'a' and 'z'
        Skip this iteration
    Seventh Iteration (c = 'w'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 4
    Eighth Iteration (c = 'o'):
        c is between 'a' and 'z'
        c is a vowel
        Increment vowels: vowels = 3
    Ninth Iteration (c = 'r'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 5
    Tenth Iteration (c = 'l'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 6
    Eleventh Iteration (c = 'd'):
        c is between 'a' and 'z'
        c is not a vowel
        Increment consonants: consonants = 7

Print Results

    System.out.println("Vowels : " + vowels); prints "Vowels : 3"
    System.out.println("Consonants : " + consonants); prints "Consonants : 7"
    
    Summary

    The program counts and prints the number of vowels and consonants in a given string.
    It converts the string to lowercase for case-insensitive comparison.
    It uses a for-each loop to iterate through each character and checks if it is a vowel or consonant.
    It maintains counters for vowels and consonants, incrementing them accordingly, and prints the results.
    
    
    
*/


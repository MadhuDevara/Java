package strings;

public class FindAllPermutations {

	public static void main(String[] args) {
		String str ="abc";
		permute(str, "");
	}

	static void permute(String str, String prefix) {
	
		//permute Method: This is a recursive method that generates all permutations of the string str. The prefix parameter keeps track of the current permutation being built.
		if(str.length()==0) 
		{
			System.out.println(prefix);
		}
		
		//Base Case: If str is empty, it means a permutation has been fully formed. The method prints the current permutation stored in prefix.
		else
		{
			for(int i=0; i< str.length(); i++) 
			{
				String rem = str.substring(0,i)+ str.substring(i+1);
				permute(rem,prefix + str.charAt(i));
				
	/*
	 * //Recursive Case: If str is not empty, the method iterates over each
	 * character in str. For each character, it creates a new string rem by removing
	 * the character at index i. It then calls permute recursively with rem and the
	 * updated prefix (which includes the character at index i).
	 */				
				
				
			}
		}
	}
}


/*Summary
 * 
 *
 * 
 * 
 * Detailed Explanation of the Recursive Process
 * 
 * Initial Call
 *  permute("abc", "")
   
 *  First Level of Recursion
 * Loop iteration i=0:
 *  rem = "bc" (remove a)
 *  Call permute("bc", "a")
 * 
 * Loop iteration i=1:
 *  rem = "ac" (remove b)
 *  Call permute("ac", "b")
   
 *  Loop iteration i=2:
 *  rem = "ab" (remove c)
 *  Call permute("ab", "c")
   
 *  Second Level of Recursion (Example for i=0)
 *  permute("bc", "a")
 *  Loop iteration i=0:
 *  rem = "c" (remove b)
 *  Call permute("c", "ab")
   
 *  Loop iteration i=1:
 *  rem = "b" (remove c)
 *   Call permute("b", "ac")
 * 
 *  Third Level of Recursion (Example for i=0 of Second Level)
 *  permute("c", "ab")
 *  Loop iteration i=0:
 *  rem = "" (remove c)
 *  Call permute("", "abc")
 * 
 *  Base Case (Example for i=0 of Third Level)
 *  permute("", "abc")
 *  Since str is empty, print abc.
 
 *  This process continues for all characters and their permutations, ensuring all possible reorders of the string "abc" are printed.
 * 
 * Summary
 * The program recursively generates and prints all permutations of a given string.
 * It uses a helper method permute that builds permutations by iteratively removing characters and appending them to a prefix.
 * The base case prints the permutation when no characters are left to permute.
 * 
 */
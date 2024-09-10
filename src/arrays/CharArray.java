//Converts name string to a new character array.

package arrays;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {

		String name = "Selenium-Automation";
		
		char a1[]= name.toCharArray();
		
		//Char to array conversion
		System.out.println(Arrays.toString(a1));
		
		
		/*Another way to convert char to arrays
		 * 
		 * for (int i=0; i<name.length();i++) 
		 * {
		 *  System.out.println(a1[i]); 
		 * }
		 */
				
	}
}

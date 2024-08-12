// Remove duplicates from an Array

package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int [] array = {5,2,9,1,6,2,5};
		int[] uniqueArray = removeDuplicates(array);
		System.out.println("Array with duplicates removed: ");
		for(int num : uniqueArray) {
			System.out.print(num + " " );
	
		/*	
		Array Initialization:
		An integer array array is created and initialized with values {5, 2, 9, 1, 6, 2, 5}. This array contains duplicate elements.
		Removing Duplicates:
		The method removeDuplicates(array) is called, which processes the array and returns a new array uniqueArray containing only the unique elements.
		Printing the Result:
		The program then prints the elements of the uniqueArray using a for-each loop.	
		*/	
			
		}
	}

	public static int[] removeDuplicates(int[] array) {
		// HashSet<Integer> named set is created. A HashSet automatically removes duplicates, as it only allows unique elements.
		Set<Integer> set = new HashSet<>();
		
		//For (int num : array) is a for-each loop that iterates over each element (num) in the array.
		//set.add(num); adds the current num to the set. Since Set does not allow duplicates, only unique elements are stored.
		for(int num: array) {
			set.add(num);
		}
		
		/*This line creates a new integer array named result with a size equal to the number of unique elements in the set.
		  int[] result declares the array.new int[set.size()] initializes the array with the size of the set. 
		*/
		
		int[] result = new int [set.size()];
		
		// i will be used as an index for inserting elements into the result array.
		int i = 0;
		for (int num: set) { // for (int num : set) is a for-each loop that iterates over each unique element (num) in the set.
			result[i++]	= num; // result[i++] = num; assigns the current num to the result array at index i, then increments i by 1.
		}
		
		return result;
	}

}

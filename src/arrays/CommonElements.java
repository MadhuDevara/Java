// Find common elements between two arrays

package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		
		// Two integer arrays, array1 and array2, are initialized with some elements.
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		
		//The findCommonElements method is called with array1 and array2 as arguments, and the result is stored in the commonElements set.
		//The common elements found are printed out.
		Set<Integer> commonElements = findCommonElements(array1,array2);
		System.out.println("Common elements: "+ commonElements);
			
	}
	
	// This method is defined to find common elements between the two arrays.
	// It returns a Set<Integer> containing the common elements.
	
	public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
		
		// set1 is used to store all unique elements from array1.
		// commonSet is used to store the common elements found in both arrays.
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonSet = new HashSet<>();
		
		//Add elements of the first array to the set
		// A loop iterates over array1 and adds each element to set1.
		for (int num: array1) {
			set1.add(num);
		}
		
		// Another loop iterates over array2. If an element from array2 exists in set1, it’s added to commonSet.
		//Check for common elements in the second array
		for (int num: array2) {
			if (set1.contains(num)) {
				commonSet.add(num);
			}
		}
		
		// The commonSet containing all common elements is returned to the caller.
		return commonSet;
	}
}

/*OUTPUT:
  Common elements: [4, 5]
  Key Concepts
  HashSet: Used to store unique elements and allows for efficient lookup operations. The contains method has an average time complexity of O(1).
  Set Interface: The Set interface is used to store elements without duplicates, making it ideal for finding common elements.
  This program is an efficient way to find common elements between two arrays, especially with the help of the HashSet for fast lookups.
*/






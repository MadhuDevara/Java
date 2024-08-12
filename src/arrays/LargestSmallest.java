// This Java program is designed to find both the smallest and the largest elements in an array

package arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		
		// An integer array array is initialized with the values {5, 2, 9, 1, 6, 3}.
		int[] array = {5,2,9,1,6,3};
		
		// The method findLargestAndSmallest(array) is called, which calculates and returns an array containing both the smallest and largest elements in the input array.
		int[] result = findLargestAndSmallest(array);
		
		// The smallest and largest elements are printed to the console. result[0] contains the smallest element, and result[1] contains the largest element.
		System.out.println("Smallest element: "+result[0]);
		System.out.println("Largest element: "+result[1]);
		
	}

	// This method takes an integer array as input and returns an array containing the smallest and largest elements.
	public static int[] findLargestAndSmallest(int[] array) {
		
		// This check ensures that the input array is not null or empty. If it is, an IllegalArgumentException is thrown.
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		
        //The variables smallest and largest are initialized to the first element of the array.

		int smallest = array[0];
		int largest = array[0];
		
		/*
		   This loop iterates through the array. For each element:		
		 * If the current element is smaller than smallest, smallest is updated. If the
		 * current element is larger than largest, largest is updated.
		 */
		
		    for (int num: array) {
			if (num < smallest) {
				smallest = num;				
			}
			if(num > largest) {
				largest = num;
			}
		}
		// The method returns an array containing the smallest and largest elements.
		return new int[] {smallest, largest};
	}
}

/*
The array {5, 2, 9, 1, 6, 3} is processed.
The smallest element is 1, and the largest element is 9.
These values are then printed to the console:
"Smallest element: 1"
"Largest element: 9"
Thus, the program correctly identifies and outputs the smallest and largest elements in the array.
*/
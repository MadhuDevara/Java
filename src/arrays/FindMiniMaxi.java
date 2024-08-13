package arrays;

public class FindMiniMaxi {

	public static void main(String[] args) {

		// An array of integers named array is created and initialized with the values
		int[] array = { 5, 2, 9, 1, 6, 3 };

		int max = findMaximum(array);
		/*
		 * Explanation: int max: Declares an integer variable max. findMaximum(array):
		 * Calls the findMaximum method with the array as an argument. This method
		 * returns the maximum value in the array. The returned value is assigned to the
		 * variable max.
		 */

		int min = findMinimum(array);
		/*
		 * Explanation: int min: Declares an integer variable min. findMinimum(array):
		 * Calls the findMinimum method with the array as an argument. This method
		 * returns the minimum value in the array. The returned value is assigned to the
		 * variable min.
		 */
		
		// The program prints the minimum and maximum values found in the array.
		System.out.println("Minimum value in array: " + min);
		System.out.println("Maximum value in array: " + max);

	}

	public static int findMaximum(int[] array) {

		if (array.length == 0) { // if (array.length == 0): Checks if the array has zero elements (i.e., it is
									// empty).
			throw new IllegalArgumentException("Array must not be empty");
		}
		/*
		 * throw new IllegalArgumentException("Array // must not be empty"): If the
		 * array is empty, this line throws an IllegalArgumentException with the
		 * message "Array must not be empty". This prevents the method from
		 * proceeding with an empty array.
		 */
		
		int max = array[0];
		/*
		 * int max: Declares an integer variable max. array[0]: The first element of the
		 * array. This line initializes max with the first element of the array,
		 * assuming it is the largest.
		 */
	

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;

		/*
		 * for (int i = 1; i < array.length; i++): A loop that starts at the second
		 * element (index 1) and continues to the end of the array. 
		 * if (array[i] > max): Checks if the current element is greater than max.
		 * max = array[i]: If the current element is greater, update max to this new value.
		 * 
		 * Purpose: This method finds the maximum value in the array. Logic: It first
		 * checks if the array is empty. If so, it throws an IllegalArgumentException.
		 * The first element of the array is assumed to be the maximum (max = array[0]).
		 * It then iterates through the rest of the array, updating max if it finds a
		 * larger value. Finally, it returns the maximum value found.
		 * 
		 */
	}

	public static int findMinimum(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;

		/*
		 * Purpose: This method finds the minimum value in the array. Logic:
		 * 
		 * Similar to findMaximum, it first checks if the array is empty and throws an
		 * exception if it is. The first element is assumed to be the minimum (min =
		 * array[0]). It iterates through the array, updating min if it finds a smaller
		 * value. Finally, it returns the minimum value found.
		 * 
		 */
	}
}

/*
 * Summary
 * 
 * The program finds and prints the minimum and maximum values in a given array.
 * It includes error handling to ensure the array is not empty. The logic for
 * finding the minimum and maximum values involves iterating through the array
 * and comparing elements to track the smallest or largest value.
 */
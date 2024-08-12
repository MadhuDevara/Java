// Search element in an Array 

package arrays;

public class SearchElement {

	public static void main(String[] args) {
		// This line initializes an integer array named array with the values
		int [] array = {5,2,9,1,6,3};
		
		// This declares an integer variable target and initializes it with the value 6. This is the value the program will search for in the array.
		int target = 6;
		
		//This calls the linearSearch method with the array and target as arguments. The method returns the index of the target if it is found in the array, or -1 if it is not found. The result is stored in the index variable.
		int index = linearSearch(array, target);
		
		// This line checks if the index is not equal to -1. If index is not -1, it means the target was found in the array.
		if (index !=-1	) 
		{
			// If the target is found (i.e., index is not -1), this line prints a message indicating that the element was found and displays its index.
			System.out.println("Element " + target +"found at index: " + index);
		}
		else 
		{	
			// If the target is found (i.e., index is not -1), this line prints a message indicating that the element was found and displays its index.
			System.out.println("Element "+ target + "not found in the array");
		}
	}
	
	// This defines the linearSearch method, which searches for the target in the given array.
	public static int linearSearch(int[] array, int target)
	{ 
		/*
		 * Purpose: This is a for loop that iterates over each element in the array. int
		 * i = 0: The loop starts with i (the index) initialized to 0. i < array.length:
		 * The loop continues as long as i is less than the length of the array. i++:
		 * After each iteration, i is incremented by 1.
		 */
		
		for(int i = 0; i <array.length; i++) 
		{
			if(array[i] == target){
				return i;
		}
	}
		return -1;
	}
}

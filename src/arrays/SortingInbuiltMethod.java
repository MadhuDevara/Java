// Sort an array without using in-built method

package arrays;

public class SortingInbuiltMethod {

	public static void main(String[] args) {
		
		//This line declares and initializes an integer array named array with five elements: 5, 2, 9, 1, and 6.
		int[] array = {5, 2, 9, 1, 6};
		
		// This line calls the selectionSort method, passing the array as an argument. This method will sort the array using the selection sort algorithm.
		selectionSort(array); 
			
		System.out.println("Sorted array: ");
				
		// This is an enhanced for loop that iterates over each element in the array. The System.out.print(num + " "); prints each element followed by a space, effectively displaying the sorted array.
		for (int num : array) {
			System.out.print(num + " ");
		}		
	}
	
	// This line declares a static method named selectionSort that takes an integer array as a parameter. The method sorts the array in ascending order using the selection sort algorithm.
	public static void selectionSort(int[] array) {
		
		// This line initializes an integer variable n with the length of the array.
		int n = array.length;
		
		// This line starts a for loop that iterates from i = 0 to n-2. The minIndex variable is initialized to i at the beginning of each iteration. minIndex will eventually hold the index of the smallest element found in the unsorted portion of the array.
		for(int i = 0; i< n - 1; i++) {
		int minIndex=i;
			
			for(int j = i + 1; j < n; j++) {
			if(array[j]  < array[minIndex]) {
				minIndex = j;
			}
		}
		
		//Swap array[i] and array [minIndex]
		int temp = array[i];
		array[i] = array[minIndex];
		array[minIndex]=temp;
				
		}		
	}
}

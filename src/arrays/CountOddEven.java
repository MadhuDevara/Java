package arrays;

public class CountOddEven {

	public static void main(String[] args) {

		int[]array = {1,2,3,4,5,6,7,8,9}; // Initializes the array with nine integer elements. These values are stored in the array in the same order.
		
		int[]count = countOddAndEven(array);
		/*
		 * int[] count: Declares an integer array named count. countOddAndEven(array):
		 * Calls the countOddAndEven method, passing the array as an argument. This
		 * method returns an array where count[0] contains the count of odd numbers, and
		 * count[1] contains the count of even numbers. The returned array is stored in
		 * the count variable.
		 */
		
		System.out.println("Even number count: " +count[1]);
		System.out.println("Odd number count: " +count[0]);
		//  Concatenates the value of count[1] (the count of even numbers) with the text. This prints the number of even numbers in the array.
		
	}

	
	public static int[] countOddAndEven(int[] array) {
		//  Declares an integer array named count with two elements.
		int[]count = new int[2]; // index 0 for odd count,index 1 for even count
		
		for(int num:array) { // This loop will go through each number in the array.
			if(num % 2==0) { // Checks if the current number num is even. num % 2 calculates the remainder when num is divided by 2. If the remainder is 0, the number is even.
				count[1]++; // If the number is even, increment the value of count[1] by 1. This counts how many even numbers are in the array.
			}else {  // If the number is not even (i.e., it's odd), the program enters this block.
				count[0]++; // Increment the value of count[0] by 1. This counts how many odd numbers are in the array.
			}
		}
		return count; // The method returns the count array, which contains the counts of odd and even numbers.
	}
}

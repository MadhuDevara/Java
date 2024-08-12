package arrays;

public class MissingNumbers {

	public static void main(String[] args) {

		int[] array = {1,2,4,5,6}; // Missing an array
		int missingNumber = findMissingNumber(array); //The method findMissingNumber(array) is called, which calculates and returns the missing number in the array.
		System.out.println("The missing number is: "+ missingNumber); //The missing number is printed to the console.
		
	}
	
	
	//This method takes an integer array as input and returns the missing number.
	public static int findMissingNumber(int[] array) {
		
		
		int n = array.length+1; // Since one number is missing, the length should be n+1
		int totalSum = n * (n+1)/2; // The formula for the sum of the first n natural numbers is n * (n + 1) / 2. This gives the sum of numbers from 1 to n
		
		// This loop iterates through the array and sums up its elements.
		int arraySum = 0;
		for(int num : array) {
			arraySum += num;
		}
		
		// The missing number is found by subtracting the sum of the array elements (arraySum) from the sum of the first n natural numbers (totalSum).
		return totalSum - arraySum;
	}

}

/*
  How It Works: The array {1, 2, 4, 5, 6} is missing the number 3. The total
  sum of numbers from 1 to 6 (inclusive) is 21. The sum of the array elements
  is 18. The missing number is 21 - 18 = 3. Thus, the program correctly
  identifies that the missing number is 3.
*/
package numbers;

public class SumofDigits {

	public static void main(String[] args) {
		
		int number = 12345;
		
		int sumOfDigits = calculateSumOfDigits(number);
		
		System.out.println("Sum of digits of " + number + " is: " + 
				sumOfDigits);
		
	}

	private static int calculateSumOfDigits(int number) {
		int sum =0;
		
		while (number>0) {
			int digit = number % 10; //Extract the last number
			sum = sum + digit; // Add the digit to sum
			number = number / 10; // Remove the last digit from number
		}
		
		return sum;
	}

}

/*
 * Summary
 * 
 * The program reads a predefined number 12345. It calculates the sum of
 * its digits using the calculateSumOfDigits method. The method extracts each
 * digit, adds it to a running total, and returns the sum. The main method
 * prints the result.
 */
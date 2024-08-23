package numbers;

public class FibonacciSeries2 {

	public static void main(String[] args) {

		int n=10, num1=0, num2=1;
		System.out.println("Fibonacci Series:"+num1+","+num2);
		for(int i=2;i<n;i++){
			int num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
}

/*
 *The Fibonacci series is a sequence of numbers where each number 
 *is the sum of the two preceding ones, usually starting with 0 and 1.
 *The sequence typically looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 
 *and so on Summary
 *The program initializes the first two Fibonacci numbers.
 *It prints these numbers.
 *It then uses a loop to calculate and print the remaining numbers in the series by adding the last two numbers.
 *The loop runs for n - 2 iterations (since the first two numbers are already printed), generating the next Fibonacci numbers sequentially
 * 
 */


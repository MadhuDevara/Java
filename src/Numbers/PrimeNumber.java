// Java program to find prime number

package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if (isPrime(number))
		{
			System.out.println(number + "is a prime number.");
		} 
		
		else 
		{
			System.out.println(number + "is not a prime number.");
		}
		
		scanner.close();
	}
		
		public static boolean isPrime(int num) {
			 for (int i = 2; i <= num / 2; i++) {
			 //try each number by using %
			 if (num % i == 0) {
			 return false;
		 }
 
	} 			
			 
			 return true;
	}
		
}



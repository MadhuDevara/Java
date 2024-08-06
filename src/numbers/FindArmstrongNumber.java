//Java program to find Armstrong Number

package numbers;

import java.util.Scanner;

public class FindArmstrongNumber {

	public static void main(String[] args) {

		int arm=0, a,b,c,d,no;
		
		//Creating a scanner object to user input
		Scanner scanner = new Scanner(System.in);
		
		//Prompt to enter a number
		System.out.println("Enter any number: ");
		
		no=407;
		//no = scanner.nextInt();
		d=no;
		while(no>0) 
		{
			a=no%10;
			no=no/10;
			arm=arm+a*a*a;
		}
		if(arm==d) 
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
				
	}

}


/*
 * An Armstrong number (also known as a narcissistic number or pluperfect
 * number) is a number that is equal to the sum of its own digits each raised to
 * the power of the number of digits. For example,the number 153 is an Armstrong
 * number because:
 * 
 * 153=1³+5³+3³
 * 153=1+125+27
 * 153=153
 * 
 * Few example of Armstrong number
 * 153,370,371,407
 * 1634,8208,9474
 * 54748,92727,93084
 * 548834
 * 
 */
package numbers;

public class CheckNumberArmstrong {

	public static void main(String[] args) {
		
		int num = 153, sum = 0, temp = num;
		
		while (temp != 0) {
			
			int digit = temp % 10;

			sum += Math.pow(digit, 3);

			temp /= 10;
		}
		
		System.out.println(num == sum);
	}
}





/*
 * An Armstrong number (also known as a Narcissistic number or pluperfect
 * digital invariant (PPDI)) in Java or any other programming context is a
 * number that is equal to the sum of its own digits each raised to the power of
 * the number of digits.
 * 
 * For example:
 * 
 * 153 is an Armstrong number because it has 3 digits, and:
 * 13+53+33=1+125+27=153 13+53+33=1+125+27=153
 * 
 * 9474 is also an Armstrong number because it has 4 digits, and:
 * 94+44+74+44=6561+256+2401+256=9474 94+44+74+44=6561+256+2401+256=9474
 */
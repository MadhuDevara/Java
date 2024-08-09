// Java program to gives Output: “32412120000” for the Input String Str = “32400121200”

package strings;

public class ShuffleStringNumber {

	//This is the main method, the entry point of the Java application. When you run the program, the Java Virtual Machine (JVM) invokes this method.
	public static void main(String[] args) {

		//A String variable named input is declared and initialized with the value "a1b2c3". This string contains both alphabetic and numeric characters.
		String input = "a1b2c3";
		
		//he program calls the rearrangeDigits method, passing the input string as an argument. The returned string from the method is stored in the variable output.
		String output = rearrangeDigits(input);
		
		//This line prints the output string to the console, prefixed with the text "Output: ". It shows the rearranged result of the input string.
		System.out.println("Output: " + output);
	}

	//This line declares a static method named rearrangeDigits. The method takes a String as an argument (the input string) and returns a String. Being static means it can be called without creating an instance of the class.
	public static String rearrangeDigits(String input) {
		
		//Split the input into parts: Digit and nonDigits
		
		//A StringBuilder object named digits is created to hold all the digit characters from the input string. StringBuilder is a mutable sequence of characters that can be modified efficiently.
		StringBuilder digits = new StringBuilder();
		//Another StringBuilder object named nonDigits is created to hold all the non-digit characters from the input string.
		StringBuilder nonDigits = new StringBuilder();
		
		//his line starts a for-each loop that iterates over each character in the input string. The toCharArray() method converts the string into an array of characters.
		for(char c : input.toCharArray()) {
			
			/*
			This condition checks if the current character c is a digit (0-9).
			digits.append(c);: If c is a digit, it is appended to the digits StringBuilder.
			else { nonDigits.append(c); }: If c is not a digit (i.e., it's an alphabetic character), it is appended to the nonDigits StringBuilder.	
			*/
			if (Character.isDigit(c)) {
				digits.append(c);
			}else {
				nonDigits.append(c);
			}
		}
		
		//his line concatenates the contents of nonDigits and digits. The method returns a string where all non-digit characters precede the digit characters. The toString() method converts the StringBuilder contents into a String.
		return nonDigits.toString() + digits.toString();
	}
}

/*
Summary of Program Execution:
The program starts by initializing the string "a1b2c3".
It calls the rearrangeDigits method to separate and rearrange the characters.
Inside rearrangeDigits, it iterates through each character:
Appending digits to digits and non-digits to nonDigits.
Finally, it concatenates the non-digit characters with the digit characters and returns the result.
The main method then prints the final output.

 Output: abc123
*/

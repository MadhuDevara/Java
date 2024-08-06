package strings;

public class CoreBrushJava3 {

	public static void main(String[] args) {
		// how to declare strings and other methods
		// String is an object
		// create an object in java
		// we can keep s1 = same content java will create in the same memory
		// *** what is string?
		// ANS: String is an object that represents sequences of character
		// how ways we can define string?
		// Ans:we can define in two ways one way is string literal
		// another is new memory locate operater in both the value will be
		// stored in object or variable
		// Differnce between variable and new memory locate operator

		// string is an object // string literal

		// String s1 ="Rahul Shetty Academy";

		// this is one way of creating string
		// new
		String s2 = new String("welcome");
		String s3 = new String("welcome");

		// split
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);

		// System.out.println(splittedString[2]);

		System.out.println(splittedString[1].trim());

		// print by character by character
		// for(int i=0;i<s.length();i++)
		// {
		// System.out.println(s.charAt(i));
		// }

		// print the string in reverse order ?

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}

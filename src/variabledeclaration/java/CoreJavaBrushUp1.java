// what is this code 
package variabledeclaration.java;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For declaring type of data input

		int MyNum = 5;
		String website = "Rahul Shetty Academy";
		String letter = "r";
		double dec = 5.99;
		boolean mycard = true;

		// for above mentioned data to use
		// System.out.println(MyNum);
		// System.out.println(MyNum+"is the value stored in myNum variable");
		// System.out.println(website);

		// Arrays
		// for assigned memory
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 };

		// System.out.println(arr2[0]);

		// for loop
		// for print values from arr
		// for loop arr.length - 5
		// Enhanced for loop

		for (int i = 0; i < arr2.length; i++)
			;
		int i = 0;
		{
			System.out.println(arr2[i]);
		}

		String[] name = { "rahul", "shetty", "selenium" };

		for (int i1 = 0; i1 < name.length; i1++)
			;
		{
			System.out.println(name[i]);
		}

		for (String s : name) {
			System.out.println(s);
		}

	}
}

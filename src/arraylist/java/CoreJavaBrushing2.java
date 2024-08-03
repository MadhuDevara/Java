package arraylist.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushing2 {

	public static void main(String[] args) {

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 };

		// 2,4,6,8,10,122
		// if else condition
		// check if this array had multiple of 2
		// For loop and if condition

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			}

			// multiple of 2
			else {
				System.out.println(arr2[i] + "is not multiple of 2");
			}

		}

		// NUMBER 2 CODE
		// create a object of the class - object.method

		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		System.out.println(a.get(3));

		// a.add("index");
		// a.remove();
		// a.get(4);
		// a.get method
		// selenium had to print

		// NUMBER 3 CODE
		// for loop to iterate over the array list in the values
		// to get size of array list we have to use sixe method
		// if is normal method we have to use length method

		// for(int i=0;i<a.size();i++);
		// {
		// int i = 0;
		// System.out.println(a.get(i));
		// }

		// NUMBER 4 CODE
		// Enhanced for loop to print or retrieve the values in arraylist
		// use *** to separate the loop lines

		// System.out.println("*****");
		// for( String val :a)
		// {
		// System.out.println(val);
		// }

		// NUMBER 5 CODE
		// Any item is present in the array list check selenium key word is there or not
		// TRUE OR FALSE
		// method called .contains boolean this method will
		// tell searching text is available in array list or not.

		// System.out.println("*****");

		// System.out.println(a.contains("selenium"));

		// convert this array to array list

		// String [] name = {"rahul", "shetty", "selenium"};

		// .aslist method will show the return type
		// list or array list both will satisfy the operation

		// List<String> nameArraylist = Arrays.asList("selenium");
		// System.out.println("*****");
		// nameArraylist.contains("selenium");

		// for loop to iterate the array list print the values

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("*********");

		for (String val : a)
			;
		{
			char[] val = null;
			System.out.println(val);
		}

		// item is present in Arraylist
		// convert array to array list to capture one variable

		System.out.println(a.contains("selenium"));
		String[] name = { "rahul", "shetty", "selenium" };
		List<String> nameArraylist = Arrays.asList(name);
		nameArraylist.contains("selenium");

	}

}

// Find first and last element of Arraylist

package arrays;

import java.util.ArrayList;

public class FIndFirstLastArrayList {

	public static void main(String[] args) {
		// An ArrayList of type String named arrayList is created. This ArrayList will store a list of string elements.
		ArrayList<String> arrayList = new ArrayList<>();
		// The add method is used to add string elements
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");
		
		
		// Before attempting to access the first and last elements, 
		// the program checks if the arrayList is not empty using the isEmpty() method. This ensures that the program does not attempt to access elements in an empty list, which would result in an IndexOutOfBoundsException
		if(!arrayList.isEmpty()) {
			
		//If the arrayList is not empty, the first element is retrieved using the get(0) method, which accesses the element at index 0.	
		String firstELement = arrayList.get(0);
		
		// The last element is retrieved using the get(arrayList.size() - 1) method. arrayList.size() returns the number of elements in the list, and subtracting 1 gives the index of the last element.
		String lastElement = arrayList.get(arrayList.size() -1);
		
		// The first and last elements are printed to the console.
		System.out.println("First element: " + firstELement);
		System.out.println("Last element: "+ lastElement);
		
		// If the arrayList is empty, the program prints a message indicating that the list is empty.
		} else {
			System.out.println("The arrayList is empty.");
		}
	}
}

/*
Key Concepts
ArrayList: A resizable array implementation in Java, where elements can be added or removed dynamically.
isEmpty(): A method used to check if the ArrayList is empty. It returns true if the list has no elements, and false otherwise.
get(): A method used to access elements at a specific index in the ArrayList.
This program provides a simple and efficient way to retrieve and display the first and last elements of an ArrayList.
*/
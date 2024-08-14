// 

package arrays;

import java.util.ArrayList; // Imports the ArrayList class, which is a resizable array implementation of the List interface.
import java.util.HashMap; // Imports the HashMap class, which is used to store key-value pairs.
import java.util.List; // Imports the List interface, which ArrayList implements.
import java.util.Map; // Imports the Map interface, which HashMap implements.

public class NonRepeated {
	
	
	public static void main(String[] args) {
		
		// int[]: Declares an array of integers.
		// array: The name of the array.
		int[] array = {1,1,2,2,3,4,5,5,6,6}; // Initializes the array with ten integer elements. Some elements are repeated.
		
		//List<Integer>: Declares a list of integers.
		//The name of the list that will store the non-repeated elements.
		List<Integer> result = findNonRepeatedElements(array); //  method, passing the array as an argument. This method returns a list of integers that appear only once in the array.
		System.out.println("Non-repeated elements: "+ result); 
		
	}
	
	/*
	public: The method is accessible from outside the class.
	static: The method belongs to the class rather than an instance, so it can be called without creating an object.
	List<Integer>: The method returns a list of integers.
	findNonRepeatedElements: The name of the method that finds elements in the array that are not repeated.
	int[] array: The method accepts an integer array as an argument.
	*/
	
	public static List<Integer> findNonRepeatedElements(int[] array) {
		
		/*
		Map<Integer, Integer>: Declares a map where keys and values are both integers.
		countMap: The name of the map that will store the count of each element in the array.
		new HashMap<>(): Creates a new HashMap instance.
		*/		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(int num : array) { // A for-each loop that iterates over each element in the array. The current element is stored in the variable num.
			
			/*
			for (int num : array): A for-each loop that iterates over each element in the array. The current element is stored in the variable num.
			countMap.put(num, countMap.getOrDefault(num, 0) + 1):
			countMap.getOrDefault(num, 0): Checks if num is already in the map. If it is, it returns the current count; otherwise, it returns 0.
			countMap.put(num, ...): Updates the map by setting the value for num to the current count plus one. This effectively counts how many times each number appears in the array.
			*/
			
			countMap.put(num, countMap.getOrDefault(num, 0)+1); 
		}
		
		/*
		List<Integer>: Declares a list of integers.
		nonRepeatedElements: The name of the list that will store the non-repeated elements.
		new ArrayList<>(): Creates a new ArrayList instance.
		*/
		
		List<Integer> nonRepeatedElements = new ArrayList<>();
		
		/*
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()): A loop that iterates over each entry in the countMap. Each entry is a key-value pair where the key is an integer (an element from the array) and the value is an integer (the count of that element).
		if (entry.getValue() == 1): Checks if the value (count) of the current entry is 1. This means the element is non-repeated.
		nonRepeatedElements.add(entry.getKey()): If the element is non-repeated, add it to the nonRepeatedElements list.
		*/
		for(Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
			if (entry.getValue() ==1) {
				nonRepeatedElements.add(entry.getKey());
			}
		}
		return nonRepeatedElements; // The method returns the list nonRepeatedElements, which contains the elements that appear only once in the array.
	}

}

/*
 * Summary:
 * 
 * The program defines an array of integers and finds the elements that are not
 * repeated in the array. It does this by first counting the occurrences of each
 * element using a HashMap. Then, it identifies and stores the elements that
 * appear only once in a list. Finally, the list of non-repeated elements is
 * printed to the console.
 */



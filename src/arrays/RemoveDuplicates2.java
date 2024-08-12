/*
Explanation: These lines import the necessary classes from the java.util package:
ArrayList: A resizable array implementation of the List interface, used to store a dynamic list of elements.
HashSet: An implementation of the Set interface that uses a hash table to store elements, ensuring that there are no duplicates.
Set: A collection that cannot contain duplicate elements.
*/

package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		
		/*
		  This line creates a new ArrayList object named arrayList. ArrayList<Integer>
		  indicates that arrayList will store integers. new ArrayList<>() creates an
		  instance of ArrayList. java
		 */		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(9);
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(5);
		
		/*
		 * This line calls the removeDuplicates method, passing the arrayList as an
		 * argument, and stores the returned list (with duplicates removed) in the
		 * uniqueList variable. ArrayList<Integer> indicates that uniqueList is an
		 * ArrayList of integers. removeDuplicates(arrayList) calls the removeDuplicates
		 * method with arrayList as its argument. java
		 */
		
		// is the return type, indicating that the method will return an ArrayList of integers.

		ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
		
		System.out.println("ArrayList with duplicates removed: ");
			for(int num: uniqueList) {
				System.out.print(num + " ");
			}
	}

	public static ArrayList<Integer> 
	removeDuplicates(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		
		/*
		 * This line creates a new HashSet object named set and initializes it with the
		 * elements of the list. Set<Integer> declares a variable set of type Set that
		 * holds Integer objects. new HashSet<>(list) creates an instance of HashSet and
		 * adds all elements from list to the set. The HashSet will automatically remove
		 * any duplicate elements from the list.
		 */
		
		
		return new ArrayList<>(set);
	}

}

package arrays;

import java.util.HashSet;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {

		int[]arr= {1,2,2,3,4,4};
		HashSet<Integer>Set=new HashSet<>();
		for(int num:arr) {
			Set.add(num);
		}
		System.out.println(Set);
	}
}

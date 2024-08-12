// Array consists of integers and special characters,sum only integers

package arrays;

public class SumOnlyIntegers {
	
	/*
	Purpose: This is the main method, which serves as the entry point for the Java application. The JVM (Java Virtual Machine) begins the execution of the program from this method.
	public: The method is accessible from anywhere.
	static: The method belongs to the class rather than an instance of the class.
	void: The method does not return any value.
	String[] args: The method accepts an array of String objects as arguments from the command line.	
	*/
	
	public static void main(String[] args)
	{	
		// This line initializes a String array named array with the values
		String []array	= {"5","2","9","a","1","6","#","3"};
		
		// This line calls the sumIntegers method, passing the array as an argument. The method will sum all the integers in the array and return the result. The returned sum is stored in the sum variable.
		int sum = sumIntegers(array);
		
		// This line prints the sum of the integers in the array to the console. The + operator is used to concatenate the string with the value of sum.
		System.out.println("Sum of integers in the array: "+sum);
	}

	public static int sumIntegers(String[] array) 
	{
		int sum = 0;
		for(String element : array){
		try {
			int num = Integer.parseInt(element);
			sum += num;
		}catch(NumberFormatException e){
			
			}	
		}
		return sum;
	}

}

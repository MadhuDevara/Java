package ExceptionHandlingTryCatch;

public class TryCathc {

	public static void main(String[] args) {

		try 
		{
			System.out.println("Hello");
			int c=1/0;
			System.out.println(c);
						
		}
		
		catch(ArithmeticException a) 
		{
			System.out.println("I have handled the exception");
		}
		
		
	}

}

/*
 * Explain Exceptional Handling ? 
 * 
 * Answer:
 * Which ever line is giving you exception should be in try block And it must be
 * handled in the catch block Writing exception handling code doesn’t mean
 * exception will come,it may come or it may not come If exception is coming
 * then try block will not execute and catch block will execute
 */
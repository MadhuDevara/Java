
//147 Parameterized constructors

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parameterizedconstructorsPS1 extends beforemethodPSJava{
	
	/*
	@BeforeMethod
	public void beforeRun() 
	{
		System.out.println("Run me first");
	}
	
	@Test
	public void testRun() 
	{
		dothis();
	}
	
	@AfterMethod
	public void AfterRun() 
	{
		System.out.println("Run me last");
	}
	*/
	//Creating the object of the class also we can push the methods.
	
	@Test
	public void testRun() 
	{
		extendsPS2 ps2 =new extendsPS2(3); //Parameterized constructors
		int a =3;
		dothis();//parentClass
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		//PS3 ps3 = new PS3(3);
		System.out.println(ps2.multiplyThree());
	}
	
	
	
	
}

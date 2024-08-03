package Constructers;

public class StaticInstanceConstructer {
	
	static  //SIB
	{
		System.out.println("SIB");
	}

	{            //IIB
		System.out.println("IIB");
	}
	
	StaticInstanceConstructer()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		new StaticInstanceConstructer();
	
	}

}


public class PS2 extends PS3 {
	
	int a;
	
	//This. call variable class global variable and its a current class variable
	//super(a); parent class constructor will evoke its used when inheritance is there
	
	public PS2(int a)
	{
		super(a);
		this.a=a;
	}

	//Default constructor
	public int increment() 
	{
		a=a+1;
		return a;
	}
	
	public int decrement() 
	{
		a=a-1;
		return a;
	}
	
	
	

}

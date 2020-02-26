/*Create a class with two (overloaded) constructors. 
 * Using this, call the second constructor inside the
 *  first one.*/
public class Constructors 
{
	int c;
	
	
//multiple constructors can't be called from the one constructor
	public Constructors(int i,double d)
	{
		this(d);
		
		System.out.println("the square of number "+i+" is "+i*i);
	}

	public Constructors(double d)
	{
		
		System.out.println("the square of number "+d+" is "+d*d);
	}
	

	public static void main(String args[])
	{
		Constructors c =new Constructors(5,5.5);
	}
	
	
}

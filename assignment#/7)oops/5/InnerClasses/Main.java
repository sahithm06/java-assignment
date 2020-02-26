
/*Create a class with an inner class that has a non-default constructor (one that takes arguments). Create a second class with an inner class that inherits from the first inner class.*/


package InnerClasses;

public class Main 
{
public static void main(String args[])
{
	Class2 c2=new Class2();
	
	//Class2.InnerClass2 ic2= 
	c2.new InnerClass2();
	
	
}
	
}

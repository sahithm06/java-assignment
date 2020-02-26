/*Create a class with a constructor that takes a String argument. 
 * During construction, print the argument. Create an array of 
 * object references to this class, but don’t actually create 
 * objects to assign into the array. When you run the program, 
 * notice whether the initialization messages from the 
 * constructor calls are printed.*/

public class ConstructorArrayReference
{
	
	public ConstructorArrayReference (String arg)
	{
		
		System.out.println(arg);
		
		
	}	
// the only refernce varriable doesnt contain anything ;
	//beacuse it is not initalized to objects 
	//if we try to print the objects only the null values are displYED
		public static void main(String args[])
		{
			new ConstructorArrayReference("message");
			ConstructorArrayReference objects[]=new ConstructorArrayReference[5];
			for(int i=0;i<5;i++)
			{
					//objects[i]=new ConstructorArrayReference("message "+i);
			
			System.out.println(objects[i]);
			}
			
		}






}
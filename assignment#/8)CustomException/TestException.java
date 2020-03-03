
 
package CustomException;

import java.util.*;

/*
Error Handling
Create three new types of exceptions. 
Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. 
Add a finally clause and verify that your finally clause is executed,
even if a NullPointerException is thrown.
*/
public class TestException {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter a age :");
		 
			String age=	sc.nextLine();
			
		sc.close();
		try 
		{
			
				if(age.isEmpty())
			    	throw new EmptyAgeException("No age found.");
			
				else { 
					
					if(Integer.parseInt(age)<21)
					throw new LessAgeException("under age");
				
					if(Integer.parseInt(age)>60)
					throw new GreaterAgeException("over age");			
					}
			}
		
		
		
		catch (Exception e) {
				// TODO Auto-generated catch block
			System.out.println("Error :"+e.getMessage());
				//e.printStackTrace();
			}
		finally {
			System.out.println("This is finally block is executed anyway, all possible errors are caught.");
		}
	}
}



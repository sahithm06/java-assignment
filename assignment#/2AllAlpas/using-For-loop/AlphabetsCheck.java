import java.util.*;
public class AlphabetsCheck
{
	
	public static void main(String[] args)
	{
		String message;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		message=sc.nextLine();
		Checker c=new Checker(message);
		double stTime=System.nanoTime();
		if(c.check())
		{
			System.out.println("yes,given string contains all the alphabets");
		}
		else
		{
			System.out.println("no,given string doesnot contains all the alphabets");
		}
		double edTime=System.nanoTime();
		System.out.println( (edTime-stTime)/1000000000  );
	}
	
	
	
	
	
	
	
	
	
}


/*
Using the documentation for java.util.regex.Pattern as a resource, 
write and test a regular expression that checks a sentence to see that
 it begins with a capital letter and ends with a period.*/

import java.util.regex.*;
public class CheckPattern 
{
	
	
	public void check(String sentence)
	{
		if(Pattern.matches("[A-Z](.)*[.]$", sentence))
		{
			System.out.println("starts with capital and ends with period");
		}
		else
		{
			System.out.println("deosn't starts with capital and ends with period");
		}
		
	}
	

	
}

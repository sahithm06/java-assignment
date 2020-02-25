import java.util.*;
public class Checker 
{

	String message;
	String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int count[]=new int[26];                     //space complexity depends on the input
													// O(n) is space complexity
	public Checker(String message)
	{
		
		this.message = message.toUpperCase();
		System.out.println(message);
	}
    
	public boolean check()
	{
		
		for(int i=0;i<message.length();i++)
		{
			char ch=message.charAt(i);
			int idx=alpha.indexOf(ch);          //time complexity based on the size of message
			if(idx!=-1)                           //O(n2) is the time complexity
			{
				count[idx]++;
			}
	
		}
		
		for(int i=0;i<26;i++)
		{							//constant time
			if(count[i]==0)
			return false;
		
		}
		return true;
		
		
	}
	
	
	
	
}

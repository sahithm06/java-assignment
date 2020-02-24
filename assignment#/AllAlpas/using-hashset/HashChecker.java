import java.util.HashSet;
public class HashChecker {

		String message;
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int count[]=new int[26];
		HashSet<Character> hs ;
		
	

		public HashChecker(String message)      //space complexity is O(n)
		{
			 hs=new HashSet<Character>();
				this.message = message.toUpperCase();
				System.out.println(message);
		}

		public boolean hashcheck()
		{
			
			for(int i=0;i<message.length();i++)
			{				
			    
				if(Character.isLetter(message.charAt(i)))  // time complexity is O(n) 
				{
					
			       hs.add(message.charAt(i));
				}
				
		    }
		      if(hs.size()== 26)
		    	  return true;
		    	 
		      return false;
			
		}
		
		
		
		
	}




import java.io.*;
import java.util.*;
public class ReadandWrite  
{
	HashMap<Character,Integer> map;
	public ReadandWrite()
	{
	
		map=new  HashMap<Character,Integer>();
	}
	
    public void readFromFile(String path)
    {
    	
    	
		try {
	
	BufferedReader br = new BufferedReader(new FileReader(path));
	 
	      String s="";
	 	while( (s=br.readLine())!=null     )
	 	{
	 		System.out.println(s);
	 		for(int i=0;i<s.length();i++)	 			
	 		{
	 			char c=s.charAt(i);
	 			if( map.get(c)== null)
	 			{
	 				map.put(c,1);
	 			}
	 			else
	 			{
	 				map.put(c, map.get(c)+1);
	 			}
	 				
	 		
	 		}
	 				
	 				
	 				
	 	}

	 	br.close();
	
        }
		catch(IOException e)
		{
            e.printStackTrace();
		}
    }
		
	 	public void writeToFile(String path)
	 	{
	 		try
	 		{
	 			BufferedWriter bw=
						new BufferedWriter
						(new FileWriter(path));
	 		
	 		for(char c :map.keySet())
	 		 {
	 			 String lettercount =c+"  "+map.get(c);
	 			 bw.write(lettercount);
	 			 bw.newLine();
	 			
	 			 System.out.println(lettercount);
	 		 }
	 		System.out.println("Succesfully wrritten the int ot file");
	 		 bw.close();
	 		}
	 		catch(IOException e)
	 		{
	 			e.printStackTrace();
	     	}
	
	 	

		}
		

    

    public static void main(String []args)
    {
    	ReadandWrite rw=new ReadandWrite();
    	System.out.println(args[0]);
    	rw.readFromFile(args[0]);
    	System.out.println(args[1]);
    	rw.writeToFile(args[1]);
    	
    }


    
}

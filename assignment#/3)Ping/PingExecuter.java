import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;

public class PingExecuter {

	BufferedReader bf;
	 Process p;
	 String s="";
	 ArrayList<Double> list=new ArrayList<Double>();
	 int idx1,idx2,flag=0;
	public  void execute(String command) throws IOException
	{
		try
		{
			p=Runtime.getRuntime().exec(command);//getRuntime returns the current java application environmen
			
	        bf=new BufferedReader(new InputStreamReader(p.getInputStream()));
	        
	         while(   (s=bf.readLine())!=null  )
	         {
	        	//System.out.println(s);
	        	 
	        	
	        	 if(s.contains("64 bytes"))
	        	 {
	        		 flag=1;
	        		  idx1 =s.indexOf("time");
	        		  idx2=s.indexOf("ms",idx1);
	        		  System.out.println(s);

	        		  Double d=Double.parseDouble((s.substring(idx1+5, idx2))) ;
	        		 list.add(d);
	        		
	        		 
	        	 }
	        	 else if( (s.contains("not known") || s.isEmpty() )&& flag==0) 
	        	 {
	        		 	System.out.println("not valid Or cant handle the ping request");
	        		 	break;
	        	 }
	 
	         }
	          if(flag==1)
	         System.out.println("the medain is"+findMedian());
	        
		}
	   catch(Exception e)
		{
		   System.out.print("Invalid IP");
		  //System.out.println(stackTrace(e));
		   e.printStackTrace();
		}

		
	}
	private double findMedian() 
	{ 
				int size;
				size=list.size();
				Collections.sort(list);
				System.out.println(list);
				int idx= (size/2 );
				if(size%2==0)
				{
					return ( list.get(idx-1)+list.get(idx) )/2 ;
				}
	
			
			return list.get( (idx) );

				
	}

	
}
























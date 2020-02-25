import java.io.*;
import java.net.*;
import java.util.*;
public class PingCommandReader
	{
   
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	  String pingCommand;
	  		
	 Scanner sc=new Scanner(System.in);
	  System.out.println("enter command to execute");
	  pingCommand=sc.nextLine();
	 
	  PingExecuter pe =new  PingExecuter();
	  pe.execute(pingCommand);
	 /* InetAddress geek = InetAddress.getByName(pingCommand); 
	  if (geek.isReachable(5000)) 
		  
	    else
	      System.out.println("Sorry ! We can't reach to this host"); 
	  } */
	  	    
  }

}
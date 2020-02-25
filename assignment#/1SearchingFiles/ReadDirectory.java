
/*Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
*/

import java.io.File;
import java.util.*;
public class ReadDirectory {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    File file = new File("/home/sahith/Desktop/java_oops");
	    File[] files=file.listFiles();
	   
	    System.out.println("enter the pattern to search thee files");
	    
	    String pattern=sc.next();
	    SearchDirectory sd= new SearchDirectory(pattern);
	    for(String s:sd.searchFiles(files))
	        System.out.println(s);
	}
	

	
}

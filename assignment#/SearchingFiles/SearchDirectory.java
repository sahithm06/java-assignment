import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class SearchDirectory {

	String pattern;

	public SearchDirectory(String pattern) 
	{
		
		this.pattern = pattern;
	}

	
	
	ArrayList<String> searchedFiles=new ArrayList<String>();
    
	public ArrayList<String> searchFiles(File[] files) 
	{
	    for (File file : files) 
	    {
	        if (file.isDirectory())
	        {
	            //System.out.println("Directory: " + file.getName());
	        	
	            searchFiles(file.listFiles()); // calling the methd again(recursive).
	        } 
	        
	        else 
	        {
	        	if( Pattern.matches( pattern, file.getName())) 
	        	{
	        	  //System.out.println("File: " + file.getName());
	        		searchedFiles.add(file.getAbsolutePath());
	        		
	        		
	        	}
	        }
	   }
	  return   searchedFiles;
	}

}


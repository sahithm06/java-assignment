import edu.duke.*;

public class part4
{
    // instance variables - replace the example below with your own
   
    public void findurl()
    
    {
        URLResource url=new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");

        for(String line : url.lines())

       {
           String duplicatestring=line.toLowerCase();
           
        int youtubeindex= duplicatestring.indexOf("youtube.com");
        if(youtubeindex>0){
            
          int startindex=line.lastIndexOf("\"",youtubeindex); 
         int endindex=line.indexOf("\"",youtubeindex);
         System.out.println(line.substring(startindex,endindex));
                 
        }
    }
    
    
    
    
    
    
    }
}

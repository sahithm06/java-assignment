
public class part3
{
    // instance variables - replace the example below with your own
   
    

  
    public boolean twoOccurences(String a, String b)
    {
       
       
       int in=b.indexOf(a);
       
       if(in == -1) return false;
        else 
        { 
            in=b.indexOf(a,in+a.length()); 
            if(in==-1)
            {
                return false;}
            else
            {
             return true; 
             }
        }
     
       
    }
    
    
    String lastPart(String a,String b)
    {
        int in=b.indexOf(a);
        if(in==-1)
        return b;
        else
        {
         String sub=b.substring(in+a.length(),b.length());
         return sub;
        }
    
    
    }
     void testing()
    {
  System.out.println("first string is aa :second string is aaa output : "+ twoOccurences("aa","aaa"));
  System.out.println("first string is a :second string is alpha output: "+twoOccurences("a","alpha"));
  System.out.println("first string is one :second string is onetwo output : "+twoOccurences("one","onetwo"));
   System.out.println("first string is zoo :second string is zoopark output : "+lastPart("zoo","zoopark")); 
    System.out.println("first string is one :second string is one two    three output:"+lastPart("one two","one two   three"));
}
    
    
    
}

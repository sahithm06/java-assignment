
/**
 * Write a description of class Part1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part1
{
    // instance variables - replace the example below with your own
    
    public int findStopcodon(String dna,int startIndex,String stopCodon)
    { 
        int currIndex=dna.indexOf(stopCodon,startIndex+3);
        while(currIndex!=-1)
        {
        if((currIndex-startIndex)%3==0)
        return currIndex;
        else 
        currIndex=dna.indexOf(stopCodon,currIndex+1);
        
        }
        return -1;
        
    }
    
    public void testFindStopCodon()
    {
        String dna="ATG123123TAA";
        int startIndex=dna.indexOf("ATG");
        int endIndex=findStopcodon(dna,startIndex,"TAA");
        if(endIndex==dna.length())
        System.out.println("No gene Found");
        else
        System.out.println(dna.substring(startIndex,endIndex+3));
    }
    
    public String findGene(String dna,int startIndex)
  {int minIndex=0;
    
     if(startIndex!=-1) 
     { int indexTAA=findStopcodon(dna,startIndex,"TAA");
       int indexTAG=findStopcodon(dna,startIndex,"TAG");
       int indexTGA=findStopcodon(dna,startIndex,"TGA");
     
      
      if(indexTAA==-1 ||  (indexTAG!=-1 && indexTAA>indexTAG) )
    minIndex=indexTAG;
    else minIndex=indexTAA;
    if(minIndex==-1 ||  (indexTGA!=-1 && minIndex>indexTGA) )
    minIndex=indexTGA;
      
      if(minIndex!=-1)
       return dna.substring(startIndex,minIndex+3); 
    else 
    return "";
    }
     else 
     return "";
    }
    
    public void printAllGene(String dna)
    {
        int startIndex=dna.indexOf("ATG");
        
        while(startIndex!=-1)
        {String gene=findGene(dna,startIndex);
          System.out.println(gene);
          
          startIndex= dna.indexOf("ATG",startIndex+2+gene.length());
        }
        
        
        
        
        
    }
    public void testfindGene()
    {
        
String dna="XYZATG123123TAAABCATG123123TAG";
System.out.println("Dna  : "+dna);
 printAllGene(dna);
    } 
}

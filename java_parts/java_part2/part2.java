

public class Part2
{
    // instance variables - replace the example below with your own
    public String findSimpleGene(String dna,String st,String en){
     String ddna=dna.toLowerCase();
     
        int startcod=ddna.indexOf(st);
    if(startcod==-1) return "no gene";
    
    int endcod=ddna.indexOf(en,startcod+3);
    if(endcod==-1) return "no gene";
    String res= dna.substring(startcod,endcod+3);
    if((startcod-endcod )%3 ==0) return ("the gene is"+res);
    else {  return "didnt find a gene"; }
        
        

    }
    public void simpleGene()
    {
        String a="atgdfgdhfg";
        String b="atgATGdfseTAa";
        String c="atgdffdbdftaa";
        String d="ATGRedFREtaA";
        System.out.println( a);
        
        System.out.println( findSimpleGene(a,"atg","taa"));
       
     System.out.println(b); 
   
        System.out.println( findSimpleGene(b,"atg","taa"));
        System.out.println( c);
        System.out.println( findSimpleGene(c,"atg","taa"));
        System.out.println( d);
        System.out.println(findSimpleGene(d,"atg","taa"));
        // put your code here
        
    }
}


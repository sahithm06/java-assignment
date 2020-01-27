

public class part1
{
    
  
    public String findSimpleGene(String dna){
    int startcod=dna.indexOf("atg");
    if(startcod==-1) return "returned nothing";
    
    int endcod=dna.indexOf("taa",startcod+3);
    if(endcod==-1) return "returned nothing";
    String res= dna.substring(startcod,endcod+3);
    if((startcod-endcod )%3 ==0) return res;
    else {  return "didnt find a gene"; }
        
        

    }
    public void simpleGene()
    {
        String a="atgfdgfdvfdfb";
        String b="dsfgdfbbgddbtrtaa";
        String c="atgdffdbdftaa";
        String d="atgredredasdtaa";
        System.out.println( a);
        
        System.out.println( findSimpleGene(a));
        System.out.println( b);
        System.out.println( findSimpleGene(b));
        System.out.println( c);
        System.out.println( findSimpleGene(c));
        System.out.println( d);
        System.out.println(findSimpleGene(d));
        // put your code here
        
    }
}


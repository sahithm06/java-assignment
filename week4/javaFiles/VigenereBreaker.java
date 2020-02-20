import java.util.*;
import edu.duke.*;

public class VigenereBreaker {
   FileResource fr;
    public VigenereBreaker ()
    {
      fr=new FileResource();
        
        
    }
    
    public String sliceString(String message, int whichSlice, int totalSlices)
    {
        StringBuilder msg=new StringBuilder();
        for(int i=whichSlice;i<message.length();i+=totalSlices)
        {
            msg.append(message.charAt(i));
            
        }
        
 
        return msg.toString();
    
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        int[] key = new int[klength];
        //WRITE YOUR CODE HERE
        CaesarCracker cc =new CaesarCracker (); 
        for(int i=0; i<klength; i++)
        {
            key[i]=cc.getKey(sliceString(encrypted,i,klength));
        }
        
        return key;
    }

    public void breakVigenere () 
    {
      String  message= fr.asString();
        int key[]=tryKeyLength(message, 5, 'e') ;
        VigenereCipher vc =new VigenereCipher(key);
       System.out.println( vc.decrypt(message)); 
        
    }
    
}


import java.io.*;
import edu.duke.*;

public class TestVigenere
{
    void test()
    {
        VigenereBreaker  vb=new VigenereBreaker ();
    //System.out.println(vb.sliceString("abcdefghijklm", 4, 5) );
    /*FileResource fr= new FileResource("athens_keyflute.txt");
    
    String message=fr.asString();
    int a[]= vb.tryKeyLength(message,5,'e');
    for(int b:a)
    System.out.println(b);*/
    vb.breakVigenere();
    }

    
}

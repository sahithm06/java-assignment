import java.util.*;
public class ReadSentence {

	public static void main(String[] args)
	{
		CheckPattern cp=new CheckPattern();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{System.out.println("entr the sentece to check");
		cp.check(sc.nextLine());
		
		
	 }
		sc.close(); 
	}
	
	
	
}

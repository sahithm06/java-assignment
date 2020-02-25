package sahith.assignmemt.main;

import sahith.assignmemt.singleton.SecondClass;
import sahith.assignment.data.FirstClass;

public class Main {

	public static void main(String args[])
	{
		FirstClass f=new FirstClass();
		f.print();
		f.print1();
	
  
	  SecondClass s=SecondClass.print("object creation on calling");
	  s.print();
	}   
  
}

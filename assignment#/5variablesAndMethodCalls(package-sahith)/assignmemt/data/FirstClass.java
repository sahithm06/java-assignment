package sahith.assignment.data;
public class FirstClass {

	int i;
	char c;
	public void print()
	{
		System.out.println(i+"  "+c);
	}
	public void print1()
	{
		int i;
	     char c;
	     
	     /*
	     System.out.println(i+"  "+c);
	     */
	     
	   //the local variables which are not initalized cant be used.  
	    /* when the objects are created the instance variables will be initialized to 0 and this happens in heap
	     * but when comes to methods and the variables in that ,the local variables are pushed  on to the stack
	     * when that method is called .so java doesnt allow the varables to hold something and no deafault values also 
	     * so we have to intialize them and use.
	     */
	    
	     
	}


}

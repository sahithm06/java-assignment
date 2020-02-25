package sahith.assignmemt.singleton;
public class SecondClass {

	String s;
	public static SecondClass print(String s)
	{
		/*this.s=s;*/
		//the static functions can't use the data members of the class.
	/*they can't use because the static methods can be called 
	 * with the class name so that is, we cant use the instance varaibles of the class
	 *  without the references of the object.
	 * 
	 */

		return new SecondClass();
	}
	public void print()
	{
		System.out.println(s);
	}
	
	
}

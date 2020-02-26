
public class ConstrcutorArrayObjects 
{

	
	public ConstrcutorArrayObjects(String arg)
	{
		
		System.out.println(arg);
		
		
	}	
/* when we are initializing and printing the objects the object address
 *  is displayed whenever a object is created ,its corresponding constructor
 *   is called*/
		public static void main(String args[])
		{
			new ConstrcutorArrayObjects ("message");
			ConstrcutorArrayObjects  objects[]=new ConstrcutorArrayObjects[5];
			for(int i=0;i<5;i++)
			{
					objects[i]=new ConstrcutorArrayObjects("message "+i);
			
			System.out.println(objects[i]);
			}
			
		}


}
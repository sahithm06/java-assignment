package InnerClasses;

//import InnerClasses.Class1.InnerClass1;


public class Class2
{

	/*public Class2()
	{
		System.out.println("class2 base" );
		
	}*/

	class InnerClass2 extends Class1.InnerClass1
	{
		/*non static inner classes constructor can't be called when 
		 * they are inherited , so the inherited class should create
		 *object of the outerclass in which the inner base class 
		 *is present */
		public InnerClass2()
		{
			new Class1().super("hii");
		}
		 
	}


}

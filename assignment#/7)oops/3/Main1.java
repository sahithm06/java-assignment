/* Create three interfaces, each with two methods. Inherit a 
 * new interface that combines the three, adding a new method. 
 * Create a class by implementing the new interface and also 
 * inheriting from a concrete class. Now write four methods,
 *  each of which takes one of the four interfaces as an argument
 *  . In main( ), create an object of your class and pass it to 
 *  each of the 
 * methods*/
interface I1
{
	
	public void I1method1();
	public void I1method2();	

}
interface I2
{
	
	public void I2method1();
	public void I2method2();	

}
interface I3
{
	
	public void I3method1();
	public void I3method2();	

}
interface I4 extends I1,I2,I3
{
	
	public void I4method1();

}
 class InterfaceClassConcrete{
	
	 public void testMethod1(I1 i1)
		{
			System.out.println("\"from the testmethod 1 with interface 1 as arguement\"");
			i1.I1method1();
			i1.I1method2();
		}
		public void testMethod2(I2 i2)
		{
			System.out.println("\"from the testmethod 2 with interface 2 as arguement\"");
			i2.I2method1();
			i2.I2method2();
		}
		
		public void testMethod3(I3 i3)
		{
			System.out.println("\"from the testmethod 3 with interface 3 as arguement\"");
			i3.I3method1();
			i3.I3method2();
			
		}
		public void testMethod4(I4 i4)
		{
			System.out.println("\"from the testmethod 4 with interface 4 as arguement\"");
			i4.I1method1();
			i4.I2method1();
			i4.I3method1();
			i4.I4method1();
		}
}

/* Create three interfaces, each with two methods. Inherit a 
 * new interface that combines the three, adding a new method. 
 * Create a class by implementing the new interface and also 
 * inheriting from a concrete class. Now write four methods,
 *  each of which takes one of the four interfaces as an argument
 *  . In main( ), create an object of your class and pass it to 
 *  each of the 
 * methods*/

class NewClass extends InterfaceClassConcrete implements I4
{

	@Override
	public void I1method1() {
		// TODO Auto-generated method stub
		System.out.println("initerface 1 method 1 from new class");
	}

	@Override
	public void I1method2() {
		// TODO Auto-generated method stub
		System.out.println("initerface 1 method 2 from new class");
	}

	@Override
	public void I2method1() {
		// TODO Auto-generated method stub
		System.out.println("initerface 2 method 1 from new class");
	}

	@Override
	public void I2method2() {
		// TODO Auto-generated method stub
		System.out.println("initerface 2 method 2 from new class");
	}

	@Override
	public void I3method1() {
		// TODO Auto-generated method stub
		System.out.println("initerface 3 method 1 from new class");
	}

	@Override
	public void I3method2() {
		// TODO Auto-generated method stub
		System.out.println("initerface 3 method 2 from new class");
	}

	@Override
	public void I4method1() {
		// TODO Auto-generated method stub
		System.out.println("initerface 4 method 1 from new class");
	}
	
		
	
	
	
	
}




	
	/* class TestClass
	{
		public void testMethod1(I1 i1)
		{
			System.out.println("\"from the testmethod 1 with interface 1 as arguement\"");
			i1.I1method1();
			i1.I1method2();
		}
		public void testMethod2(I2 i2)
		{
			System.out.println("\"from the testmethod 2 with interface 2 as arguement\"");
			i2.I2method1();
			i2.I2method2();
		}
		
		public void testMethod3(I3 i3)
		{
			System.out.println("\"from the testmethod 3 with interface 3 as arguement\"");
			i3.I3method1();
			i3.I3method2();
			
		}
		public void testMethod4(I4 i4)
		{
			System.out.println("\"from the testmethod 4 with interface 4 as arguement\"");
			i4.I1method1();
			i4.I2method1();
			i4.I3method1();
			i4.I4method1();
		}
		

		
		
	}
	*/
	
	
	
	
	class Main1
	{

		public static void main(String[] args)
		{
			
			NewClass nc=new NewClass();
			InterfaceClassConcrete tc=new InterfaceClassConcrete();
			tc.testMethod1(nc);
			tc.testMethod2(nc);
			tc.testMethod3(nc);
			tc.testMethod4(nc);
			
			
			
		}
			
	}

































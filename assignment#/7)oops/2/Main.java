
public class Main {

	public static void main(String[] args)
	{
		
		BiCycle bc=new BiCycle();
		TriCycle tc=new TriCycle();
		UniCycle uc=new UniCycle();
		
		Cycle c[]=new Cycle[3];
		c[0]=uc;
		c[1]=bc;
		c[2]=tc;	
		for(int i=0;i<3;i++)   //upcast
		
		{
			//methods which are overriden in the subclsses are called 
			/*when you upcast it or downcast it*/
			c[i].balance();
		}
		//downcast
		/*the methods which are not overidden in the subcalsses 
		 * when upcasted or downcasted the parent class method
		 *  will be called*/
		
		uc=(UniCycle)c[0];
		uc.balance();
		bc=(BiCycle)c[1];
		bc.balance();
		tc=(TriCycle)c[2];
		tc.balance();
		
	}
}

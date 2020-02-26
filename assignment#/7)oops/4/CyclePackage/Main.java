package CyclePackage;

public class Main
{
	public static void main(String args[])
	{
		UniCycle uc[];
		BiCycle bc[];
		TriCycle tc[];
	     uc=new UniCycleFactory(2).createUniCycles();
	     
	     bc=new BiCycleFactory(2).createBiCycles();
	     tc=new TriCycleFactory(2).createTriCycles();
	     
	     for(int i=0;i<2;i++)
	     {
	    	 System.out.println((i+1)+"st cycle");
	    	 

	    	 
	     }

	}
}

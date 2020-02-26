package CyclePackage;

public class UniCycleFactory 
{ 
	int no_of_cycles;

	public UniCycleFactory(int no_of_cycles)
	{
		this.no_of_cycles=no_of_cycles;
		//createUniCycles();
		
	}
	
	UniCycle[] createUniCycles()
	{
		UniCycle uc[]=new UniCycle[no_of_cycles];
		for(int i=0;i<no_of_cycles;i++)
		{
			uc[i]=new UniCycle();
		}
		
		return uc;
	}

}

package CyclePackage;

public class TriCycleFactory 
{
	 
		int no_of_cycles;

		public TriCycleFactory(int no_of_cycles)
		{
			this.no_of_cycles=no_of_cycles;
			//createTriCycles();
			
		}
		
		TriCycle[] createTriCycles()
		{
			TriCycle tc[]=new TriCycle[no_of_cycles];
			for(int i=0;i<no_of_cycles;i++)
			{
				tc[i]=new TriCycle();
			}
			
			return tc;
		}



}

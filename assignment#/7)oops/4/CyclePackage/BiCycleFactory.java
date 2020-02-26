package CyclePackage;

public class BiCycleFactory 
{

	 
		int no_of_cycles;

		public BiCycleFactory(int no_of_cycles)
		{
			this.no_of_cycles=no_of_cycles;
			//createBiCycles();
			
		}
		
		BiCycle[] createBiCycles()
		{
			BiCycle bc[]=new BiCycle[no_of_cycles];
			for(int i=0;i<no_of_cycles;i++)
			{
				bc[i]=new BiCycle();
			}
			
			return bc;
		}


}

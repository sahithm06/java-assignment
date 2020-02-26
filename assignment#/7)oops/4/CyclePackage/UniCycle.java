package CyclePackage;

public class UniCycle implements Cycle
{
	public void balance()
	{
		System.out.println("balance in from uni cycle");
	}
	

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("driving unicycle ");
	}

	@Override
	public void applyBrakes() {
		// TODO Auto-generated method stub
		System.out.println("applying brakes to unicycle ");
	}

	
}

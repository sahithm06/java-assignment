package CyclePackage;

public class BiCycle implements Cycle
{
	public void balance()
	{
		System.out.println("balance in from bicycle ");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("driving bicycle ");
	}

	@Override
	public void applyBrakes() {
		// TODO Auto-generated method stub
		System.out.println("applying brakes to bicycle ");
	}

}

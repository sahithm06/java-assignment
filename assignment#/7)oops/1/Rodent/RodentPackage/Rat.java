package RodentPackage;

public class Rat extends Rodent 
{
	public Rat()
	{
		System.out.println("from rat class");
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Rat is moving");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Rat is making sound");
	}

}

package RodentPackage;

public class Gerbil extends Rodent
{

	public Gerbil()
	{
		System.out.println("from Gerbil");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("gerbil  is moving");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("gerbil is making sound");
	}
	
}

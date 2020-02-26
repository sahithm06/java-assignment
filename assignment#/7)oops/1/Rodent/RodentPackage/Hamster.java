package RodentPackage;

public class Hamster extends Rodent
{

	public Hamster()
	{
		System.out.println("from the Hamster");
	}


	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("hamster  is moving");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("hamster is making sound");
	}
	
	
}

package RodentPackage;

public abstract class Rodent 
{

	public Rodent()
	{
		System.out.println(" from rodent class");
	}
	
	public void eat()
	{
		System.out.println(this.getClass().getSimpleName()+" is eating");
	}
	public void sleep()
	{
		System.out.println(this.getClass().getSimpleName()+" is sleping");
		
	}
	abstract void move();
	
	abstract void sound();


}

package RodentPackage;

public class Main
{

	public static void main(String args[])
	{
		Rodent r[]=new Rodent[3];//object reference
		
		//Rat rat =new Rat();
	r[0]=new Rat();
		r[1]=new Gerbil();
		r[2]=new Hamster();     //object creations
		//subclass constructor is called first and 
		//then automatically its parent constructor is called.
		for(int i=0;i<3;i++)
		{
			r[i].eat();
			r[i].sleep();
			r[i].move();
			r[i].sound();
		}
		
		
	}
}

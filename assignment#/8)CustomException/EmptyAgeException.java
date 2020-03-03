package CustomException;

public class EmptyAgeException extends Exception

{
public EmptyAgeException(String s)
{
	super(s);
}
	
}
class GreaterAgeException extends Exception
{
	public GreaterAgeException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	//private static final long serialVersionUID = 1L;
	
	
}

class LessAgeException extends Exception
{

	public LessAgeException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	
//	private static final long serialVersionUID = 1L;
	
}